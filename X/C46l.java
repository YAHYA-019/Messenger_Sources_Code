package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.46l, reason: invalid class name */
/* loaded from: 46l.class */
public final class C46l extends 2QB {
    public boolean A00;
    public final 2Qy A05 = new 2Qy() { // from class: X.46m
        public void Bo5() {
            0fH.A0j("HTImmersiveBadgeController", 1BJ.A00(863));
            C46l.this.A08(false);
        }

        public void CLQ(int i) {
            C46l c46l = C46l.this;
            if (c46l.A00) {
                return;
            }
            0fH.A0j("HTImmersiveBadgeController", 1BJ.A00(864));
            c46l.A08(true);
        }
    };
    public final 1Br A01 = 1Bq.A00(83207);
    public final 1Br A03 = 1Bq.A00(68228);
    public final 1Br A02 = 1Bq.A00(33013);
    public final 1Br A04 = 1Bq.A00(68457);
    public final 1HN A06 = new 4OY(this);

    public void A05() {
        ((C5ct) 1Br.A0B(this.A04)).A07("entered_tab", true);
    }

    public void A06() {
        ((C5ct) 1Br.A0B(this.A04)).A06(1Fw.A06(1Bn.A0A(16428)), this.A05);
        1Br.A09(this.A02).CcV(this.A06, 1NK.A1T);
        A08(false);
    }

    public void A07() {
        ((C5ct) this.A04.A00.get()).A05();
        ((FbSharedPreferences) this.A02.A00.get()).D63(this.A06, 1NK.A1T);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (X.C5bz.A01() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A08(boolean r302) {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A03
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.46n r0 = (X.C46n) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A00()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L27
            boolean r0 = X.C5bz.A01()
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r304
            if (r0 == 0) goto L2a
        L27:
            r0 = 1
            r305 = r0
        L2a:
            r0 = r301
            boolean r0 = r0.A00
            r304 = r0
            java.lang.String r0 = "HTImmersiveBadgeController"
            r307 = r0
            r0 = r304
            if (r0 != 0) goto L8e
            r0 = r305
            if (r0 == 0) goto L7d
            r0 = r302
            if (r0 == 0) goto L8e
            java.lang.String r0 = "Show badge on Highlights Tab due to new stories"
            r303 = r0
            r0 = r307
            r1 = r303
            X.0fH.A0j(r0, r1)
            java.lang.Integer r0 = X.0S2.A01
            r306 = r0
        L4e:
            r0 = 1
            r308 = r0
            r0 = r301
            X.1Br r0 = r0.A01
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            r0 = 304(0x130, float:4.26E-43)
            r304 = r0
            r0 = r304
            java.lang.String r0 = X.1BJ.A00(r0)
            r303 = r0
            X.2QC r0 = new X.2QC
            r309 = r0
            r0 = r309
            r1 = r306
            r2 = r303
            r3 = r308
            r0.<init>(r1, r2, r3)
        L76:
            r0 = r301
            r1 = r309
            r0.A04(r1)
            return
        L7d:
            java.lang.String r0 = "Show badge on Highlights Tab due to NUX"
            r303 = r0
            r0 = r307
            r1 = r303
            X.0fH.A0j(r0, r1)
            java.lang.Integer r0 = X.0S2.A00
            r306 = r0
            goto L4e
        L8e:
            r0 = 255(0xff, float:3.57E-43)
            r304 = r0
            r0 = r304
            java.lang.String r0 = X.1BJ.A00(r0)
            r303 = r0
            r0 = r307
            r1 = r303
            X.0fH.A0j(r0, r1)
            X.2QC r0 = X.2QC.A03
            r309 = r0
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46l.A08(boolean):void");
    }
}
