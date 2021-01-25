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

public class CowJellyfishEntity extends AbstractJellyfishEntity {
    public CowJellyfishEntity(EntityType<? extends AbstractFishEntity> type, World worldIn) {
        super(type, worldIn, new ItemStack((IItemProvider) MoreJellyfishItems.COW_JELLYFISH.get(), 1), (Item) MoreJellyfishItems.GELATINOUS_MILK.get(), 1.0D, false, 300, 4, 0.4D, 0.05D, 0.15D, 100);
    }
}
