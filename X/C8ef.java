package X;

import com.mapbox.mapboxsdk.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8ef, reason: invalid class name */
/* loaded from: 8ef.class */
public final class C8ef extends 1LH {
    public final int A00;
    public final int A01;
    public final 1LI A02;
    public final C1qb A03;
    public final C5j5 A04;
    public final C5fv A05;
    public final 5vW A06;
    public final 6yJ A07;
    public final C6zG A08;
    public final 7Gn A09;
    public final CharSequence A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;
    public final boolean A0E;

    public /* synthetic */ C8ef(1LI r302, C1qb c1qb, C5j5 c5j5, C5fv c5fv, 5vW r306, 6yJ r307, C6zG c6zG, CharSequence charSequence, List list, List list2, List list3, int i, int i2, boolean z) {
        7Gn r0 = new 7Gn();
        11T.A0F(c6zG, 11);
        this.A03 = c1qb;
        this.A04 = c5j5;
        this.A02 = r302;
        this.A06 = r306;
        this.A00 = i;
        this.A0B = list;
        this.A0A = charSequence;
        this.A01 = i2;
        this.A07 = r307;
        this.A0C = list2;
        this.A08 = c6zG;
        this.A0D = list3;
        this.A05 = c5fv;
        this.A09 = r0;
        this.A0E = z;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        CharSequence charSequence = this.A0A;
        C5fu c5fu = (C5fu) this.A05;
        5gC r0 = (5gC) AQY.A00(c2k5, this, new Object[]{charSequence, c5fu.A09, c5fu.A0B, c5fu.A05, Boolean.valueOf(c5fu.A0H), Long.valueOf(c5fu.A02), Long.valueOf(c5fu.A01), c5fu.A04, c5fu.A03, c5fu.A0D, Integer.valueOf(c5fu.A00), c5fu.A0A}, 41);
        List list = (List) AQY.A00(c2k5, this, new Object[]{this.A0C, this.A08, this.A0D}, 40);
        2lQ r02 = 2lO.A02;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0k(0S2.A0C, 1.0f));
        C2sn A0L = 7zR.A0L(c2k5);
        2lO A0R = 7zS.A0R((2lO) null, 1.0f);
        C1rp c1rp = C1rp.FLEX_START;
        C2sn A0J = 7zS.A0J(A0L);
        7Gn r03 = this.A09;
        1Iw r04 = A0J.A00;
        String str = r0.A09;
        C5j5 c5j5 = this.A04;
        6yJ r05 = this.A07;
        C1qb c1qb = this.A03;
        int BEr = r05.BEr(7zL.A0A(c1qb), r0);
        int i = this.A01;
        C1rs A00 = 7Gn.A00(r04, (InterfaceC02083tw) null, c5j5, r0, r03, (C70p) null, (8Kv) null, C26z.VERTICAL, (CharSequence) null, Integer.valueOf(i), str, (-1) >>> 1, BEr, false, this.A0E, true, false, false, false, false, false, false, false);
        A00.A1a(R.dimen.mapbox_eight_dp);
        A0J.A00(A00.A2V());
        1LI A0W = C2so.A0W(A0J, A0L, A0R, c1rp);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0W = ((C6zG) it.next()).AMI(A0W, c1qb, c5j5, this.A06, this.A0B, this.A00);
        }
        A0L.A00(A0W);
        2dD A002 = C2dB.A00(A0L.A00);
        A002.A2X(this.A02);
        A002.A2O(true);
        return 7zM.A0l(A002.A2W(), A0L, c2k5, A0g);
    }
}
