package X;

import android.app.Activity;
import android.view.KeyEvent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;

/* renamed from: X.AmZ, reason: case insensitive filesystem */
/* loaded from: AmZ.class */
public final class C1592AmZ extends 5W3 {
    public final 1Br A00;
    public final 1De A01;

    public C1592AmZ(1De r302) {
        this.A01 = r302;
        this.A00 = 7zM.A0h(r302, 16428);
    }

    public Boolean C31(Activity activity, KeyEvent keyEvent, int i) {
        int A05 = 7zP.A05(activity, keyEvent, 0);
        FbUserSession A03 = 1Br.A03(this.A00);
        CallModel A0V = AbL.A0V(1Lm.A05(activity, A03, 33088));
        if ((i != 25 && i != 24) || A0V == null || A0V.inCallState != A05) {
            return null;
        }
        ((IRF) 1Lm.A05(activity, A03, 99979)).A0g();
        return true;
    }
}
