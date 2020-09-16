package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.GoldJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.GoldJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GoldJellyfishRenderer extends MobRenderer<GoldJellyfishEntity, GoldJellyfishModel> {

    public GoldJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GoldJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(GoldJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/gold_jellyfish.png");
    }
}
