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

public class IronJellyfishEntity extends AbstractJellyfishEntity {
    public IronJellyfishEntity(EntityType<? extends AbstractFishEntity> type, World worldIn) {
        super(type, worldIn, new ItemStack((IItemProvider) MoreJellyfishItems.IRON_JELLYFISH.get(), 1), (Item) Items.IRON_NUGGET, 2.0D, true, 300, 4, 0.4D, 0.6D, 0.15D, 100);
    }
}
