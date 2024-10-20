package X;

import android.text.TextUtils;

/* renamed from: X.1gb, reason: invalid class name */
/* loaded from: 1gb.class */
public final class C1gb {
    public final 1Br A08 = 1Bq.A00(16385);
    public final C0et A00 = (C0et) 1Bi.A03(83604);
    public final 1Br A05 = 1Bu.A00(82615);
    public final 1Br A03 = 1Bu.A00(82617);
    public final 1Br A04 = 1Bq.A00(68665);
    public final 1Br A01 = 1Bq.A00(66265);
    public final 1Br A07 = 1Bq.A00(66409);
    public final 1Br A06 = 1Bq.A00(66347);
    public final 1Br A02 = 1Bq.A00(82485);

    public static final 1qI A00(C1gb c1gb) {
        return (1qI) c1gb.A07.A00.get();
    }

    public static 1CO A01(C00i c00i) {
        return A02((C1gb) c00i.get());
    }

    public static final 1CO A02(C1gb c1gb) {
        return (1CO) c1gb.A08.A00.get();
    }

    public int A03() {
        return (int) A02(this).Auy(36601410650510724L);
    }

    public int A04() {
        return (int) A02(this).Auy(36601410650379650L);
    }

    public Long A05() {
        Long l = null;
        if (this.A00 == C0et.A0P && !((1Wa) this.A06.A00.get()).A00()) {
            String A06 = A00(this).A06();
            if (TextUtils.isDigitsOnly(A06)) {
                l = Long.valueOf(Long.parseLong(A06));
            }
        }
        return l;
    }

