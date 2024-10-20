package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.8qq, reason: invalid class name */
/* loaded from: 8qq.class */
public final class C8qq extends 2Yf {
    public int A00;
    public int A01;
    public AXV A02;
    public QuickPerformanceLogger A03;
    public String A04;

    public C8qq() {
        super("InitialTTILoggingSection");
        this.A01 = 0;
    }

    public static void A0I(C1qb c1qb, 9AG r302, boolean z) {
        if (1BK.A0K().AZk(36311783824559524L)) {
            r302.A00 = z;
        } else if (c1qb.A0J() != null) {
            c1qb.A0H(7zS.A0N(Boolean.valueOf(z)), "updateState:InitialTTILoggingSection.updateInitialLoad");
        }
    }

    public void A0X(2Yv r302, 2Yv r303) {
        ((C8od) r303).A00 = ((C8od) r302).A00;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.9AG, java.lang.Object] */
    public void A0a(C1qb c1qb) {
        C8od c8od = (C8od) ((2Yf) this).A03;
        ?? obj = new Object();
        ((9AG) obj).A00 = false;
        c8od.A00 = obj;
    }

    public 2Ys A0d(C1qb c1qb) {
        AXV axv = this.A02;
        2Yr A0l = 7zL.A0l();
        A0l.A01(axv.AKs(2Yg.A0A(c1qb, C8qq.class, "InitialTTILoggingSection", -939748803), c1qb));
        return A0l.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e1, code lost:
    
        if (r0.A00 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0e(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8qq.A0e(X.1Im, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yv A0f() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yf A0g(boolean z) {
        2Yf A0g = super.A0g(z);
        if (!z) {
            A0g.A03 = new Object();
        }
        return A0g;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qq c8qq = (C8qq) r302;
            QuickPerformanceLogger quickPerformanceLogger = this.A03;
            QuickPerformanceLogger quickPerformanceLogger2 = c8qq.A03;
            if (quickPerformanceLogger != null) {
                if (!quickPerformanceLogger.equals(quickPerformanceLogger2)) {
                    return false;
                }
            } else if (quickPerformanceLogger2 != null) {
                return false;
            }
            if (this.A00 != c8qq.A00 || this.A01 != c8qq.A01) {
                return false;
            }
            AXV axv = this.A02;
            AXV axv2 = c8qq.A02;
            if (axv != null) {
                if (!axv.equals(axv2)) {
                    return false;
                }
            } else if (axv2 != null) {
                return false;
            }
            String str = this.A04;
            String str2 = c8qq.A04;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
        }
        return true;
    }
}
