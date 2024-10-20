package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.contacts.graphql.Contact;
import com.facebook.contacts.server.FetchMultipleContactsByFbidParams;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.SingletonImmutableSet;

/* renamed from: X.5u0, reason: invalid class name */
/* loaded from: 5u0.class */
public final class C5u0 {
    public final 1De A00;
    public final 1Br A01 = 1Bq.A00(66351);
    public final 1Br A02;

    public C5u0(1De r302) {
        this.A00 = r302;
        this.A02 = 1Bu.A03(r302.A00, 66013);
    }

    public final User A00(UserKey userKey, int i) {
        User A00;
        if (i == 7 || i == 18) {
            FbUserSession A04 = ((1Fv) this.A01.A00.get()).A04();
            1BY r0 = this.A00.A00;
            A00 = ((C8b) 1Lm.A07(A04, r0, 84457)).A00(userKey);
            if (A00 == null) {
                try {
                    ImmutableList immutableList = ((CHI) 1Lm.A07(A04, r0, 84591)).A01(new FetchMultipleContactsByFbidParams(1He.A05, new SingletonImmutableSet(userKey))).A01;
                    11T.A0A(immutableList);
                    return CJG.A01((Contact) 0QD.A0D(immutableList));
                } catch (Exception unused) {
                }
            }
            return A00;
        }
        1Kh r02 = new 1Kh();
        r02.A02(userKey.type, userKey.id);
        C00i c00i = this.A02.A00;
        r02.A0R = new Name((i == 10 || i == 11) ? "" : (String) ((C5u1) c00i.get()).A00.getValue());
        r02.A1R = ((C5u1) c00i.get()).A00(i);
        A00 = new User(r02);
        return A00;
    }
}
