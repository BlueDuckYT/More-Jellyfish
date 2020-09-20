package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.QuartzJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.QuartzJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class QuartzJellyfishRenderer extends MobRenderer<QuartzJellyfishEntity, QuartzJellyfishModel> {

    public QuartzJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new QuartzJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(QuartzJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/quartz_jellyfish.png");
    }
}
