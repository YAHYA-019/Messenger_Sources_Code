package X;

import android.text.TextUtils;
import com.mapbox.mapboxsdk.R;
import java.util.BitSet;

/* renamed from: X.6n2, reason: invalid class name */
/* loaded from: 6n2.class */
public final class C6n2 extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC02083tw A03;
    public 5zD A04;
    public C6n3 A05;
    public CharSequence A06;
    public CharSequence A07;
    public boolean A08;
    public boolean A09;

    public C6n2() {
        super("TextComponent");
        this.A00 = R.dimen.mapbox_eight_dp;
    }

    public static int A00(C6n3 c6n3, boolean z) {
        int i;
        boolean z2 = c6n3.A0I;
        boolean z3 = c6n3.A0J;
        boolean z4 = c6n3.A07;
        boolean z5 = c6n3.A0F;
        boolean z6 = c6n3.A06;
        Integer A00 = 6nX.A00(z2, z, z3, z4, z5, z6);
        if (A00 == 0S2.A01) {
            i = 2132279480;
        } else {
            if (A00 == 0S2.A0C || A00 == 0S2.A0Y) {
                return 2132279481;
            }
            i = 2132279591;
            if (z6) {
                return 2132279481;
            }
        }
        return i;
    }

    public static 85A A01(1Iw r301) {
        return new 85A(r301, new C6n2());
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), this.A06, Boolean.valueOf(this.A08), Integer.valueOf(this.A01), Boolean.valueOf(this.A09), this.A05, Integer.valueOf(this.A02), this.A03, this.A07, null, this.A04};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C6n3 c6n3 = this.A05;
        5zD r0 = this.A04;
        CharSequence charSequence = this.A07;
        int i = this.A01;
        boolean z = this.A09;
        InterfaceC02083tw interfaceC02083tw = this.A03;
        int i2 = this.A02;
        int i3 = this.A00;
        boolean z2 = this.A08;
        CharSequence charSequence2 = this.A06;
        6JM r02 = (6JM) 1Bn.A0A(67632);
        if (i == 0) {
            if (z2) {
                i = r02.A02(r0).B9Q();
            } else {
                i = r0.AzP(c6n3.A0B ? 0S2.A00 : 0S2.A01, 6nX.A00(c6n3.A0I, false, c6n3.A0J, c6n3.A07, c6n3.A0F, c6n3.A06));
            }
        }
        3yF A0L = 2KZ.A0L(r302, 0);
        A0L.A3B(true);
        A0L.A3C(false);
        A0L.A3D(false);
        A0L.A3E(false);
        2KZ r03 = A0L.A01;
        r03.A0g = true;
        r03.A0M = A0L.A02.A02(20.0f);
        A0L.A3A(charSequence);
        A0L.A2x(i);
        r03.A0F = i;
        r03.A0A = -3355444;
        A0L.A1y(C1ro.CENTER);
        A0L.A32(A00(c6n3, z2));
        A0L.A2S(null);
        if (interfaceC02083tw != null) {
            r03.A0X = interfaceC02083tw;
        }
        A0L.A34(r0.BHh());
        if (c6n3.A0J || c6n3.A0F || c6n3.A04 || c6n3.A08) {
            A0L.A33(2);
        }
        int i4 = c6n3.A00;
        if (i4 > 0) {
            A0L.A2u(i4);
            A0L.A2a();
            if (charSequence2 != null) {
                r03.A0b = charSequence2;
            }
        }
        if (z) {
            A0L.A0K();
        }
        if (!c6n3.A0D || c6n3.A0A) {
            A0L.A2D(C26z.HORIZONTAL, 2132279327);
            A0L.A2D(C26z.TOP, 2132279395);
            A0L.A2D(C26z.BOTTOM, i3);
        }
        if (i2 != 0) {
            A0L.A2u(i2);
            A0L.A36(TextUtils.TruncateAt.END);
        }
        if (!c6n3.A0H) {
            return A0L.A2W();
        }
        C1rq A01 = C1rg.A01(r302, null, 0);
        8Ak r04 = new 8Ak(new 8Aj(), r302);
        r04.A2D(C26z.VERTICAL, 2132279327);
        8Aj r05 = r04.A00;
        r05.A00 = r04.A02.A02(2.0f);
        BitSet bitSet = r04.A02;
        bitSet.set(0);
        r05.A02 = Integer.valueOf(i);
        r05.A03 = 1;
        r05.A01 = 1;
        C1rs.A05(bitSet, r04.A03, 1);
        r04.A0J();
        A01.A2f(r05);
        A01.A2f(A0L.A2W());
        A01.A2D(C26z.LEFT, 2132279327);
        return A01.A00;
    }
}
