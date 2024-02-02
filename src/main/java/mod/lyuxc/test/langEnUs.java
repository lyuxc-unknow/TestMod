package mod.lyuxc.test;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class langEnUs extends LanguageProvider {
    public langEnUs(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        for(int i=0;i<10000;i++) {
            add("item.f_test.example_"+i,"Example "+i);
        }
    }
}
