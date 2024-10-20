package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.1BK;
import X.JR2;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.atc2.AtcScopeType;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: Atc2ClientTransportProvider.class */
public final class Atc2ClientTransportProvider implements INativeTransportProvider {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    /* loaded from: Atc2ClientTransportProvider$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean isAvailable() {
            return Atc2ClientTransportProvider.isAvailable();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.wearable.common.comms.hera.shared.native.Atc2ClientTransportProvider$Companion] */
    static {
        HeraNativeLoader.load();
    }

    public Atc2ClientTransportProvider(int i, boolean z, AtcScopeType atcScopeType, String str) {
        1BK.A1K(atcScopeType, 3, str);
        this.mHybridData = initHybrid(i, z, atcScopeType.getIntValue(), str);
    }

    public /* synthetic */ Atc2ClientTransportProvider(int i, boolean z, AtcScopeType atcScopeType, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? AtcScopeType.APP : atcScopeType, (i2 & 8) != 0 ? "" : str);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(int i, boolean z, int i2, String str);

    public static final native boolean isAvailable();

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider
    public String getIdentifier() {
        return JR2.A0U(this);
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider
    public native boolean start();

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider
    public native void stop();
}
