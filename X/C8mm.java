package X;

import android.content.res.Resources;
import com.facebook.common.callercontext.CallerContext;
import java.util.BitSet;

/* renamed from: X.8mm, reason: invalid class name */
/* loaded from: 8mm.class */
public final class C8mm extends C1rj {
    public static final CallerContext A09 = CallerContext.A0B("AlbumInfoRowSpec");
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public C9cc A08;

    public C8mm() {
        super("AlbumInfoRow");
        this.A00 = -1;
        this.A01 = -16777216;
        this.A02 = -1;
        this.A03 = -1;
        this.A04 = -1;
        this.A05 = -16777216;
        this.A06 = -1;
        this.A07 = -1;
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), this.A08, Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A04), Integer.valueOf(this.A05), Integer.valueOf(this.A06), Integer.valueOf(this.A07)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C9cc c9cc = this.A08;
        int i = this.A01;
        int i2 = this.A02;
        int i3 = this.A05;
        int i4 = this.A06;
        int i5 = this.A00;
        int i6 = this.A03;
        int i7 = this.A04;
        int i8 = this.A07;
        Resources A0E = 4YU.A0E(r302);
        C1rq A0P = 7zN.A0P(r302, 0);
        C26z c26z = C26z.HORIZONTAL;
        if (i5 == -1) {
            i5 = 7zN.A01(A0E);
        }
        A0P.A2C(c26z, i5);
        C26z c26z2 = C26z.VERTICAL;
        if (i8 == -1) {
            i8 = A0E.getDimensionPixelSize(2132279305);
        }
        A0P.A2C(c26z2, i8);
        C8Sh c8Sh = new C8Sh(r302, new C8mz());
        CallerContext callerContext = A09;
        C8mz c8mz = c8Sh.A01;
        c8mz.A05 = callerContext;
        BitSet bitSet = c8Sh.A02;
        bitSet.set(0);
        c8Sh.A1L(i6 == -1 ? A0E.getDimensionPixelSize(2132279368) : i6);
        C26z c26z3 = C26z.END;
        if (i7 == -1) {
            i7 = 7zN.A01(A0E);
        }
        c8Sh.A2A(c26z3, i7);
        c8mz.A04 = c9cc.A00();
        bitSet.set(1);
        if (i6 == -1) {
            i6 = A0E.getDimensionPixelSize(2132279368);
        }
        c8Sh.A0C(i6);
        A0P.A2f(c8Sh.A2V());
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        3yF A0L = 2KZ.A0L(r302, 0);
        A0L.A2a();
        7zP.A1E(A0L);
        A0L.A3A(c9cc.A03);
        A0L.A2x(i3);
        if (i4 == -1) {
            i4 = A0E.getDimensionPixelSize(2132279367);
        }
        A0L.A31(i4);
        7zM.A1L(A01, A0L);
        3yF A0L2 = 2KZ.A0L(r302, 0);
        A0L2.A2a();
        7zP.A1E(A0L2);
        A0L2.A3A(String.valueOf(c9cc.A00));
        A0L2.A2x(i);
        if (i2 == -1) {
            i2 = A0E.getDimensionPixelSize(2132279367);
        }
        A0L2.A31(i2);
        7zM.A1L(A01, A0L2);
        7zL.A1H(A01, A0P);
        return A0P.A00;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }
}
