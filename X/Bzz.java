package X;

import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecBaseData;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecPassword;
import java.util.HashMap;

/* loaded from: Bzz.class */
public final class Bzz {
    public final /* synthetic */ B2s A00;

    public Bzz(B2s b2s) {
        this.A00 = b2s;
    }

    public void A00() {
        int length;
        B2s b2s = this.A00;
        AccountLoginSegueBase accountLoginSegueBase = ((AlJ) b2s).A01;
        b2s.A1g("action_recovery_confirm_password", ((AccountLoginSegueRecPassword) accountLoginSegueBase).A00, AnonymousClass001.A1Q(((AccountLoginSegueRecBaseData) accountLoginSegueBase).A01, 2), false);
        String str = ((AccountLoginSegueRecPassword) ((AlJ) b2s).A01).A00;
        if (str != null && (length = str.length()) > 0 && length < 6) {
            1UG A0A = AbG.A0A(1ZG.A03, 1BK.A07(((BjW) b2s.A02.get()).A00), "password_too_short");
            if (A0A.isSampled()) {
                A0A.BZL();
            }
        }
        BMG bmg = BMG.A2W;
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("contact_point", AlJ.A07(b2s));
        AbF.A0V(b2s.A01).A0O(bmg, A0u);
    }
}
