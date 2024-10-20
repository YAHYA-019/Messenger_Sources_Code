package X;

import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: If9.class */
public final class If9 implements JKQ {
    public int A00;
    public long A01;
    public final 1Br A02 = 1BK.A0C();
    public final 1Br A03 = 1Bq.A00(16705);
    public final 1Br A04 = 1Bu.A00(16428);
    public volatile boolean A05;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (r305 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ATM() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A05
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L9f
            r0 = 16428(0x402c, float:2.302E-41)
            java.lang.Object r0 = X.1Bn.A0A(r0)
            X.1EZ r0 = (X.1EZ) r0
            com.facebook.auth.usersession.FbUserSession r0 = X.1Fw.A04(r0)
            r303 = r0
            r0 = 33088(0x8140, float:4.6366E-41)
            r302 = r0
            r0 = r303
            r1 = r302
            java.lang.Object r0 = X.1Lm.A06(r0, r1)
            X.2JS r0 = X.GOn.A0x(r0)
            com.facebook.rsys.state.gen.State r0 = X.GOq.A0n(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L34
            r0 = r304
            java.lang.String r0 = r0.localCallId
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L38
        L34:
            java.lang.String r0 = ""
            r305 = r0
        L38:
            X.4zJ r0 = X.4zI.A03
            r306 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r305
            r1[r2] = r3
            r303 = r0
            r0 = r306
            java.lang.String r1 = "AudioManagerQplLoggerImpl"
            java.lang.String r2 = "flow end callId=%s"
            r3 = r303
            r0.A05(r1, r2, r3)
            r0 = r301
            X.1Br r0 = r0.A03
            X.00i r0 = r0.A00
            r307 = r0
            r0 = r307
            java.lang.Object r0 = r0.get()
            com.facebook.quicklog.reliability.UserFlowLogger r0 = (com.facebook.quicklog.reliability.UserFlowLogger) r0
            r306 = r0
            r0 = r301
            long r0 = r0.A01
            r308 = r0
            java.lang.String r0 = "local_call_id"
            r304 = r0
            r0 = r306
            r1 = r308
            r2 = r304
            r3 = r305
            r0.flowAnnotate(r1, r2, r3)
            r0 = r307
            java.lang.Object r0 = r0.get()
            com.facebook.quicklog.reliability.UserFlowLogger r0 = (com.facebook.quicklog.reliability.UserFlowLogger) r0
            r310 = r0
            r0 = r301
            long r0 = r0.A01
            r311 = r0
            r0 = r310
            r1 = r311
            r0.flowEndSuccess(r1)
            r0 = 0
            r311 = r0
            r0 = r301
            r1 = r311
            r0.A01 = r1
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.If9.ATM():void");
    }

    public void ATO() {
        this.A05 = 1Br.A07(this.A02).AZk(36316881950353958L);
        this.A00 = 0;
        if (this.A05) {
            4zI.A03.A05("AudioManagerQplLoggerImpl", "flow start", new Object[0]);
            C00i c00i = this.A03.A00;
            this.A01 = ((UserFlowLogger) c00i.get()).generateNewFlowId(867378854);
            AbI.A1U((UserFlowLogger) c00i.get(), "rtc", this.A01, false);
            2QN r0 = (2QN) 1Lm.A06(1Br.A03(this.A04), 99978);
            UserFlowLogger userFlowLogger = (UserFlowLogger) c00i.get();
            long j = this.A01;
            String str = r0.A0G;
            if (str == null) {
                str = "unknown";
            }
            userFlowLogger.flowAnnotate(j, "logging_trace_id", str);
        }
    }

    public void Bct(String str, String str2) {
        if (this.A05) {
            UserFlowLogger A0Z = 4YV.A0Z(this.A03);
            long j = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            A0Z.flowMarkPoint(j, 0Pz.A0M(str, '_', i), str2);
        }
    }
}
