package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5yv, reason: invalid class name */
/* loaded from: 5yv.class */
public final class C5yv extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public C2ko A03;
    public 2QC A04;
    public MigColorScheme A05;
    public 4RU A06;
    public 2MG A07;
    public C5xv A08;
    public C5xv A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public static final int A0J = 2RH.A05.A00();
    public static final 2MG A0L = 2MG.A02;
    public static final 4RU A0K = 4RU.A02;

    public C5yv() {
        super("MigTitleBar");
        this.A0C = Collections.emptyList();
        this.A0D = true;
        this.A0F = true;
        this.A07 = A0L;
        this.A0G = false;
        this.A0H = true;
        this.A02 = 0;
        this.A06 = A0K;
    }

    public static C5yw A00(1Iw r301) {
        return new C5yw(r301, new C5yv());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.7ob, java.lang.Object] */
    public static void A01(C2iw c2iw, boolean z) {
        C2ko A0G = 1LI.A0G(c2iw, -1786156681);
        if (A0G != 0) {
            ?? obj = new Object();
            obj.A00 = z;
            A0G.A00(obj, new Object[0]);
        }
    }

    public final Object[] A0k() {
        return new Object[]{this.A0C, this.A05, Boolean.valueOf(this.A0D), Boolean.valueOf(this.A0E), Boolean.valueOf(this.A0F), this.A08, Integer.valueOf(this.A00), this.A07, this.A04, Integer.valueOf(this.A01), Boolean.valueOf(this.A0G), Boolean.valueOf(this.A0H), this.A0A, Integer.valueOf(this.A02), this.A0B, this.A06, this.A09, Boolean.valueOf(this.A0I)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        5zH r328;
        1LI A2W;
        1LI r319;
        C5yx c5yx = (C5yx) r302.A06().A00();
        MigColorScheme migColorScheme = this.A05;
        CharSequence charSequence = this.A0B;
        CharSequence charSequence2 = this.A0A;
        2MG r0 = this.A07;
        boolean z = this.A0H;
        C5xv c5xv = this.A09;
        C5xv c5xv2 = this.A08;
        int i = this.A02;
        int i2 = this.A01;
        List list = this.A0C;
        boolean z2 = this.A0D;
        boolean z3 = this.A0F;
        2QC r02 = this.A04;
        4RU r03 = this.A06;
        boolean z4 = this.A0I;
        boolean z5 = this.A0E;
        int i3 = this.A00;
        boolean z6 = this.A0G;
        C2iw c2iw = c5yx.A00;
        if (i == 0) {
            i = migColorScheme.B4h();
        }
        C83r A00 = C5yy.A00(r302);
        A00.A1w(c2iw);
        if (1JF.A0B(charSequence) && 1JF.A0B(charSequence2)) {
            r319 = null;
        } else {
            2cM A01 = 2cK.A01(r302, (String) null, 0);
            if (1JF.A0B(charSequence)) {
                r328 = null;
            } else {
                8RB r04 = new 8RB(r302, new 5zH());
                2KE r324 = r03.ordinal() != 1 ? 2KE.A08 : 2KE.A07;
                r328 = r04.A01;
                r328.A01 = r324;
                BitSet bitSet = r04.A02;
                bitSet.set(1);
                r328.A02 = 2KE.A0C;
                bitSet.set(2);
                r328.A00 = migColorScheme;
                bitSet.set(0);
                r328.A03 = charSequence;
                bitSet.set(3);
                C1rs.A05(bitSet, r04.A03, 4);
                r04.A0J();
            }
            A01.A2e(r328);
            if (1JF.A0B(charSequence2)) {
                A2W = null;
            } else {
                2KD A012 = 2K3.A01(r302, 0);
                A012.A2x(migColorScheme);
                A012.A2z(charSequence2);
                A012.A2i();
                A012.A2d();
                A012.A2q(1);
                A012.A31(false);
                A012.A2o(0.0f);
                A2W = A012.A2W();
            }
            A01.A2e(A2W);
            A01.A24(C26z.LEFT, A0J);
            r319 = A01.A00;
        }
        A00.A2X(r319);
        C5yy c5yy = A00.A01;
        c5yy.A08 = r0;
        c5yy.A0I = z4;
        c5yy.A0H = z;
        c5yy.A03 = i;
        c5yy.A02 = i2;
        A00.A2Y(migColorScheme);
        A00.A2Z(c5xv);
        c5yy.A09 = c5xv2;
        A00.A2b(list);
        c5yy.A0E = z3;
        c5yy.A0C = z2;
        c5yy.A06 = r02;
        c5yy.A0D = z5;
        c5yy.A01 = i3;
        c5yy.A0G = z6;
        return A00.A2V();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.7ob, java.lang.Object] */
    @Override // X.C1rj
    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        if (c2ko.A02 != -1786156681) {
            return null;
        }
        1Iw r0 = c2ko.A00;
        boolean z = ((C7ob) obj).A00;
        C2ko A0G = 1LI.A0G(((C5yx) r0.A06().A00()).A00, -1671105658);
        if (A0G == 0) {
            return null;
        }
        ?? obj2 = new Object();
        obj2.A00 = z;
        A0G.A00(obj2, new Object[0]);
        return null;
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        C2ko c2ko = this.A03;
        if (c2ko != null) {
            c2ko.A00 = r302;
            c2ko.A01 = this;
            r303.A02(c2ko);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2iw, java.lang.Object] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((C5yx) r303).A00 = new Object();
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
