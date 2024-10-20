package X;

/* renamed from: X.Jce, reason: case insensitive filesystem */
/* loaded from: Jce.class */
public final class C2894Jce extends LPR implements MNZ, MNa, MNN {
    public MLN A00;
    public boolean A01;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r302 == null) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.0CL] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.C2894Jce r301) {
        /*
            X.0CL r0 = new X.0CL
            r302 = r0
            r0 = r302
            r0.<init>()
            r0 = 15
            r303 = r0
            r0 = r302
            r1 = r303
            X.M6m r0 = X.M6m.A00(r0, r1)
            r304 = r0
            r0 = r301
            r1 = r304
            A02(r0, r1)
            r0 = r302
            java.lang.Object r0 = r0.element
            X.Jce r0 = (X.C2894Jce) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2b
            r0 = r304
            X.MLN r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L30
        L2b:
            r0 = r301
            X.MLN r0 = r0.A00
            r302 = r0
        L30:
            X.Jau r0 = X.L7J.A05
            r1 = r301
            java.lang.Object r0 = X.KUe.A00(r0, r1)
            X.MEM r0 = (X.MEM) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L46
            r0 = r304
            r1 = r302
            r0.Cpa(r1)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2894Jce.A00(X.Jce):void");
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.0CL] */
    public static final void A01(C2894Jce c2894Jce) {
        if (c2894Jce.A01) {
            c2894Jce.A01 = false;
            if (((LPR) c2894Jce).A08) {
                ?? obj = new Object();
                A02(c2894Jce, M6m.A00(obj, 12));
                C2894Jce c2894Jce2 = (C2894Jce) ((0CL) obj).element;
                if (c2894Jce2 != null) {
                    A00(c2894Jce2);
                    return;
                }
                MEM mem = (MEM) KUe.A00(L7J.A05, c2894Jce);
                if (mem != null) {
                    mem.Cpa((MLN) null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x012a, code lost:
    
        if (r313 == 1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(X.MNa r301, kotlin.jvm.functions.Function1 r302) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2894Jce.A02(X.MNa, kotlin.jvm.functions.Function1):void");
    }

    @Override // X.MNa
    public /* bridge */ /* synthetic */ Object BGy() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    public /* synthetic */ boolean BPq() {
        return false;
    }

    public void Bmx() {
        A01(this);
    }

    public /* synthetic */ void BtB() {
        A01(this);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0Je, java.lang.Object] */
    public void CCi(KiX kiX, KMa kMa, long j) {
        if (kMa == KMa.A03) {
            int i = kiX.A00;
            if (i != 4) {
                if (i == 5) {
                    A01(this);
                    return;
                }
                return;
            }
            this.A01 = true;
            ?? obj = new Object();
            ((0Je) obj).element = true;
            L5f.A02(this, M6m.A00(obj, 13));
            if (((0Je) obj).element) {
                A00(this);
            }
        }
    }

    public /* synthetic */ void CUa() {
        A01(this);
    }

    public /* synthetic */ boolean Cx3() {
        return false;
    }
}
