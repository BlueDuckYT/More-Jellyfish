package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.SlimeJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.SlimeJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SlimeJellyfishRenderer extends MobRenderer<SlimeJellyfishEntity, SlimeJellyfishModel> {

    public SlimeJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SlimeJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(SlimeJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/slime_jellyfish.png");
    }
}
