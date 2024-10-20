package X;

import android.graphics.drawable.Drawable;
import com.facebook.common.callercontext.CallerContext;
import kotlin.jvm.functions.Function1;

/* loaded from: Dw5.class */
public final class Dw5 extends 1LH {
    public final Drawable A00;
    public final EN4 A01;
    public final Integer A02;
    public final String A03;
    public final Function1 A04;
    public static final Integer A06 = 0S2.A0N;
    public static final CallerContext A05 = CallerContext.A0B("GeoPrivateButton");

    public Dw5(Drawable drawable, EN4 en4, Integer num, String str, Function1 function1) {
        this.A00 = drawable;
        this.A03 = str;
        this.A02 = num;
        this.A01 = en4;
        this.A04 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean z;
        boolean z2;
        long j = 0;
        long j2 = 0;
        11T.A0F(c2k5, 0);
        Object A0A = c2k5.A05.A0A(BMI.class);
        if (A0A == null) {
            A0A = BMI.A04;
        }
        EN4 en4 = this.A01;
        Object A00 = 2rO.A00(c2k5, new 85O(13, A0A, c2k5, this), new Object[]{A0A, false, en4});
        int A03 = AnonymousClass001.A03(2rO.A00(c2k5, new JR6(this, c2k5, 36), new Object[]{null, en4}));
        C1ro c1ro = C1ro.CENTER;
        C1rp c1rp = C1rp.CENTER;
        2lQ r0 = 2lO.A02;
        2lO A0L = 4YV.A0L(4YV.A0L((2lO) null, 0S2.A00, A00, 1), 0S2.A0F, true, 1);
        float f = 1 - this.A02.intValue() != 0 ? 36.0f : 44.0f;
        2lO A0K = 4YV.A0K(A0L, 0S2.A0C, Double.doubleToRawLongBits(f));
        long A0A2 = 7zP.A0A();
        if (this.A00 != null || this.A03 == null) {
            j2 = 7zQ.A08();
            z = true;
        } else {
            z = false;
        }
        if (this.A03 == null) {
            j = 7zQ.A08();
            z2 = true;
        } else {
            z2 = false;
        }
        2lO A0K2 = 4YV.A0K(A0K, 0S2.A04, A0A2);
        if (z) {
            A0K2 = 4YV.A0K(A0K2, 0S2.A0u, j2);
        }
        if (z2) {
            A0K2 = 4YV.A0K(A0K2, 0S2.A1G, j);
        }
        if (f < 44.0f) {
            A0K2 = 7zL.A0g(A0K2, new C6na(0S2.A1G, Double.doubleToRawLongBits((44.0f - f) / 2.0f)));
        }
        Function1 function1 = this.A04;
        if (function1 != null) {
            A0K2 = 7zR.A0R(A0K2, new G98(function1, 0), 1);
        }
        return new Dva(A0K2, c1ro, c1rp, 0S2.A01, new GAc(A03, 5, this), 7zP.A08());
    }
}
