package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.DiamondJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.DiamondJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DiamondJellyfishRenderer extends MobRenderer<DiamondJellyfishEntity, DiamondJellyfishModel> {

    public DiamondJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DiamondJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(DiamondJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/diamond_jellyfish.png");
    }
}
