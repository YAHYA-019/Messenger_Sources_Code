package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.user.model.User;

/* loaded from: C54.class */
public final class C54 {
    public 1BY A00;
    public CbQ A01;
    public String A02;
    public DGt A03;
    public final C0f A04 = new C0f(this);

    public C54(1BO r302, DGt dGt) {
        this.A00 = 7zL.A0Q(r302);
        this.A03 = dGt;
    }

    public void A00(User user, String str) {
        NavigationTrigger A02 = NavigationTrigger.A02(null, "contact_manager", str, null, null, null, false);
        DGt dGt = this.A03;
        if (dGt != null && dGt.BVP()) {
            dGt.CH0(A02, user);
            return;
        }
        Bundle A05 = 1BK.A05();
        A05.putParcelable("entrypoint", A02);
        1BY r0 = this.A00;
        Context A04 = AbF.A04(r0);
        6HS r02 = (6HS) 1Hv.A02(A04, 50024);
        C1gs c1gs = (C1gs) 1Bn.A0E((Context) null, r0, 66804);
        if (c1gs == null || c1gs.A02()) {
            if (1XU.A00(r02.A00)) {
                6HS.A02(r02, user, "all_connections_list");
                return;
            } else {
                6HS.A00(A05, r02, user);
                return;
            }
        }
        CPY cpy = (CPY) 1Hv.A02(A04, 83556);
        if (1XU.A00(cpy.A00)) {
            CPY.A02((Bundle) null, cpy, (ThreadKey) null, user, "all_connections_list");
        } else {
            CPY.A03(A05, cpy, user);
        }
    }
}
