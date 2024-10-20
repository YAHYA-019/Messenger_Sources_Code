package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.8ql, reason: invalid class name */
/* loaded from: 8ql.class */
public final class C8ql extends 2Yf {
    public int A00;
    public int A01;
    public 9Z6 A02;
    public MigColorScheme A03;
    public ThreadThemeInfo A04;
    public ImmutableList A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;

    public C8ql() {
        super("ThreadCustomizationPickerColorSection");
    }

    public static int A0I(int i, int i2, int i3, int i4, int i5) {
        return i == 0 ? i5 : i2 - ((i3 - i4) - A0I(i - 1, i2, i3, i4, i5));
    }

    public 2Ys A0d(C1qb c1qb) {
        2hO r312;
        ImmutableList immutableList = this.A05;
        MigColorScheme migColorScheme = this.A03;
        int i = this.A01;
        boolean z = this.A08;
        2Yr A0l = 7zL.A0l();
        if (z) {
            2hP A0I = 2hO.A0I(c1qb);
            int i2 = 9GJ.A00;
            2KD A0Y = 7zN.A0Y(c1qb, false);
            7zN.A1F(c1qb, A0Y, 2131955416);
            A0Y.A2j();
            A0Y.A2d();
            A0Y.A2x(migColorScheme);
            A0Y.A1B(9GJ.A02);
            A0Y.A1C(9GJ.A01);
            A0I.A05(A0Y.A2W());
            A0I.A01.A04 = Integer.valueOf(i);
            r312 = A0I.A02();
        } else {
            r312 = null;
        }
        A0l.A01(r312);
        7zQ.A1J(2Yg.A03(c1qb, C8ql.class, "ThreadCustomizationPickerColorSection"), A0l, 7zM.A0s(c1qb, immutableList));
        return A0l.A00;
    }

    public Object A0e(1Im r302, Object obj) {
        C8gp c8gp;
        int i = r302.A01;
        C2hl c2hl = null;
        if (i == -1351902487) {
            C8ql c8ql = r302.A00.A01;
            ThreadThemeInfo threadThemeInfo = (ThreadThemeInfo) 7zN.A0o(r302);
            C8ql c8ql2 = c8ql;
            9Z6 r0 = c8ql2.A02;
            boolean z = c8ql2.A06;
            r0.getClass();
            r0.A00(threadThemeInfo, z);
            return null;
        }
        if (i == 1463818325) {
            C2i6 c2i6 = (C2i6) obj;
            1Iv r02 = r302.A00;
            C8ql c8ql3 = r02.A01;
            C1qb c1qb = (C1qb) r02.A00;
            ThreadThemeInfo threadThemeInfo2 = (ThreadThemeInfo) c2i6.A01;
            int i2 = c2i6.A00;
            C8ql c8ql4 = c8ql3;
            int i3 = c8ql4.A00;
            ThreadThemeInfo threadThemeInfo3 = c8ql4.A04;
            MigColorScheme migColorScheme = c8ql4.A03;
            int i4 = c8ql4.A01;
            boolean z2 = c8ql4.A07;
            C9lv c9lv = (C9lv) 1Bn.A0A(68061);
            long j = threadThemeInfo3 == null ? -1 : threadThemeInfo3.A0T;
            Drawable A01 = z2 ? C9lv.A01(c1qb, c9lv, migColorScheme, threadThemeInfo2) : null;
            boolean z3 = false;
            C1rq A012 = C1rg.A01(c1qb, null, 0);
            if (z2) {
                A012.A2i(C1rp.SPACE_EVENLY);
                A012.A2T(2Yg.A0B(c1qb, C8ql.class, "ThreadCustomizationPickerColorSection", new Object[]{threadThemeInfo2}, -1351902487));
                9W4 r03 = new 9W4(((1Iw) c1qb).A0D, migColorScheme);
                String str = threadThemeInfo2.A0e;
                Uri uri = threadThemeInfo2.A0V;
                if (j == threadThemeInfo2.A0T) {
                    z3 = true;
                }
                c8gp = new C8gp(A01, null, uri, r03, str, z3);
            } else {
                A012.A0C(i3);
                A012.A2i(C1rp.FLEX_START);
                C26z c26z = C26z.LEFT;
                int i5 = i2 % i4;
                Context context = ((1Iw) c1qb).A0D;
                int A00 = C0A8.A00(context, 9F1.A00);
                int A002 = C0A8.A00(context, 66.0f);
                int i6 = ((i3 * i4) - (A002 * i4)) - (A00 * 2);
                if (i4 != 1) {
                    i4--;
                }
                A012.A2C(c26z, A0I(i5, i6 / i4, i3, A002, A00));
                8Oy r04 = new 8Oy(c1qb, new 8jQ());
                c8gp = r04.A01;
                ((8jQ) c8gp).A01 = threadThemeInfo2;
                BitSet bitSet = r04.A02;
                bitSet.set(2);
                r04.A2S(1BK.A0v(context, threadThemeInfo2.A0e, 2131966818));
                ((8jQ) c8gp).A00 = migColorScheme;
                bitSet.set(0);
                if (j == threadThemeInfo2.A0T) {
                    z3 = true;
                }
                ((8jQ) c8gp).A02 = z3;
                bitSet.set(1);
                r04.A2T(2Yg.A0B(c1qb, C8ql.class, "ThreadCustomizationPickerColorSection", new Object[]{threadThemeInfo2}, -1351902487));
                C1rs.A03(bitSet, r04.A03);
                r04.A0J();
            }
            A012.A2f(c8gp);
            C2hj A0m = 7zL.A0m();
            A0m.A03(A012);
            c2hl = new C2hl(A0m);
        }
        return c2hl;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8ql c8ql = (C8ql) r302;
            ImmutableList immutableList = this.A05;
            ImmutableList immutableList2 = c8ql.A05;
            if (immutableList != null) {
                if (!immutableList.equals(immutableList2)) {
                    return false;
                }
            } else if (immutableList2 != null) {
                return false;
            }
            MigColorScheme migColorScheme = this.A03;
            MigColorScheme migColorScheme2 = c8ql.A03;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            if (this.A06 != c8ql.A06 || this.A07 != c8ql.A07 || this.A00 != c8ql.A00) {
                return false;
            }
            9Z6 r0 = this.A02;
            9Z6 r02 = c8ql.A02;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            if (this.A01 != c8ql.A01 || this.A08 != c8ql.A08) {
                return false;
            }
            ThreadThemeInfo threadThemeInfo = this.A04;
            ThreadThemeInfo threadThemeInfo2 = c8ql.A04;
            if (threadThemeInfo != null) {
                if (!threadThemeInfo.equals(threadThemeInfo2)) {
                    return false;
                }
            } else if (threadThemeInfo2 != null) {
                return false;
            }
        }
        return true;
    }
}
