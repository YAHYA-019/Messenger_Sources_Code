package X;

import com.facebook.auth.component.listener.interfaces.AuthenticationResult;
import com.facebook.auth.credentials.DeviceBasedLoginCredentials;

/* loaded from: Fag.class */
public final class Fag implements GOk {
    public static final String __redex_internal_original_name = "AuthOperations$DblAuthOperation";
    public String A00;
    public final DeviceBasedLoginCredentials A01;
    public final String A02;
    public final /* synthetic */ Fck A03;

    public Fag(DeviceBasedLoginCredentials deviceBasedLoginCredentials, Fck fck) {
        this.A03 = fck;
        this.A01 = deviceBasedLoginCredentials;
        this.A02 = "logged_in_account_switcher";
        this.A00 = null;
    }

    public Fag(DeviceBasedLoginCredentials deviceBasedLoginCredentials, Fck fck, String str, String str2) {
        this.A03 = fck;
        this.A01 = deviceBasedLoginCredentials;
        this.A02 = str;
        this.A00 = str2;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public AuthenticationResult call() {
        C15h c15h;
        C00i c00i;
        if (1JF.A0B(this.A00)) {
            String A00 = FFU.A00(this.A03);
            this.A00 = A00;
            if (A00 == null) {
                A00 = "";
            }
            this.A00 = A00;
        }
        Fck fck = this.A03;
        String A0q = DKF.A0q(fck);
        DeviceBasedLoginCredentials deviceBasedLoginCredentials = this.A01;
        String str = this.A00;
        c15h = fck.A0y;
        EoX eoX = new EoX(deviceBasedLoginCredentials, str, A0q, this.A02, 1BL.A1a(c15h));
        1Rl A0Y = DKE.A0Y(fck);
        c00i = fck.A0Q;
        return (AuthenticationResult) DKF.A0m(DKC.A0S(c00i), A0Y, this, eoX);
    }
}
