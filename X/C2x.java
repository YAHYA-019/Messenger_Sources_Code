package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.contacts.graphql.Contact;
import com.facebook.contacts.server.FetchMultipleContactsByFbidParams;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;

/* loaded from: C2x.class */
public final class C2x {
    public 1BY A00;
    public final C00i A01 = 1BQ.A00();

    public C2x(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public User A00(FbUserSession fbUserSession, String str) {
        String str2;
        UserKey A0X = 1BK.A0X(str);
        1BY r0 = this.A00;
        User A00 = ((C8b) 1Lo.A04((Context) null, fbUserSession, r0, 84457)).A00(A0X);
        if (A00 == null) {
            try {
                return CJG.A01((Contact) 1BK.A0r(((CHI) 1Lo.A04((Context) null, fbUserSession, r0, 84591)).A01(new FetchMultipleContactsByFbidParams(1He.A05, AbF.A11(A0X))).A01));
            } catch (Exception e) {
                str2 = "Failed to fetch contact";
                C00i c00i = this.A01;
                0fH.A0r("SecureMessageFetchUserUtil", 1BK.A0N(c00i).AZk(36310911950521826L) ? "Failed to fetch contact" : 0Pz.A0z(str2, ":", str, ":", e.getMessage()), e);
                String A0W = 0Pz.A0W("Contact is null: ", str);
                if (!1BK.A0N(c00i).AZk(36310911950521826L)) {
                    A0W = 0Pz.A0j(A0W, ":", str);
                }
                0fH.A0k("SecureMessageFetchUserUtil", A0W);
                1Kh A0y = AbF.A0y();
                A0y.A02(A0X.type, A0X.id);
                A00 = AbF.A0w(A0y);
            }
        }
        return A00;
    }
}
