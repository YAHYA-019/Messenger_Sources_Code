package com.facebook.rsys.mosaicgrid.gen;

import X.HNA;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: MosaicGridFeatureFactory.class */
public abstract class MosaicGridFeatureFactory {

    /* loaded from: MosaicGridFeatureFactory$CProxy.class */
    public final class CProxy extends MosaicGridFeatureFactory {
        static {
            HNA.A00();
        }

        public static native FeatureHolder create(MosaicGridProxy mosaicGridProxy, MosaicGridParams mosaicGridParams);

        public static native MosaicGridFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
