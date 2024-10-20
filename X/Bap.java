package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Bap.class */
public final class Bap {
    public final DGa A00;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Bap(Context context, FbUserSession fbUserSession, C8m c8m, DFS dfs, MigColorScheme migColorScheme, String str) {
        DGa ccf;
        switch (str.hashCode()) {
            case -2074609671:
                if (str.equals("Catalog")) {
                    ccf = new Ccg(context, fbUserSession, c8m, dfs, migColorScheme);
                    break;
                }
                throw 1BL.A0l(str);
            case 1418731995:
                if (str.equals("BusinessTools")) {
                    ccf = new Cch(context, fbUserSession, c8m, dfs, migColorScheme);
                    break;
                }
                throw 1BL.A0l(str);
            case 1950170350:
                if (str.equals("AdsEntryPoint")) {
                    ccf = new Ccf(context, fbUserSession, c8m, dfs, migColorScheme);
                    break;
                }
                throw 1BL.A0l(str);
            default:
                throw 1BL.A0l(str);
        }
        this.A00 = ccf;
    }
}
