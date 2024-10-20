package com.facebook.cameracore.mediapipeline.services.gallerypicker;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: GalleryPickerServiceConfigurationHybrid.class */
public class GalleryPickerServiceConfigurationHybrid extends ServiceConfiguration {
    public final GalleryPickerServiceConfiguration mConfiguration;

    public GalleryPickerServiceConfigurationHybrid(GalleryPickerServiceConfiguration galleryPickerServiceConfiguration) {
        this.mConfiguration = galleryPickerServiceConfiguration;
        this.mHybridData = initHybrid(galleryPickerServiceConfiguration.A00);
    }

    public static native HybridData initHybrid(GalleryPickerServiceDataSource galleryPickerServiceDataSource);
}
