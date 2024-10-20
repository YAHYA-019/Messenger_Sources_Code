package X;

import com.facebook.auth.viewercontext.ViewerContext;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: E0v.class */
public final class E0v extends 2Yf {
    public C7z0 A00;
    public 1Im A01;
    public 2lK A02;
    public 5TY A03;
    public EAE A04;

    public E0v() {
        super("ResponseQuerySection");
    }

    public static ELJ A0I(EAE eae) {
        F8X f8x;
        int ordinal = EXr.A00(eae).ordinal();
        boolean z = true;
        if (ordinal == 0 || ordinal == 1 || ordinal == 3) {
            return ELJ.A04;
        }
        if (((4kO) eae).A00 == 1 || (f8x = eae.A03) == null || 3 != f8x.A00) {
            z = false;
        }
        EnumC08284mf enumC08284mf = eae.A01;
        if (!z) {
            int ordinal2 = enumC08284mf.ordinal();
            if (ordinal2 == 0) {
                return ELJ.A03;
            }
            if (ordinal2 == 2) {
                return ELJ.A02;
            }
        }
        return ELJ.A01;
    }

    public C1qp A0S(C1qp c1qp, C1qb c1qb) {
        C1qp A00 = 1sK.A00(c1qp);
        AtomicReference atomicReference = ((2Yf) this).A03.A02;
        A00.A03(C7z0.class, atomicReference != null ? atomicReference.get() : null);
        EAE eae = this.A04;
        A00.A03(F8X.class, eae != null ? eae.A03 : null);
        EAE eae2 = this.A04;
        A00.A03(ViewerContext.class, eae2 != null ? eae2.A00 : null);
        return A00;
    }

    public void A0X(2Yv r302, 2Yv r303) {
        E0W e0w = (E0W) r302;
        E0W e0w2 = (E0W) r303;
        e0w2.A00 = e0w.A00;
        e0w2.A02 = e0w.A02;
        e0w2.A01 = e0w.A01;
    }

    public void A0Y(C1qp c1qp) {
        if (c1qp != null) {
            this.A02 = (2lK) c1qp.A01(2lK.class);
            this.A03 = (5TY) c1qp.A01(5TY.class);
            this.A00 = (C7z0) c1qp.A01(C7z0.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0409, code lost:
    
        if (r0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014e, code lost:
    
        if (r0.A01 != (-1)) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Z(X.2Yy r302, X.C1qb r303, int r304, int r305, int r306, long r307, boolean r309, boolean r310) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E0v.A0Z(X.2Yy, X.1qb, int, int, int, long, boolean, boolean):void");
    }

    public void A0a(C1qb c1qb) {
        E0W e0w = ((2Yf) this).A03;
        C7z0 c7z0 = this.A00;
        5TY r0 = this.A03;
        5iW r02 = (5iW) 1Bi.A03(49830);
        EqS eqS = new EqS();
        if (c7z0 == null && r0 != null) {
            c7z0 = r02.A02(r0);
        }
        AtomicReference atomicReference = new AtomicReference(c7z0);
        AtomicBoolean A15 = 7zO.A15();
        e0w.A02 = atomicReference;
        e0w.A01 = A15;
        e0w.A00 = eqS;
    }

    public boolean A0c(2Yf r302, 2Yf r303, C1qb c1qb, C1qb c1qb2) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        if (r308 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c7, code lost:
    
        r0 = ((X.4kO) r0).A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        if (r0.A02 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00db, code lost:
    
        r308.ARr(r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01ef, code lost:
    
        if (r305 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01f2, code lost:
    
        r309.A07.A01(r308, A0I(r0), r305);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x020d, code lost:
    
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.9TF, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.2Ys A0d(X.C1qb r302) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E0v.A0d(X.1qb):X.2Ys");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yv A0f() {
        return new Object();
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            E0v e0v = (E0v) r302;
            EAE eae = this.A04;
            EAE eae2 = e0v.A04;
            if (eae != null) {
                if (!eae.equals(eae2)) {
                    return false;
                }
            } else if (eae2 != null) {
                return false;
            }
            2lK r0 = this.A02;
            2lK r02 = e0v.A02;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            5TY r03 = this.A03;
            5TY r04 = e0v.A03;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            C7z0 c7z0 = this.A00;
            C7z0 c7z02 = e0v.A00;
            if (c7z0 != null) {
                if (!c7z0.equals(c7z02)) {
                    return false;
                }
            } else if (c7z02 != null) {
                return false;
            }
        }
        return true;
    }
}
