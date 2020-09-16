package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.LapisLazuliJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.LapisLazuliJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class LapisLazuliJellyfishRenderer extends MobRenderer<LapisLazuliJellyfishEntity, LapisLazuliJellyfishModel> {

    public LapisLazuliJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new LapisLazuliJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(LapisLazuliJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/lapis_lazuli_jellyfish.png");
    }
}
