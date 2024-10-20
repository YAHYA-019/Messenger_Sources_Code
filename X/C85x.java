package X;

import android.view.View;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.85x, reason: invalid class name */
/* loaded from: 85x.class */
public final class C85x extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public List A04;
    public boolean A05;

    public C85x() {
        super("EvenWidthAutoStackLayout");
    }

    public static C85y A00(1Iw r301) {
        return new C85y(r301, new C85x());
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A04, Boolean.valueOf(this.A05), Integer.valueOf(this.A02), Integer.valueOf(this.A03)};
    }

    public boolean A0o() {
        return true;
    }

    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        C8lp c8lp;
        List<1LI> list = this.A04;
        int i3 = this.A01;
        int i4 = this.A00;
        int i5 = this.A03;
        int i6 = this.A02;
        boolean z = this.A05;
        1BK.A1J(r302, 0, list);
        int[] A00 = AnonymousClass861.A00(r302, list);
        int size = View.MeasureSpec.getSize(i);
        int size2 = list.size();
        int floor = (int) Math.floor(((size - (i3 * 2)) - ((size2 - 1) * i4)) / size2);
        int length = A00.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                C2yw A002 = 2dA.A00(r302);
                A002.A10(100.0f);
                A002.A01.A00 = i4;
                A002.A2C(C26z.HORIZONTAL, i3);
                A002.A2C(C26z.VERTICAL, i5);
                for (1LI r0 : list) {
                    C1rq A01 = C1rg.A01(r302, null, 0);
                    A01.A10((1.0f / list.size()) * 100.0f);
                    A01.A2f(r0);
                    A002.A2X(A01.A00);
                }
                A002.A0J();
                c8lp = A002.A01;
            } else if (A00[i7] > floor) {
                if (z) {
                    list = ImmutableList.copyOf((Collection) list).reverse();
                    11T.A0A(list);
                }
                8OG A003 = C8lp.A00(r302);
                A003.A0e();
                A003.A01.A00 = i6;
                A003.A2C(C26z.HORIZONTAL, i3);
                A003.A2C(C26z.VERTICAL, i5);
                for (1LI r02 : list) {
                    C1rq A012 = C1rg.A01(r302, null, 0);
                    A012.A0j(1.0f);
                    A012.A2f(r02);
                    A003.A2X(A012.A00);
                }
                A003.A0J();
                c8lp = A003.A01;
            } else {
                i7++;
            }
        }
        11T.A0A(c8lp);
        return c8lp;
    }
}
