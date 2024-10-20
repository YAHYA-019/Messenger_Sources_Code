package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.Azj, reason: case insensitive filesystem */
/* loaded from: Azj.class */
public final class C2022Azj extends C1rj {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Drawable A05;
    public Drawable A06;
    public Drawable A07;
    public DIu A08;
    public MigColorScheme A09;
    public Integer A0A;
    public Integer A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;

    public C2022Azj() {
        super("MessengerSearchBar");
        this.A03 = 3;
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A0E), this.A05, this.A06, this.A0A, this.A09, Boolean.valueOf(this.A0F), Boolean.valueOf(this.A0G), this.A0C, Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), this.A0D, this.A08, this.A07, this.A0B, Integer.valueOf(this.A04), Float.valueOf(this.A00), Boolean.valueOf(this.A0H), Boolean.valueOf(this.A0I), Boolean.valueOf(this.A0J), Boolean.valueOf(this.A0K), Boolean.valueOf(this.A0L)};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        5SW r331;
        B1q b1q = (B1q) 4YU.A0P(r302);
        MigColorScheme migColorScheme = this.A09;
        boolean z = this.A0J;
        int i = this.A02;
        Drawable drawable = this.A05;
        Drawable drawable2 = this.A06;
        Integer num = this.A0A;
        String str = this.A0C;
        int i2 = this.A01;
        int i3 = this.A03;
        boolean z2 = this.A0I;
        DIu dIu = this.A08;
        boolean z3 = this.A0K;
        boolean z4 = this.A0L;
        Drawable drawable3 = this.A07;
        Integer num2 = this.A0B;
        boolean z5 = this.A0E;
        boolean z6 = this.A0H;
        boolean z7 = this.A0F;
        boolean z8 = this.A0G;
        int i4 = this.A04;
        float f = this.A00;
        String str2 = b1q.A02;
        MHn mHn = b1q.A01;
        View.OnFocusChangeListener onFocusChangeListener = b1q.A00;
        String trim = str2.trim();
        AvT avT = new AvT(r302, new C2001Ayu());
        C2001Ayu c2001Ayu = avT.A01;
        c2001Ayu.A0P = z;
        BitSet bitSet = avT.A02;
        bitSet.set(9);
        c2001Ayu.A0Q = z3;
        c2001Ayu.A0O = z2;
        c2001Ayu.A0R = z4;
        c2001Ayu.A0G = migColorScheme;
        bitSet.set(2);
        c2001Ayu.A02 = i;
        bitSet.set(5);
        c2001Ayu.A05 = drawable;
        bitSet.set(0);
        c2001Ayu.A07 = drawable3;
        c2001Ayu.A0I = num2;
        c2001Ayu.A0L = z5;
        c2001Ayu.A0N = z8;
        c2001Ayu.A04 = i4;
        c2001Ayu.A00 = f;
        c2001Ayu.A06 = drawable2;
        bitSet.set(1);
        c2001Ayu.A0H = num;
        c2001Ayu.A0J = str;
        bitSet.set(3);
        c2001Ayu.A01 = i2;
        bitSet.set(4);
        c2001Ayu.A0K = str2;
        bitSet.set(8);
        c2001Ayu.A0A = mHn;
        bitSet.set(7);
        c2001Ayu.A08 = onFocusChangeListener;
        bitSet.set(6);
        c2001Ayu.A09 = new CZU(dIu, r302, 1);
        c2001Ayu.A0B = 1LI.A09(r302, C2022Azj.class, "MessengerSearchBar", -1124185393);
        c2001Ayu.A0C = 1LI.A0C(r302, C2022Azj.class, "MessengerSearchBar", new Object[]{Boolean.valueOf(z6)}, -1786875001);
        boolean isEmpty = trim.isEmpty();
        5SW r329 = isEmpty ? 5SW.A1b : 5SW.A1g;
        Long A0l = 1BK.A0l(trim.length());
        String str3 = null;
        c2001Ayu.A0E = 1LI.A0C(r302, C2022Azj.class, "MessengerSearchBar", new Object[]{null, r329, A0l}, 889739292);
        if (isEmpty) {
            r331 = 5SW.A1a;
        } else {
            str3 = trim;
            r331 = 5SW.A1f;
        }
        c2001Ayu.A0D = 1LI.A0C(r302, C2022Azj.class, "MessengerSearchBar", new Object[]{str3, r331, A0l}, 889739292);
        c2001Ayu.A0F = 1LI.A0C(r302, C2022Azj.class, "MessengerSearchBar", new Object[]{A0l}, -428024484);
        c2001Ayu.A03 = i3;
        c2001Ayu.A0M = z7;
        7zP.A19(avT, bitSet, avT.A03);
        return c2001Ayu;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1786875001:
                1Iv r0 = r302.A00;
                1Is r02 = r0.A01;
                1Iw r03 = r0.A00;
                boolean A1Z = 7zO.A1Z(r302.A03, 0);
                DIu dIu = ((C2022Azj) r02).A08;
                if (r03.A02 != null) {
                    r03.A0H(7zQ.A0V("", 0), "updateState:MessengerSearchBar.updateQuery");
                }
                if (dIu == null) {
                    return null;
                }
                if (A1Z) {
                    dIu.BaE();
                }
                dIu.CPv("");
                return null;
            case -1124185393:
                DIu dIu2 = ((C2022Azj) r302.A00.A01).A08;
                if (dIu2 == null) {
                    return null;
                }
                dIu2.Bka();
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -428024484:
                1Is r04 = r302.A00.A01;
                Long l = (Long) r302.A03[0];
                DIu dIu3 = ((C2022Azj) r04).A08;
                if (dIu3 == null) {
                    return null;
                }
                dIu3.C0G(l);
                return null;
            case 889739292:
                1Is r05 = r302.A00.A01;
                Object[] objArr = r302.A03;
                String str = (String) objArr[0];
                5SW r06 = (5SW) objArr[1];
                Long l2 = (Long) objArr[2];
                DIu dIu4 = ((C2022Azj) r05).A08;
                if (dIu4 == null) {
                    return null;
                }
                dIu4.C0E(r06, l2, str);
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        B1q b1q = (B1q) r303;
        String str = this.A0D;
        DIu dIu = this.A08;
        CZg cZg = new CZg(r302, dIu, 4);
        CZI czi = new CZI(dIu, 2);
        b1q.A02 = str;
        b1q.A01 = cZg;
        b1q.A00 = czi;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
