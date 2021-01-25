package blueduck.morejellyfish.morejellyfishmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class MoreJellyfishConfig {



    public ConfigHelper.ConfigValueListener<Boolean> DIAMOND_SPAWN;
    public ConfigHelper.ConfigValueListener<Boolean> EMERALD_SPAWN;
    public ConfigHelper.ConfigValueListener<Boolean> IRON_SPAWN;
    public ConfigHelper.ConfigValueListener<Boolean> GOLD_SPAWN;
    public ConfigHelper.ConfigValueListener<Boolean> COAL_SPAWN;
    public ConfigHelper.ConfigValueListener<Boolean> REDSTONE_SPAWN;
    public ConfigHelper.ConfigValueListener<Boolean> LAPIS_SPAWN;
    public ConfigHelper.ConfigValueListener<Boolean> QUARTZ_SPAWN;



    public MoreJellyfishConfig(ForgeConfigSpec.Builder builder, ConfigHelper.Subscriber subscriber) {
        builder.push("Spawning");
        this.DIAMOND_SPAWN = subscriber.subscribe(builder
                .comment("Should Diamond Jellyfish Spawn?")
                .define("diamond_jellyfish_spawn", true, (o) -> { return o instanceof Boolean; }));
        this.EMERALD_SPAWN = subscriber.subscribe(builder
                .comment("Should Emerald Jellyfish Spawn?")
                .define("emerald_jellyfish_spawn", true, (o) -> { return o instanceof Boolean; }));
        this.IRON_SPAWN = subscriber.subscribe(builder
                .comment("Should Iron Jellyfish Spawn?")
                .define("iron_jellyfish_spawn", true, (o) -> { return o instanceof Boolean; }));
        this.GOLD_SPAWN = subscriber.subscribe(builder
                .comment("Should Gold Jellyfish Spawn?")
                .define("gold_jellyfish_spawn", true, (o) -> { return o instanceof Boolean; }));
        this.COAL_SPAWN = subscriber.subscribe(builder
                .comment("Should Coal Jellyfish Spawn?")
                .define("coal_jellyfish_spawn", true, (o) -> { return o instanceof Boolean; }));
        this.REDSTONE_SPAWN = subscriber.subscribe(builder
                .comment("Should Redstone Jellyfish Spawn?")
                .define("redstone_jellyfish_spawn", true, (o) -> { return o instanceof Boolean; }));
        this.LAPIS_SPAWN = subscriber.subscribe(builder
                .comment("Should Lapis Lazuli Jellyfish Spawn?")
                .define("lapis_jellyfish_spawn", true, (o) -> { return o instanceof Boolean; }));
        this.QUARTZ_SPAWN = subscriber.subscribe(builder
                .comment("Should Nether Quartz Jellyfish Spawn?")
                .define("quartz_jellyfish_spawn", true, (o) -> { return o instanceof Boolean; }));

        builder.pop();
    }

}
