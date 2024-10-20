package X;

import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* loaded from: Erq.class */
public final class Erq {
    public final 1De A00;

    public Erq(1De r302) {
        this.A00 = r302;
    }

    public final 55D A00(FbUserSession fbUserSession, MigColorScheme migColorScheme, String str, String str2) {
        C2fq A0A;
        AbK.A1S(fbUserSession, migColorScheme);
        2fZ r0 = (2fZ) 4YU.A0o(fbUserSession, this.A00, 17067);
        C2q1 c2q1 = C2q0.A05;
        LightColorScheme.A00();
        if (str == null || str.length() == 0) {
            A0A = r0.A0A();
        } else {
            Uri uri = null;
            try {
                uri = C0A2.A03(str);
            } catch (SecurityException unused) {
            }
            A0A = r0.A0B(uri, EWV.A00(str2));
        }
        11T.A0B(c2q1);
        C2q1 A00 = R0f.A00(c2q1);
        A00.getClass();
        return 55C.A02(A00, migColorScheme, A0A);
    }
}
