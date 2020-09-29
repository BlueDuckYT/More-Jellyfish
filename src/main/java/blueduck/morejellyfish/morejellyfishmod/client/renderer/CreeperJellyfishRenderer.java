package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.CreeperJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.CreeperJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CreeperJellyfishRenderer extends MobRenderer<CreeperJellyfishEntity, CreeperJellyfishModel> {

    public CreeperJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CreeperJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(CreeperJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/creeper_jellyfish.png");
    }
}
