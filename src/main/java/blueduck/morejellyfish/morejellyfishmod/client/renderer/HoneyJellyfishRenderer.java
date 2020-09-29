package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.HoneyJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.HoneyJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class HoneyJellyfishRenderer extends MobRenderer<HoneyJellyfishEntity, HoneyJellyfishModel> {

    public HoneyJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new HoneyJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(HoneyJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/honey_jellyfish.png");
    }
}
