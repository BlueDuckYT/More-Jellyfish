package blueduck.morejellyfish.morejellyfishmod.registry;

import blueduck.jellyfishing.jellyfishingmod.JellyfishingMod;
import blueduck.jellyfishing.jellyfishingmod.items.JellyfishItem;
import blueduck.jellyfishing.jellyfishingmod.registry.JellyfishingEntities;
import blueduck.morejellyfish.morejellyfishmod.MoreJellyfishMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MoreJellyfishItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MoreJellyfishMod.MODID);

    public static final RegistryObject<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> DIAMOND_FRAGMENT = ITEMS.register("diamond_fragment", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));




    public static final RegistryObject<Item> EMERALD_FRAGMENT = ITEMS.register("emerald_fragment", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> DIAMOND_JELLYFISH = ITEMS.register("diamond_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.DIAMOND_JELLYFISH.get()));
    public static final RegistryObject<Item> EMERALD_JELLYFISH = ITEMS.register("emerald_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.EMERALD_JELLYFISH.get()));
    public static final RegistryObject<Item> IRON_JELLYFISH = ITEMS.register("iron_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.IRON_JELLYFISH.get()));
    public static final RegistryObject<Item> GOLD_JELLYFISH = ITEMS.register("gold_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.GOLD_JELLYFISH.get()));
    public static final RegistryObject<Item> COAL_JELLYFISH = ITEMS.register("coal_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.COAL_JELLYFISH.get()));
    public static final RegistryObject<Item> REDSTONE_JELLYFISH = ITEMS.register("redstone_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.REDSTONE_JELLYFISH.get()));
    public static final RegistryObject<Item> LAPIS_LAZULI_JELLYFISH = ITEMS.register("lapis_lazuli_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.LAPIS_LAZULI_JELLYFISH.get()));

    public static final RegistryObject<Item> SLIME_JELLYFISH = ITEMS.register("slime_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.SLIME_JELLYFISH.get()));



    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
