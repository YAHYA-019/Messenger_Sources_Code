package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: X.8mz, reason: invalid class name */
/* loaded from: 8mz.class */
public final class C8mz extends C1rj {
    public static final Drawable A09;
    public static final Drawable A0A;
    public static final Drawable A0B;
    public static final InterfaceC07034in A0C;
    public int A00;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public Uri A04;
    public CallerContext A05;
    public InterfaceC07034in A06;
    public boolean A07;
    public boolean A08;

    static {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-7829368);
        A09 = gradientDrawable;
        A0B = gradientDrawable;
        A0A = gradientDrawable;
        A0C = InterfaceC07034in.A01;
    }

    public C8mz() {
        super("PhotoPreviewItemComponent");
        this.A02 = A0A;
        this.A03 = A0B;
        this.A06 = A0C;
    }

    public final Object[] A0k() {
        return new Object[]{this.A05, this.A02, Integer.valueOf(this.A00), Boolean.valueOf(this.A07), this.A04, this.A03, null, null, Boolean.valueOf(this.A08), null, this.A06, Integer.valueOf(this.A01)};
    }

    public boolean A0o() {
        return true;
    }

    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        CallerContext callerContext = this.A05;
        Uri uri = this.A04;
        int i3 = this.A00;
        Drawable drawable = this.A03;
        Drawable drawable2 = this.A02;
        InterfaceC07034in interfaceC07034in = this.A06;
        boolean z = this.A07;
        boolean z2 = this.A08;
        final String A0C2 = r302.A0C();
        final Uri uri2 = this.A04;
        final int i4 = this.A01;
        final boolean z3 = this.A07;
        Object obj = new Object(uri2, A0C2, i4, z3) { // from class: X.9bk
            public final int A00;
            public final Uri A01;
            public final String A02;
            public final boolean A03;

            {
                this.A02 = A0C2;
                this.A01 = uri2;
                this.A00 = i4;
                this.A03 = z3;
            }

            public boolean equals(Object obj2) {
                if (this != obj2) {
                    if (obj2 == null || !(obj2 instanceof C9bk)) {
                        return false;
                    }
                    C9bk c9bk = (C9bk) obj2;
                    if (!11T.A0O(this.A02, c9bk.A02)) {
                        return false;
                    }
                    Uri uri3 = this.A01;
                    Uri uri4 = c9bk.A01;
                    if (uri3 != null) {
                        if (!uri3.equals(uri4)) {
                            return false;
                        }
                    } else if (uri4 != null) {
                        return false;
                    }
                    if (this.A00 != c9bk.A00 || this.A03 != c9bk.A03) {
                        return false;
                    }
                }
                return true;
            }

            public int hashCode() {
                return Arrays.hashCode(new Object[]{this.A02, this.A01, Integer.valueOf(this.A00), null, Boolean.valueOf(this.A03), getClass()});
            }
        };
        C02353ux c02353ux = (2Dp) r302.A0B(obj, A0C2, 0);
        if (c02353ux == null) {
            Uri uri3 = this.A04;
            int i5 = this.A01;
            boolean z4 = this.A07;
            c02353ux = null;
            if (uri3 != null && uri3 != Uri.EMPTY) {
                2IA A01 = 2IA.A01(uri3);
                A01.A0H = true;
                A01.A0G = z4;
                A01.A0C = null;
                A01.A0I = true;
                2rA r0 = new 2rA();
                r0.A0A = false;
                r0.A07 = false;
                A01.A04 = new C2r9(r0);
                if (i5 != 0) {
                    c02353ux = new C02353ux(i5, i5);
                }
                A01.A06 = c02353ux;
                c02353ux = A01.A04();
            }
            r302.A0I(obj, c02353ux, A0C2, 0);
        }
        if (c02353ux != null && z2) {
            int size = View.MeasureSpec.getSize(i);
            if (size <= 0) {
                size = View.MeasureSpec.getSize(i2);
            }
            2IA A02 = 2IA.A02(c02353ux);
            A02.A06 = AbstractC02343uw.A00(size);
            c02353ux = A02.A04();
        }
        if (uri == null || uri == Uri.EMPTY) {
            8Rx r02 = new 8Rx(r302, new 2Kc());
            BitSet bitSet = r02.A02;
            bitSet.set(0);
            7zP.A13(r02);
            C1rs.A01(bitSet, r02.A03);
            r02.A0J();
            return r02.A01;
        }
        5BH A012 = 5BG.A01(r302);
        C07004ik A00 = C06984ii.A00();
        A00.A0J = true;
        A00.A00(interfaceC07034in);
        A00.A04(drawable2);
        A00.A06(drawable);
        ((C07014il) A00).A04 = null;
        ((C07014il) A00).A03 = null;
        ((C07014il) A00).A0B = z;
        C06984ii.A01(A012, A00);
        A012.A2b(callerContext);
        A012.A2a(5BL.A01(c02353ux));
        A012.A2C(C26z.ALL, i3);
        return 7zL.A0K(A012);
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }
}
