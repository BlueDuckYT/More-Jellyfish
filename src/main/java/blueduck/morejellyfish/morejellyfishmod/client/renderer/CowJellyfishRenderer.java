package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.CowJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.CowJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CowJellyfishRenderer extends MobRenderer<CowJellyfishEntity, CowJellyfishModel> {

    public CowJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CowJellyfishModel(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(CowJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/cow_jellyfish.png");
    }
}
