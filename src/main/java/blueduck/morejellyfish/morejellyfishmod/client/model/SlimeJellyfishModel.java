package blueduck.morejellyfish.morejellyfishmod.client.model;// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import blueduck.morejellyfish.morejellyfishmod.entity.SlimeJellyfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class SlimeJellyfishModel extends EntityModel<SlimeJellyfishEntity> {
	private final ModelRenderer bone;
	private final ModelRenderer tentacle1;
	private final ModelRenderer tentacle2;
	private final ModelRenderer tentacle3;
	private final ModelRenderer tentacle4;

	public SlimeJellyfishModel() {
		textureWidth = 24;
		textureHeight = 24;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 19.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(0, 16).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(16, 20).addBox(-2.99F, -4.5F, -2.99F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(16, 20).addBox(0.99F, -4.5F, -2.99F, 2.0F, 2.0F, 2.0F, 0.0F, true);
		bone.setTextureOffset(18, 20).addBox(-0.5F, -2.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		this.tentacle3 = new ModelRenderer(this, 0, 0);
		this.tentacle3.setRotationPoint(-1.5F, 3.0F, -1.5F);
		this.tentacle3.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
		this.tentacle2 = new ModelRenderer(this, 0, 0);
		this.tentacle2.setRotationPoint(-1.5F, 3.0F, 1.5F);
		this.tentacle2.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
		this.tentacle4 = new ModelRenderer(this, 0, 0);
		this.tentacle4.setRotationPoint(1.5F, 3.0F, -1.5F);
		this.tentacle4.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
		this.tentacle1 = new ModelRenderer(this, 0, 0);
		this.tentacle1.setRotationPoint(1.5F, 3.0F, 1.5F);
		this.tentacle1.addBox(-1.0F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
		this.bone.addChild(this.tentacle3);
		this.bone.addChild(this.tentacle2);
		this.bone.addChild(this.tentacle4);
		this.bone.addChild(this.tentacle1);}

	@Override
	public void setRotationAngles(SlimeJellyfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        if  (!entity.isInWater()) {
            bone.rotateAngleX = (float) (30 + MathHelper.sin(limbSwing) * 0.5);
        }
        else {
            //body.rotateAngleX = 30;//(float) (entityIn.dirY * -180) + 90;
            //body.rotateAngleY = (float) (360 +(Math.atan2(entityIn.dirZ, entityIn.dirX) % (Math.PI)))%360;
            bone.rotateAngleX = 0f;
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
		RenderType.getEntityTranslucent(new ResourceLocation("more_jellyfish", "textures/entity/slime_jellyfish.png"));
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}