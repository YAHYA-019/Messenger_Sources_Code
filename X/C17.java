package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.messaging.nativepagereply.orders.threadsettings.model.BusinessInboxPlacedOrder;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: C17.class */
public final class C17 {
    public final 1Br A00 = 1BK.A0C();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [X.58p] */
    public final AnonymousClass544 A00(Context context, BusinessInboxPlacedOrder businessInboxPlacedOrder, MigColorScheme migColorScheme, C00m c00m, C00m c00m2, long j) {
        AnonymousClass597 A00;
        boolean A1Y = 7zP.A1Y(migColorScheme);
        C2sT c2sT = (C2sT) 1Bi.A03(67517);
        String str = businessInboxPlacedOrder.A01;
        String str2 = str;
        11T.A0A(str);
        String str3 = businessInboxPlacedOrder.A02;
        if (str3 != null && !str3.equals(ConstantsKt.CAMERA_ID_FRONT)) {
            str2 = TextUtils.concat(str, " · ", str3).toString();
        }
        String A12 = AbM.A12(c2sT.A06(), businessInboxPlacedOrder.A00 * 1000);
        String str4 = businessInboxPlacedOrder.A06;
        CharSequence concat = TextUtils.concat(str4, " · ", A12);
        String str5 = businessInboxPlacedOrder.A05;
        String str6 = businessInboxPlacedOrder.A04;
        11T.A0A(str6);
        int i = 2131967175;
        if (11T.A0O(str4, "CANCELLED")) {
            i = 2131967093;
        }
        String A0v = 1BK.A0v(context, A12, i);
        11T.A0D(A0v);
        ?? AZk = 1Br.A07(this.A00).AZk(36319768168708433L);
        6BC r0 = new 6BC();
        r0.A00 = j;
        if (AZk == 0) {
            r0.A06(0Pz.A0K(businessInboxPlacedOrder.A03, '#'));
            r0.A05(str);
            r0.A04 = 5OM.A00(A0v);
            A00 = new AnonymousClass597(((C1u2) 1Bi.A03(16839)).A03(C1u3.A2M), migColorScheme.B4h(), migColorScheme.B9I());
        } else {
            r0.A06(str2);
            r0.A05(concat);
            String str7 = businessInboxPlacedOrder.A07;
            A00 = str7 != null ? C5wv.A00(C0A2.A03(str7), C2q0.A07, C2py.ROUND_RECT, migColorScheme, A1Y ? 1 : 0) : new AnonymousClass597(((C1u2) 1Bi.A03(16839)).A03(C1u3.A5t), migColorScheme.B4h(), migColorScheme.B9I());
        }
        r0.A02(A00);
        r0.A03(migColorScheme);
        r0.A0A.add(new 55G(new Cvv(c00m, A1Y ? 1 : 0)));
        r0.A01 = new Cvb(context, businessInboxPlacedOrder, this, str6, str5, c00m2);
        AnonymousClass544 A002 = r0.A00();
        11T.A0A(A002);
        return A002;
    }
}
