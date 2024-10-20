package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* renamed from: X.8ee, reason: invalid class name */
/* loaded from: 8ee.class */
public final class C8ee extends 1LH {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final ColorStateList A06;
    public final ColorStateList A07;
    public final C2iw A08;
    public final 6tM A09;
    public final 6wX A0A;
    public final Boolean A0B;
    public final String A0C;
    public final Function2 A0D;
    public final boolean A0E;

    public /* synthetic */ C8ee(ColorStateList colorStateList, ColorStateList colorStateList2, C2iw c2iw, 6tM r305, 6wX r306, Boolean bool, Function2 function2, int i, int i2, int i3, int i4, boolean z) {
        11T.A0F(r305, 1);
        7zP.A1Q(c2iw, 13, function2);
        this.A09 = r305;
        this.A0E = z;
        this.A0A = r306;
        this.A02 = i;
        this.A06 = colorStateList;
        this.A0C = "";
        this.A07 = colorStateList2;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = 2132345367;
        this.A05 = -7829368;
        this.A03 = i4;
        this.A08 = c2iw;
        this.A0D = function2;
        this.A0B = bool;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        Boolean A0K = AnonymousClass001.A0K();
        Drawable drawable = (Drawable) AQf.A00(c2k5, this, new Object[]{this.A09}, 10);
        4NU A00 = 4NT.A00(c2k5, AP7.A00);
        C2lh A002 = C2lc.A00(c2k5, AP9.A00);
        List list = (List) 2rO.A00(c2k5, AP8.A00, new Object[0]);
        5Rn r0 = 5Rn.A01;
        5X3 A003 = C3s9.A00(r0, "searchbox_resize_transition_key");
        A003.A03(C2jm.A07);
        7zM.A1U(A003, 150);
        ((5X4) A003).A05 = new A2F(c2k5, A00, A002, this);
        5XC.A00(c2k5, A003);
        1Iw r02 = c2k5.A05;
        8OF A01 = 8oR.A01(r02);
        A01.A01.A06 = drawable;
        A01.A0L();
        A01.A1L(this.A03);
        8oR r03 = A01.A01;
        r03.A00 = 2132345291;
        r03.A0G = !7zP.A1V(A002);
        boolean z = this.A0E;
        A01.A0C(z ? this.A01 : this.A00);
        A01.A2L("searchbox_resize_transition_key");
        A01.A1x(r0);
        A01.A01.A0I = false;
        C2cm A004 = C2cl.A00(r02);
        2lQ r04 = 2lO.A02;
        7zS.A1K(A004, (2lO) null, 0S2.A09, 7zP.A0F());
        A004.A2X(this.A05);
        A004.A2a(this.A04);
        A01.A2W(7zL.A0J(A004));
        8oR r05 = A01.A01;
        r05.A0H = z;
        r05.A0E = this.A0C;
        r05.A0C = this.A08;
        A01.A01.A0A = 7zL.A0a(83T.A01(this, c2k5, 43));
        3vS A0a = 7zL.A0a(C83d.A00(A00, this, c2k5, 23));
        8oR r06 = A01.A01;
        r06.A0B = A0a;
        r06.A02 = this.A02;
        r06.A05 = this.A07;
        r06.A0I = false;
        r06.A04 = this.A06;
        Boolean bool = this.A0B;
        A01.A01.A0J = 11T.A0O(bool, A0K);
        if (!11T.A0O(bool, A0K)) {
            list = null;
        }
        A01.A01.A0F = list;
        A01.A0J();
        8oR r07 = A01.A01;
        11T.A0A(r07);
        return r07;
    }
}
