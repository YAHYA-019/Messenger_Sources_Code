package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.msys.mca.Mailbox;
import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen.PregenerateSdp;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.call.datamessage.gen.DataMessage;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.callintent.gen.CallIntent;
import com.facebook.rsys.callintent.gen.CallIntentCreationResult;
import com.facebook.rsys.callintent.gen.CallIntentFactory;
import com.facebook.rsys.callintent.gen.SignalingUserContext;
import com.facebook.rsys.callmanager.callintent.gen.CallManagerCallIntent;
import com.facebook.rsys.callmanager.gen.AppInfo;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import com.facebook.rsys.devxagent.gen.DevXAgentAppProxy;
import com.facebook.rsys.devxcallagent.gen.DevXAgentCallApi;
import com.facebook.rsys.devxcallagent.gen.DevXAgentCallConfig;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;
import com.facebook.rsys.execution.gen.TaskExecutor;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;
import com.facebook.rsys.outgoingcallconfig.gen.OutgoingCallConfig;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.rsys.transport.gen.SignalingMessage;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import com.facebook.webrtc.config.WebrtcConfigInterface;
import com.facebook.webrtc.models.FbWebrtcDataMessage;
import com.facebook.webrtc.models.FbWebrtcGenericDataMessage;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.webrtc.ContextUtils;

/* loaded from: Ia0.class */
public final class Ia0 implements JLn {
    public static final Ia0 $redex_init_class = null;
    public HrI A00;
    public AudioModule A01;
    public final Handler A02;
    public final 1De A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final Mailbox A09;
    public final HqZ A0A;
    public final SignalingTransportProxy A0B;
    public final WebrtcConfigInterface A0C;
    public final java.util.Map A0D;
    public final FbUserSession A0E;
    public final HJ5 A0F;
    public final String A0G;
    public final String A0H;

    static {
        I1P.A00.A00();
    }

