package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.RedFungalJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.RedFungalJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RedFungalJellyfishRenderer extends MobRenderer<RedFungalJellyfishEntity, RedFungalJellyfishModel> {

    public RedFungalJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new RedFungalJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(RedFungalJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/red_fungal_jellyfish.png");
    }
}
