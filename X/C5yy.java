package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5yy, reason: invalid class name */
/* loaded from: 5yy.class */
public final class C5yy extends C1rj {
    public static final int A0J = 2RH.A04.A00();
    public static final 2MG A0K = 2MG.A02;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public 1LI A04;
    public C2ko A05;
    public 2QC A06;
    public MigColorScheme A07;
    public 2MG A08;
    public C5xv A09;
    public C5xv A0A;
    public List A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;

    public C5yy() {
        super("MigCustomTitleBar");
        this.A0B = Collections.emptyList();
        this.A00 = 0;
        this.A0C = true;
        this.A0E = true;
        this.A08 = A0K;
        this.A02 = 0;
        this.A0F = false;
        this.A0H = true;
        this.A03 = 0;
    }

    public static C83r A00(1Iw r301) {
        return new C83r(r301, new C5yy());
    }

    public final Object[] A0k() {
        return new Object[]{this.A0B, this.A07, Integer.valueOf(this.A00), this.A04, Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0D), Boolean.valueOf(this.A0E), this.A09, Integer.valueOf(this.A01), this.A08, this.A06, Integer.valueOf(this.A02), Boolean.valueOf(this.A0F), Boolean.valueOf(this.A0G), Boolean.valueOf(this.A0H), Integer.valueOf(this.A03), this.A0A, Boolean.valueOf(this.A0I)};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C5yy c5yy = (C5yy) super.A0l();
        c5yy.A04 = 4YV.A0J(c5yy.A04);
        return c5yy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x04ac, code lost:
    
        if (r0.A01() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x032f  */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Throwable, boolean] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 1724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5yy.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        if (c2ko.A02 != -1671105658) {
            return null;
        }
        1Iw r0 = c2ko.A00;
        boolean z = ((C7ob) obj).A00;
        11T.A0F(r0, 0);
        if (r0.A02 == null) {
            return null;
        }
        r0.A0G(new C2l4(new Object[]{Boolean.valueOf(z)}, 0), "updateState:MigCustomTitleBar.updateElevationValue");
        return null;
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        C2ko c2ko = this.A05;
        if (c2ko != null) {
            c2ko.A00 = r302;
            c2ko.A01 = this;
            r303.A02(c2ko);
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((C5yz) r303).A00 = this.A0E;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
