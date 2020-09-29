package blueduck.morejellyfish.morejellyfishmod.client.model;
// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import blueduck.morejellyfish.morejellyfishmod.entity.CowJellyfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class CowJellyfishModel extends EntityModel<CowJellyfishEntity> {
	private final ModelRenderer body;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;

	public CowJellyfishModel() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(-4.0F, 24.9F, 5.0F);
		body.setTextureOffset(0, 0).addBox(-3.0F, -10.9F, -12.0F, 14.0F, 10.0F, 14.0F, 0.0F, false);
		body.setTextureOffset(13, 27).addBox(1.0F, -1.1F, -8.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(0.0F, 24.0F, 0.0F);
		leg1.setTextureOffset(0, 24).addBox(-6.0F, -0.1F, 3.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(0.0F, 24.0F, 0.0F);
		leg2.setTextureOffset(0, 24).addBox(-6.0F, -0.1F, -6.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(0.0F, 24.0F, 0.0F);
		leg3.setTextureOffset(0, 24).addBox(3.0F, -0.1F, 3.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(0.0F, 24.0F, 0.0F);
		leg4.setTextureOffset(0, 24).addBox(3.0F, -0.1F, -6.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);
	}

	@Override
	public void setRotationAngles(CowJellyfishEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){

		float rotateVal = ageInTicks * 0.1F;

		leg1.rotationPointY = 22.9F + MathHelper.sin(rotateVal);
		leg2.rotationPointY = 22.9F + MathHelper.sin(rotateVal);
		leg3.rotationPointY = 22.9F + MathHelper.sin(rotateVal);
		leg4.rotationPointY = 22.9F + MathHelper.sin(rotateVal);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}