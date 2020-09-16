package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.CoalJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.CoalJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CoalJellyfishRenderer extends MobRenderer<CoalJellyfishEntity, CoalJellyfishModel> {

    public CoalJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CoalJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(CoalJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/coal_jellyfish.png");
    }
}
