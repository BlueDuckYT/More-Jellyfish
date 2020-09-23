//// Made with Blockbench 3.6.6
//// Exported for Minecraft version 1.15
//// Paste this class into your mod and generate all required imports
//
//
//public class ChickenJellyfishModel extends EntityModel<Entity> {
//	private final ModelRenderer bone;
//	private final ModelRenderer tentacle1;
//	private final ModelRenderer tentacle2;
//	private final ModelRenderer tentacle3;
//	private final ModelRenderer tentacle4;
//
//	public ChickenJellyfishModel() {
//		textureWidth = 24;
//		textureHeight = 15;
//
//		bone = new ModelRenderer(this);
//		bone.setRotationPoint(0.0F, 19.0F, 0.0F);
//		bone.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
//		bone.setTextureOffset(0, 12).addBox(-2.0F, -3.5F, -4.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
//
//		tentacle1 = new ModelRenderer(this);
//		tentacle1.setRotationPoint(-1.5F, 0.0F, 1.5F);
//		bone.addChild(tentacle1);
//		tentacle1.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
//
//		tentacle2 = new ModelRenderer(this);
//		tentacle2.setRotationPoint(1.5F, 0.0F, 1.5F);
//		bone.addChild(tentacle2);
//		tentacle2.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
//
//		tentacle3 = new ModelRenderer(this);
//		tentacle3.setRotationPoint(1.5F, 0.0F, -1.5F);
//		bone.addChild(tentacle3);
//		tentacle3.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
//
//		tentacle4 = new ModelRenderer(this);
//		tentacle4.setRotationPoint(-1.5F, 0.0F, -1.5F);
//		bone.addChild(tentacle4);
//		tentacle4.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
//	}
//
//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}
//
//	@Override
//	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
//		bone.render(matrixStack, buffer, packedLight, packedOverlay);
//	}
//
//	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
//		modelRenderer.rotateAngleX = x;
//		modelRenderer.rotateAngleY = y;
//		modelRenderer.rotateAngleZ = z;
//	}
//}