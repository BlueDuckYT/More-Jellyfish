package blueduck.morejellyfish.morejellyfishmod;

import blueduck.jellyfishing.jellyfishingmod.biomes.JellyfishFields;
import blueduck.jellyfishing.jellyfishingmod.client.entity.renderer.AbstractJellyfishRenderer;
import blueduck.jellyfishing.jellyfishingmod.client.entity.renderer.BlueJellyfishRenderer;
import blueduck.jellyfishing.jellyfishingmod.client.entity.renderer.JellyfishRenderer;
import blueduck.jellyfishing.jellyfishingmod.client.entity.renderer.PattyWagonRenderer;
import blueduck.jellyfishing.jellyfishingmod.items.JellyfishingSpawnEgg;
import blueduck.jellyfishing.jellyfishingmod.registry.*;
import blueduck.morejellyfish.morejellyfishmod.client.renderer.*;
import blueduck.morejellyfish.morejellyfishmod.entity.MoreJellyfishSpawnEgg;
import blueduck.morejellyfish.morejellyfishmod.registry.MoreJellyfishBiomes;
import blueduck.morejellyfish.morejellyfishmod.registry.MoreJellyfishBlocks;
import blueduck.morejellyfish.morejellyfishmod.registry.MoreJellyfishEntities;
import blueduck.morejellyfish.morejellyfishmod.registry.MoreJellyfishItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MerchantOffer;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTables;
import net.minecraft.world.storage.loot.TableLootEntry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
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

    public MoreJellyfishMod() {
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
        ((JellyfishFields) JellyfishingBiomes.JELLYFISH_FIELDS.get()).addCreatureSpawn(EntityClassification.WATER_CREATURE, new Biome.SpawnListEntry(MoreJellyfishEntities.DIAMOND_JELLYFISH.get(), 1, 1, 1));
        ((JellyfishFields) JellyfishingBiomes.JELLYFISH_FIELDS.get()).addCreatureSpawn(EntityClassification.WATER_CREATURE, new Biome.SpawnListEntry(MoreJellyfishEntities.EMERALD_JELLYFISH.get(), 3, 1, 1));
        ((JellyfishFields) JellyfishingBiomes.JELLYFISH_FIELDS.get()).addCreatureSpawn(EntityClassification.WATER_CREATURE, new Biome.SpawnListEntry(MoreJellyfishEntities.IRON_JELLYFISH.get(), 5, 1, 1));
        ((JellyfishFields) JellyfishingBiomes.JELLYFISH_FIELDS.get()).addCreatureSpawn(EntityClassification.WATER_CREATURE, new Biome.SpawnListEntry(MoreJellyfishEntities.GOLD_JELLYFISH.get(), 3, 1, 1));
        ((JellyfishFields) JellyfishingBiomes.JELLYFISH_FIELDS.get()).addCreatureSpawn(EntityClassification.WATER_CREATURE, new Biome.SpawnListEntry(MoreJellyfishEntities.COAL_JELLYFISH.get(), 10, 1, 1));
        ((JellyfishFields) JellyfishingBiomes.JELLYFISH_FIELDS.get()).addCreatureSpawn(EntityClassification.WATER_CREATURE, new Biome.SpawnListEntry(MoreJellyfishEntities.REDSTONE_JELLYFISH.get(), 7, 1, 1));
        ((JellyfishFields) JellyfishingBiomes.JELLYFISH_FIELDS.get()).addCreatureSpawn(EntityClassification.WATER_CREATURE, new Biome.SpawnListEntry(MoreJellyfishEntities.LAPIS_LAZULI_JELLYFISH.get(), 6, 1, 1));
        ((JellyfishFields) JellyfishingBiomes.JELLYFISH_FIELDS.get()).addCreatureSpawn(EntityClassification.WATER_CREATURE, new Biome.SpawnListEntry(MoreJellyfishEntities.SLIME_JELLYFISH.get(), 5, 1, 1));



        Biomes.SWAMP.getSpawns(EntityClassification.WATER_CREATURE).add(new Biome.SpawnListEntry(MoreJellyfishEntities.SLIME_JELLYFISH.get(), 10, 1, 1));
        Biomes.BADLANDS.getSpawns(EntityClassification.WATER_CREATURE).add(new Biome.SpawnListEntry(MoreJellyfishEntities.GOLD_JELLYFISH.get(), 10, 1, 1));


        MoreJellyfishBiomes.ROCK_BOTTOM.get().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, MoreJellyfishBlocks.DEEP_CORALSTONE.get().getDefaultState(), 50)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(250, 20, 0, 60))));
        DefaultBiomeFeatures.addOres(MoreJellyfishBiomes.ROCK_BOTTOM.get());
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
            MoreJellyfishBiomes.ROCK_BOTTOM.get().addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, JellyfishingFeatures.CORAL_PLANT_FEATURE.withConfiguration(new CountConfig(1)));
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
        public static void onLootLoad(LootTableLoadEvent event) throws IllegalAccessException {

            //Fishing Loot Injection from Aquaculture 2 by Team Metallurgy
            ResourceLocation name = event.getName();
            if (name.equals(LootTables.GAMEPLAY_FISHING)) {
                LootPool pool = event.getTable().getPool("main");
                if (pool != null) {
                    addEntry(pool, getInjectEntry(new ResourceLocation("more_jellyfish:gameplay/more_jellyfish"), 4, 1));

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
            if (event.getType() == VillagerProfession.FISHERMAN) {
                event.getTrades().get(5).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.DIAMOND_JELLYFISH.get()), new ItemStack(Items.EMERALD, 10), 3, 10, 0.05F));
                event.getTrades().get(5).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.REDSTONE_JELLYFISH.get()), new ItemStack(Items.EMERALD, 4), 3, 10, 0.05F));
                event.getTrades().get(5).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.IRON_JELLYFISH.get()), new ItemStack(Items.EMERALD, 3), 3, 10, 0.05F));
                event.getTrades().get(5).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.GOLD_JELLYFISH.get()), new ItemStack(Items.EMERALD, 5), 3, 10, 0.05F));
                event.getTrades().get(5).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.COAL_JELLYFISH.get()), new ItemStack(Items.EMERALD, 2), 3, 10, 0.05F));
                event.getTrades().get(5).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishItems.EMERALD_JELLYFISH.get()), new ItemStack(Items.EMERALD, 5), 3, 10, 0.05F));
            }
            if (event.getType() == VillagerProfession.MASON) {
                event.getTrades().get(3).add((entity, random) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(MoreJellyfishBlocks.POLISHED_DEEP_CORALSTONE_ITEM.get(), 4), 5, 10, 0.05F));
                event.getTrades().get(3).add((entity, random) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(MoreJellyfishBlocks.DEEP_CORALSTONE_ITEM.get(), 8), 5, 10, 0.05F));
                event.getTrades().get(3).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishBlocks.DEEP_CORALSTONE_ITEM.get(), 16), new ItemStack(Items.EMERALD, 1), 5, 10, 0.05F));
                event.getTrades().get(4).add((entity, random) -> new MerchantOffer(new ItemStack(MoreJellyfishBlocks.DEEP_CORALSTONE_ITEM.get(), 8), new ItemStack(Items.EMERALD, 1), 5, 10, 0.05F));
            }
        }
    }
}
