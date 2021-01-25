package blueduck.morejellyfish.morejellyfishmod;

import blueduck.jellyfishing.JellyfishingMod;
import blueduck.jellyfishing.entities.AbstractJellyfishEntity;
import blueduck.jellyfishing.registry.JellyfishingConfiguredFeatures;
import blueduck.jellyfishing.registry.JellyfishingVillagers;
import blueduck.morejellyfish.morejellyfishmod.config.ConfigHelper;
import blueduck.morejellyfish.morejellyfishmod.config.MoreJellyfishConfig;
import blueduck.morejellyfish.morejellyfishmod.entity.EmeraldJellyfishEntity;
import blueduck.morejellyfish.morejellyfishmod.misc.MoreJellyfishSpawnEgg;
import blueduck.morejellyfish.morejellyfishmod.misc.KelpForest;
import blueduck.morejellyfish.morejellyfishmod.misc.RockBottom;
import blueduck.morejellyfish.morejellyfishmod.registry.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MerchantOffer;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.loot.LootEntry;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.TableLootEntry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("more_jellyfish")
public class MoreJellyfishMod {

    public static String MODID = "more_jellyfish";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public static MoreJellyfishConfig CONFIG;

    public MoreJellyfishMod() {
        CONFIG = ConfigHelper.register(ModConfig.Type.COMMON, MoreJellyfishConfig::new);

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        MoreJellyfishItems.init();
        MoreJellyfishBlocks.init();
        MoreJellyfishBiomes.init();
        MoreJellyfishEntities.init();


    }

