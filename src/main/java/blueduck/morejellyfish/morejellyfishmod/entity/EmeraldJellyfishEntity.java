package blueduck.morejellyfish.morejellyfishmod.entity;

import blueduck.jellyfishing.jellyfishingmod.entities.AbstractJellyfishEntity;
import blueduck.morejellyfish.morejellyfishmod.registry.MoreJellyfishItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.world.World;

public class EmeraldJellyfishEntity extends AbstractJellyfishEntity {
    public EmeraldJellyfishEntity(EntityType<? extends AbstractFishEntity> type, World worldIn) {
        super(type, worldIn, new ItemStack((IItemProvider) MoreJellyfishItems.EMERALD_JELLYFISH.get(), 1), (Item)MoreJellyfishItems.EMERALD_FRAGMENT.get(), 0.35D, true, 200, 5, 0.75D, 0.75D, 0.2D, 60);
    }
}
