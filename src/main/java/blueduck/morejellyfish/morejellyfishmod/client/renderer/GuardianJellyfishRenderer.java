package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.GuardianJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.GuardianJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GuardianJellyfishRenderer extends MobRenderer<GuardianJellyfishEntity, GuardianJellyfishModel> {

    public GuardianJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GuardianJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(GuardianJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/guardian_jellyfish.png");
    }
}
