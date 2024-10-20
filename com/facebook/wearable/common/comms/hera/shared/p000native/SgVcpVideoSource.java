package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.02L;
import X.04S;
import X.0DR;
import X.0QQ;
import X.0Ro;
import X.0Xs;
import X.11T;
import X.1BK;
import X.AnonymousClass001;
import X.C00m;
import X.C00t;
import X.C15t;
import X.I6K;
import X.IJE;
import X.Il0;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: SgVcpVideoSource.class */
public final class SgVcpVideoSource implements IRawVideoSource {
    public static final Companion Companion = new Object();
    public final 0Xs activeFlow;
    public final C15t isVideoSourceActive;
    public final HybridData mHybridData;
    public Function1 onCameraErrorCallback;
    public C00m onCaptureStartedCallback;
    public final Il0 previewViewSink;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: SgVcpVideoSource$CameraError.class */
    public final class CameraError {
        public static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* synthetic */ CameraError[] $VALUES;
        public static final CameraError INTERNAL_ERROR = new CameraError("INTERNAL_ERROR", 0);
        public static final CameraError DOWNSCALE_ERROR = new CameraError("DOWNSCALE_ERROR", 1);
        public static final CameraError TAMPER_WARNING = new CameraError("TAMPER_WARNING", 2);
        public static final CameraError TAMPER_ERROR = new CameraError("TAMPER_ERROR", 3);
        public static final CameraError HINGE_CLOSED = new CameraError("HINGE_CLOSED", 4);

        public static final /* synthetic */ CameraError[] $values() {
            return new CameraError[]{INTERNAL_ERROR, DOWNSCALE_ERROR, TAMPER_WARNING, TAMPER_ERROR, HINGE_CLOSED};
        }

        static {
            CameraError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C00t.A00($values);
        }

        public CameraError(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static CameraError valueOf(String str) {
            return (CameraError) Enum.valueOf(CameraError.class, str);
        }

        public static CameraError[] values() {
            return (CameraError[]) $VALUES.clone();
        }
    }

    /* loaded from: SgVcpVideoSource$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean isAvailable() {
            return SgVcpVideoSource.isAvailable();
        }
    }

    public SgVcpVideoSource() {
        HeraNativeLoader.load();
        this.mHybridData = initHybrid();
        this.previewViewSink = new Il0(new SgVcpVideoSource$previewViewSink$1(this));
        0Ro r0 = new 0Ro(1BK.A0d());
        this.activeFlow = r0;
        this.isVideoSourceActive = r0;
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static Object getPreviewView$delegate(SgVcpVideoSource sgVcpVideoSource) {
        return new 0QQ(Il0.class, sgVcpVideoSource.previewViewSink, "view", "getView()Landroid/view/SurfaceView;");
    }

    private final native HybridData initHybrid();

    public static final native boolean isAvailable();

    private final void onCameraError(int i) {
        Object A02 = 02L.A02(CameraError.values(), i);
        if (A02 == null) {
            A02 = CameraError.INTERNAL_ERROR;
        }
        Function1 function1 = this.onCameraErrorCallback;
        if (function1 != null) {
            function1.invoke(A02);
        }
    }

    private final void onCaptureStarted() {
        C00m c00m = this.onCaptureStartedCallback;
        if (c00m != null) {
            c00m.invoke();
        }
    }

    private final native void releaseNative();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void setPreviewSurface(Surface surface);

    private final native void startNative();

    private final native void stopNative();

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public void addOutput(IRawVideoSource.Output output) {
        throw AnonymousClass001.A0q("addOutput not supported");
    }

    public final Function1 getOnCameraErrorCallback() {
        return this.onCameraErrorCallback;
    }

    public final C00m getOnCaptureStartedCallback() {
        return this.onCaptureStartedCallback;
    }

    public SurfaceView getPreviewView() {
        return this.previewViewSink.A01;
    }

    public C15t isVideoSourceActive() {
        return this.isVideoSourceActive;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public Object release(0DR r302) {
        this.activeFlow.Cvx(1BK.A0d());
        return 04S.A00;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public void releaseBlocking() {
        I6K.releaseBlocking(this);
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public void removeOutput(IRawVideoSource.Output output) {
        throw AnonymousClass001.A0q("removeOutput not supported");
    }

    public final void setOnCameraErrorCallback(Function1 function1) {
        this.onCameraErrorCallback = function1;
    }

    public final void setOnCaptureStartedCallback(C00m c00m) {
        this.onCaptureStartedCallback = c00m;
    }

    public void setPreviewView(SurfaceView surfaceView) {
        SurfaceHolder holder;
        Il0 il0 = this.previewViewSink;
        SurfaceView surfaceView2 = il0.A01;
        if (surfaceView2 != null && (holder = surfaceView2.getHolder()) != null) {
            IJE ije = il0.A04;
            holder.removeCallback(ije);
            ije.surfaceDestroyed(holder);
        }
        il0.A01 = null;
        il0.A02 = null;
        if (surfaceView != null) {
            Surface surface = surfaceView.getHolder().getSurface();
            if (surface != null && surface.isValid()) {
                IJE ije2 = il0.A04;
                SurfaceHolder holder2 = surfaceView.getHolder();
                11T.A0A(holder2);
                ije2.surfaceCreated(holder2);
            }
            SurfaceHolder holder3 = surfaceView.getHolder();
            if (holder3 != null) {
                holder3.addCallback(il0.A04);
            }
            il0.A01 = surfaceView;
        }
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public Object start(0DR r302) {
        this.activeFlow.Cvx(AnonymousClass001.A0K());
        return 04S.A00;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public void startBlocking() {
        I6K.startBlocking(this);
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public Object stop(0DR r302) {
        this.activeFlow.Cvx(1BK.A0d());
        return 04S.A00;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public void stopBlocking() {
        I6K.stopBlocking(this);
    }
}
