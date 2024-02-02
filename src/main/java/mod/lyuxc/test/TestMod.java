package mod.lyuxc.test;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(TestMod.MOD_ID)
public class TestMod {
    public static final String MOD_ID = "f_test";
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> F_TEST_TAB = CREATIVE_MODE_TABS.register("f_test_creative_tab",() -> CreativeModeTab.builder()
            .title(Component.literal("测试"))
            .icon(() -> BuiltInRegistries.ITEM.get(new ResourceLocation("minecraft:dirt")).getDefaultInstance())
            .build());

    public TestMod(IEventBus iEventBus) {
        CREATIVE_MODE_TABS.register(iEventBus);
        ItemRegistry.init(iEventBus);
        iEventBus.addListener(ItemRegistry::addCreativeTab);
        iEventBus.addListener(DataGeneration::generate);
    }
}
