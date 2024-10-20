package X;

import android.content.Context;
import com.facebook.foa.session.FbMetaSessionImpl;
import kotlin.jvm.functions.Function1;

/* loaded from: F2g.class */
public abstract class F2g {
    public static final void A00(Context context, FbMetaSessionImpl fbMetaSessionImpl, Eza eza, GJB gjb, Function1 function1) {
        EKK ekk = new EKK(context, fbMetaSessionImpl, eza, new GBn(gjb, 30), new GBn(null, 31), new GBn(new GBn(function1, 32), 34));
        ESX.A00 = ekk;
        ekk.A0E();
    }

    public static final void A01(Context context, FbMetaSessionImpl fbMetaSessionImpl, FAB fab, GJB gjb) {
        11T.A0H(context, fbMetaSessionImpl);
        GBn gBn = new GBn(gjb, 33);
        (1BL.A0Q().AZk(36326558513583824L) ? new EKH(context, fbMetaSessionImpl, fab, gBn) : new EKI(context, fbMetaSessionImpl, fab, gBn)).A0E();
    }
}
