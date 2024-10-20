package com.facebook.rsys.polls.gen;

import X.Kag;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: PollsFeatureFactory.class */
public abstract class PollsFeatureFactory {

    /* loaded from: PollsFeatureFactory$CProxy.class */
    public final class CProxy extends PollsFeatureFactory {
        static {
            Kag.A00();
        }

        public static native FeatureHolder create(PollsProxy pollsProxy);

        public static native PollsFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
