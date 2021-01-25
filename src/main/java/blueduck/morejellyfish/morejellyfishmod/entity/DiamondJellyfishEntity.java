package blueduck.morejellyfish.morejellyfishmod.entity;

import blueduck.jellyfishing.entities.AbstractJellyfishEntity;
import blueduck.morejellyfish.morejellyfishmod.registry.MoreJellyfishItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.world.World;

public class DiamondJellyfishEntity extends AbstractJellyfishEntity {
    public DiamondJellyfishEntity(EntityType<? extends AbstractFishEntity> type, World worldIn) {
        super(type, worldIn, new ItemStack((IItemProvider) MoreJellyfishItems.DIAMOND_JELLYFISH.get(), 1), (Item)MoreJellyfishItems.DIAMOND_SHARD.get(), 0.5D, true, 200, 8, 0.9D, 0.95D, 0.4D, 40);
    }
}
