package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.7zQ;
import X.C01g;
import X.C01i;
import X.C03i;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;

/* loaded from: NativeFeatures.class */
public final class NativeFeatures {
    public static final NativeFeatures INSTANCE = new Object();
    public static final C01i hasAudio$delegate;
    public static final C01i hasHostRsys$delegate;
    public static final C01i hasLoopbackAudio$delegate;
    public static final C01i hasMockAudio$delegate;
    public static final C01i hasRsysAdapters$delegate;
    public static final C01i hasRsysAudio$delegate;
    public static final C01i hasWearablesAudio$delegate;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.wearable.common.comms.hera.shared.native.NativeFeatures, java.lang.Object] */
    static {
        HeraNativeLoader.load();
        C03i c03i = C03i.A02;
        hasAudio$delegate = C01g.A00(c03i, NativeFeatures$hasAudio$2.INSTANCE);
        hasMockAudio$delegate = C01g.A00(c03i, NativeFeatures$hasMockAudio$2.INSTANCE);
        hasLoopbackAudio$delegate = C01g.A00(c03i, NativeFeatures$hasLoopbackAudio$2.INSTANCE);
        hasRsysAudio$delegate = C01g.A00(c03i, NativeFeatures$hasRsysAudio$2.INSTANCE);
        hasWearablesAudio$delegate = C01g.A00(c03i, NativeFeatures$hasWearablesAudio$2.INSTANCE);
        hasHostRsys$delegate = C01g.A00(c03i, NativeFeatures$hasHostRsys$2.INSTANCE);
        hasRsysAdapters$delegate = C01g.A00(c03i, NativeFeatures$hasRsysAdapters$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean hasAudio();

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean hasHostRsys();

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean hasLoopbackAudio();

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean hasMockAudio();

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean hasRsysAdapters();

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean hasRsysAudio();

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean hasWearablesAudio();

    public final boolean getHasAudio() {
        return 7zQ.A1a(hasAudio$delegate);
    }

    public final boolean getHasHostRsys() {
        return 7zQ.A1a(hasHostRsys$delegate);
    }

    public final boolean getHasLoopbackAudio() {
        return 7zQ.A1a(hasLoopbackAudio$delegate);
    }

    public final boolean getHasMockAudio() {
        return 7zQ.A1a(hasMockAudio$delegate);
    }

    public final boolean getHasRsysAdapters() {
        return 7zQ.A1a(hasRsysAdapters$delegate);
    }

    public final boolean getHasRsysAudio() {
        return 7zQ.A1a(hasRsysAudio$delegate);
    }

    public final boolean getHasWearablesAudio() {
        return 7zQ.A1a(hasWearablesAudio$delegate);
    }
}
