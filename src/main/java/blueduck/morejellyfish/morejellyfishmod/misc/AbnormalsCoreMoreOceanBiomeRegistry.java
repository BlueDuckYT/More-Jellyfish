package blueduck.morejellyfish.morejellyfishmod.misc;

import com.minecraftabnormals.abnormals_core.core.util.BiomeUtil;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;

import javax.annotation.Nullable;

public class AbnormalsCoreMoreOceanBiomeRegistry {

    public static void registerBiome(RegistryKey<Biome> biome, @Nullable RegistryKey<Biome> deep, int weight) {
        BiomeUtil.addOceanBiome(BiomeUtil.OceanType.COLD, biome, deep, weight);
    }
}
