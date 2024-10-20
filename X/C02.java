package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.common.network.FbNetworkManager;

/* loaded from: C02.class */
public final class C02 {
    public final FbNetworkManager A00 = (FbNetworkManager) 1Bi.A03(16687);

    public DMV A00(Context context, DialogInterface.OnClickListener onClickListener) {
        C2121Dea c2121Dea = new C2121Dea(context);
        c2121Dea.A06(2131955732);
        c2121Dea.A05(2131955731);
        c2121Dea.A08(new CSF(onClickListener, this, 0));
        c2121Dea.A0D(CSG.A00(this, 11), 2131955718);
        return c2121Dea.A0I();
    }
}
