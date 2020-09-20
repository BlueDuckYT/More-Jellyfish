package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.BrownFungalJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.BrownFungalJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BrownFungalJellyfishRenderer extends MobRenderer<BrownFungalJellyfishEntity, BrownFungalJellyfishModel> {

    public BrownFungalJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BrownFungalJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(BrownFungalJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/brown_fungal_jellyfish.png");
    }
}
