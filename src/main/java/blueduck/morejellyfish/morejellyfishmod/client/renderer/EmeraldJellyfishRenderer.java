package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.DiamondJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.client.model.EmeraldJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.DiamondJellyfishEntity;
import blueduck.morejellyfish.morejellyfishmod.entity.EmeraldJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class EmeraldJellyfishRenderer extends MobRenderer<EmeraldJellyfishEntity, EmeraldJellyfishModel> {

    public EmeraldJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new EmeraldJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(EmeraldJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/emerald_jellyfish.png");
    }
}