    private void setup(final FMLCommonSetupEvent event) {
        for (RegistryObject<EntityType<?>> ENTITY: MoreJellyfishEntities.ENTITIES.getEntries()) {
            GlobalEntityTypeAttributes.put((EntityType<? extends LivingEntity>) ENTITY.get(), AbstractJellyfishEntity.func_234176_m_().create()/*(or your own)*/);
        }
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);

    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> {
            LOGGER.info("Hello world from the MDK");
            return "Hello world";
        });
    }

    private void processIMC(final InterModProcessEvent event) {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m -> m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
        @SubscribeEvent
        public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
            MoreJellyfishBiomes.registerBiomes();
        }
    }

    @Mod.EventBusSubscriber(
            modid = "more_jellyfish",
            bus = Mod.EventBusSubscriber.Bus.MOD,
            value = {Dist.CLIENT}
    )
    public static class ClientEventBusSubscriber {
        public ClientEventBusSubscriber() {
        }

        @SubscribeEvent(priority = EventPriority.LOWEST)
        public static void onPostRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
            MoreJellyfishSpawnEgg.doDispenserSetup();
        }

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            MoreJellyfishEntities.registerRenderer();
            RenderTypeLookup.setRenderLayer((Block)MoreJellyfishBlocks.GELATINOUS_MILK_BLOCK.get(), RenderType.getTranslucent());

        }
        @SubscribeEvent
        public static void onItemColorEvent(ColorHandlerEvent.Item event) {
            for (final SpawnEggItem egg : MoreJellyfishSpawnEgg.JELLYFISHING_SPAWN_EGGS) {
                event.getItemColors().register((stack, i) -> egg.getColor(i), egg);
            }
        }
    }

    @Mod.EventBusSubscriber(modid = "more_jellyfish")
    public static class LootEvents {

        @SubscribeEvent
        public static void onBiomeLoad(BiomeLoadingEvent event) {
            if (event.getName().equals(new ResourceLocation("more_jellyfish:rock_bottom"))) {
                event.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, MoreJellyfishConfiguredFeatures.CONFIGURED_UNCOMMON_CORAL_PLANT);
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, MoreJellyfishConfiguredFeatures.CONFIGURED_DEEP_CORALSTONE_REPLACEMENT);
            }
            else if ( event.getName().equals(new ResourceLocation("more_jellyfish:kelp_forest"))) {
                event.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, JellyfishingConfiguredFeatures.CONFIGURED_CORAL_PLANT);
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, MoreJellyfishConfiguredFeatures.CONFIGURED_DEEP_CORALSTONE_REPLACEMENT);
            }
            if (event.getName().equals(new ResourceLocation("jellyfishing:jellyfish_fields"))) {
                if (CONFIG.DIAMOND_SPAWN.get())
                    event.getSpawns().withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(MoreJellyfishEntities.DIAMOND_JELLYFISH.get(), 5, 1, 1));
                if (CONFIG.EMERALD_SPAWN.get())
                    event.getSpawns().withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(MoreJellyfishEntities.EMERALD_JELLYFISH.get(), 10, 1, 1));
                if (CONFIG.IRON_SPAWN.get())
                    event.getSpawns().withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(MoreJellyfishEntities.IRON_JELLYFISH.get(), 90, 1, 1));
                if (CONFIG.GOLD_SPAWN.get())
                    event.getSpawns().withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(MoreJellyfishEntities.GOLD_JELLYFISH.get(), 90, 1, 1));
                if (CONFIG.REDSTONE_SPAWN.get())
                    event.getSpawns().withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(MoreJellyfishEntities.REDSTONE_JELLYFISH.get(), 80, 1, 1));
                if (CONFIG.LAPIS_SPAWN.get())
                    event.getSpawns().withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(MoreJellyfishEntities.LAPIS_LAZULI_JELLYFISH.get(), 60, 1, 1));
                if (CONFIG.COAL_SPAWN.get())
                    event.getSpawns().withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(MoreJellyfishEntities.COAL_JELLYFISH.get(), 100, 1, 1));
                event.getSpawns().withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(MoreJellyfishEntities.SLIME_JELLYFISH.get(), 150, 1, 1));
                event.getSpawns().withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(MoreJellyfishEntities.HONEY_JELLYFISH.get(), 150, 1, 1));

            }
        }

        @SubscribeEvent
        public static void onLootLoad(LootTableLoadEvent event) throws IllegalAccessException {

            //Fishing Loot Injection from Aquaculture 2 by Team Metallurgy
            ResourceLocation name = event.getName();
            if (JellyfishingMod.CONFIG.JELLYFISH_FISHABLE.get() && name.equals(LootTables.GAMEPLAY_FISHING)) {
                LootPool pool = event.getTable().getPool("main");
                if (pool != null) {
                    addEntry(pool, getInjectEntry(new ResourceLocation("more_jellyfish:gameplay/more_jellyfish"), 1, 2));

                }
            }
        }

        private static LootEntry getInjectEntry(ResourceLocation location, int weight, int quality) {
            return TableLootEntry.builder(location).weight(weight).quality(quality).build();
        }


        private static void addEntry(LootPool pool, LootEntry entry) throws IllegalAccessException {
            List<LootEntry> lootEntries = (List<LootEntry>) ObfuscationReflectionHelper.findField(LootPool.class, "field_186453_a").get(pool);
            if (lootEntries.stream().anyMatch(e -> e == entry)) {
                throw new RuntimeException("Attempted to add a duplicate entry to pool: " + entry);
            }
            lootEntries.add(entry);
        }

        @SubscribeEvent
        public static void villagerTrades(final VillagerTradesEvent event) {
            if (event.getType() == VillagerProfession.MASON) {
                event.getTrades().get(3).add((entity, random) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(MoreJellyfishBlocks.POLISHED_DEEP_CORALSTONE_ITEM.get(), 4), 5, 10, 0.05F));
                event.getTrades().get(3).add((entity, random) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(MoreJellyfishBlocks.DEEP_CORALSTONE_ITEM.get(), 8), 5, 10, 0.05F));
                event.getTrades().get(3).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishBlocks.DEEP_CORALSTONE_ITEM.get(), 16), new ItemStack(Items.EMERALD, 1), 5, 10, 0.05F));
                event.getTrades().get(4).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishBlocks.DEEP_CORALSTONE_ITEM.get(), 8), new ItemStack(Items.EMERALD, 1), 5, 10, 0.05F));
            }

            if (event.getType() == JellyfishingVillagers.FRYCOOK.get()) {
                event.getTrades().get(1).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.GELATINOUS_MILK.get(), 20), new ItemStack(Items.EMERALD, 1), 8, 10, 0.05F));

                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.DIAMOND_JELLYFISH.get()), new ItemStack(Items.EMERALD, 16), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.REDSTONE_JELLYFISH.get()), new ItemStack(Items.EMERALD, 3), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.IRON_JELLYFISH.get()), new ItemStack(Items.EMERALD, 1), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.GOLD_JELLYFISH.get()), new ItemStack(Items.EMERALD, 1), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.COAL_JELLYFISH.get()), new ItemStack(Items.EMERALD, 2), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.EMERALD_JELLYFISH.get()), new ItemStack(Items.EMERALD, 12), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.LAPIS_LAZULI_JELLYFISH.get()), new ItemStack(Items.EMERALD, 2), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.SLIME_JELLYFISH.get()), new ItemStack(Items.EMERALD, 2), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.HONEY_JELLYFISH.get()), new ItemStack(Items.EMERALD, 2), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.CLAY_JELLYFISH.get()), new ItemStack(Items.EMERALD, 2), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.RED_FUNGAL_JELLYFISH.get()), new ItemStack(Items.EMERALD, 2), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.BROWN_FUNGAL_JELLYFISH.get()), new ItemStack(Items.EMERALD, 2), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.WARPED_FUNGAL_JELLYFISH.get()), new ItemStack(Items.EMERALD, 2), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.CRIMSON_FUNGAL_JELLYFISH.get()), new ItemStack(Items.EMERALD, 2), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.GLOWSTONE_JELLYFISH.get()), new ItemStack(Items.EMERALD, 3), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.COW_JELLYFISH.get()), new ItemStack(Items.EMERALD, 6), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.SPONGE_JELLYFISH.get()), new ItemStack(Items.EMERALD, 10), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.SKELLYFISH.get()), new ItemStack(Items.EMERALD, 3), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.CREEPER_JELLYFISH.get()), new ItemStack(Items.EMERALD, 4), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.GUARDIAN_JELLYFISH.get()), new ItemStack(Items.EMERALD, 5), 12, 10, 0.05F));
                event.getTrades().get(2).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.QUARTZ_JELLYFISH.get()), new ItemStack(Items.EMERALD, 2), 12, 10, 0.05F));

            }
        }
    }
}
