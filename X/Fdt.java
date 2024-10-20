package X;

import android.os.Parcelable;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.service.OperationResult;

/* loaded from: Fdt.class */
public final class Fdt implements 1Tu, CallerContextable {
    public static final String __redex_internal_original_name = "NotifyServerUserAckedOperationHandler";
    public final C00i A00 = 1BV.A00(98816);
    public final C00i A01 = 1BQ.A02(84633);
    public final C00i A02 = 1BQ.A01();

    public static final Fdt A00() {
        return new Fdt();
    }

    public OperationResult BMQ(1TC r302) {
        String str = r302.A06;
        if (1BJ.A00(502).equals(str)) {
            Parcelable parcelable = r302.A00.getParcelable("notifyServerUserAckedParams");
            1Ro A0S = DKC.A0S(this.A00);
            C04033zm c04033zm = new C04033zm();
            c04033zm.A01(0S2.A0C);
            String str2 = (String) ((1Rl) this.A01.get()).A07(CallerContext.A06(Fdt.class), A0S, c04033zm, parcelable);
            if (str2 != null) {
                return new OperationResult(str2, null);
            }
        } else {
            0BS A01 = 0BR.A01(__redex_internal_original_name, 0Pz.A0W("invalid type: ", str));
            A01.A00 = 1;
            1BK.A09(this.A02).D0u(new 0BR(A01));
        }
        return OperationResult.A01(29B.A02);
    }
}
