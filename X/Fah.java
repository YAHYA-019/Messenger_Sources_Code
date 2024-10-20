package X;

import com.facebook.auth.component.listener.interfaces.AuthenticationResult;
import com.facebook.auth.credentials.PasswordCredentials;

/* loaded from: Fah.class */
public final class Fah implements GOk {
    public static final String __redex_internal_original_name = "AuthOperations$PasswordAuthOperation";
    public final PasswordCredentials A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final /* synthetic */ Fck A06;

    public Fah(PasswordCredentials passwordCredentials, Fck fck, String str) {
        this(passwordCredentials, fck, null, str, null, null, null);
    }

    public Fah(PasswordCredentials passwordCredentials, Fck fck, String str, String str2, String str3, String str4, String str5) {
        this.A06 = fck;
        this.A00 = passwordCredentials;
        this.A01 = str;
        this.A02 = str3;
        this.A05 = str4;
        this.A03 = str5;
        this.A04 = 1JF.A0B(str2) ? passwordCredentials.A04 : str2;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public AuthenticationResult call() {
        C15h c15h;
        Fhw fhw;
        Fck fck = this.A06;
        String A00 = FFU.A00(fck);
        String A0q = DKF.A0q(fck);
        PasswordCredentials passwordCredentials = this.A00;
        c15h = fck.A0y;
        EqV eqV = new EqV(passwordCredentials, A00, A0q, this.A01, this.A04, this.A02, this.A05, this.A03, 1BL.A1a(c15h));
        1Rl A0Y = DKE.A0Y(fck);
        fhw = fck.A0B;
        return (AuthenticationResult) DKF.A0m(fhw, A0Y, this, eqV);
    }
}
