package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.2kV, reason: invalid class name */
/* loaded from: 2kV.class */
public final class C2kV extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public 2N3 A08;
    public 2NI A09;
    public 2Nv A0A;
    public 1LI A0B;
    public 1LI A0C;
    public 1LI A0D;
    public 1Im A0E;
    public 1Im A0F;
    public C2ko A0G;
    public C2ko A0H;
    public C2ko A0I;
    public 2lK A0J;
    public C2l1 A0K;
    public 2Yf A0L;
    public C2kx A0M;
    public C2kf A0N;
    public 3xS A0O;
    public 3xT A0P;
    public Integer A0Q;
    public String A0R;
    public List A0S;
    public List A0T;
    public List A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public static final C2kf A0h = new 2kW().A00();
    public static final 2NI A0g = new C2kh();

    public C2kV() {
        super("RecyclerCollectionComponent");
        this.A0V = false;
        this.A0X = true;
        this.A0Y = true;
        this.A0c = true;
        this.A09 = A0g;
        this.A0T = Collections.emptyList();
        this.A0d = true;
        this.A0U = Collections.emptyList();
        this.A03 = 0;
        this.A0N = A0h;
        this.A04 = -1;
        this.A05 = -12425294;
        this.A0e = false;
    }

    public static C2ki A00(1Iw r301) {
        return new C2ki(r301, new C2kV());
    }

    public static void A01(1Iw r301, 2Xo r302, boolean z) {
        1LI r0 = r301.A02;
        1Im r3012 = r0 == null ? null : ((C2kV) r0).A0E;
        if (z && r3012 != null) {
            if (AnonymousClass001.A1V(r3012.A00(new Object()))) {
                return;
            }
        }
        r302.A0M();
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C2kV c2kV = (C2kV) super.A0l();
        1LI r0 = c2kV.A0B;
        2Yf r304 = null;
        c2kV.A0B = r0 != null ? r0.A0l() : null;
        1LI r02 = c2kV.A0C;
        c2kV.A0C = r02 != null ? r02.A0l() : null;
        1LI r03 = c2kV.A0D;
        c2kV.A0D = r03 != null ? r03.A0l() : null;
        2Yf r04 = c2kV.A0L;
        if (r04 != null) {
            r304 = r04.A0g(false);
        }
        c2kV.A0L = r304;
        return c2kV;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // X.C1rj
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2kV.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        C2ko c2ko = this.A0I;
        if (c2ko != null) {
            c2ko.A00 = r302;
            c2ko.A01 = this;
            r303.A02(c2ko);
        }
        C2ko c2ko2 = this.A0H;
        if (c2ko2 != null) {
            c2ko2.A00 = r302;
            c2ko2.A01 = this;
            r303.A02(c2ko2);
        }
        C2ko c2ko3 = this.A0G;
        if (c2ko3 != null) {
            c2ko3.A00 = r302;
            c2ko3.A01 = this;
            r303.A02(c2ko3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00fc, code lost:
    
        if (r325.A0N == false) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.66W] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1N(X.1Iw r302, X.2Yv r303) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2kV.A1N(X.1Iw, X.2Yv):void");
    }

    @Override // X.C1rj
    public boolean A1R() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
