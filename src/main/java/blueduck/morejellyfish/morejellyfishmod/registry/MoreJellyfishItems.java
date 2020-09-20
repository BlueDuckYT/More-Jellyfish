package blueduck.morejellyfish.morejellyfishmod.registry;

import blueduck.jellyfishing.jellyfishingmod.items.JellyfishItem;
import blueduck.morejellyfish.morejellyfishmod.MoreJellyfishMod;
import blueduck.morejellyfish.morejellyfishmod.misc.MoreJellyfishSpawnEgg;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MoreJellyfishItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MoreJellyfishMod.MODID);

    public static final RegistryObject<Item> DIAMOND_JELLYFISH_SPAWN_EGG = ITEMS.register("diamond_jellyfish_spawn_egg", () -> new MoreJellyfishSpawnEgg(() -> MoreJellyfishEntities.DIAMOND_JELLYFISH.get(),3130874, 3145722, new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> EMERALD_JELLYFISH_SPAWN_EGG = ITEMS.register("emerald_jellyfish_spawn_egg", () -> new MoreJellyfishSpawnEgg(() -> MoreJellyfishEntities.EMERALD_JELLYFISH.get(),3145495, 3145544, new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> IRON_JELLYFISH_SPAWN_EGG = ITEMS.register("iron_jellyfish_spawn_egg", () -> new MoreJellyfishSpawnEgg(() -> MoreJellyfishEntities.IRON_JELLYFISH.get(),16777177, 12490717, new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> GOLD_JELLYFISH_SPAWN_EGG = ITEMS.register("gold_jellyfish_spawn_egg", () -> new MoreJellyfishSpawnEgg(() -> MoreJellyfishEntities.GOLD_JELLYFISH.get(),16759571, 14055168, new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> COAL_JELLYFISH_SPAWN_EGG = ITEMS.register("coal_jellyfish_spawn_egg", () -> new MoreJellyfishSpawnEgg(() -> MoreJellyfishEntities.COAL_JELLYFISH.get(),3347, 2632492, new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> REDSTONE_JELLYFISH_SPAWN_EGG = ITEMS.register("redstone_jellyfish_spawn_egg", () -> new MoreJellyfishSpawnEgg(() -> MoreJellyfishEntities.REDSTONE_JELLYFISH.get(),16719380, 4849664, new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> LAPIS_LAZULI_JELLYFISH_SPAWN_EGG = ITEMS.register("lapis_lazuli_jellyfish_spawn_egg", () -> new MoreJellyfishSpawnEgg(() -> MoreJellyfishEntities.LAPIS_LAZULI_JELLYFISH.get(),917582, 4871679, new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> SLIME_JELLYFISH_SPAWN_EGG = ITEMS.register("slime_jellyfish_spawn_egg", () -> new MoreJellyfishSpawnEgg(() -> MoreJellyfishEntities.SLIME_JELLYFISH.get(),4905017, 4890425, new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> SPONGE_JELLYFISH_SPAWN_EGG = ITEMS.register("sponge_jellyfish_spawn_egg", () -> new MoreJellyfishSpawnEgg(() -> MoreJellyfishEntities.SPONGE_JELLYFISH.get(),13479464, 7628544, new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> GLOWSTONE_JELLYFISH_SPAWN_EGG = ITEMS.register("glowstone_jellyfish_spawn_egg", () -> new MoreJellyfishSpawnEgg(() -> MoreJellyfishEntities.GLOWSTONE_JELLYFISH.get(),13479464, 7628544, new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> QUARTZ_JELLYFISH_SPAWN_EGG = ITEMS.register("quartz_jellyfish_spawn_egg", () -> new MoreJellyfishSpawnEgg(() -> MoreJellyfishEntities.QUARTZ_JELLYFISH.get(),16777065, 16757097, new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> RED_FUNGAL_JELLYFISH_SPAWN_EGG = ITEMS.register("red_fungal_jellyfish_spawn_egg", () -> new MoreJellyfishSpawnEgg(() -> MoreJellyfishEntities.RED_FUNGAL_JELLYFISH.get(),16716800, 16770269, new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> BROWN_FUNGAL_JELLYFISH_SPAWN_EGG = ITEMS.register("brown_fungal_jellyfish_spawn_egg", () -> new MoreJellyfishSpawnEgg(() -> MoreJellyfishEntities.BROWN_FUNGAL_JELLYFISH.get(),10513224, 7367496, new Item.Properties().group(ItemGroup.MISC)));




    public static final RegistryObject<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> DIAMOND_FRAGMENT = ITEMS.register("diamond_fragment", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> EMERALD_FRAGMENT = ITEMS.register("emerald_fragment", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));


    public static final RegistryObject<Item> SPONGE_CHUNK = ITEMS.register("sponge_chunk", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> DIAMOND_JELLYFISH = ITEMS.register("diamond_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.DIAMOND_JELLYFISH.get()));
    public static final RegistryObject<Item> EMERALD_JELLYFISH = ITEMS.register("emerald_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.EMERALD_JELLYFISH.get()));
    public static final RegistryObject<Item> IRON_JELLYFISH = ITEMS.register("iron_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.IRON_JELLYFISH.get()));
    public static final RegistryObject<Item> GOLD_JELLYFISH = ITEMS.register("gold_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.GOLD_JELLYFISH.get()));
    public static final RegistryObject<Item> COAL_JELLYFISH = ITEMS.register("coal_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.COAL_JELLYFISH.get()));
    public static final RegistryObject<Item> REDSTONE_JELLYFISH = ITEMS.register("redstone_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.REDSTONE_JELLYFISH.get()));
    public static final RegistryObject<Item> LAPIS_LAZULI_JELLYFISH = ITEMS.register("lapis_lazuli_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.LAPIS_LAZULI_JELLYFISH.get()));

    public static final RegistryObject<Item> SLIME_JELLYFISH = ITEMS.register("slime_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.SLIME_JELLYFISH.get()));
    public static final RegistryObject<Item> SPONGE_JELLYFISH = ITEMS.register("sponge_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.SPONGE_JELLYFISH.get()));
    public static final RegistryObject<Item> GLOWSTONE_JELLYFISH = ITEMS.register("glowstone_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.GLOWSTONE_JELLYFISH.get()));
    public static final RegistryObject<Item> QUARTZ_JELLYFISH = ITEMS.register("quartz_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.QUARTZ_JELLYFISH.get()));
    public static final RegistryObject<Item> RED_FUNGAL_JELLYFISH = ITEMS.register("red_fungal_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.RED_FUNGAL_JELLYFISH.get()));
    public static final RegistryObject<Item> BROWN_FUNGAL_JELLYFISH = ITEMS.register("brown_fungal_jellyfish", () -> new JellyfishItem(new Item.Properties().group(ItemGroup.MATERIALS),  () -> MoreJellyfishEntities.BROWN_FUNGAL_JELLYFISH.get()));






    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
