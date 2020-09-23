//// Made with Blockbench 3.6.6
//// Exported for Minecraft version 1.15
//// Paste this class into your mod and generate all required imports
//
//
//public class GuardianJellyfishModel extends EntityModel<Entity> {
//	private final ModelRenderer bone;
//	private final ModelRenderer tentacle1;
//	private final ModelRenderer tentacle2;
//	private final ModelRenderer tentacle3;
//	private final ModelRenderer tentacle4;
//	private final ModelRenderer eye;
//	private final ModelRenderer spiek;
//	private final ModelRenderer spiek2;
//	private final ModelRenderer spiek3;
//	private final ModelRenderer spiek4;
//	private final ModelRenderer spiek5;
//	private final ModelRenderer spiek6;
//	private final ModelRenderer spiek7;
//	private final ModelRenderer spiek8;
//
//	public GuardianJellyfishModel() {
//		textureWidth = 24;
//		textureHeight = 12;
//
//		bone = new ModelRenderer(this);
//		bone.setRotationPoint(0.0F, 19.0F, 0.0F);
//		bone.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
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
//
//		eye = new ModelRenderer(this);
//		eye.setRotationPoint(0.0F, -2.5F, -3.0F);
//		bone.addChild(eye);
//		eye.setTextureOffset(18, 0).addBox(-1.0F, -1.0F, -0.01F, 2.0F, 2.0F, 1.0F, 0.0F, false);
//
//		spiek = new ModelRenderer(this);
//		spiek.setRotationPoint(3.0F, -6.0F, -3.0F);
//		bone.addChild(spiek);
//		setRotationAngle(spiek, 0.7854F, -0.7854F, 0.0F);
//		spiek.setTextureOffset(0, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
//
//		spiek2 = new ModelRenderer(this);
//		spiek2.setRotationPoint(-3.0F, -6.0F, -3.0F);
//		bone.addChild(spiek2);
//		setRotationAngle(spiek2, 0.7854F, 0.7854F, 0.0F);
//		spiek2.setTextureOffset(0, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
//
//		spiek3 = new ModelRenderer(this);
//		spiek3.setRotationPoint(-3.0F, -6.0F, 3.0F);
//		bone.addChild(spiek3);
//		setRotationAngle(spiek3, -0.7854F, -0.7854F, 0.0F);
//		spiek3.setTextureOffset(0, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
//
//		spiek4 = new ModelRenderer(this);
//		spiek4.setRotationPoint(3.0F, -6.0F, 3.0F);
//		bone.addChild(spiek4);
//		setRotationAngle(spiek4, -0.7854F, 0.7854F, 0.0F);
//		spiek4.setTextureOffset(0, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
//
//		spiek5 = new ModelRenderer(this);
//		spiek5.setRotationPoint(3.0F, 0.0F, 3.0F);
//		bone.addChild(spiek5);
//		setRotationAngle(spiek5, 0.7854F, 0.7854F, 0.0F);
//		spiek5.setTextureOffset(0, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
//
//		spiek6 = new ModelRenderer(this);
//		spiek6.setRotationPoint(-3.0F, 0.0F, 3.0F);
//		bone.addChild(spiek6);
//		setRotationAngle(spiek6, 0.7854F, -0.7854F, 0.0F);
//		spiek6.setTextureOffset(0, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
//
//		spiek7 = new ModelRenderer(this);
//		spiek7.setRotationPoint(-3.0F, 0.0F, -3.0F);
//		bone.addChild(spiek7);
//		setRotationAngle(spiek7, -0.7854F, 0.7854F, 0.0F);
//		spiek7.setTextureOffset(0, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
//
//		spiek8 = new ModelRenderer(this);
//		spiek8.setRotationPoint(3.0F, 0.0F, -3.0F);
//		bone.addChild(spiek8);
//		setRotationAngle(spiek8, -0.7854F, -0.7854F, 0.0F);
//		spiek8.setTextureOffset(0, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
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