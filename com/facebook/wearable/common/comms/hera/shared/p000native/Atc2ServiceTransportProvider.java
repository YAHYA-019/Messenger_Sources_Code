package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.11T;
import X.JR2;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.atc2.AtcScopeType;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: Atc2ServiceTransportProvider.class */
public final class Atc2ServiceTransportProvider implements INativeTransportProvider {
    public static final Companion Companion = new Object();
    public final int dataXServiceId;
    public final int localNodeId;
    public final HybridData mHybridData;
    public final AtcScopeType scopeType;

    /* loaded from: Atc2ServiceTransportProvider$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean isAvailable() {
            return Atc2ServiceTransportProvider.isAvailable();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.wearable.common.comms.hera.shared.native.Atc2ServiceTransportProvider$Companion, java.lang.Object] */
    static {
        HeraNativeLoader.load();
    }

    public Atc2ServiceTransportProvider(int i, AtcScopeType atcScopeType, int i2) {
        11T.A0F(atcScopeType, 2);
        this.localNodeId = i;
        this.scopeType = atcScopeType;
        this.dataXServiceId = i2;
        this.mHybridData = initHybrid(i, atcScopeType.getIntValue(), i2);
    }

    public /* synthetic */ Atc2ServiceTransportProvider(int i, AtcScopeType atcScopeType, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? AtcScopeType.APP : atcScopeType, (i3 & 4) != 0 ? 0 : i2);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(int i, int i2, int i3);

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
