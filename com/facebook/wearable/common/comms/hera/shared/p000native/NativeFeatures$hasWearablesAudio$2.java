package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.C00m;
import X.C00q;

/* loaded from: NativeFeatures$hasWearablesAudio$2.class */
public final class NativeFeatures$hasWearablesAudio$2 extends C00q implements C00m {
    public static final NativeFeatures$hasWearablesAudio$2 INSTANCE = new NativeFeatures$hasWearablesAudio$2();

    public NativeFeatures$hasWearablesAudio$2() {
        super(0);
    }

    @Override // X.C00m
    public final Boolean invoke() {
        boolean hasWearablesAudio;
        hasWearablesAudio = NativeFeatures.INSTANCE.hasWearablesAudio();
        return Boolean.valueOf(hasWearablesAudio);
    }
}
