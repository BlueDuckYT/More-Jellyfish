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

public class SlimeJellyfishEntity extends AbstractJellyfishEntity {
    public SlimeJellyfishEntity(EntityType<? extends AbstractFishEntity> type, World worldIn) {
        super(type, worldIn, new ItemStack((IItemProvider) MoreJellyfishItems.SLIME_JELLYFISH.get(), 1), (Item) Items.SLIME_BALL, 1.0D, true, 200, 2, 0.25D, 0.45D, 0.1D);
    }
}
