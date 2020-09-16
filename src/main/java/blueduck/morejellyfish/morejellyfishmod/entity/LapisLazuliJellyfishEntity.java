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

public class LapisLazuliJellyfishEntity extends AbstractJellyfishEntity {
    public LapisLazuliJellyfishEntity(EntityType<? extends AbstractFishEntity> type, World worldIn) {
        super(type, worldIn, new ItemStack((IItemProvider) MoreJellyfishItems.LAPIS_LAZULI_JELLYFISH.get(), 1), (Item) Items.LAPIS_LAZULI, 1.5D, true, 200, 2, 0.25D, 0.2D, 0.1D);
    }
}