    public boolean A06() {
        return A02(this).AZk(36319935673153993L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (A00(r301).A0E() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A07() {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A06
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1Wa r0 = (X.1Wa) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A00()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L29
            r0 = r301
            X.1qI r0 = A00(r0)
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0E()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L2d
        L29:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L2d:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1gb.A07():boolean");
    }

    public boolean A08() {
        return A02(this).AZk(36322280725300500L);
    }

    public boolean A09() {
        return A02(this).AZk(36319935672891846L);
    }

    public boolean A0A() {
        return A02(this).AZk(36319227002828502L);
    }

    public boolean A0B() {
        boolean AZk = A02(this).AZk(36326648706520843L);
        0fH.A0j("MessengerSearchConfig", 0Pz.A1C("android_messenger_search_h2_24.enable_odml_mldw_logging: ", AZk));
        return AZk;
    }

    public boolean A0C() {
        boolean AZk = A02(this).AZk(36326648706258698L);
        0fH.A0j("MessengerSearchConfig", 0Pz.A1C("android_messenger_search_h2_24.enable_odml_ranking_task: ", AZk));
        return AZk;
    }

    public boolean A0D() {
        boolean AZk = A02(this).AZk(36326648706586380L);
        0fH.A0j("MessengerSearchConfig", 0Pz.A1C("android_messenger_search_h2_24.enable_people_prioritization_qs: ", AZk));
        return AZk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (X.1qI.A02(r0).AZk(36322796127078284L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0E() {
        /*
            r301 = this;
            r0 = r301
            X.1qI r0 = A00(r0)
            r302 = r0
            r0 = r302
            boolean r0 = r0.A07()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L39
            r0 = r301
            X.1qI r0 = A00(r0)
            r304 = r0
            r0 = r304
            boolean r0 = r0.A0A()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L39
            r0 = r304
            X.1CO r0 = X.1qI.A02(r0)
            r305 = r0
            r0 = 36322796127078284(0x810b640067478c, double:3.034020758700098E-306)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r308 = r0
            r0 = 1
            r303 = r0
            r0 = r308
            if (r0 != 0) goto L3d
        L39:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L3d:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1gb.A0E():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (X.1qI.A02(r0).AZk(36322796129372065L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0F() {
        /*
            r301 = this;
            r0 = r301
            X.1qI r0 = A00(r0)
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0A()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L29
            r0 = r302
            X.1CO r0 = X.1qI.A02(r0)
            r304 = r0
            r0 = 36322796129372065(0x810b64008a47a1, double:3.034020760150694E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = 1
            r303 = r0
            r0 = r307
            if (r0 != 0) goto L2b
        L29:
            r0 = 0
            r303 = r0
        L2b:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1gb.A0F():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (X.1qI.A02(r0).AZk(36322796127537040L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0G() {
        /*
            r301 = this;
            r0 = r301
            X.1qI r0 = A00(r0)
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0A()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L29
            r0 = r302
            X.1CO r0 = X.1qI.A02(r0)
            r304 = r0
            r0 = 36322796127537040(0x810b64006e4790, double:3.034020758990217E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = 1
            r303 = r0
            r0 = r307
            if (r0 != 0) goto L2b
        L29:
            r0 = 0
            r303 = r0
        L2b:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1gb.A0G():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (A00(r301).A0E() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0H() {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A06
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1Wa r0 = (X.1Wa) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A00()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L29
            r0 = r301
            X.1qI r0 = A00(r0)
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0E()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L2d
        L29:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L2d:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1gb.A0H():boolean");
    }

    public boolean A0I() {
        return A02(this).AZk(36315254158533225L);
    }

    public boolean A0J() {
        return A02(this).AZr(1GD.A05, 2342162163201750644L);
    }

    public boolean A0K() {
        boolean z = false;
        if (CCi.A00((CCi) this.A03.A00.get(), 36312995006977459L)) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (X.C5yp.A00((X.C5yp) r301.A05.A00.get(), 36312995006846386L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0L() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0K()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L2f
            r0 = r301
            X.1Br r0 = r0.A05
            X.00i r0 = r0.A00
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.5yp r0 = (X.C5yp) r0
            r304 = r0
            r0 = 36312995006846386(0x81027a001d15b2, double:3.027822490799502E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.C5yp.A00(r0, r1)
            r307 = r0
            r0 = 1
            r302 = r0
            r0 = r307
            if (r0 != 0) goto L33
        L2f:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L33:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1gb.A0L():boolean");
    }

    public boolean A0M() {
        return ((1Wa) this.A06.A00.get()).A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (A02(r301).AZr(X.1GD.A05, 2342162163202209397L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0N() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0J()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L29
            r0 = r301
            X.1CO r0 = A02(r0)
            r303 = r0
            r0 = 2342162163202209397(0x2081081400073675, double:4.064868534263619E-152)
            r304 = r0
            X.1GD r0 = X.1GD.A05
            r306 = r0
            r0 = r303
            r1 = r306
            r2 = r304
            boolean r0 = r0.AZr(r1, r2)
            r307 = r0
            r0 = 1
            r302 = r0
            r0 = r307
            if (r0 != 0) goto L2e
        L29:
            r0 = 0
            r302 = r0
            r0 = 0
            r306 = r0
        L2e:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1gb.A0N():boolean");
    }

    public boolean A0O() {
        boolean z = false;
        if (((C5ya) ((C5yp) this.A05.A00.get()).A00.A00.get()).A00()) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (A00(r301).A0E() == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0P(X.53M r302) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            X.1Br r0 = r0.A06
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.1Wa r0 = (X.1Wa) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A00()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L6a
            X.53M r0 = X.53M.A0L
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L58
            X.53M r0 = X.53M.A0M
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L58
            X.53M r0 = X.53M.A0Q
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L58
            X.53M r0 = X.53M.A0U
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L58
            X.53M r0 = X.53M.A0N
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L58
            X.53M r0 = X.53M.A0O
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L58
            X.53M r0 = X.53M.A0K
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L6a
        L58:
            r0 = r301
            X.1qI r0 = A00(r0)
            r303 = r0
            r0 = r303
            boolean r0 = r0.A0E()
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L6e
        L6a:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L6e:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1gb.A0P(X.53M):boolean");
    }

    public boolean A0Q(boolean z) {
        1CO A02 = A02(this);
        return z ? A02.AZk(36321322949558492L) : A02.AZr(1GD.A07, 36321322949558492L);
    }
}
