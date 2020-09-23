package blueduck.morejellyfish.morejellyfishmod.client.renderer;

import blueduck.morejellyfish.morejellyfishmod.client.model.SlimeJellyfishModel;
import blueduck.morejellyfish.morejellyfishmod.entity.SlimeJellyfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import static com.mojang.blaze3d.platform.GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA;
import static com.mojang.blaze3d.platform.GlStateManager.SourceFactor.SRC_ALPHA;

public class SlimeJellyfishRenderer extends MobRenderer<SlimeJellyfishEntity, SlimeJellyfishModel> {

    public SlimeJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SlimeJellyfishModel(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(SlimeJellyfishEntity entity) {
        return new ResourceLocation("more_jellyfish", "textures/entity/slime_jellyfish.png");
    }

    @Override
    public void render(SlimeJellyfishEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        RenderSystem.blendFunc(SRC_ALPHA, ONE_MINUS_SRC_ALPHA);
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }
}
//RenderSystem.setBlendFunc(SRC_ALPHA, ONE_MINUS_SRC_ALPHA);