package blueduck.morejellyfish.morejellyfishmod.registry;

import blueduck.jellyfishing.jellyfishingmod.JellyfishingMod;
import blueduck.jellyfishing.jellyfishingmod.biomes.JellyfishFields;
import blueduck.morejellyfish.morejellyfishmod.MoreJellyfishMod;
import blueduck.morejellyfish.morejellyfishmod.misc.RockBottom;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MoreJellyfishBiomes {

    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, MoreJellyfishMod.MODID);

    public static final RegistryObject<Biome> ROCK_BOTTOM = BIOMES.register("rock_bottom", () -> new RockBottom());


    public static void init() {
        BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static void registerBiomes() {
        registerBiome(ROCK_BOTTOM.get(), BiomeManager.BiomeType.COOL, BiomeDictionary.Type.OCEAN, BiomeDictionary.Type.OVERWORLD);
    }
    public static void registerBiome(Biome biome, BiomeManager.BiomeType type, BiomeDictionary.Type... types) {
        BiomeDictionary.addTypes(biome, types);
        //BiomeManager.addSpawnBiome(biome);
        BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(biome, 6));

    }
}
