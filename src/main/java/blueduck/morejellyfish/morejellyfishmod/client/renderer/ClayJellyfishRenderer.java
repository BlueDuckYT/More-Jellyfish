package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.ClayJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.ClayJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ClayJellyfishRenderer extends MobRenderer<ClayJellyfishEntity, ClayJellyfishModel> {

    public ClayJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ClayJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(ClayJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/clay_jellyfish.png");
    }
}
