package blueduck.morejellyfish.morejellyfishmod.registry;

import blueduck.morejellyfish.morejellyfishmod.MoreJellyfishMod;
import blueduck.morejellyfish.morejellyfishmod.client.renderer.*;
import blueduck.morejellyfish.morejellyfishmod.entity.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MoreJellyfishEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MoreJellyfishMod.MODID);

    public static final RegistryObject<EntityType<DiamondJellyfishEntity>> DIAMOND_JELLYFISH = ENTITIES.register("diamond_jellyfish", () -> EntityType.Builder.<DiamondJellyfishEntity>create(DiamondJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/diamond_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<EmeraldJellyfishEntity>> EMERALD_JELLYFISH = ENTITIES.register("emerald_jellyfish", () -> EntityType.Builder.<EmeraldJellyfishEntity>create(EmeraldJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/emerald_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<IronJellyfishEntity>> IRON_JELLYFISH = ENTITIES.register("iron_jellyfish", () -> EntityType.Builder.<IronJellyfishEntity>create(IronJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/iron_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<GoldJellyfishEntity>> GOLD_JELLYFISH = ENTITIES.register("gold_jellyfish", () -> EntityType.Builder.<GoldJellyfishEntity>create(GoldJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/gold_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<CoalJellyfishEntity>> COAL_JELLYFISH = ENTITIES.register("coal_jellyfish", () -> EntityType.Builder.<CoalJellyfishEntity>create(CoalJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/coal_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<RedstoneJellyfishEntity>> REDSTONE_JELLYFISH = ENTITIES.register("redstone_jellyfish", () -> EntityType.Builder.<RedstoneJellyfishEntity>create(RedstoneJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/redstone_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<LapisLazuliJellyfishEntity>> LAPIS_LAZULI_JELLYFISH = ENTITIES.register("lapis_lazuli_jellyfish", () -> EntityType.Builder.<LapisLazuliJellyfishEntity>create(LapisLazuliJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/lapis_lazuli_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<SlimeJellyfishEntity>> SLIME_JELLYFISH = ENTITIES.register("slime_jellyfish", () -> EntityType.Builder.<SlimeJellyfishEntity>create(SlimeJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/slime_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<SpongeJellyfishEntity>> SPONGE_JELLYFISH = ENTITIES.register("sponge_jellyfish", () -> EntityType.Builder.<SpongeJellyfishEntity>create(SpongeJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/sponge_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<GlowstoneJellyfishEntity>> GLOWSTONE_JELLYFISH = ENTITIES.register("glowstone_jellyfish", () -> EntityType.Builder.<GlowstoneJellyfishEntity>create(GlowstoneJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/slime_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<QuartzJellyfishEntity>> QUARTZ_JELLYFISH = ENTITIES.register("quartz_jellyfish", () -> EntityType.Builder.<QuartzJellyfishEntity>create(QuartzJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/slime_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<RedFungalJellyfishEntity>> RED_FUNGAL_JELLYFISH = ENTITIES.register("red_fungal_jellyfish", () -> EntityType.Builder.<RedFungalJellyfishEntity>create(RedFungalJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/slime_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<BrownFungalJellyfishEntity>> BROWN_FUNGAL_JELLYFISH = ENTITIES.register("brown_fungal_jellyfish", () -> EntityType.Builder.<BrownFungalJellyfishEntity>create(BrownFungalJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/slime_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<WarpedFungalJellyfishEntity>> WARPED_FUNGAL_JELLYFISH = ENTITIES.register("warped_fungal_jellyfish", () -> EntityType.Builder.<WarpedFungalJellyfishEntity>create(WarpedFungalJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).immuneToFire().build(new ResourceLocation("more_jellyfish", "textures/entities/slime_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<CrimsonFungalJellyfishEntity>> CRIMSON_FUNGAL_JELLYFISH = ENTITIES.register("crimson_fungal_jellyfish", () -> EntityType.Builder.<CrimsonFungalJellyfishEntity>create(CrimsonFungalJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).immuneToFire().build(new ResourceLocation("more_jellyfish", "textures/entities/slime_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<CreeperJellyfishEntity>> CREEPER_JELLYFISH = ENTITIES.register("creeper_jellyfish", () -> EntityType.Builder.<CreeperJellyfishEntity>create(CreeperJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/sponge_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<ClayJellyfishEntity>> CLAY_JELLYFISH = ENTITIES.register("clay_jellyfish", () -> EntityType.Builder.<ClayJellyfishEntity>create(ClayJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/sponge_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<GuardianJellyfishEntity>> GUARDIAN_JELLYFISH = ENTITIES.register("guardian_jellyfish", () -> EntityType.Builder.<GuardianJellyfishEntity>create(GuardianJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/sponge_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<SkellyfishEntity>> SKELLYFISH = ENTITIES.register("skellyfish", () -> EntityType.Builder.<SkellyfishEntity>create(SkellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/sponge_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<HoneyJellyfishEntity>> HONEY_JELLYFISH = ENTITIES.register("honey_jellyfish", () -> EntityType.Builder.<HoneyJellyfishEntity>create(HoneyJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).build(new ResourceLocation("more_jellyfish", "textures/entities/sponge_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<CowJellyfishEntity>> COW_JELLYFISH = ENTITIES.register("cow_jellyfish", () -> EntityType.Builder.<CowJellyfishEntity>create(CowJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.9F, 0.5F).build(new ResourceLocation("more_jellyfish", "textures/entities/sponge_jellyfish.png").toString()));
    public static final RegistryObject<EntityType<NetheriteJellyfishEntity>> NETHERITE_JELLYFISH = ENTITIES.register("netherite_jellyfish", () -> EntityType.Builder.<NetheriteJellyfishEntity>create(NetheriteJellyfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.9F, 0.5F).immuneToFire().build(new ResourceLocation("more_jellyfish", "textures/entities/sponge_jellyfish.png").toString()));



    public MoreJellyfishEntities() {
    }

    public static void init() {
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderer() {
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.DIAMOND_JELLYFISH.get(), (manager) -> {
            return new DiamondJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.EMERALD_JELLYFISH.get(), (manager) -> {
            return new EmeraldJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.IRON_JELLYFISH.get(), (manager) -> {
            return new IronJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.GOLD_JELLYFISH.get(), (manager) -> {
            return new GoldJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.COAL_JELLYFISH.get(), (manager) -> {
            return new CoalJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.REDSTONE_JELLYFISH.get(), (manager) -> {
            return new RedstoneJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.LAPIS_LAZULI_JELLYFISH.get(), (manager) -> {
            return new LapisLazuliJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.SLIME_JELLYFISH.get(), (manager) -> {
            return new SlimeJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.QUARTZ_JELLYFISH.get(), (manager) -> {
            return new QuartzJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.GLOWSTONE_JELLYFISH.get(), (manager) -> {
            return new GlowstoneJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.SPONGE_JELLYFISH.get(), (manager) -> {
            return new SpongeJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.RED_FUNGAL_JELLYFISH.get(), (manager) -> {
            return new RedFungalJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.BROWN_FUNGAL_JELLYFISH.get(), (manager) -> {
            return new BrownFungalJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.WARPED_FUNGAL_JELLYFISH.get(), (manager) -> {
            return new WarpedFungalJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.CRIMSON_FUNGAL_JELLYFISH.get(), (manager) -> {
            return new CrimsonFungalJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.CREEPER_JELLYFISH.get(), (manager) -> {
            return new CreeperJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.CLAY_JELLYFISH.get(), (manager) -> {
            return new ClayJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.SKELLYFISH.get(), (manager) -> {
            return new SkellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.GUARDIAN_JELLYFISH.get(), (manager) -> {
            return new GuardianJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.HONEY_JELLYFISH.get(), (manager) -> {
            return new HoneyJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.COW_JELLYFISH.get(), (manager) -> {
            return new CowJellyfishRenderer(manager);
        });
        RenderingRegistry.registerEntityRenderingHandler((EntityType) MoreJellyfishEntities.NETHERITE_JELLYFISH.get(), (manager) -> {
            return new NetheriteJellyfishRenderer(manager);
        });
    }
}
