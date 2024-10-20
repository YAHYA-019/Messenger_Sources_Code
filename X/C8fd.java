package X;

import android.graphics.drawable.GradientDrawable;
import com.facebook.acra.constants.ActionId;

/* renamed from: X.8fd, reason: invalid class name */
/* loaded from: 8fd.class */
public final class C8fd extends 1LH {
    public final C00m A00;
    public final C00m A01;
    public final boolean A02;

    public C8fd(C00m c00m, C00m c00m2, boolean z) {
        this.A02 = z;
        this.A00 = c00m;
        this.A01 = c00m2;
    }

    public static final Dvv A01(C2k6 c2k6, C97h c97h, String str) {
        int A00 = FGN.A00(c2k6, C97i.A0X);
        2lQ r0 = 2lO.A02;
        return new Dvv(7zT.A0i((2lO) null, 0S2.A00, 7zQ.A06()), c97h, null, null, Integer.valueOf(A00), str, null, 12, true);
    }

    public 1LI A0s(C2k5 c2k5) {
        String str;
        11T.A0F(c2k5, 0);
        int A00 = FGN.A00(c2k5, C97i.A0B);
        Object A002 = 2rO.A00(c2k5, new AKK(c2k5, 49), new Object[0]);
        2lQ r0 = 2lO.A02;
        long doubleToRawLongBits = Double.doubleToRawLongBits(250.0d);
        Integer num = 0S2.A0N;
        2lO A0K = 4YV.A0K((2lO) null, num, doubleToRawLongBits);
        long A0A = 7zP.A0A();
        long A0B = 7zQ.A0B();
        Integer num2 = 0S2.A04;
        2lO A0K2 = 4YV.A0K(A0K, num2, A0B);
        Integer num3 = 0S2.A05;
        2lO A0U = 7zT.A0U(A0K2, 7zL.A0i(num3, A0A));
        2lO A0c = 7zS.A0c(4YV.A0L((2lO) null, num3, A002, 1), num, true);
        GradientDrawable A0G = 7zO.A0G(0);
        A0G.setCornerRadius(12.0f);
        A0G.setColor(A00);
        A0G.setStroke(7zS.A01(c2k5, 1.0d), 0);
        Integer num4 = 0S2.A00;
        2lO A0L = 4YV.A0L(7zT.A0O(4YV.A0L(A0c, num4, A0G, 1), 8.0d), num4, C1ro.FLEX_START, 0);
        C2sn A0L2 = 7zR.A0L(c2k5);
        boolean z = this.A02;
        if (z) {
            str = null;
            A0L2.A00(new Dw8(7zS.A0V((2lO) null, 7zL.A0i(num2, A0B), num3, A0A), null, C97i.A0i, 3yH.A09(A0L2, 2131960275), 0S2.A1J, 0, ActionId.VIDEO_SET_RENDERER_CONTEXT));
        } else {
            str = 3yH.A09(A0L2, 2131960275);
        }
        A0L2.A00(new 8cY(A01(A0L2, C97h.A0M, 3yH.A09(A0L2, 2131960278)), (1LI) null, A0U, 3yH.A09(A0L2, 2131960276), str, new AKK(this, 47)));
        if (z) {
            A0L2.A00(new 8cY(A01(A0L2, C97h.A0d, 3yH.A09(A0L2, 2131960169)), (1LI) null, A0U, 3yH.A09(A0L2, 2131960277), (String) null, new AKK(this, 48)));
        }
        return C2so.A02(A0L2, c2k5, A0L);
    }
}
