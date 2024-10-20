package X;

import android.graphics.drawable.Drawable;
import java.util.BitSet;
import java.util.List;

/* renamed from: X.8nv, reason: invalid class name */
/* loaded from: 8nv.class */
public final class C8nv extends C1rj {
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public Drawable A00;
    public 1LI A01;
    public 9YE A02;
    public 9PI A03;
    public String A04;
    public List A05;
    public List A06;

    static {
        2RH r0 = 2RH.A06;
        A08 = r0.A00();
        2RH r02 = 2RH.A04;
        A07 = r02.A00();
        A0A = r02.A00();
        A09 = r0.A00();
    }

    public C8nv() {
        super("SwipeableListItemRowComponent");
    }

    public static final 2dA A00(1Iw r301, List list, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        C2yw A00 = 2dA.A00(r301);
        A00.A2W(7zL.A02());
        A00.A25(C26z.START, i);
        A00.A25(C26z.END, i2);
        A00.A2Y(list);
        A00.A0J();
        return A00.A01;
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A03, this.A01, this.A05, this.A06, this.A04, null, this.A02};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8nv c8nv = (C8nv) super.A0l();
        c8nv.A01 = 4YV.A0J(c8nv.A01);
        return c8nv;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI r0 = this.A01;
        Drawable drawable = this.A00;
        9PI r02 = this.A03;
        9YE r03 = this.A02;
        List list = this.A05;
        List list2 = this.A06;
        String str = this.A04;
        boolean A1X = 1BL.A1X(r302, r0);
        if (drawable == null) {
            drawable = C2cn.A00(0.0f, -1, 520093696);
        }
        8Qb r04 = new 8Qb(r302, new 8oK());
        8oK r05 = r04.A01;
        r05.A01 = r0.A0l();
        BitSet bitSet = r04.A02;
        bitSet.set(0);
        r05.A00 = drawable;
        r05.A04 = r03;
        r05.A06 = str;
        r05.A05 = r02;
        2dA A00 = A00(r302, list, A08, A07);
        if (A00 != null) {
            r05.A02 = A00.A0l();
        }
        2dA A002 = A00(r302, list2, A0A, A09);
        if (A002 != null) {
            r05.A03 = A002.A0l();
        }
        C1rs.A05(bitSet, r04.A03, A1X ? 1 : 0);
        r04.A0J();
        return r05;
    }
}
