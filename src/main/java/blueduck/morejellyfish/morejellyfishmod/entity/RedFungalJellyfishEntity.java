package blueduck.morejellyfish.morejellyfishmod.entity;

import blueduck.jellyfishing.jellyfishingmod.entities.AbstractJellyfishEntity;
import blueduck.morejellyfish.morejellyfishmod.registry.MoreJellyfishItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;
import net.minecraft.world.World;

public class RedFungalJellyfishEntity extends AbstractJellyfishEntity {
    public RedFungalJellyfishEntity(EntityType<? extends AbstractFishEntity> type, World worldIn) {
        super(type, worldIn, new ItemStack((IItemProvider) MoreJellyfishItems.RED_FUNGAL_JELLYFISH.get(), 1), (Item) Items.RED_MUSHROOM, 1.0D, true, 400, 5, 0.35D, 0.3D, 0.4D, 60);
    }
}
