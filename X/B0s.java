package X;

import java.util.Collections;
import java.util.List;

/* loaded from: B0s.class */
public final class B0s extends C1rj {
    public static final C1ro A0A;
    public static final C1ro A0B;
    public static final C1ro A0C;
    public int A00;
    public int A01;
    public int A02;
    public 1LI A03;
    public 1LI A04;
    public C1ro A05;
    public C1ro A06;
    public C1ro A07;
    public List A08;
    public List A09;

    static {
        C1ro c1ro = C1ro.FLEX_START;
        A0A = c1ro;
        A0C = c1ro;
        A0B = C1ro.CENTER;
    }

    public B0s() {
        super("ImageBlockLayout");
        this.A05 = A0A;
        this.A08 = Collections.emptyList();
        this.A06 = A0B;
        this.A00 = 0;
        this.A01 = 0;
        this.A09 = null;
        this.A07 = A0C;
    }

    public static AtU A00(1Iw r301) {
        B0s b0s = new B0s();
        C1rs c1rs = new C1rs(b0s, r301, 0, 0);
        ((AtU) c1rs).A00 = b0s;
        ((AtU) c1rs).A01 = r301;
        return c1rs;
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, 0, this.A05, this.A08, this.A06, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A09, this.A04, Integer.valueOf(this.A02), this.A07};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        B0s b0s = (B0s) super.A0l();
        1LI r0 = b0s.A03;
        1LI r304 = null;
        b0s.A03 = r0 != null ? r0.A0l() : null;
        1LI r02 = b0s.A04;
        if (r02 != null) {
            r304 = r02.A0l();
        }
        b0s.A04 = r304;
        return b0s;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2dD A00;
        boolean z;
        int i;
        int i2;
        1LI r0 = this.A04;
        C1ro c1ro = this.A07;
        int i3 = this.A02;
        List list = this.A08;
        C1ro c1ro2 = this.A06;
        int i4 = this.A00;
        int i5 = this.A01;
        List list2 = this.A09;
        1LI r02 = this.A03;
        C1ro c1ro3 = this.A05;
        2dD r303 = null;
        if (r0 == null) {
            A00 = null;
        } else {
            A00 = C2dB.A00(r302);
            A00.A2X(r0);
            A00.A1y(c1ro);
            A00.A2A(C26z.START, i4);
            A00.A2A(C26z.VERTICAL, i5);
            A00.A0S();
            if (i3 > 0) {
                A00.A0C(i3);
                A00.A1L(i3);
            }
        }
        if (list2 == null || list2.isEmpty()) {
            z = false;
            i = 0;
            i2 = 0;
        } else {
            z = true;
            i = AnonymousClass001.A03(list2.get(0));
            i2 = list2.size();
        }
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        7zQ.A1C(A01);
        A01.A1y(c1ro2);
        A01.A2A(C26z.HORIZONTAL, i4);
        A01.A2A(C26z.VERTICAL, i5);
        int size = list.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            if (z) {
                2dD A002 = C2dB.A00(r302);
                A002.A2X((1LI) list.get(i7));
                A002.A2A(C26z.TOP, i);
                A01.A2W(A002);
                int i8 = i6 + 1;
                if (i8 < i2) {
                    i = AnonymousClass001.A03(list2.get(i8));
                    i6 = i8;
                }
            } else {
                A01.A2X((1LI) list.get(i7));
            }
        }
        if (r02 != null) {
            r303 = C2dB.A00(r302);
            r303.A2X(r02);
            r303.A1y(c1ro3);
            r303.A0S();
        }
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A2e(A00);
        A012.A2e(A01);
        A012.A2e(r303);
        return A012.A00;
    }
}
