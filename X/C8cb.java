package X;

import android.graphics.drawable.Drawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.8cb, reason: invalid class name */
/* loaded from: 8cb.class */
public final class C8cb extends 1LH {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final MigColorScheme A03;
    public final Function1 A04;
    public final Function2 A05;
    public final boolean A06;

    public C8cb(MigColorScheme migColorScheme, Function1 function1, Function2 function2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = migColorScheme;
        this.A00 = z;
        this.A06 = z2;
        this.A02 = z3;
        this.A01 = z4;
        this.A05 = function2;
        this.A04 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, AQk.A01(this, 18));
        C2lh A002 = C2lc.A00(c2k5, AQk.A01(this, 17));
        Object A0A = 1Bn.A0A(67625);
        4FL.A00(c2k5, AQc.A00(A0A, A00, 25), new Object[]{A0A});
        boolean A1V = 7zP.A1V(A00);
        if (A1V && 7zP.A1V(A002)) {
            1Iw r0 = c2k5.A05;
            7fT A003 = AnonymousClass653.A00(r0);
            A003.A01.A00 = 4YU.A0E(r0).getDimensionPixelSize(2132279376);
            A003.A0S();
            A003.A0J();
            AnonymousClass653 anonymousClass653 = A003.A01;
            11T.A0A(anonymousClass653);
            return anonymousClass653;
        }
        2lQ r02 = 2lO.A02;
        2lO A0g = 7zL.A0g((2lO) null, new C5z8(0S2.A01, "android.widget.Button"));
        double d = 4.0d;
        long doubleToRawLongBits = Double.doubleToRawLongBits(4.0d);
        Integer num = 0S2.A09;
        2lO A0K = 4YV.A0K(A0g, num, doubleToRawLongBits);
        C2sn A0L = 7zR.A0L(c2k5);
        if (!A1V) {
            MigColorScheme migColorScheme = this.A03;
            7zL.A1L(A0L.A00);
            Integer num2 = 0S2.A0T;
            Integer num3 = 0S2.A00;
            Drawable A004 = 7MU.A00(num2, num3);
            boolean z = this.A06;
            if (z) {
                doubleToRawLongBits = 7zP.A0G();
            }
            2lO A0K2 = 4YV.A0K((2lO) null, num, doubleToRawLongBits);
            Function2 function2 = this.A05;
            A0L.A00(new 8aQ(A004, A0K2, migColorScheme, function2, true));
            Drawable A005 = 7MU.A00(0S2.A0L, num3);
            if (z) {
                d = 14.0d;
            }
            A0L.A00(new 8aQ(A005, 7zS.A0Z((2lO) null, num, d), migColorScheme, function2, false));
        }
        if (!7zP.A1V(A002)) {
            A0L.A00(new 8V5(this.A03, this.A04));
        }
        return C2so.A0P(A0L, c2k5, A0K);
    }
}
