package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.GlowstoneJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.GlowstoneJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GlowstoneJellyfishRenderer extends MobRenderer<GlowstoneJellyfishEntity, GlowstoneJellyfishModel> {

    public GlowstoneJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GlowstoneJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(GlowstoneJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/glowstone_jellyfish.png");
    }
}
