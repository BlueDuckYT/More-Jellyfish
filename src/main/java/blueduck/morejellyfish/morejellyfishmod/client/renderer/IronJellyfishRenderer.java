package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.GoldJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.client.model.IronJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.GoldJellyfishEntity;
import blueduck.morejellyfish.morejellyfishmod.entity.IronJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class IronJellyfishRenderer extends MobRenderer<IronJellyfishEntity, IronJellyfishModel> {

    public IronJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new IronJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(IronJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/iron_jellyfish.png");
    }
}
