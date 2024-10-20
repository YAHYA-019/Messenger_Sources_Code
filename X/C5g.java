package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxCallback;
import java.util.concurrent.ExecutionException;

/* loaded from: C5g.class */
public final class C5g {
    public 1BY A00;
    public C1qM A01;
    public final C00i A02;
    public final C00i A04;
    public final String A06 = AnonymousClass001.A0X(this);
    public final C00i A05 = AbH.A0F();
    public final C00i A03 = 1BQ.A00();

    public C5g(1BO r302) {
        this.A04 = 1BV.A01(this.A00, 83267);
        this.A02 = 1BV.A01(this.A00, 83268);
        this.A00 = 7zL.A0Q(r302);
    }

    public boolean A00(FbUserSession fbUserSession) {
        try {
            if (7zL.A0t(((BDO) 1Lo.A04((Context) null, fbUserSession, this.A00, 67450)).A00((MailboxCallback) null).get()) != null) {
                return !r0.mResultSet.getBoolean(0, 15);
            }
        } catch (InterruptedException | ExecutionException e) {
            0fH.A0s(this.A06, e.getMessage() != null ? e.getMessage() : "", e);
        }
        return true;
    }
}
