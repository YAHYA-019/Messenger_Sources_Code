package com.facebook.rsys.view.gen;

import X.HNN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: ViewFeatureFactory.class */
public abstract class ViewFeatureFactory {

    /* loaded from: ViewFeatureFactory$CProxy.class */
    public final class CProxy extends ViewFeatureFactory {
        static {
            HNN.A00();
        }

        public static native FeatureHolder create(ViewProxy viewProxy);

        public static native ViewFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
