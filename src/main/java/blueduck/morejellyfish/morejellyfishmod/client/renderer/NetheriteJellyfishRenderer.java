package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.ClayJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.client.model.NetheriteJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.ClayJellyfishEntity;
import blueduck.morejellyfish.morejellyfishmod.entity.NetheriteJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class NetheriteJellyfishRenderer extends MobRenderer<NetheriteJellyfishEntity, NetheriteJellyfishModel> {

    public NetheriteJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new NetheriteJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(NetheriteJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/netherite_jellyfish.png");
    }
}
