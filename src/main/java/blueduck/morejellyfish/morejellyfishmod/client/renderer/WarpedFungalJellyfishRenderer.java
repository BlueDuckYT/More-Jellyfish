package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.WarpedFungalJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.WarpedFungalJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class WarpedFungalJellyfishRenderer extends MobRenderer<WarpedFungalJellyfishEntity, WarpedFungalJellyfishModel> {

    public WarpedFungalJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new WarpedFungalJellyfishModel(), 0.3F);
        this.addLayer(new WarpedJellyfishGlowLayer(this));
    }

    @Override
    public ResourceLocation getEntityTexture(WarpedFungalJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/warped_fungal_jellyfish.png");
    }
}
