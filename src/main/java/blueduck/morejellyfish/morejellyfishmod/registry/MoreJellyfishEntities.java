package blueduck.morejellyfish.morejellyfishmod.registry;

import blueduck.jellyfishing.jellyfishingmod.JellyfishingMod;
import blueduck.jellyfishing.jellyfishingmod.entities.AbstractJellyfishEntity;
import blueduck.jellyfishing.jellyfishingmod.entities.BlueJellyfishEntity;
import blueduck.jellyfishing.jellyfishingmod.entities.JellyfishEntity;
import blueduck.morejellyfish.morejellyfishmod.MoreJellyfishMod;
import blueduck.morejellyfish.morejellyfishmod.entity.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MoreJellyfishEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES, MoreJellyfishMod.MODID);

    public static final RegistryObject<EntityType<DiamondJellyfishEntity>> DIAMOND_JELLYFISH = ENTITIES.register("diamond_jellyfish", () -> EntityType.Builder.<DiamondJellyfishEntity>create(DiamondJellyfishEntity::new, EntityClassification.WATER_CREATURE).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/diamond_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<EmeraldJellyfishEntity>> EMERALD_JELLYFISH = ENTITIES.register("emerald_jellyfish", () -> EntityType.Builder.<EmeraldJellyfishEntity>create(EmeraldJellyfishEntity::new, EntityClassification.WATER_CREATURE).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/emerald_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<IronJellyfishEntity>> IRON_JELLYFISH = ENTITIES.register("iron_jellyfish", () -> EntityType.Builder.<IronJellyfishEntity>create(IronJellyfishEntity::new, EntityClassification.WATER_CREATURE).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/iron_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<GoldJellyfishEntity>> GOLD_JELLYFISH = ENTITIES.register("gold_jellyfish", () -> EntityType.Builder.<GoldJellyfishEntity>create(GoldJellyfishEntity::new, EntityClassification.WATER_CREATURE).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/gold_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<CoalJellyfishEntity>> COAL_JELLYFISH = ENTITIES.register("coal_jellyfish", () -> EntityType.Builder.<CoalJellyfishEntity>create(CoalJellyfishEntity::new, EntityClassification.WATER_CREATURE).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/coal_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<RedstoneJellyfishEntity>> REDSTONE_JELLYFISH = ENTITIES.register("redstone_jellyfish", () -> EntityType.Builder.<RedstoneJellyfishEntity>create(RedstoneJellyfishEntity::new, EntityClassification.WATER_CREATURE).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/redstone_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<LapisLazuliJellyfishEntity>> LAPIS_LAZULI_JELLYFISH = ENTITIES.register("lapis_lazuli_jellyfish", () -> EntityType.Builder.<LapisLazuliJellyfishEntity>create(LapisLazuliJellyfishEntity::new, EntityClassification.WATER_CREATURE).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/lapis_lazuli_jellyfish.png").toString()));



    public MoreJellyfishEntities() {
    }

    public static void init() {
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