    /* JADX WARN: Type inference failed for: r0v181, types: [com.facebook.rsys.callmanager.callintentcommon.gen.CallManagerCallIntentCallbacks, java.lang.Object] */
    public Ia0(Handler handler, FbUserSession fbUserSession, 1De r304, SignalingTransportProxy signalingTransportProxy, WebrtcConfigInterface webrtcConfigInterface) {
        HashSet hashSet;
        DevXAgentApi devXAgentApi;
        this.A03 = r304;
        this.A0C = webrtcConfigInterface;
        this.A02 = handler;
        this.A0B = signalingTransportProxy;
        this.A0E = fbUserSession;
        1BY r0 = r304.A00;
        this.A06 = 1Bu.A03(r0, 115758);
        this.A0F = (HJ5) 1Bi.A03(115759);
        java.util.Map synchronizedMap = Collections.synchronizedMap(1BK.A1C());
        11T.A0A(synchronizedMap);
        this.A0D = synchronizedMap;
        this.A08 = 1Bq.A00(115627);
        this.A07 = 1Bu.A01(7zM.A0A(), 114918);
        this.A05 = 1Bu.A01(7zM.A0A(), 1138);
        this.A04 = 1Bu.A03(r0, 1136);
        C00j.A05("OrcaRsysSdk.init", -2000889329);
        ContextUtils.initialize(7zM.A0A().getApplicationContext());
        C00j.A05("OrcaRsysSdk.initMsysInfra", 275992603);
        1ZK.A01((1ZJ) ((I8i) 1Br.A0B(this.A06)).A03.getValue());
        C00j.A01(-1798789914);
        C00j.A05("OrcaRsysSdk.initMailbox", 1711746701);
        1Br.A0C(this.A06);
        this.A09 = I8i.A00(fbUserSession);
        C00j.A01(-1557895751);
        C00j.A05("OrcaRsysSdk.createUser", 1551555577);
        1Br.A0C(this.A06);
        03Y A01 = I8i.A01(fbUserSession, String.valueOf(webrtcConfigInterface.getUserId()));
        String str = (String) A01.first;
        this.A0H = str;
        this.A0G = (String) A01.second;
        ViewerContext Aue = fbUserSession.Aue();
        1gS r02 = (1gS) 1Bi.A03(66793);
        I3r i3r = (I3r) 1Bn.A0E(7zM.A0A(), (1BY) null, 114998);
        2JQ r03 = AppInfo.CONVERTER;
        WebrtcConfigInterface webrtcConfigInterface2 = this.A0C;
        AppInfo appInfo = new AppInfo(String.valueOf(webrtcConfigInterface2.getAppId()), webrtcConfigInterface2.getDeviceId());
        1BY r04 = this.A03.A00;
        Hk5 hk5 = new Hk5(appInfo, (LYE) 1Bn.A0E((Context) null, r04, 131159), (OverlayConfigLayerInterface) 1Bn.A0E((Context) null, r04, 114996), r02.A03, str, new AQV(this, 4), new AKW(Aue, this, 14), new AQV(this, 5), new AQV(this, 6), i3r.A02(fbUserSession));
        Mailbox mailbox = this.A09;
        if (mailbox != null) {
            hk5.A00 = new AKY(str, mailbox, 17);
        }
        C2636Gjo c2636Gjo = new C2636Gjo(hk5.A01, new Hj2(hk5), hk5.A05);
        C00j.A01(-69326280);
        C00j.A05("OrcaRsysSdk.createCallManager", 592214495);
        Hj2 hj2 = (Hj2) c2636Gjo.A02;
        C01i c01i = hj2.A03;
        OverlayConfigManagerHolder overlayConfigManagerHolder = (OverlayConfigManagerHolder) c01i.getValue();
        1BY r05 = this.A03.A00;
        EnvironmentVariablesProxy environmentVariablesProxy = (EnvironmentVariablesProxy) 1Bn.A0E((Context) null, r05, 115384);
        RNC rnc = new RNC(this.A02);
        11T.A0F(environmentVariablesProxy, 0);
        rnc.A01 = environmentVariablesProxy;
        1Bn.A0E((Context) null, r05, 115695);
        AudioModule A00 = Hvd.A00(environmentVariablesProxy, overlayConfigManagerHolder);
        this.A01 = A00;
        rnc.A00 = A00;
        Context A0A = 7zM.A0A();
        EnvironmentVariablesProxy environmentVariablesProxy2 = rnc.A01;
        8Lk r06 = new 8Lk(rnc.A00, (environmentVariablesProxy2 == null || !rnc.A03.isEmpty()) ? new QSm(environmentVariablesProxy2, rnc) : environmentVariablesProxy2, rnc.A02);
        DevXAgentAppProxy devXAgentAppProxy = (DevXAgentAppProxy) r06.A04;
        if (devXAgentAppProxy != null && (hashSet = (HashSet) r06.A03) != null && (devXAgentApi = (DevXAgentApi) r06.A02) != null) {
            devXAgentApi.setProxy(devXAgentAppProxy, hashSet);
        }
        HqZ hqZ = new HqZ(A0A, new Object(), new GwN(r06), (TaskExecutor) r06.A07, new AW5(r06, 31));
        this.A0A = hqZ;
        C00j.A01(1171430067);
        HO1.A01 = new AV2(this, 18);
        C00j.A05("OrcaRsysSdk.registerUser", 174275475);
        java.util.Map map = hqZ.A07;
        11T.A09(map);
        synchronized (map) {
            String str2 = c2636Gjo.A03;
            AppInfo appInfo2 = (AppInfo) c2636Gjo.A01;
            03Y A1G = 1BK.A1G(str2, appInfo2.getAppId());
            if (!map.containsKey(A1G)) {
                CallIntentFactory callIntentFactory = (CallIntentFactory) hqZ.A09.getValue();
                2JQ r07 = SignalingUserContext.CONVERTER;
                callIntentFactory.registerUser(new SignalingUserContext(str2, appInfo2.getAppId(), appInfo2.getDeviceId(), (SignalingTransportProxy) hj2.A04.getValue(), (OverlayConfigManagerHolder) c01i.getValue(), hqZ.A03));
                map.put(A1G, new Hbv(c2636Gjo));
            }
        }
        C00j.A01(-2097099884);
        hqZ.A08.add(new HW0(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0051, code lost:
    
        if (r302 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList A00(com.facebook.rsys.callcontext.gen.CallContext r301, java.util.ArrayList r302) {
        /*
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 == 0) goto Lf
            r0 = r302
            boolean r0 = r0.isEmpty()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L50
        Lf:
            r0 = r303
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r305 = r0
            java.lang.Integer r0 = X.AbG.A11()
            r306 = r0
            r0 = 2
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r1 = r0
            r2 = 0
            r3 = r305
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r306
            r1[r2] = r3
            r306 = r0
            r0 = r306
            java.util.List r0 = X.C0s8.A14(r0)
            r305 = r0
            r0 = r301
            int r0 = com.facebook.rsys.roomtypecalling.gen.CallingAppContextUtils.CProxy.getThreadType(r0)
            r1 = r305
            boolean r0 = X.GOo.A1U(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L50
            r0 = r301
            java.lang.String r0 = com.facebook.rsys.roomtypecalling.gen.CallingAppContextUtils.CProxy.getThreadId(r0)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L54
            r0 = r306
            java.util.ArrayList r0 = X.GOo.A12(r0)
            r302 = r0
        L50:
            r0 = r302
            if (r0 != 0) goto L58
        L54:
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r302 = r0
        L58:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ia0.A00(com.facebook.rsys.callcontext.gen.CallContext, java.util.ArrayList):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0156 A[LOOP:0: B:26:0x0148->B:28:0x0156, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.Ia0 r301, com.facebook.rsys.callintent.gen.CallIntent r302, kotlin.jvm.functions.Function1 r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ia0.A01(X.Ia0, com.facebook.rsys.callintent.gen.CallIntent, kotlin.jvm.functions.Function1, boolean):void");
    }

    @Override // X.JLn
    public AudioModule AXn() {
        return this.A01;
    }

    @Override // X.JLn
    public void C6x(SignalingMessage signalingMessage) {
        SignalingTransportProxy signalingTransportProxy = this.A0B;
        11T.A0I(signalingTransportProxy, "null cannot be cast to non-null type com.facebook.messaging.rtc.rsys.network.WebRtcSignalingTransportProxy");
        HoZ hoZ = ((GyC) signalingTransportProxy).A00;
        if (hoZ == null) {
            throw AnonymousClass001.A0N("Proxy hasn't registered (registerUser wasn't called)");
        }
        hoZ.A00(signalingMessage);
    }

    @Override // X.JLn
    public void CmP(HrI hrI) {
        this.A00 = hrI;
    }

    @Override // X.JLn
    public String D1T(Hsu hsu) {
        CallContext A00 = HJ4.A00(hsu.A00, this.A0H, hsu.A05, hsu.A04, hsu.A02, this.A0G, false);
        String valueOf = String.valueOf(this.A0C.getAppId());
        String str = hsu.A06;
        ArrayList arrayList = null;
        boolean A1Z = 7zP.A1Z(A00);
        String str2 = hsu.A03;
        11T.A0A(str2);
        AbstractCollection abstractCollection = hsu.A01;
        11T.A0A(abstractCollection);
        ArrayList A17 = abstractCollection instanceof ArrayList ? (ArrayList) abstractCollection : 1BK.A17(abstractCollection);
        boolean z = hsu.A0A;
        Collection<FbWebrtcDataMessage> collection = hsu.A07;
        if (collection == null) {
            collection = C0ty.A00;
        }
        for (FbWebrtcDataMessage fbWebrtcDataMessage : collection) {
            Collection collection2 = fbWebrtcDataMessage.A00.A02;
            if (collection2 == null) {
                collection2 = C0ty.A00;
            }
            ArrayList A172 = 1BK.A17(collection2);
            FbWebrtcGenericDataMessage fbWebrtcGenericDataMessage = fbWebrtcDataMessage.A01;
            DataMessage dataMessage = new DataMessage(A172, fbWebrtcGenericDataMessage.A00, fbWebrtcGenericDataMessage.A01);
            if (arrayList != null) {
                arrayList.add(dataMessage);
            } else {
                arrayList = C0s8.A10(dataMessage);
            }
        }
        CallIntentCreationResult createCallIntent = ((CallIntentFactory) this.A0A.A09.getValue()).createCallIntent(new OutgoingCallConfig(str2, valueOf, A00, A00(A00, A17), z, A1Z, str, arrayList, false, false, 0, null, null));
        11T.A0A(createCallIntent);
        if (createCallIntent.getStatusCode() != 0) {
            if (createCallIntent.getStatusCode() != A1Z) {
                throw 4YV.A0h("Failed to create outgoing call intent. status=", createCallIntent.getStatusCode());
            }
            return null;
        }
        CallIntent callIntent = createCallIntent.getCallIntent();
        if (callIntent == null) {
            throw 1BK.A0h();
        }
        A01(this, callIntent, new AV2(hsu, 19), false);
        return callIntent.getLocalCallId();
    }

    @Override // X.JLn
    public Object D2G(Hjv hjv, 0DR r303) {
        String valueOf = String.valueOf(this.A0C.getAppId());
        CallContext callContext = (CallContext) hjv.A05.invoke();
        String str = hjv.A04;
        boolean A1Z = 7zP.A1Z(callContext);
        String str2 = hjv.A02;
        ArrayList A12 = GOo.A12(hjv.A03);
        C00m c00m = hjv.A07;
        DevXAgentCallConfig devXAgentCallConfig = null;
        PregenerateSdp pregenerateSdp = c00m != null ? (PregenerateSdp) c00m.invoke() : null;
        OverlayConfigLayerInterface overlayConfigLayerInterface = hjv.A01;
        11T.A0F(overlayConfigLayerInterface, 0);
        OutgoingCallConfig outgoingCallConfig = new OutgoingCallConfig(str2, valueOf, callContext, A00(callContext, A12), false, A1Z, str, null, false, false, 0, overlayConfigLayerInterface, pregenerateSdp);
        HqZ hqZ = this.A0A;
        CallIntentCreationResult createCallIntent = ((CallIntentFactory) hqZ.A09.getValue()).createCallIntent(outgoingCallConfig);
        11T.A0A(createCallIntent);
        if (createCallIntent.getStatusCode() != 0) {
            4zI.A03.A05("OrcaRsysSdk", 0Pz.A0T("Failed to create session: ", createCallIntent.getStatusCode()), new Object[0]);
            return null;
        }
        CallIntent callIntent = createCallIntent.getCallIntent();
        if (callIntent == null) {
            throw 1BK.A0h();
        }
        DevXAgentCallApi devXAgentCallApi = ((CallManagerCallIntent) hqZ.A0A.getValue()).getDevXAgentCallApi();
        if (devXAgentCallApi != null) {
            devXAgentCallConfig = devXAgentCallApi.copyCallConfig(null);
        }
        Gw1 gw1 = (Gw1) hjv.A09.invoke(devXAgentCallConfig);
        GwV gwV = (GwV) hjv.A06.invoke();
        1BK.A1K(gw1, 3, gwV);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A1G = GOn.A1G(hjv.A08.invoke());
        while (A1G.hasNext()) {
            Object next = A1G.next();
            11T.A0F(next, 0);
            A0s.add(next);
        }
        C2635Gjn c2635Gjn = new C2635Gjn(gw1, callIntent, gwV, (GroupExpansionProxy) null, (List) A0s, false);
        C2s7 A15 = 7zS.A15(r303, A1Z ? 1 : 0);
        Ini.A02(hqZ.A00(c2635Gjn), A15, 44);
        return A15.A0C();
    }
}
