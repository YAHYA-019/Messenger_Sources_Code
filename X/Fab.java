package X;

import com.facebook.auth.component.listener.interfaces.AuthenticationResult;
import com.facebook.auth.credentials.BrowserToNativeSSOCredentials;

/* loaded from: Fab.class */
public final class Fab implements GOk {
    public static final String __redex_internal_original_name = "AuthOperations$NativeSSOAuthOperation";
    public final BrowserToNativeSSOCredentials A00;
    public final String A01;
    public final /* synthetic */ Fck A02;

    public Fab(BrowserToNativeSSOCredentials browserToNativeSSOCredentials, Fck fck, String str) {
        this.A02 = fck;
        this.A00 = browserToNativeSSOCredentials;
        this.A01 = str;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public AuthenticationResult call() {
        C15h c15h;
        C00i c00i;
        Fck fck = this.A02;
        String A0q = DKF.A0q(fck);
        BrowserToNativeSSOCredentials browserToNativeSSOCredentials = this.A00;
        String str = this.A01;
        c15h = fck.A0y;
        EnD enD = new EnD(browserToNativeSSOCredentials, str, A0q, 1BL.A1a(c15h));
        1Rl A0Y = DKE.A0Y(fck);
        c00i = fck.A0R;
        return (AuthenticationResult) DKF.A0m(DKC.A0S(c00i), A0Y, this, enD);
    }
}
