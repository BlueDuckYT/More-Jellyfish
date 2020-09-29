package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.SkellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.SkellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SkellyfishRenderer extends MobRenderer<SkellyfishEntity, SkellyfishModel> {

    public SkellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SkellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(SkellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/skellyfish.png");
    }
}
