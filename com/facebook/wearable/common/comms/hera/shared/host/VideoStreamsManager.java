package com.facebook.wearable.common.comms.hera.shared.host;

import X.04S;
import X.0DE;
import X.0DR;
import X.0Ds;
import X.0Pz;
import X.11T;
import X.1BK;
import X.2aI;
import X.2aK;
import X.7zL;
import X.7zN;
import X.AnonymousClass001;
import X.C0Bx;
import X.GOn;
import X.H3z;
import X.HBE;
import X.JDd;
import X.JJM;
import X.JKh;
import X.JLV;
import X.RaA;
import android.util.Log;
import android.view.Surface;
import com.facebook.wearable.common.comms.hera.host.intf.IHeraHostEventLogger;
import com.facebook.wearable.common.comms.hera.host.intf.IHeraVideoBridge;
import com.facebook.wearable.common.comms.hera.shared.context.HeraContext;
import com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager;
import com.facebook.wearable.common.comms.hera.shared.host.config.CameraOutputRotation;
import com.facebook.wearable.common.comms.hera.shared.host.config.HeraHostConfig;
import com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource;
import com.facebook.wearable.common.comms.rtc.hera.intf.IVideoReceiver;
import com.facebook.wearable.common.comms.rtc.hera.intf.IVideoSender;
import com.facebook.wearable.common.comms.rtc.hera.video.mixer.RawVideoMixer;
import com.facebook.wearable.common.comms.rtc.hera.video.util.VideoSize;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: VideoStreamsManager.class */
public final class VideoStreamsManager {
    public static final String TAG = "Hera.VideoStreamsManager";
    public final RawVideoMixer cameraVideoMixer;
    public final 2aI coroutineScope;
    public final boolean enableFusionCamera;
    public final IHeraHostEventLogger eventLogger;
    public IRawVideoSource.SurfaceOutput externalSurfaceOutput;
    public final RawVideoMixer peerVideoMixer;
    public final Map remoteClients;
    public final JLV remoteVideoEndpoint;
    public final IHeraVideoBridge videoBridge;
    public static final Companion Companion = new Object();
    public static final RaA VIEWPORT_PIP = new RaA(0.25f, 0.5f, 0.15f, 0.25f);

    /* loaded from: VideoStreamsManager$Companion.class */
    public final class Companion {

