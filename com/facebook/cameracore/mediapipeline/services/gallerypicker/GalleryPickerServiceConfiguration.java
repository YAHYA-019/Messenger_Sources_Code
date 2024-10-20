package com.facebook.cameracore.mediapipeline.services.gallerypicker;

import X.HC7;
import X.HFT;
import X.Hy3;

/* loaded from: GalleryPickerServiceConfiguration.class */
public class GalleryPickerServiceConfiguration extends HFT {
    public static final Hy3 A01 = new Hy3(HC7.A0U);
    public final GalleryPickerServiceDataSource A00;

    public GalleryPickerServiceConfiguration(GalleryPickerServiceDataSource galleryPickerServiceDataSource) {
        this.A00 = galleryPickerServiceDataSource;
    }

    public GalleryPickerServiceDataSource getDataSource() {
        return this.A00;
    }
}
