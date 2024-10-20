package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBloksLogin;

/* loaded from: G3o.class */
public final /* synthetic */ class G3o implements Runnable {
    public static final String __redex_internal_original_name = "AccountLoginSegueBloksLogin$$ExternalSyntheticLambda0";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ AccountLoginSegueBloksLogin A01;
    public final /* synthetic */ DEf A02;

    public /* synthetic */ G3o(FbUserSession fbUserSession, AccountLoginSegueBloksLogin accountLoginSegueBloksLogin, DEf dEf) {
        this.A01 = accountLoginSegueBloksLogin;
        this.A00 = fbUserSession;
        this.A02 = dEf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AccountLoginSegueBloksLogin.A00(this.A00, this.A01, this.A02);
    }
}
