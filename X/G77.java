package X;

import com.facebook.auth.protocol.UserTypeResult;
import com.facebook.common.callercontext.CallerContextable;
import java.util.concurrent.Callable;

/* loaded from: G77.class */
public final class G77 implements Callable, CallerContextable {
    public static final String __redex_internal_original_name = "AuthOperations$DetermineUserTypeOperation";
    public final String A00;
    public final String A01;
    public final /* synthetic */ Fck A02;

    public G77(Fck fck, String str, String str2) {
        this.A02 = fck;
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        EhD ehD = new EhD(this.A01, this.A00);
        Fck fck = this.A02;
        return (UserTypeResult) DKF.A0m(fck.A0E, DKE.A0Y(fck), this, ehD);
    }
}
