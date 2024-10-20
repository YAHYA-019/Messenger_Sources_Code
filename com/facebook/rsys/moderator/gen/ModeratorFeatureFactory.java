package com.facebook.rsys.moderator.gen;

import X.HN9;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: ModeratorFeatureFactory.class */
public abstract class ModeratorFeatureFactory {

    /* loaded from: ModeratorFeatureFactory$CProxy.class */
    public final class CProxy extends ModeratorFeatureFactory {
        static {
            HN9.A00();
        }

        public static native FeatureHolder create(ModeratorProxy moderatorProxy);

        public static native ModeratorFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
