package blueduck.morejellyfish.morejellyfishmod.client.model;// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import blueduck.morejellyfish.morejellyfishmod.entity.GuardianJellyfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class GuardianJellyfishModel extends EntityModel<GuardianJellyfishEntity> {
	private final ModelRenderer body;
	private final ModelRenderer tentacle1;
	private final ModelRenderer tentacle2;
	private final ModelRenderer tentacle3;
	private final ModelRenderer tentacle4;
	private final ModelRenderer spiek;
	private final ModelRenderer spiek2;
	private final ModelRenderer spiek3;
	private final ModelRenderer spiek4;
	private final ModelRenderer spiek5;
	private final ModelRenderer spiek6;
	private final ModelRenderer spiek7;
	private final ModelRenderer spiek8;

	public GuardianJellyfishModel() {
		textureWidth = 24;
		textureHeight = 12;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		tentacle1 = new ModelRenderer(this);
		tentacle1.setRotationPoint(-1.5F, 0.0F, 1.5F);
		body.addChild(tentacle1);
		tentacle1.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		tentacle2 = new ModelRenderer(this);
		tentacle2.setRotationPoint(1.5F, 0.0F, 1.5F);
		body.addChild(tentacle2);
		tentacle2.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		tentacle3 = new ModelRenderer(this);
		tentacle3.setRotationPoint(1.5F, 0.0F, -1.5F);
		body.addChild(tentacle3);
		tentacle3.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		tentacle4 = new ModelRenderer(this);
		tentacle4.setRotationPoint(-1.5F, 0.0F, -1.5F);
		body.addChild(tentacle4);
		tentacle4.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		spiek = new ModelRenderer(this);
		spiek.setRotationPoint(3.0F, -6.0F, -3.0F);
		body.addChild(spiek);
		setRotationAngle(spiek, 0.7854F, -0.7854F, 0.0F);
		spiek.setTextureOffset(0, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		spiek2 = new ModelRenderer(this);
		spiek2.setRotationPoint(-3.0F, -6.0F, -3.0F);
		body.addChild(spiek2);
		setRotationAngle(spiek2, 0.7854F, 0.7854F, 0.0F);
		spiek2.setTextureOffset(0, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		spiek3 = new ModelRenderer(this);
		spiek3.setRotationPoint(-3.0F, -6.0F, 3.0F);
		body.addChild(spiek3);
		setRotationAngle(spiek3, -0.7854F, -0.7854F, 0.0F);
		spiek3.setTextureOffset(0, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		spiek4 = new ModelRenderer(this);
		spiek4.setRotationPoint(3.0F, -6.0F, 3.0F);
		body.addChild(spiek4);
		setRotationAngle(spiek4, -0.7854F, 0.7854F, 0.0F);
		spiek4.setTextureOffset(0, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		spiek5 = new ModelRenderer(this);
		spiek5.setRotationPoint(3.0F, 0.0F, 3.0F);
		body.addChild(spiek5);
		setRotationAngle(spiek5, 0.7854F, 0.7854F, 0.0F);
		spiek5.setTextureOffset(0, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		spiek6 = new ModelRenderer(this);
		spiek6.setRotationPoint(-3.0F, 0.0F, 3.0F);
		body.addChild(spiek6);
		setRotationAngle(spiek6, 0.7854F, -0.7854F, 0.0F);
		spiek6.setTextureOffset(0, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		spiek7 = new ModelRenderer(this);
		spiek7.setRotationPoint(-3.0F, 0.0F, -3.0F);
		body.addChild(spiek7);
		setRotationAngle(spiek7, -0.7854F, 0.7854F, 0.0F);
		spiek7.setTextureOffset(0, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		spiek8 = new ModelRenderer(this);
		spiek8.setRotationPoint(3.0F, 0.0F, -3.0F);
		body.addChild(spiek8);
		setRotationAngle(spiek8, -0.7854F, -0.7854F, 0.0F);
		spiek8.setTextureOffset(0, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(GuardianJellyfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if  (!entity.isInWater()) {
			body.rotateAngleX = (float) (30 + MathHelper.sin(limbSwing) * 0.5);
		}
		else {
			//body.rotateAngleX = 30;//(float) (entityIn.dirY * -180) + 90;
			//body.rotateAngleY = (float) (360 +(Math.atan2(entityIn.dirZ, entityIn.dirX) % (Math.PI)))%360;
			body.rotateAngleX = 0f;
		}

		float rotateVal = ageInTicks * 0.1F;

		tentacle1.rotateAngleX = Math.abs(MathHelper.sin(rotateVal)) * 0.5F;
		tentacle1.rotateAngleZ = Math.abs(MathHelper.sin(rotateVal)) * -0.5F;

		tentacle2.rotateAngleX = Math.abs(MathHelper.sin(rotateVal)) * 0.5F;
		tentacle2.rotateAngleZ = Math.abs(MathHelper.sin(rotateVal)) * 0.5F;

		tentacle3.rotateAngleX = Math.abs(MathHelper.sin(rotateVal)) * -0.5F;
		tentacle3.rotateAngleZ = Math.abs(MathHelper.sin(rotateVal)) * 0.5F;

		tentacle4.rotateAngleX = Math.abs(MathHelper.sin(rotateVal)) * -0.5F;
		tentacle4.rotateAngleZ = Math.abs(MathHelper.sin(rotateVal)) * -0.5F;

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}