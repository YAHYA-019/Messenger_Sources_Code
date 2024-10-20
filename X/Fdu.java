package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.service.OperationResult;

/* loaded from: Fdu.class */
public final class Fdu implements 1Tu, CallerContextable {
    public static final String __redex_internal_original_name = "ZeroGraphRequestHandler";
    public final C00i A00;
    public final C00i A02 = 1BV.A00(98818);
    public final C00i A04 = 1BQ.A01();
    public final C00i A03 = 1BQ.A02(84633);
    public final C00i A01 = AbH.A0H();

    public Fdu(Context context) {
        this.A00 = 7zL.A0R(context, 33031);
    }

    public static final Fdu A00(Object obj) {
        return new Fdu((Context) obj);
    }

    public OperationResult BMQ(1TC r302) {
        String str = r302.A06;
        if (str.equals(1BJ.A00(1394))) {
            String str2 = (String) ((1Rl) this.A03.get()).A07(CallerContext.A06(Fdu.class), DKC.A0S(this.A02), new C04033zm(), (Object) null);
            if (str2 != null) {
                return new OperationResult(str2, null);
            }
        } else {
            0BS A01 = 0BR.A01(__redex_internal_original_name, 0Pz.A0W("invalid type: ", str));
            A01.A00 = 1;
            1BK.A09(this.A04).D0u(new 0BR(A01));
        }
        return OperationResult.A01(29B.A02);
    }
}
