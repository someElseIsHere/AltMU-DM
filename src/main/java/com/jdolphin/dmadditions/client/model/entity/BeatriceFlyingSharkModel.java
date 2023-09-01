package com.jdolphin.dmadditions.client.model.entity;

import com.google.common.collect.ImmutableList;
import com.jdolphin.dmadditions.DmAdditions;
import com.jdolphin.dmadditions.entity.BeatriceFlyingSharkEntity;
import com.swdteam.client.model.IModelPartReloader;
import com.swdteam.client.model.ModelReloaderRegistry;
import com.swdteam.model.javajson.JSONModel;
import com.swdteam.model.javajson.ModelLoader;
import com.swdteam.model.javajson.ModelWrapper;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

public class BeatriceFlyingSharkModel extends SegmentedModel<BeatriceFlyingSharkEntity> implements IModelPartReloader {

	protected ModelRenderer beatrice_flying_shark;
	public JSONModel model;

	public BeatriceFlyingSharkModel() {
		super();
		ModelReloaderRegistry.register(this);
	}

	@Override
	public void init() {
		this.model = ModelLoader.loadModel(new ResourceLocation(DmAdditions.MODID, "models/entity/beatrice_flying_shark.json"));
		ModelWrapper modelWrapper = this.model.getModelData().getModel();
		this.beatrice_flying_shark = modelWrapper.getPart("beatrice_flying_shark");
	}

	@Override
	public JSONModel getModel() {
		return model;
	}

	@Override
	public Iterable<ModelRenderer> parts() {
		return ImmutableList.of(beatrice_flying_shark);
	}

	@Override
	public void setupAnim(BeatriceFlyingSharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		// Implement animation setup for your entity here if needed
	}
}
