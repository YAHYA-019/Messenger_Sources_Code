package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.polling.PollingInputParams;
import com.facebook.traffic.rsys.MC;
import java.lang.ref.WeakReference;

/* loaded from: Ckf.class */
public final class Ckf implements C7yf {
    public final C00i A00 = 7zL.A0R(FbInjector.A00(), 83032);

    @Override // X.C7yf
    public 1pK AlC(Parcelable parcelable) {
        parcelable.getClass();
        PollingInputParams pollingInputParams = (PollingInputParams) parcelable;
        boolean isEmpty = TextUtils.isEmpty(pollingInputParams.A03);
        boolean z = !TextUtils.isEmpty(pollingInputParams.A02);
        if (isEmpty || z) {
            FbUserSession A0C = 4YV.A0C(FbInjector.A00());
            IEZ iez = (IEZ) this.A00.get();
            BOT bot = pollingInputParams.A00;
            bot.getClass();
            ThreadKey threadKey = pollingInputParams.A01;
            AbK.A1S(A0C, threadKey);
            2R2 A08 = AbF.A08(1BK.A08(IEZ.A00(iez), 1BJ.A00(MC.rp_ctm_network_throttling.__CONFIG__)), 293);
            if (4YU.A1X(A08)) {
                HCX hcx = z ? HCX.A01 : HCX.A02;
                EnumC03583yg A00 = AbstractC03573yf.A00(threadKey);
                if (threadKey.A0z()) {
                    ((5P5) 4YU.A0o(A0C, iez.A00, 67488)).A00(new CyC(4, A08, hcx, bot, iez, A00), threadKey.A01);
                } else {
                    IEZ.A03(A08, A00, bot, hcx, IEZ.A02(iez, 1BK.A0w(threadKey)));
                }
            }
        }
        1pK c1579Aly = new C1579Aly();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("polling_params", pollingInputParams);
        c1579Aly.setArguments(A05);
        return c1579Aly;
    }

    @Override // X.C7yf
    public BP7 AlE() {
        return BP7.POLL;
    }

    @Override // X.C7yf
    public /* synthetic */ 1pK AlF(Parcelable parcelable, WeakReference weakReference) {
        return null;
    }
}
