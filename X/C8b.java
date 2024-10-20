package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.contacts.graphql.Contact;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;

/* loaded from: C8b.class */
public final class C8b {
    public 1BY A00;
    public final C12064ym A06;
    public final Bzq A07;
    public final 23F A08;
    public final C00i A03 = AbH.A0K();
    public final C00i A04 = AbH.A0a();
    public final C00i A05 = 1BQ.A01();
    public final CG4 A02 = (CG4) 1Bi.A03(84432);
    public final 2eT A01 = (2eT) 1Bn.A0E((Context) null, (1BY) null, 17055);

    public C8b(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        this.A07 = (Bzq) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 84872);
        this.A06 = (C12064ym) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 49414);
        this.A08 = AbJ.A0l(fbUserSession, (1BY) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.user.model.User A00(com.facebook.user.model.UserKey r302) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8b.A00(com.facebook.user.model.UserKey):com.facebook.user.model.User");
    }

    public User A01(UserKey userKey) {
        User A00 = this.A08.A00(userKey);
        if (A00 != null) {
            0fH.A0i(A00.A13, "FetchUserHandler", "Find user %s in DataCache");
        } else {
            Contact contact = (Contact) this.A07.A00.Apt(userKey);
            if (contact != null) {
                0fH.A0i(contact.mContactId, "FetchUserHandler", "Find user %s in ContactCache");
                return CJG.A01(contact);
            }
        }
        return A00;
    }
}
