package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: B83.class */
public final class B83 extends CqM {
    public FbUserSession A00;
    public MigColorScheme A01;
    public String A02;
    public final DFE A04;
    public final CIJ A05;
    public final CBG A06 = (CBG) 1Bi.A03(84035);
    public final C2sT A03 = (C2sT) 1Bi.A03(67517);

    public B83(Context context, FbUserSession fbUserSession, DFE dfe, MigColorScheme migColorScheme, String str) {
        this.A05 = (CIJ) 1Bn.A0E(context, (1BY) null, 84034);
        this.A04 = dfe;
        this.A02 = str;
        this.A01 = migColorScheme;
        this.A00 = fbUserSession;
    }
}
