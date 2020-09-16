package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.RedstoneJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.RedstoneJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RedstoneJellyfishRenderer extends MobRenderer<RedstoneJellyfishEntity, RedstoneJellyfishModel> {

    public RedstoneJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new RedstoneJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(RedstoneJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/redstone_jellyfish.png");
    }
}
