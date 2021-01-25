package blueduck.morejellyfish.morejellyfishmod.entity;

import blueduck.jellyfishing.entities.AbstractJellyfishEntity;
import blueduck.morejellyfish.morejellyfishmod.registry.MoreJellyfishItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;
import net.minecraft.world.World;

public class GoldJellyfishEntity extends AbstractJellyfishEntity {
    public GoldJellyfishEntity(EntityType<? extends AbstractFishEntity> type, World worldIn) {
        super(type, worldIn, new ItemStack((IItemProvider) MoreJellyfishItems.GOLD_JELLYFISH.get(), 1), (Item) Items.GOLD_NUGGET, 2.0D, true, 200, 5, 0.4D, 0.6D, 0.25D);
    }
}
