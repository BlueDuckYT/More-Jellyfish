package blueduck.morejellyfish.morejellyfishmod.registry;

import blueduck.jellyfishing.jellyfishingmod.JellyfishingMod;
import blueduck.jellyfishing.jellyfishingmod.entities.AbstractJellyfishEntity;
import blueduck.jellyfishing.jellyfishingmod.entities.BlueJellyfishEntity;
import blueduck.jellyfishing.jellyfishingmod.entities.JellyfishEntity;
import blueduck.morejellyfish.morejellyfishmod.entity.DiamondJellyfishEntity;
import blueduck.morejellyfish.morejellyfishmod.entity.EmeraldJellyfishEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MoreJellyfishEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES, JellyfishingMod.MODID);

    public static final RegistryObject<EntityType<DiamondJellyfishEntity>> DIAMOND_JELLYFISH = ENTITIES.register("diamond_jellyfish", () -> EntityType.Builder.<DiamondJellyfishEntity>create(DiamondJellyfishEntity::new, EntityClassification.WATER_CREATURE).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/diamond_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<EmeraldJellyfishEntity>> EMERALD_JELLYFISH = ENTITIES.register("emerald_jellyfish", () -> EntityType.Builder.<EmeraldJellyfishEntity>create(EmeraldJellyfishEntity::new, EntityClassification.WATER_CREATURE).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/emerald_jellyfish.png").toString()));


    public MoreJellyfishEntities() {
    }

    public static void init() {
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
