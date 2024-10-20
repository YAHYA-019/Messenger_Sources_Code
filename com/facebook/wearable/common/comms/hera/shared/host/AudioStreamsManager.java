package com.facebook.wearable.common.comms.hera.shared.host;

import X.04S;
import X.0DR;
import X.0Ds;
import X.0Pz;
import X.11T;
import X.4dH;
import X.7zN;
import X.JDY;
import X.JJM;
import X.JLU;
import android.util.Log;
import com.facebook.wearable.common.comms.rtc.hera.intf.IAudioReceiver;
import com.facebook.wearable.common.comms.rtc.hera.intf.IAudioSender;
import com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSink;
import com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSource;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: AudioStreamsManager.class */
public final class AudioStreamsManager {
    public static final Companion Companion = new Object();
    public static final String TAG = "Hera.AudioStreamsManager";
    public final IRawAudioSink audioSink;
    public final IRawAudioSource audioSource;
    public final 4dH mutex;
    public final JLU remoteAudioEndpoint;
    public final Map remoteClients;

    /* loaded from: AudioStreamsManager$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: AudioStreamsManager$RemoteClientAudioState.class */
    public final class RemoteClientAudioState {
        public boolean audioEnabled;
        public final IAudioReceiver audioReceiver;
        public final IAudioSender audioSender;
        public final JJM mediaFactory;
        public final int remoteId;
        public final /* synthetic */ AudioStreamsManager this$0;

        public RemoteClientAudioState(AudioStreamsManager audioStreamsManager, int i, JJM jjm, boolean z) {
            11T.A0F(jjm, 3);
            this.this$0 = audioStreamsManager;
            this.remoteId = i;
            this.mediaFactory = jjm;
            this.audioEnabled = z;
            IRawAudioSource iRawAudioSource = audioStreamsManager.audioSource;
            IAudioReceiver iAudioReceiver = null;
            Object createMediaSender = iRawAudioSource != null ? jjm.createMediaSender(i, iRawAudioSource) : null;
            this.audioSender = createMediaSender instanceof IAudioSender ? (IAudioSender) createMediaSender : null;
            IRawAudioSink iRawAudioSink = audioStreamsManager.audioSink;
            Object createMediaReceiver = iRawAudioSink != null ? jjm.createMediaReceiver(i, iRawAudioSink, (JDY) null, (Integer) null) : null;
            this.audioReceiver = createMediaReceiver instanceof IAudioReceiver ? (IAudioReceiver) createMediaReceiver : iAudioReceiver;
        }

        public /* synthetic */ RemoteClientAudioState(AudioStreamsManager audioStreamsManager, int i, JJM jjm, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(audioStreamsManager, i, jjm, (i2 & 4) != 0 ? true : z);
        }

