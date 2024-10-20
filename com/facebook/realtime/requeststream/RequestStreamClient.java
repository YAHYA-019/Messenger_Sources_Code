package com.facebook.realtime.requeststream;

import X.1CO;
import X.C0il;
import X.C15h;
import X.Hrh;
import X.IMi;
import com.facebook.distribgw.client.DGWClient;
import com.facebook.jni.HybridData;
import com.facebook.realtime.common.appstate.AppStateGetter;
import com.facebook.realtime.common.appstate.AppStateSyncer;
import com.facebook.realtime.common.network.NetworkDetailedStateGetter;
import com.facebook.realtime.common.streamid.RSStreamIdProvider;
import com.facebook.realtime.mqttprotocol.MQTTProtocolImp;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;
import com.facebook.realtime.requeststream.api.StreamOptions;
import com.facebook.realtime.requeststream.builder.dgw.StreamGroupDecider;
import com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler;
import com.facebook.realtime.requeststream.streamref.NativeStream;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: RequestStreamClient.class */
public abstract class RequestStreamClient extends BaseRequestStreamClient {
    public static final RequestStreamClient $redex_init_class = null;
    public final String mAccountId;
    public final String mActorId;
    public final C15h mStreamOptionsProvider;

    static {
        C0il.A0B("requeststream-jni");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x020f, code lost:
    
        if (r0.startsWith("FRL") == false) goto L35;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RequestStreamClient(com.facebook.auth.usersession.FbUserSession r302, X.1Uz r303, java.util.concurrent.ScheduledExecutorService r304, com.facebook.realtime.common.appstate.AppStateGetter r305, com.facebook.realtime.common.appstate.AppStateSyncer r306, com.facebook.realtime.common.network.NetworkDetailedStateGetter r307, com.facebook.realtime.common.streamid.RSStreamIdProvider r308, com.facebook.prefs.shared.FbSharedPreferences r309, X.Hrh r310, X.1CO r311, com.facebook.realtime.requeststream.E2ELogging r312, com.facebook.realtime.requeststream.builder.dgw.StreamGroupDecider r313, X.C15h r314) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.realtime.requeststream.RequestStreamClient.<init>(com.facebook.auth.usersession.FbUserSession, X.1Uz, java.util.concurrent.ScheduledExecutorService, com.facebook.realtime.common.appstate.AppStateGetter, com.facebook.realtime.common.appstate.AppStateSyncer, com.facebook.realtime.common.network.NetworkDetailedStateGetter, com.facebook.realtime.common.streamid.RSStreamIdProvider, com.facebook.prefs.shared.FbSharedPreferences, X.Hrh, X.1CO, com.facebook.realtime.requeststream.E2ELogging, com.facebook.realtime.requeststream.builder.dgw.StreamGroupDecider, X.15h):void");
    }

    public RequestStreamClient(MQTTProtocolImp mQTTProtocolImp, ScheduledExecutorService scheduledExecutorService, AppStateGetter appStateGetter, AppStateSyncer appStateSyncer, NetworkDetailedStateGetter networkDetailedStateGetter, RSStreamIdProvider rSStreamIdProvider, Hrh hrh, 1CO r309, E2ELogging e2ELogging, C15h c15h) {
        super(initHybrid(mQTTProtocolImp, scheduledExecutorService, appStateGetter, appStateSyncer, r309.AZk(36313424505412161L), networkDetailedStateGetter, rSStreamIdProvider, e2ELogging, r309.BCy(36876374455878345L), hrh.A00(), hrh.A01(), r309.AZk(2342156433719302722L), true, r309.AZk(36313424506198596L), true, r309.BCy(36876374459417293L), false, true, r309.AZk(36313424506329670L)));
        this.mStreamOptionsProvider = c15h;
        this.mAccountId = "";
        this.mActorId = "";
        IMi.A00(this);
    }

    public static native HybridData initHybrid(MQTTProtocolImp mQTTProtocolImp, ScheduledExecutorService scheduledExecutorService, AppStateGetter appStateGetter, AppStateSyncer appStateSyncer, boolean z, NetworkDetailedStateGetter networkDetailedStateGetter, RSStreamIdProvider rSStreamIdProvider, E2ELogging e2ELogging, String str, String str2, String str3, boolean z2, boolean z3, boolean z4, boolean z5, String str4, boolean z6, boolean z7, boolean z8);

    public static native HybridData initHybridDGW(DGWClient dGWClient, String str, int i, String str2, String str3, ScheduledExecutorService scheduledExecutorService, AppStateGetter appStateGetter, AppStateSyncer appStateSyncer, boolean z, NetworkDetailedStateGetter networkDetailedStateGetter, RSStreamIdProvider rSStreamIdProvider, E2ELogging e2ELogging, StreamGroupDecider streamGroupDecider, String str4, String str5, String str6, long j, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, boolean z10, boolean z11);

    @Override // com.facebook.realtime.requeststream.api.BaseRequestStreamClient
    public NativeStream createStream(String str, byte[] bArr, String str2, StreamEventHandler streamEventHandler, Executor executor) {
        return createStreamNative(str, bArr, str2, streamEventHandler, executor, 0, (StreamOptions) this.mStreamOptionsProvider.get());
    }

    @Override // com.facebook.realtime.requeststream.api.BaseRequestStreamClient
    public NativeStream createStream(String str, byte[] bArr, String str2, StreamEventHandler streamEventHandler, Executor executor, int i) {
        return createStreamNative(str, bArr, str2, streamEventHandler, executor, i, (StreamOptions) this.mStreamOptionsProvider.get());
    }

    public final native boolean writeBugReportToFile(String str);
}
