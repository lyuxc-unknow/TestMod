package mod.lyuxc.test;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TestMod.MOD_ID);

    public static void addCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == TestMod.F_TEST_TAB.value()) {
            ITEMS.getEntries().stream().map(DeferredHolder::get).forEach(event::accept);
        }
    }
    public static void init(IEventBus iEventBus) {
        for (int i=0;i<10000;i++) {
            ITEMS.register("example_"+i,() -> new Item(new Item.Properties()));
        }
        ITEMS.register(iEventBus);
    }
}
