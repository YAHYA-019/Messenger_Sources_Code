package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.JdF, reason: case insensitive filesystem */
/* loaded from: JdF.class */
public abstract class AbstractC2927JdF extends L56 implements MNJ, MER {
    public static final Function1 A06 = M57.A00;
    public JaW A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public JaW A04;
    public final L8T A05 = new C2921Jd9(this);

    public static AbstractC2941JdU A00(AbstractC2938JdR abstractC2938JdR) {
        AbstractC2938JdR abstractC2938JdR2 = abstractC2938JdR.A06;
        11T.A0D(abstractC2938JdR2);
        AbstractC2941JdU A0Q = abstractC2938JdR2.A0Q();
        11T.A0D(A0Q);
        return A0Q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0202, code lost:
    
        if ((X.JR0.A0U(r0) & (-9187201950435737472L)) == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0205, code lost:
    
        r352 = X.JaW.A00(r308, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0218, code lost:
    
        if (((X.JaW) r308).A00 != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021b, code lost:
    
        r0 = r308.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0237, code lost:
    
        if (X.JR1.A0W(r0, r352) == 254) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x023a, code lost:
    
        r0 = r308.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x024c, code lost:
    
        if (r0 <= 8) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x027a, code lost:
    
        if ((X.JR0.A0R(r308.A01) ^ Long.MIN_VALUE) > (X.JQz.A0H(r0) ^ Long.MIN_VALUE)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x027d, code lost:
    
        r0 = r308.A04;
        r0 = r308.A02;
        X.Ky4.A00(r0, r0);
        r339 = 0;
        r337 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x029f, code lost:
    
        r0 = r339 >> 3;
        r0 = r0[r0];
        r0 = (r339 & 7) << 3;
        r0 = (r0 >> r0) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02c6, code lost:
    
        if (r0 != 128) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02c9, code lost:
    
        r337 = r339;
        r339 = r339 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02d9, code lost:
    
        if (r339 != r0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02dc, code lost:
    
        ((X.JaW) r308).A00 = X.JR1.A05(r308.A00) - r308.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02f9, code lost:
    
        r352 = X.JaW.A00(r308, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x03cd, code lost:
    
        if (r0 != 254) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x03d0, code lost:
    
        r0 = X.JQz.A08(X.AnonymousClass002.A04(r0[r339]), -862048943);
        r0 = r0 >>> 7;
        r0 = X.JaW.A00(r308, r0);
        r0 = r0 & r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0421, code lost:
    
        if (X.JQz.A09(r0, r0, r0) != X.JQz.A09(r339, r0, r0)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0424, code lost:
    
        r0[r0] = ((r0 & 127) << r0) | (((255 << r0) ^ r0) & r0[r0]);
        r0[r0.length - 1] = (r0[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0476, code lost:
    
        r0 = r0 >> 3;
        r0 = r0[r0];
        r0 = (r0 & 7) << 3;
        r0 = (r0 >> r0) & 255;
        r0 = r0 & 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04a5, code lost:
    
        if (r0 != 128) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x04a8, code lost:
    
        r0[r0] = (r0 & ((255 << r0) ^ r0)) | (r0 << r0);
        r0[r0] = (r0[r0] & ((255 << r0) ^ r0)) | (128 << r0);
        X.JR0.A1N(r0, r339, r0);
        r0[r0] = r0[r339];
        r0[r339] = 0.0f;
        r337 = r339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x052c, code lost:
    
        r0[r0.length - 1] = (r0[0] & 72057594037927935L) | Long.MIN_VALUE;
        r339 = r339 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0551, code lost:
    
        r0[r0] = (r0 << r0) | (r0 & ((255 << r0) ^ r0));
        r337 = X.JR1.A0P(r0, r337, r339, r0);
        X.JR1.A1T(r0, r0, r337, r339);
        r0[r337] = r0[r0];
        r0[r0] = r0[r339];
        r0[r339] = r0[r337];
        r339 = r339 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x046d, code lost:
    
        r339 = r339 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x05c6, code lost:
    
        r0 = X.JR0.A0A(r0);
        r0 = r308.A04;
        r0 = r308.A02;
        X.JaW.A01(r308, r0);
        r0 = r308.A03;
        r0 = r308.A04;
        r0 = r308.A02;
        r0 = r308.A00;
        r339 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x060c, code lost:
    
        if (r339 >= r0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x061f, code lost:
    
        if (X.JR1.A0W(r0, r339) >= 128) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0622, code lost:
    
        r0 = r0[r339];
        r0 = X.JQz.A08(X.AnonymousClass002.A04(r0), -862048943);
        r0 = X.JaW.A00(r308, r0 >>> 7);
        r0 = r0 & 127;
        r0 = r0 >> 3;
        r0 = (r0 & 7) << 3;
        r0 = (r0 << r0) | (r0[r0] & ((255 << r0) ^ r0));
        r0[r0] = r0;
        X.JR1.A1S(r0, r0, r0, r0);
        r0[r0] = r0;
        r0[r0] = r0[r339];
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x06b4, code lost:
    
        r339 = r339 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0305, code lost:
    
        r308.A01++;
        r0 = ((X.JaW) r308).A00;
        r0 = r308.A03;
        r0 = r352 >> 3;
        r0 = r0[r0];
        r0 = (r352 & 7) << 3;
        ((X.JaW) r308).A00 = r0 - (X.AnonymousClass001.A1O((((r0 >> r0) & 255) > 128 ? 1 : (((r0 >> r0) & 255) == 128 ? 0 : -1))) ? 1 : 0);
        r0 = r308.A00;
        r0 = (((255 << r0) ^ r0) & r0) | (r0 << r0);
        r0[r0] = r0;
        X.JR1.A1S(r0, r352, r0, r0);
        r353 = r352 ^ (-1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v115, types: [X.JdR] */
    /* JADX WARN: Type inference failed for: r0v123, types: [X.JdR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.AbstractC2927JdF r301, X.LPX r302) {
        /*
            Method dump skipped, instructions count: 2213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2927JdF.A01(X.JdF, X.LPX):void");
    }

    public static final void A02(AbstractC2938JdR abstractC2938JdR) {
        L4u AWE;
        AbstractC2938JdR abstractC2938JdR2 = abstractC2938JdR.A06;
        LPQ lpq = abstractC2938JdR2 != null ? abstractC2938JdR2.A0H : null;
        LPQ lpq2 = abstractC2938JdR.A0H;
        boolean A0O = 11T.A0O(lpq, lpq2);
        C2926JdE c2926JdE = lpq2.A0R.A0J;
        if (A0O) {
            MNK B1I = c2926JdE.B1I();
            if (B1I == null) {
                return;
            }
            AWE = B1I.AWE();
            if (AWE == null) {
                return;
            }
        } else {
            AWE = c2926JdE.A0N;
        }
        AWE.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e6, code lost:
    
        return (-1) << (-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        if (r305 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r305 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        return r305.intValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A0L(X.Kdl r302) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2927JdF.A0L(X.Kdl):int");
    }

    public final int A0M(Kdl kdl) {
        int A0L;
        int i = (-1) << (-1);
        if ((this instanceof AbstractC2938JdR ? AnonymousClass001.A1T(((AbstractC2938JdR) this).A04) : AnonymousClass001.A1T(((AbstractC2941JdU) this).A01)) && (A0L = A0L(kdl)) != i) {
            i = A0L + JR0.A0I(((L56) this).A02);
        }
        return i;
    }

    public MKR A0N() {
        MKR mkr;
        if (this instanceof AbstractC2938JdR) {
            mkr = ((AbstractC2938JdR) this).A04;
            if (mkr == null) {
                throw AnonymousClass001.A0N("Asking for measurement result of unmeasured layout modifier");
            }
        } else {
            mkr = ((AbstractC2941JdU) this).A01;
            if (mkr == null) {
                throw AnonymousClass001.A0N("LookaheadDelegate has not been measured yet when measureResult is requested.");
            }
        }
        return mkr;
    }

    public boolean BU2() {
        return this instanceof AbstractC2941JdU;
    }

    public /* synthetic */ MKR BY7(java.util.Map map, Function1 function1, int i, int i2) {
        if ((i & (-16777216)) == 0 && ((-16777216) & i2) == 0) {
            return new LPB(this, map, function1, i, i2);
        }
        throw AnonymousClass001.A0N(0Pz.A0o("Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215.", i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ int Cik(float f) {
        return L5l.A01(this, f);
    }

    public void Csg(boolean z) {
        this.A01 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ float D4L(long j) {
        return KvQ.A00(this, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ float D4M(float f) {
        return f / AhL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ float D4S(long j) {
        return L5l.A00(this, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ float D4T(float f) {
        return f * AhL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ long D4W(long j) {
        return L5l.A02(this, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ long D4X(float f) {
        return KvQ.A01(this, f / AhL());
    }
}
