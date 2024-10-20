package X;

import com.facebook.video.common.playerorigin.PlayerOrigin;

/* loaded from: Ii5.class */
public final class Ii5 implements JNT {
    public HzI A01;
    public String A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final PlayerOrigin A0A;
    public final Hgp A0B;
    public final HcS A0C;
    public final Hf9 A0D;
    public final HfA A0E;
    public I0e A00 = (I0e) 1Bi.A03(115334);
    public Hxn A02 = (Hxn) 1Bi.A03(115342);
    public final 1Br A06 = 1Bq.A00(115340);

    public Ii5(PlayerOrigin playerOrigin, String str, boolean z) {
        boolean z2;
        this.A0A = playerOrigin;
        this.A03 = str;
        HzI hzI = (HzI) 1Bi.A03(115338);
        this.A01 = hzI;
        this.A08 = 1Bq.A00(115168);
        this.A09 = 1Bq.A00(115172);
        this.A05 = 1BK.A0C();
        this.A04 = 7zM.A0N();
        this.A0C = new HcS(this.A00, hzI);
        this.A07 = 1Bq.A00(115205);
        Hgp hgp = new Hgp(playerOrigin, z);
        this.A0B = hgp;
        this.A0D = new Hf9(hgp, this.A00, this.A01);
        this.A0E = new HfA(hgp, this.A00, this.A01);
        I0e i0e = this.A00;
        if (i0e.A0N) {
            z2 = i0e.A0M;
        } else {
            z2 = 2yD.A04(i0e.A0Q, 36316937799936653L);
            i0e.A0M = z2;
            i0e.A0N = true;
        }
        this.A03 = (hgp.A01 && z2) ? "IFP" : (!hgp.A02 || z) ? this.A03 : "WATCH_FEED";
    }

    public /* synthetic */ boolean AIO() {
        return false;
    }

    public /* synthetic */ boolean ANM() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0041, code lost:
    
        if (r308 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ANQ() {
        /*
            r301 = this;
            r0 = r301
            X.Hgp r0 = r0.A0B
            r302 = r0
            r0 = r301
            X.I0e r0 = r0.A00
            r303 = r0
            r0 = r303
            boolean r0 = r0.A03
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L48
            r0 = r303
            X.1CO r0 = r0.A0Q
            r305 = r0
            r0 = 36316937796921982(0x81061000b72a7e, double:3.03031592711965E-306)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = X.2yD.A04(r0, r1)
            r308 = r0
            r0 = r303
            r1 = r308
            r0.A02 = r1
            r0 = 1
            r304 = r0
            r0 = r303
            r1 = r304
            r0.A03 = r1
        L34:
            r0 = r302
            boolean r0 = r0.A01
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L44
            r0 = 1
            r304 = r0
            r0 = r308
            if (r0 != 0) goto L46
        L44:
            r0 = 0
            r304 = r0
        L46:
            r0 = r304
            return r0
        L48:
            r0 = r303
            boolean r0 = r0.A02
            r308 = r0
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ii5.ANQ():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005d, code lost:
    
        if (r312 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean APH(float r302, boolean r303, boolean r304) {
        /*
            r301 = this;
            r0 = r301
            X.Hgp r0 = r0.A0B
            r305 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            boolean r0 = r0.APO(r1, r2, r3)
            r306 = r0
            r0 = r301
            X.I0e r0 = r0.A00
            r307 = r0
            r0 = r307
            boolean r0 = r0.A05
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L66
            r0 = r307
            X.1CO r0 = r0.A0Q
            r309 = r0
            r0 = 36316937793383013(0x81061000812a65, double:3.030315924881592E-306)
            r310 = r0
            r0 = r309
            r1 = r310
            boolean r0 = X.2yD.A04(r0, r1)
            r312 = r0
            r0 = r307
            r1 = r312
            r0.A04 = r1
            r0 = 1
            r308 = r0
            r0 = r307
            r1 = r308
            r0.A05 = r1
        L47:
            r0 = r305
            boolean r0 = r0.A01
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L60
            r0 = r306
            if (r0 == 0) goto L60
            r0 = 1
            r308 = r0
            r0 = r312
            if (r0 != 0) goto L63
        L60:
            r0 = 0
            r308 = r0
        L63:
            r0 = r308
            return r0
        L66:
            r0 = r307
            boolean r0 = r0.A04
            r312 = r0
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ii5.APH(float, boolean, boolean):boolean");
    }

    public boolean APK() {
        return 1Br.A07(this.A04).AZk(72339378259428023L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0087, code lost:
    
        if (r312 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e7, code lost:
    
        if (r312 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean APO(float r302, boolean r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ii5.APO(float, boolean, boolean):boolean");
    }

    public /* synthetic */ boolean APS() {
        return false;
    }

    public /* synthetic */ boolean APU() {
        return false;
    }

    public /* synthetic */ boolean ARB() {
        return false;
    }

    public boolean ATe() {
        I0e i0e = this.A00;
        if (i0e.A01) {
            return i0e.A00;
        }
        boolean A04 = 2yD.A04(i0e.A0Q, 36312574109946660L);
        i0e.A00 = A04;
        i0e.A01 = true;
        return A04;
    }

    public /* synthetic */ boolean BO1() {
        return false;
    }

    public /* synthetic */ boolean BO2() {
        return false;
    }

    public boolean CiF() {
        I0e i0e = this.A00;
        if (i0e.A0P) {
            return i0e.A0O;
        }
        boolean A04 = 2yD.A04(i0e.A0Q, 36312574108898077L);
        i0e.A0O = A04;
        i0e.A0P = true;
        return A04;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (X.11T.A0O(r0, com.facebook.video.common.playerorigin.PlayerOrigin.A08) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean CxI() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.video.common.playerorigin.PlayerOrigin r0 = r0.A0A
            r302 = r0
            com.facebook.video.common.playerorigin.PlayerOrigin r0 = com.facebook.video.common.playerorigin.PlayerOrigin.A0h
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = X.11T.A0O(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L27
            com.facebook.video.common.playerorigin.PlayerOrigin r0 = com.facebook.video.common.playerorigin.PlayerOrigin.A08
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = X.11T.A0O(r0, r1)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L29
        L27:
            r0 = 1
            r304 = r0
        L29:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ii5.CxI():boolean");
    }

    public /* synthetic */ boolean D8l() {
        return false;
    }

    public /* synthetic */ boolean D8m() {
        return false;
    }
}