        public final Object deinitReceiver(0DR r302) {
            IAudioReceiver iAudioReceiver = this.audioReceiver;
            if (iAudioReceiver != null) {
                AudioStreamsManager audioStreamsManager = this.this$0;
                Log.d(AudioStreamsManager.TAG, "Deinit and disconnect audio receiver");
                iAudioReceiver.disconnect();
                audioStreamsManager.remoteAudioEndpoint.removeLocalAudioReceiver(iAudioReceiver);
            }
            return 04S.A00;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object deinitSenderReceiver(X.0DR r302) {
            /*
                Method dump skipped, instructions count: 203
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.AudioStreamsManager.RemoteClientAudioState.deinitSenderReceiver(X.0DR):java.lang.Object");
        }

        public final boolean getAudioEnabled() {
            return this.audioEnabled;
        }

        public final Object initAndStartReceiver(0DR r302) {
            IAudioReceiver iAudioReceiver = this.audioReceiver;
            if (iAudioReceiver != null) {
                AudioStreamsManager audioStreamsManager = this.this$0;
                Log.d(AudioStreamsManager.TAG, "Initiating and starting audio receiver");
                audioStreamsManager.remoteAudioEndpoint.addLocalAudioReceiver(iAudioReceiver, this.remoteId);
                iAudioReceiver.connect();
            }
            return 04S.A00;
        }

        public final Object initAndStartSender(0DR r302) {
            IAudioSender iAudioSender = this.audioSender;
            if (iAudioSender != null) {
                AudioStreamsManager audioStreamsManager = this.this$0;
                Log.d(AudioStreamsManager.TAG, "Initiating and starting audio sender");
                audioStreamsManager.remoteAudioEndpoint.addLocalAudioSender(iAudioSender, this.remoteId);
                iAudioSender.activate();
            }
            return 04S.A00;
        }

        public final void setAudioEnabled(boolean z) {
            this.audioEnabled = z;
        }
    }

    /* loaded from: AudioStreamsManager$WhenMappings.class */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x004c
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.facebook.wearable.common.comms.hera.shared.host.config.AudioIntegrationType[] r0 = com.facebook.wearable.common.comms.hera.shared.host.config.AudioIntegrationType.values()
                r301 = r0
                r0 = r301
                int r0 = r0.length
                r302 = r0
                r0 = r302
                int[] r0 = new int[r0]
                r303 = r0
                com.facebook.wearable.common.comms.hera.shared.host.config.AudioIntegrationType r0 = com.facebook.wearable.common.comms.hera.shared.host.config.AudioIntegrationType.DISABLED     // Catch: java.lang.NoSuchFieldError -> L4c
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4c
                r304 = r0
                r0 = 1
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4c
            L1a:
                com.facebook.wearable.common.comms.hera.shared.host.config.AudioIntegrationType r0 = com.facebook.wearable.common.comms.hera.shared.host.config.AudioIntegrationType.MOCK     // Catch: java.lang.NoSuchFieldError -> L4c java.lang.NoSuchFieldError -> L50
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L50
                r304 = r0
                r0 = 2
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L50
            L29:
                com.facebook.wearable.common.comms.hera.shared.host.config.AudioIntegrationType r0 = com.facebook.wearable.common.comms.hera.shared.host.config.AudioIntegrationType.LOOPBACK     // Catch: java.lang.NoSuchFieldError -> L50 java.lang.NoSuchFieldError -> L54
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r304 = r0
                r0 = 3
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L38:
                com.facebook.wearable.common.comms.hera.shared.host.config.AudioIntegrationType r0 = com.facebook.wearable.common.comms.hera.shared.host.config.AudioIntegrationType.RSYS     // Catch: java.lang.NoSuchFieldError -> L54 java.lang.NoSuchFieldError -> L58
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r304 = r0
                r0 = 4
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L47:
                r0 = r303
                com.facebook.wearable.common.comms.hera.shared.host.AudioStreamsManager.WhenMappings.$EnumSwitchMapping$0 = r0
                return
            L4c:
                goto L1a
            L50:
                goto L29
            L54:
                goto L38
            L58:
                goto L47
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.AudioStreamsManager.WhenMappings.m10264clinit():void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AudioStreamsManager(com.facebook.wearable.common.comms.hera.shared.host.config.HeraHostConfig r302) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.AudioStreamsManager.<init>(com.facebook.wearable.common.comms.hera.shared.host.config.HeraHostConfig):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object startClientAudioReceiver(int r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.AudioStreamsManager.startClientAudioReceiver(int, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f2 A[Catch: all -> 0x0133, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0133, blocks: (B:14:0x00e1, B:17:0x00e8, B:20:0x00f2, B:21:0x00fb, B:23:0x0103, B:24:0x0109, B:25:0x010f, B:26:0x0116, B:28:0x011e), top: B:13:0x00e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onCallEnded(X.0DR r302) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.AudioStreamsManager.onCallEnded(X.0DR):java.lang.Object");
    }

    public final Object onCallStarting(int i, 0DR r303) {
        Log.d(TAG, 0Pz.A0T("onCallStarting: Starting Client audio receiver for remoteId=", i));
        Object startClientAudioReceiver = startClientAudioReceiver(i, r303);
        if (startClientAudioReceiver != 0Ds.A02) {
            startClientAudioReceiver = 04S.A00;
        }
        return startClientAudioReceiver;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x018a, code lost:
    
        if (r316.BZF((java.lang.Object) null, r307) != r0) goto L67;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0055. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onRemoteAvailability(int r302, boolean r303, X.JJM r304, X.0DR r305) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.host.AudioStreamsManager.onRemoteAvailability(int, boolean, X.JJM, X.0DR):java.lang.Object");
    }

    public final Object release(0DR r302) {
        IRawAudioSource iRawAudioSource = this.audioSource;
        if (iRawAudioSource != null) {
            iRawAudioSource.release();
        }
        IRawAudioSink iRawAudioSink = this.audioSink;
        if (iRawAudioSink != null) {
            iRawAudioSink.release();
        }
        return 04S.A00;
    }

    public final void setAudioEnabled(int i, boolean z) {
        Log.d(TAG, 0Pz.A0f("setAudioEnabled: remoteId=", ", enabled=", i, z));
        RemoteClientAudioState remoteClientAudioState = (RemoteClientAudioState) 7zN.A0r(this.remoteClients, i);
        if (remoteClientAudioState != null) {
            remoteClientAudioState.audioEnabled = z;
        }
    }
}
