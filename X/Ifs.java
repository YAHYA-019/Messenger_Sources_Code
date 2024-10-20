package X;

import com.facebook.fbwebrtc.multiway.RtcMessageHeader;
import com.facebook.msys.mci.TraceLogger;
import com.facebook.rsys.chatdtransportsender.gen.ChatDTransportSenderApi;
import com.facebook.rsys.transport.gen.StatusUpdate;
import com.facebook.rtc.chatd.utils.OneTraceLogging;

/* loaded from: Ifs.class */
public final class Ifs implements JMT {
    public final int A00;
    public final int A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final ChatDTransportSenderApi A05;
    public final OneTraceLogging A06;
    public final boolean A07;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.rtc.chatd.utils.OneTraceLogging, java.lang.Object] */
    public /* synthetic */ Ifs(ChatDTransportSenderApi chatDTransportSenderApi, boolean z) {
        ?? obj = new Object();
        this.A05 = chatDTransportSenderApi;
        this.A07 = z;
        this.A06 = obj;
        this.A02 = 1Bq.A00(16616);
        this.A03 = 1Bu.A00(84853);
        this.A04 = 1Bq.A00(66430);
        if (!chatDTransportSenderApi.hasChatDSender()) {
            throw AnonymousClass001.A0L("Cannot instantiate ChatDSignalingTransport without an available RSChatDSender.");
        }
        1BQ A00 = 1BQ.A00();
        2yD r0 = (2yD) A00.get();
        1GD r02 = 1GD.A07;
        int Av9 = (int) r0.Av9(r02, 36598614627258565L);
        int Av92 = (int) ((2yD) A00.get()).Av9(r02, 36598614627324102L);
        TraceLogger.addConfig(310, Av9, Av92, ((int) ((2yD) A00.get()).Av9(r02, 36604348406962792L)) * 2);
        TraceLogger.addConfig(312, Av9, Av92, 0);
        TraceLogger.addConfig(313, Av9, Av92, 0);
        this.A00 = 2yD.A00((2yD) A00.get(), 36604348407487084L);
        this.A01 = (int) ((2yD) A00.get()).Av9(r02, 36604348407683694L);
    }

    public static final String A00(RtcMessageHeader rtcMessageHeader) {
        return rtcMessageHeader != null ? BRs.A00((Integer) rtcMessageHeader.A00(0)) : "empty";
    }

    private final java.util.Map A01() {
        C00i c00i = this.A02.A00;
        return 4YW.A0A("TimeSinceInitMs", String.valueOf(((1Od) c00i.get()).A04()), 1BK.A1G("TimeSinceLaunchMs", String.valueOf(((1Od) c00i.get()).A05())));
    }

    private final void A02(String str) {
        1hD r0 = (1hD) 1Br.A0B(this.A04);
        1hD.A01(r0, new C2y1(str, r0, 3));
    }

    public boolean DAm(int i) {
        return this.A07 && i != 1;
    }

    public void onStatusUpdate(StatusUpdate statusUpdate) {
        int sessionsCount = statusUpdate.getSessionsCount();
        ChatDTransportSenderApi chatDTransportSenderApi = this.A05;
        if (sessionsCount > 0) {
            chatDTransportSenderApi.activeConnection();
        } else {
            chatDTransportSenderApi.idleConnection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        if (r313 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean sendMultiwaySignalingMessage(java.lang.String r302, java.lang.String r303, byte[] r304) {
        /*
            r301 = this;
            r0 = 2
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r301
            boolean r0 = r0.A07
            r308 = r0
            r0 = r308
            if (r0 == 0) goto Laa
            java.lang.String r0 = "chatd_send_mws"
            r309 = r0
            r0 = r301
            r1 = r309
            r0.A02(r1)
            r0 = r304
            r310 = r0
            r0 = r304
            int r0 = r0.length
            r308 = r0
            r0 = r308
            if (r0 != 0) goto Lb3
            r0 = 0
            r311 = r0
        L2d:
            r0 = r301
            com.facebook.rtc.chatd.utils.OneTraceLogging r0 = r0.A06
            r312 = r0
            r0 = r311
            if (r0 == 0) goto L49
            r0 = r311
            r1 = r305
            java.lang.Object r0 = r0.A00(r1)
            java.lang.String r0 = (java.lang.String) r0
            r313 = r0
            r0 = r313
            if (r0 != 0) goto L4d
        L49:
            java.lang.String r0 = "null"
            r313 = r0
        L4d:
            r0 = r311
            java.lang.String r0 = A00(r0)
            r307 = r0
            java.lang.String r0 = "send_no_callbacks"
            r309 = r0
            r0 = r312
            r1 = r313
            r2 = r307
            r3 = r309
            r0.spotLogSend(r1, r2, r3)
            r0 = r311
            if (r0 == 0) goto Lad
            r0 = 4
            r308 = r0
            r0 = r311
            r1 = r308
            java.lang.Object r0 = r0.A00(r1)
            java.lang.String r0 = (java.lang.String) r0
            r314 = r0
        L77:
            r0 = r311
            java.lang.String r0 = A00(r0)
            r315 = r0
            r0 = r301
            java.util.Map r0 = r0.A01()
            r316 = r0
            com.facebook.rsys.chatdtransportsender.gen.ChatDTransportSenderSendInput r0 = new com.facebook.rsys.chatdtransportsender.gen.ChatDTransportSenderSendInput
            r311 = r0
            r0 = r311
            r1 = r310
            r2 = 0
            r3 = r303
            r4 = r314
            r5 = 0
            r6 = 0
            r7 = r315
            r8 = r316
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r301
            com.facebook.rsys.chatdtransportsender.gen.ChatDTransportSenderApi r0 = r0.A05
            r309 = r0
            r0 = r309
            r1 = r311
            r0.send(r1)
            r0 = 1
            r306 = r0
        Laa:
            r0 = r306
            return r0
        Lad:
            r0 = 0
            r314 = r0
            goto L77
        Lb3:
            r0 = r301
            X.1Br r0 = r0.A03
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.C2F r0 = (X.C2F) r0
            r309 = r0
            r0 = r309
            r1 = r304
            com.facebook.fbwebrtc.multiway.RtcMessageHeader r0 = r0.A00(r1)
            r311 = r0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ifs.sendMultiwaySignalingMessage(java.lang.String, java.lang.String, byte[]):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (r314 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean sendMultiwaySignalingMessage(byte[] r302, X.JDg r303, int r304) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ifs.sendMultiwaySignalingMessage(byte[], X.JDg, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008b, code lost:
    
        if (r322 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean sendMultiwaySignalingMessageExt(byte[] r302, X.JDg r303, X.JDh r304, int r305) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ifs.sendMultiwaySignalingMessageExt(byte[], X.JDg, X.JDh, int):boolean");
    }

    public void setWebrtcInteractor(5V5 r302) {
    }

    public void triggerEarlyConnection(boolean z) {
        int i = z ? this.A01 : this.A00;
        if (i > 0) {
            this.A05.earlyConnection(i);
        }
    }
}
