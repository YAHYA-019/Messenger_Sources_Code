package X;

import com.facebook.auth.protocol.InstagramPasswordCredentials;
import com.facebook.auth.protocol.UserTypeResult;
import com.facebook.common.callercontext.CallerContextable;
import java.util.concurrent.Callable;

/* loaded from: G76.class */
public final class G76 implements Callable, CallerContextable {
    public static final String __redex_internal_original_name = "AuthOperations$IGAuthenticateOperation";
    public final InstagramPasswordCredentials A00;
    public final /* synthetic */ Fck A01;

    public G76(Fck fck, InstagramPasswordCredentials instagramPasswordCredentials) {
        this.A01 = fck;
        this.A00 = instagramPasswordCredentials;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        Ebl ebl = new Ebl(this.A00);
        Fck fck = this.A01;
        return (UserTypeResult) DKF.A0m(fck.A0F, DKE.A0Y(fck), this, ebl);
    }
}
