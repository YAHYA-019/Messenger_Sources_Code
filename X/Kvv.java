package X;

import android.accounts.Account;
import android.app.Activity;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.Set;

/* loaded from: Kvv.class */
public final class Kvv {
    /* JADX WARN: Type inference failed for: r0v24, types: [X.28E, java.lang.Object] */
    public static final K2H A00(Activity activity, String str) {
        L2d l2d = new L2d(GoogleSignInOptions.A0C);
        Set set = l2d.A03;
        set.add(GoogleSignInOptions.A0E);
        set.add(new Scope(1, "https://www.googleapis.com/auth/drive.appdata"));
        set.addAll(Arrays.asList(new Scope[0]));
        if (str != null) {
            AbstractC00481b7.A04(str);
            l2d.A00 = new Account(str, "com.google");
        }
        GoogleSignInOptions A00 = l2d.A00();
        AbstractC00481b7.A02(A00);
        return new C27w(activity, A00, Kd2.A02, (28E) new Object());
    }
}
