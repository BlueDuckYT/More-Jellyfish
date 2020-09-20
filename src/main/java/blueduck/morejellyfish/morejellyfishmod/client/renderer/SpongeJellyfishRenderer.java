package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.SpongeJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.SpongeJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SpongeJellyfishRenderer extends MobRenderer<SpongeJellyfishEntity, SpongeJellyfishModel> {

    public SpongeJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SpongeJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(SpongeJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/sponge_jellyfish.png");
    }
}
