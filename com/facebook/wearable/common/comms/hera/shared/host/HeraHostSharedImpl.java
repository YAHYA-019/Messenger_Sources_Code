package com.facebook.wearable.common.comms.hera.shared.host;

import X.04S;
import X.0DE;
import X.0DR;
import X.0Pz;
import X.0Q8;
import X.11T;
import X.2aG;
import X.2aK;
import X.2aN;
import X.7zL;
import X.7zV;
import X.AnonymousClass001;
import X.C00m;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C0Bx;
import X.C2a2;
import X.DKE;
import X.GOn;
import X.JHE;
import android.util.Log;
import android.view.Surface;
import com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager;
import com.facebook.wearable.common.comms.hera.host.intf.IHeraHost;
import com.facebook.wearable.common.comms.hera.shared.context.HeraContext;
import com.facebook.wearable.common.comms.hera.shared.engine.IHeraHostCallEngine;
import com.facebook.wearable.common.comms.hera.shared.engine.config.HeraCallEngineConfigBuilder;
import com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager;
import com.facebook.wearable.common.comms.hera.shared.host.config.HeraHostConfig;
import com.facebook.wearable.common.comms.hera.shared.lifecycle.ILifecycleObserver;
import com.facebook.wearable.common.comms.hera.shared.p000native.NativeMediaFactory;
import com.facebook.wearable.common.comms.rtc.callengine2.camera.proto.CameraHardware;
import com.facebook.wearable.common.util.queue.JobQueue;
import com.meta.wearable.comms.calling.hera.engine.audio.FeatureAudioProxy;
import com.meta.wearable.comms.calling.hera.engine.base.Any;
import com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraProviderProxy;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: HeraHostSharedImpl.class */
public final class HeraHostSharedImpl implements IHeraHost {
    public final ILifecycleObserver appLifecycleObserver;
    public final FeatureAudioProxy audioProxyImpl;
    public final AudioStreamsManager audioStreamsManager;
    public IHeraCallManager callManager;
    public final FeatureCameraProviderProxy cameraProviderProxyImpl;
    public final VideoStreamsManager.VideoConfig clientVideoConfig;
    public final HeraHostConfig config;
    public IHeraHostCallEngine engine;
    public final HeraCallEngineConfigBuilder engineConfigBuilder;
    public final FeatureAudioProxy externalAudioProxy;
    public final FeatureCameraProviderProxy externalCameraProviderProxy;
    public final HeraContext heraContext;
    public final C01i mediaFactory$delegate;
    public final JobQueue queue;
    public final Set remoteClients;
    public final JHE remoteManagementEndpoint;
    public C00m toHostCamera;
    public C00m toWearableCamera;
    public final HeraHostSharedImpl$videoProxyImpl$1 videoProxyImpl;
    public final VideoStreamsManager videoStreamsManager;