        /* loaded from: VideoStreamsManager$Companion$WhenMappings.class */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x002e
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
                	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
                */
            static {
                /*
                    X.HBE[] r0 = X.HBE.values()
                    r301 = r0
                    r0 = r301
                    int r0 = r0.length
                    r302 = r0
                    r0 = r302
                    int[] r0 = new int[r0]
                    r303 = r0
                    X.HBE r0 = X.HBE.A03     // Catch: java.lang.NoSuchFieldError -> L2e
                    r301 = r0
                    r0 = r301
                    int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e
                    r304 = r0
                    r0 = 1
                    r302 = r0
                    r0 = r303
                    r1 = r304
                    r2 = r302
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2e
                L1a:
                    X.HBE r0 = X.HBE.A08     // Catch: java.lang.NoSuchFieldError -> L2e java.lang.NoSuchFieldError -> L32
                    r301 = r0
                    r0 = r301
                    int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L32
                    r304 = r0
                    r0 = 2
                    r302 = r0
                    r0 = r303
                    r1 = r304
                    r2 = r302
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L32
                L29:
                    r0 = r303
                    com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager.Companion.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
                L2e:
                    goto L1a
                L32:
                    goto L29
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager.Companion.WhenMappings.m10267clinit():void");
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getZOrderForClient(int i) {
            HBE hbe = (HBE) 7zN.A0r(HBE.A00, i);
            int i2 = -1;
            if (hbe != null) {
                int ordinal = hbe.ordinal();
                if (ordinal == 1) {
                    return 0;
                }
                if (ordinal == 0) {
                    i2 = 100;
                }
            }
            return i2;
        }
    }

    /* loaded from: VideoStreamsManager$RemoteClientVideoState.class */
    public final class RemoteClientVideoState {
        public boolean cameraEnabled;
        public H3z cameraMixerInput;
        public final JJM mediaFactory;
        public final int remoteId;
        public final /* synthetic */ VideoStreamsManager this$0;
        public IVideoReceiver videoReceiver;
        public final IVideoSender videoSender;

        public RemoteClientVideoState(VideoStreamsManager videoStreamsManager, int i, JJM jjm, boolean z) {
            11T.A0F(jjm, 3);
            this.this$0 = videoStreamsManager;
            this.remoteId = i;
            this.mediaFactory = jjm;
            this.cameraEnabled = z;
            JKh createMediaSender = jjm.createMediaSender(i, videoStreamsManager.peerVideoMixer);
            11T.A0I(createMediaSender, "null cannot be cast to non-null type com.facebook.wearable.common.comms.rtc.hera.intf.IVideoSender");
            this.videoSender = (IVideoSender) createMediaSender;
        }

        public /* synthetic */ RemoteClientVideoState(VideoStreamsManager videoStreamsManager, int i, JJM jjm, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(videoStreamsManager, i, jjm, (i2 & 4) != 0 ? true : z);
        }

        public final Object deinitReceiver(0DR r302) {
            H3z h3z = this.cameraMixerInput;
            if (h3z != null) {
                h3z.A02(false);
                h3z.release();
            }
            this.cameraMixerInput = null;
            IVideoReceiver iVideoReceiver = this.videoReceiver;
            if (iVideoReceiver != null) {
                VideoStreamsManager videoStreamsManager = this.this$0;
                iVideoReceiver.disconnect();
                videoStreamsManager.remoteVideoEndpoint.removeLocalVideoReceiver(iVideoReceiver);
            }
            this.videoReceiver = null;
            return 04S.A00;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object deinitSenderReceiver(X.0DR r302) {
            /*
                r301 = this;
                r0 = r302
                boolean r0 = r0 instanceof com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager$RemoteClientVideoState$deinitSenderReceiver$1
                r303 = r0
                r0 = r303
                if (r0 == 0) goto L9c
                r0 = r302
                r304 = r0
                r0 = r302
                com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager$RemoteClientVideoState$deinitSenderReceiver$1 r0 = (com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager$RemoteClientVideoState$deinitSenderReceiver$1) r0
                r304 = r0
                r0 = r304
                int r0 = r0.label
                r305 = r0
                r0 = -1
                r1 = -1
                int r0 = r0 << r1
                r306 = r0
                r0 = r305
                r1 = r306
                r0 = r0 & r1
                r303 = r0
                r0 = r303
                if (r0 == 0) goto L9c
                r0 = r305
                r1 = r306
                int r0 = r0 - r1
                r305 = r0
                r0 = r304
                r1 = r305
                r0.label = r1
            L32:
                r0 = r304
                java.lang.Object r0 = r0.result
                r307 = r0
                r0 = r304
                int r0 = r0.label
                r306 = r0
                r0 = 1
                r303 = r0
                r0 = r306
                if (r0 == 0) goto L81
                r0 = r306
                r1 = r303
                if (r0 != r1) goto Lac
                r0 = r304
                java.lang.Object r0 = r0.L$0
                com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager$RemoteClientVideoState r0 = (com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager.RemoteClientVideoState) r0
                r308 = r0
                r0 = r307
                X.0Dt.A00(r0)
            L59:
                r0 = r308
                com.facebook.wearable.common.comms.rtc.hera.intf.IVideoSender r0 = r0.videoSender
                r0.deactivate()
                r0 = r308
                com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager r0 = r0.this$0
                X.JLV r0 = r0.remoteVideoEndpoint
                r309 = r0
                r0 = r308
                com.facebook.wearable.common.comms.rtc.hera.intf.IVideoSender r0 = r0.videoSender
                r310 = r0
                r0 = r309
                r1 = r310
                r0.removeLocalVideoSender(r1)
                X.04S r0 = X.04S.A00
                return r0
            L81:
                r0 = r307
                X.0Dt.A00(r0)
                r0 = r304
                r1 = r301
                r0.L$0 = r1
                r0 = r304
                r1 = r303
                r0.label = r1
                r0 = r301
                r1 = r304
                java.lang.Object r0 = r0.deinitReceiver(r1)
                r0 = r301
                r308 = r0
                goto L59
            L9c:
                com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager$RemoteClientVideoState$deinitSenderReceiver$1 r0 = new com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager$RemoteClientVideoState$deinitSenderReceiver$1
                r304 = r0
                r0 = r304
                r1 = r301
                r2 = r302
                X.0DR r2 = (X.0DR) r2
                r0.<init>(r1, r2)
                goto L32
            Lac:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager.RemoteClientVideoState.deinitSenderReceiver(X.0DR):java.lang.Object");
        }

        public final boolean getCameraEnabled() {
            return this.cameraEnabled;
        }

        public final H3z getCameraMixerInput() {
            return this.cameraMixerInput;
        }

        public final String getDebugStats() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("VSend:");
            IVideoSender iVideoSender = this.videoSender;
            A0k.append(iVideoSender != null ? iVideoSender.getDebugStats() : "no sender");
            A0k.append('\n');
            A0k.append("VReceive:");
            IVideoReceiver iVideoReceiver = this.videoReceiver;
            A0k.append(iVideoReceiver != null ? iVideoReceiver.getDebugStats() : "no receiver");
            A0k.append('\n');
            return 11T.A02(A0k);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object initAndStartReceiver(com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager.VideoConfig r302, X.0DR r303) {
            /*
                Method dump skipped, instructions count: 447
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager.RemoteClientVideoState.initAndStartReceiver(com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager$VideoConfig, X.0DR):java.lang.Object");
        }

        public final Object initAndStartSender(0DR r302) {
            this.this$0.remoteVideoEndpoint.addLocalVideoSender(this.videoSender, this.remoteId);
            this.videoSender.activate();
            return 04S.A00;
        }

        public final void setCameraEnabled(boolean z) {
            this.cameraEnabled = z;
        }

        public final void setCameraMixerInput(H3z h3z) {
            this.cameraMixerInput = h3z;
        }
    }

    /* loaded from: VideoStreamsManager$VideoConfig.class */
    public final class VideoConfig {
        public final int iframeInterval;
        public final int initBitrate;
        public final int initFps;
        public final int initHeight;
        public final int initWidth;

        public VideoConfig(int i, int i2, int i3, int i4, int i5) {
            this.initWidth = i;
            this.initHeight = i2;
            this.initFps = i3;
            this.initBitrate = i4;
            this.iframeInterval = i5;
        }

        public final int getIframeInterval() {
            return this.iframeInterval;
        }

        public final int getInitBitrate() {
            return this.initBitrate;
        }

        public final int getInitFps() {
            return this.initFps;
        }

        public final int getInitHeight() {
            return this.initHeight;
        }

        public final int getInitWidth() {
            return this.initWidth;
        }
    }

    public VideoStreamsManager(HeraHostConfig heraHostConfig) {
        int i;
        11T.A0F(heraHostConfig, 1);
        HeraContext heraContext = heraHostConfig.heraContext;
        String A18 = GOn.A18(2aI.class);
        if (A18 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        2aI r0 = (2aI) heraContext.getObject(A18);
        if (r0 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.coroutineScope = r0;
        HeraContext heraContext2 = heraHostConfig.heraContext;
        String A00 = C0Bx.A00(JLV.class);
        if (A00 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        JLV jlv = (JLV) heraContext2.getObject(A00);
        if (jlv == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.remoteVideoEndpoint = jlv;
        HeraContext heraContext3 = heraHostConfig.heraContext;
        String A002 = C0Bx.A00(IHeraVideoBridge.class);
        if (A002 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        IHeraVideoBridge iHeraVideoBridge = (IHeraVideoBridge) heraContext3.getObject(A002);
        if (iHeraVideoBridge == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.videoBridge = iHeraVideoBridge;
        Object sharedEglContext = iHeraVideoBridge.getSharedEglContext();
        11T.A0I(sharedEglContext, "null cannot be cast to non-null type com.facebook.wearable.common.comms.rtc.hera.video.core.EglBase.Context");
        RawVideoMixer rawVideoMixer = new RawVideoMixer((JDd) sharedEglContext);
        this.cameraVideoMixer = rawVideoMixer;
        Object sharedEglContext2 = iHeraVideoBridge.getSharedEglContext();
        11T.A0I(sharedEglContext2, "null cannot be cast to non-null type com.facebook.wearable.common.comms.rtc.hera.video.core.EglBase.Context");
        this.peerVideoMixer = new RawVideoMixer((JDd) sharedEglContext2);
        this.remoteClients = 1BK.A1C();
        this.enableFusionCamera = heraHostConfig.enableFusionCamera;
        this.eventLogger = heraHostConfig.heraHostEventLogger;
        iHeraVideoBridge.initCameraProxy(rawVideoMixer, r0);
        HeraContext heraContext4 = heraHostConfig.heraContext;
        String A003 = C0Bx.A00(CameraOutputRotation.class);
        if (A003 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        CameraOutputRotation cameraOutputRotation = (CameraOutputRotation) heraContext4.getObject(A003);
        if (cameraOutputRotation == null || (i = cameraOutputRotation.rotationDegrees) == 0) {
            return;
        }
        2aK.A03((Integer) null, (0DE) null, new VideoStreamsManager$1$1(this, i, null), r0, 3);
    }

    private final void logCallVideoStreamRequested(String str) {
        IHeraHostEventLogger iHeraHostEventLogger = this.eventLogger;
        if (iHeraHostEventLogger == null) {
            Log.e(TAG, "Event logger is null, skip logging video stream requested");
        } else {
            iHeraHostEventLogger.handleVideoActionEventMessage("SEND_VIDEO_REQUEST_TO_GLASSES", str);
        }
    }

    private final void updateVideoMixerParams() {
        H3z h3z;
        RemoteClientVideoState remoteClientVideoState = (RemoteClientVideoState) 7zN.A0r(this.remoteClients, HBE.A03.nodeId);
        boolean z = remoteClientVideoState != null ? remoteClientVideoState.cameraEnabled : false;
        RemoteClientVideoState remoteClientVideoState2 = (RemoteClientVideoState) 7zN.A0r(this.remoteClients, HBE.A08.nodeId);
        if (remoteClientVideoState2 == null || (h3z = remoteClientVideoState2.cameraMixerInput) == null) {
            return;
        }
        RaA raA = (this.enableFusionCamera && z) ? VIEWPORT_PIP : RaA.A04;
        11T.A0F(raA, 0);
        h3z.A02 = raA;
    }

    public final String getDebugStats() {
        final StringBuilder A0k = AnonymousClass001.A0k();
        synchronized (this.remoteClients) {
            if (this.remoteClients.isEmpty()) {
                A0k.append("no remote clients available");
                A0k.append('\n');
            } else {
                this.remoteClients.forEach(new BiConsumer() { // from class: com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager$getDebugStats$1$1
                    @Override // java.util.function.BiConsumer
                    public final void accept(Integer num, VideoStreamsManager.RemoteClientVideoState remoteClientVideoState) {
                        11T.A0H(num, remoteClientVideoState);
                        StringBuilder sb = A0k;
                        sb.append(0Pz.A0O("Client ", ':', num.intValue()));
                        sb.append('\n');
                        sb.append(remoteClientVideoState.getDebugStats());
                        sb.append('\n');
                    }
                });
            }
        }
        return 11T.A02(A0k);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[LOOP:0: B:12:0x0058->B:14:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onCallEnded(X.0DR r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager$onCallEnded$1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L9b
            r0 = r302
            r304 = r0
            r0 = r302
            com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager$onCallEnded$1 r0 = (com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager$onCallEnded$1) r0
            r304 = r0
            r0 = r304
            int r0 = r0.label
            r305 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r306 = r0
            r0 = r305
            r1 = r306
            r0 = r0 & r1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L9b
            r0 = r305
            r1 = r306
            int r0 = r0 - r1
            r305 = r0
            r0 = r304
            r1 = r305
            r0.label = r1
        L32:
            r0 = r304
            java.lang.Object r0 = r0.result
            r307 = r0
            r0 = r304
            int r0 = r0.label
            r303 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            if (r0 == 0) goto L86
            r0 = r303
            r1 = r305
            if (r0 != r1) goto Laf
            r0 = r304
            java.lang.Object r0 = r0.L$0
            java.util.Iterator r0 = (java.util.Iterator) r0
            r308 = r0
            r0 = r307
            X.0Dt.A00(r0)
        L58:
            r0 = r308
            boolean r0 = r0.hasNext()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto Lab
            r0 = r308
            java.lang.Object r0 = r0.next()
            com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager$RemoteClientVideoState r0 = (com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager.RemoteClientVideoState) r0
            r309 = r0
            r0 = r304
            r1 = r308
            r0.L$0 = r1
            r0 = r304
            r1 = r305
            r0.label = r1
            r0 = r309
            r1 = r304
            java.lang.Object r0 = r0.deinitReceiver(r1)
            goto L58
        L86:
            r0 = r307
            X.0Dt.A00(r0)
            r0 = r301
            java.util.Map r0 = r0.remoteClients
            r309 = r0
            r0 = r309
            java.util.Iterator r0 = X.1BK.A1A(r0)
            r308 = r0
            goto L58
        L9b:
            com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager$onCallEnded$1 r0 = new com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager$onCallEnded$1
            r304 = r0
            r0 = r304
            r1 = r301
            r2 = r302
            X.0DR r2 = (X.0DR) r2
            r0.<init>(r1, r2)
            goto L32
        Lab:
            X.04S r0 = X.04S.A00
            return r0
        Laf:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager.onCallEnded(X.0DR):java.lang.Object");
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 316, insn: 0x01f7: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r316 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:60:0x01f7 */
    public final java.lang.Object onRemoteAvailability(int r302, boolean r303, X.JJM r304, X.0DR r305) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager.onRemoteAvailability(int, boolean, X.JJM, X.0DR):java.lang.Object");
    }

    public final Object release(0DR r302) {
        Object release = this.videoBridge.release(r302);
        if (release != 0Ds.A02) {
            release = 04S.A00;
        }
        return release;
    }

    public final void setCameraEnabled(int i, boolean z) {
        RemoteClientVideoState remoteClientVideoState = (RemoteClientVideoState) 7zN.A0r(this.remoteClients, i);
        if (remoteClientVideoState != null) {
            remoteClientVideoState.cameraEnabled = z;
            H3z h3z = remoteClientVideoState.cameraMixerInput;
            if (h3z != null) {
                h3z.A02(z);
            }
        }
        updateVideoMixerParams();
    }

    public final void setCameraOutputSurface(Surface surface, int i, int i2) {
        IRawVideoSource.SurfaceOutput surfaceOutput = this.externalSurfaceOutput;
        if (surfaceOutput != null) {
            this.cameraVideoMixer.removeOutput(surfaceOutput);
            this.externalSurfaceOutput = null;
        }
        if (surface != null) {
            IRawVideoSource.SurfaceOutput surfaceOutput2 = new IRawVideoSource.SurfaceOutput(surface);
            this.cameraVideoMixer.addOutput(surfaceOutput2);
            surfaceOutput2.setOutputParams(null, new VideoSize(i, i2));
            this.externalSurfaceOutput = surfaceOutput2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object startClientCameraReceiver(int r302, com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager.VideoConfig r303, java.lang.String r304, X.0DR r305) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager.startClientCameraReceiver(int, com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager$VideoConfig, java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object startPeerVideoMixer(X.0DR r302) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager.startPeerVideoMixer(X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object stopPeerVideoMixer(X.0DR r302) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.VideoStreamsManager.stopPeerVideoMixer(X.0DR):java.lang.Object");
    }

    public final Object stopReceivingFromClient(int i, 0DR r303) {
        Log.d(TAG, 0Pz.A0T("stop receiving from client camera on remoteId ", i));
        RemoteClientVideoState remoteClientVideoState = (RemoteClientVideoState) this.remoteClients.get(7zL.A0z(i));
        if (remoteClientVideoState != null) {
            setCameraEnabled(i, false);
            remoteClientVideoState.deinitReceiver(r303);
        }
        return 04S.A00;
    }
}
