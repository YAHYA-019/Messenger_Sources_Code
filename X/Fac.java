package X;

import com.facebook.auth.component.listener.interfaces.AuthenticationResult;
import com.facebook.auth.credentials.FacebookCredentials;
import com.facebook.auth.protocol.AuthenticationResultImpl;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.util.TriState;

/* loaded from: Fac.class */
public final class Fac implements GOk {
    public static final String __redex_internal_original_name = "AuthOperations$PageAdminAuthOperation";
    public final ViewerContext A00;
    public final String A01;
    public final /* synthetic */ Fck A02;

    public Fac(Fck fck, ViewerContext viewerContext, String str) {
        this.A02 = fck;
        this.A00 = viewerContext;
        this.A01 = str;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public AuthenticationResult call() {
        C00i c00i;
        C00i c00i2;
        String str = this.A01;
        if (1JF.A0B(str)) {
            Fck fck = this.A02;
            c00i = fck.A0g;
            if (!((C09794rj) c00i.get()).A07) {
                1Rl A0Y = DKE.A0Y(fck);
                C04033zm c04033zm = new C04033zm();
                c04033zm.A07 = this.A00.mAuthToken;
                c00i2 = fck.A0W;
                return (AuthenticationResult) A0Y.A07(CallerContext.A09(getClass(), Fck.__redex_internal_original_name), DKC.A0S(c00i2), c04033zm, (Object) null);
            }
        }
        ViewerContext viewerContext = this.A00;
        String str2 = viewerContext.mUserId;
        return new AuthenticationResultImpl(new FacebookCredentials(str2, viewerContext.mAuthToken, null, null, viewerContext.mSessionCookiesString, viewerContext.mSessionSecret, viewerContext.mSessionKey, viewerContext.mUsername, viewerContext.A00, false), TriState.UNSET, str2, null, str, null);
    }
}
