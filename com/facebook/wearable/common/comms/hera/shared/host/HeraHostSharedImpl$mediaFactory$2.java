package com.facebook.wearable.common.comms.hera.shared.host;

import X.C00m;
import X.C00q;
import com.facebook.wearable.common.comms.hera.shared.p000native.NativeMediaFactory;

/* loaded from: HeraHostSharedImpl$mediaFactory$2.class */
public final class HeraHostSharedImpl$mediaFactory$2 extends C00q implements C00m {
    public static final HeraHostSharedImpl$mediaFactory$2 INSTANCE = new HeraHostSharedImpl$mediaFactory$2();

    public HeraHostSharedImpl$mediaFactory$2() {
        super(0);
    }

    @Override // X.C00m
    public final NativeMediaFactory invoke() {
        return new NativeMediaFactory(false);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        return new NativeMediaFactory(false);
    }
}
