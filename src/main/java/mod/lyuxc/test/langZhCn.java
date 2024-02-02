package mod.lyuxc.test;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class langZhCn extends LanguageProvider {
    public langZhCn(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        for(int i=0;i<10000;i++) {
            add("item.f_test.example_"+i,"测试物品"+i);
        }
    }
}
