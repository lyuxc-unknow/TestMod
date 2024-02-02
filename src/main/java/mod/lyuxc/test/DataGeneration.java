package mod.lyuxc.test;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class DataGeneration {
    public static void generate(GatherDataEvent event) {
        //数据生成器
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = event.getGenerator().getPackOutput();
        //中文 - 语言生成器
        generator.addProvider(event.includeClient(), new langZhCn(packOutput,TestMod.MOD_ID ,"zh_cn"));
        generator.addProvider(event.includeClient(), new langEnUs(packOutput,TestMod.MOD_ID ,"en_us"));
    }
}
