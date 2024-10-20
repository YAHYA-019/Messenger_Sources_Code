package X;

import com.facebook.http.interfaces.RequestPriority;
import com.facebook.zero.protocol.params.FetchZeroInterstitialContentParams;
import java.util.Set;

/* loaded from: Euj.class */
public final class Euj {
    public 1BY A00;
    public final C00i A01 = 1BV.A01((1BY) null, 32811);
    public final C00i A03 = 1BV.A01((1BY) null, 32812);
    public final Set A02 = AnonymousClass001.A0v();

    public Euj(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(String str, String str2, String str3) {
        3sU r0 = (3sU) this.A03.get();
        C00i c00i = this.A01;
        3sU.A02(RequestPriority.INTERACTIVE, r0, new FetchZeroInterstitialContentParams(((3sT) c00i.get()).A00(), DKE.A0s(c00i), str, str2, str3), FwK.A01(this, 55), 1BJ.A00(422), true);
    }
}