    public HeraHostSharedImpl(HeraHostConfig heraHostConfig) {
        11T.A0F(heraHostConfig, 1);
        this.config = heraHostConfig;
        HeraContext heraContext = heraHostConfig.heraContext;
        this.heraContext = heraContext;
        String A18 = GOn.A18(HeraCallEngineConfigBuilder.class);
        if (A18 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        HeraCallEngineConfigBuilder heraCallEngineConfigBuilder = (HeraCallEngineConfigBuilder) heraContext.getObject(A18);
        if (heraCallEngineConfigBuilder == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.engineConfigBuilder = heraCallEngineConfigBuilder;
        this.remoteClients = 7zL.A15();
        String A00 = C0Bx.A00(JHE.class);
        if (A00 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        JHE jhe = (JHE) heraContext.getObject(A00);
        if (jhe == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.remoteManagementEndpoint = jhe;
        this.mediaFactory$delegate = C01g.A00(C03i.A02, HeraHostSharedImpl$mediaFactory$2.INSTANCE);
        this.videoStreamsManager = new VideoStreamsManager(heraHostConfig);
        this.audioStreamsManager = new AudioStreamsManager(heraHostConfig);
        this.clientVideoConfig = new VideoStreamsManager.VideoConfig(HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH, HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_HEIGHT, 15, HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_BITRATE, 5);
        this.queue = new JobQueue();
        String A002 = C0Bx.A00(ILifecycleObserver.class);
        if (A002 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        ILifecycleObserver iLifecycleObserver = (ILifecycleObserver) heraContext.getObject(A002);
        if (iLifecycleObserver == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.appLifecycleObserver = iLifecycleObserver;
        String A003 = C0Bx.A00(FeatureCameraProviderProxy.class);
        if (A003 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.externalCameraProviderProxy = (FeatureCameraProviderProxy) heraContext.getObject(A003);
        String A004 = C0Bx.A00(FeatureAudioProxy.class);
        if (A004 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.externalAudioProxy = (FeatureAudioProxy) heraContext.getObject(A004);
        this.videoProxyImpl = new HeraHostSharedImpl$videoProxyImpl$1(this);
        this.cameraProviderProxyImpl = new FeatureCameraProviderProxy() { // from class: com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl$cameraProviderProxyImpl$1
            @Override // com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraProviderProxy
            public void switchCamera2(CameraHardware cameraHardware, CameraHardware cameraHardware2) {
                String currentCallId = HeraHostSharedImpl.this.getEngine().getCurrentCallId();
                if (currentCallId == null) {
                    Log.d(HeraHostSharedImplKt.TAG, "cancelling switching camera because no existing callId");
                    return;
                }
                String str = null;
                String str2 = cameraHardware != null ? cameraHardware.deviceId_ : null;
                if (cameraHardware2 != null) {
                    str = cameraHardware2.deviceId_;
                }
                Log.d(HeraHostSharedImplKt.TAG, 0Pz.A0v("switch camera from ", str2, " to ", str));
                HeraHostSharedImpl heraHostSharedImpl = HeraHostSharedImpl.this;
                2aK.A03((Integer) null, (0DE) null, new HeraHostSharedImpl$cameraProviderProxyImpl$1$switchCamera2$$inlined$runOnQueue$1(heraHostSharedImpl, null, heraHostSharedImpl, cameraHardware, cameraHardware2, currentCallId), 2aG.A02(2aN.A01), 3);
            }
        };
        this.audioProxyImpl = new FeatureAudioProxy() { // from class: com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl$audioProxyImpl$1
            @Override // com.meta.wearable.comms.calling.hera.engine.audio.FeatureAudioProxy
            public void setMicOn2(String str, boolean z) {
                11T.A0F(str, 0);
                FeatureAudioProxy featureAudioProxy = HeraHostSharedImpl.this.externalAudioProxy;
                if (featureAudioProxy != null) {
                    featureAudioProxy.setMicOn2(str, z);
                }
                HeraHostSharedImpl heraHostSharedImpl = HeraHostSharedImpl.this;
                Iterator it = heraHostSharedImpl.remoteClients.iterator();
                while (it.hasNext()) {
                    heraHostSharedImpl.audioStreamsManager.setAudioEnabled(DKE.A0F(it), z);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NativeMediaFactory getMediaFactory() {
        return (NativeMediaFactory) this.mediaFactory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object maybeTurnOffCameraOnDisconnect(int r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl.maybeTurnOffCameraOnDisconnect(int, X.0DR):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRemoteAvailability(int i, boolean z) {
        2aK.A03((Integer) null, (0DE) null, new HeraHostSharedImpl$onRemoteAvailability$$inlined$runOnQueue$1(this, null, this, i, z), 2aG.A02(2aN.A01), 3);
    }

    private final C2a2 runOnQueue(Function1 function1) {
        return 2aK.A04(new HeraHostSharedImpl$runOnQueue$1(this, function1, null), 2aG.A02(2aN.A01));
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraHost
    public void configureCameraSourcesCallback(C00m c00m, C00m c00m2) {
        this.toHostCamera = c00m;
        this.toWearableCamera = c00m2;
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraHost
    public Object dispatchToStore(Object obj, 0DR r303) {
        if (obj instanceof Any) {
            getEngine().dispatchBlocking((Any) obj);
        } else {
            Log.w(HeraHostSharedImplKt.TAG, 0Pz.A0W("Fail to dispatch action to engine: unknown class ", 7zV.A0a(obj)));
        }
        return 04S.A00;
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraHost
    public IHeraCallManager getCallManager() {
        return this.callManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r303 == null) goto L6;
     */
    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraHost
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getDebugStats() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager r0 = r0.callManager
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            java.lang.String r0 = r0.getDebugStats()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L14:
            java.lang.String r0 = "Call manager not available"
            r303 = r0
        L18:
            r0 = r301
            com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager r0 = r0.videoStreamsManager
            java.lang.String r0 = r0.getDebugStats()
            r304 = r0
            r0 = r303
            r1 = r304
            r2 = 10
            java.lang.String r0 = X.0Pz.A0Y(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl.getDebugStats():java.lang.String");
    }

    public final IHeraHostCallEngine getEngine() {
        IHeraHostCallEngine iHeraHostCallEngine = this.engine;
        if (iHeraHostCallEngine != null) {
            return iHeraHostCallEngine;
        }
        11T.A0L("engine");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraHost
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object init(X.0DR r302) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl.init(X.0DR):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0155, code lost:
    
        if (r0.release(r304) == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraHost
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object release(X.0DR r302) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl.release(X.0DR):java.lang.Object");
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraHost
    public void setCameraOutputSurface(Surface surface, int i, int i2) {
        this.videoStreamsManager.setCameraOutputSurface(surface, i, i2);
    }

    public final void setEngine(IHeraHostCallEngine iHeraHostCallEngine) {
        11T.A0F(iHeraHostCallEngine, 0);
        this.engine = iHeraHostCallEngine;
    }
}
