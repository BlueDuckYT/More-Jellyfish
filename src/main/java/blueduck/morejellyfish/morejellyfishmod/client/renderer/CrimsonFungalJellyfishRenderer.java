package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.CrimsonFungalJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.CrimsonFungalJellyfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CrimsonFungalJellyfishRenderer extends MobRenderer<CrimsonFungalJellyfishEntity, CrimsonFungalJellyfishModel> {

    public CrimsonFungalJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CrimsonFungalJellyfishModel(), 0.3F);
        //this.addLayer(new CrimsonJellyfishGlowLayer(this));
    }

    @Override
    public ResourceLocation getEntityTexture(CrimsonFungalJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/crimson_fungal_jellyfish.png");
    }
}
