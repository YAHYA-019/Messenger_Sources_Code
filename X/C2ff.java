package X;

import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.user.profilepic.PicSquare;

/* renamed from: X.2ff, reason: invalid class name */
/* loaded from: 2ff.class */
public final class C2ff {
    public final C00i A03;
    public final C00i A06;
    public final C00i A00 = new 1BQ(65723);
    public final C00i A01 = new 1BQ(17053);
    public final C00i A07 = new 1BV(66790);
    public final C00i A08 = new 1BV(66792);
    public final C00i A04 = new 1BQ(83605);
    public final C00i A02 = new 1BV(67697);
    public final C00i A05 = new 1BQ(66584);

    public C2ff(FbUserSession fbUserSession) {
        Integer num = 1Lo.A05;
        this.A03 = new 1MV(fbUserSession, 66631);
        this.A06 = new 1MV(fbUserSession, 33102);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d8, code lost:
    
        if (((X.C2gq) r0.get()).A01(r0) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.2qZ A00(com.facebook.messaging.model.threadkey.ThreadKey r301, X.C2ff r302, com.facebook.user.model.UserKey r303, java.lang.String r304, java.lang.String r305, java.lang.String r306) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2ff.A00(com.facebook.messaging.model.threadkey.ThreadKey, X.2ff, com.facebook.user.model.UserKey, java.lang.String, java.lang.String, java.lang.String):X.2qZ");
    }

    public 2qZ A01(User user) {
        C2fd A03 = A03(user);
        if (!User.A01(user.A0e)) {
            return 2qZ.A03(user, A03);
        }
        User user2 = user.A0f;
        return user2 == null ? 2qZ.A02(user, A03) : 2qZ.A06(user2.A0k, A03);
    }

    public 2qZ A02(UserKey userKey, String str, int i) {
        C2fd A06;
        User user;
        User A00 = ((23F) this.A06.get()).A00(userKey);
        if (A00 == null || (user = A00.A0f) == null) {
            A06 = A06(userKey, 0, false, true);
        } else {
            userKey = user.A0k;
            A06 = C2fd.A0c;
        }
        return User.A01(userKey.type) ? new 2qZ((Uri) null, (UserKey) null, (PicSquare) null, 2qU.A02, (3xU) null, A06, userKey.A04(), new Name(str).A00(), 0, i) : 2qZ.A06(userKey, A06);
    }

    public C2fd A03(User user) {
        return A05(user, 0, false, true);
    }

    public C2fd A04(User user, int i, boolean z) {
        return A05(user, i, z, true);
    }

    public C2fd A05(User user, int i, boolean z, boolean z2) {
        if (!user.A1d && !user.A0F()) {
            C00i c00i = this.A07;
            if (((C2gq) c00i.get()).A00(user)) {
                return C2fd.A0l;
            }
            if (((C2gq) c00i.get()).A01(user)) {
                return C2fd.A0m;
            }
            this.A08.get();
            String str = user.A13;
            if (user.A0G()) {
                return C2fd.A0c;
            }
            if (user.A0e == 1Js.A08) {
                return C2fd.A0j;
            }
            if (z2 && ((1XZ) this.A00.get()).BX3(user.A0k)) {
                this.A01.get();
                return C2fd.A01;
            }
            if (((1XZ) this.A00.get()).DAK(user.A0k, i) && z) {
                return C2fd.A0a;
            }
            if (user.A0E() && user.A1r) {
                ((7XR) this.A02.get()).A00(str, 0S2.A0C);
                return C2fd.A01;
            }
        }
        return C2fd.A0T;
    }

    public C2fd A06(UserKey userKey, int i, boolean z, boolean z2) {
        User A00 = ((23F) this.A06.get()).A00(userKey);
        if (A00 != null) {
            return A05(A00, i, z, z2);
        }
        if (User.A01(userKey.type)) {
            return C2fd.A0c;
        }
        C00i c00i = this.A00;
        if (!((1XZ) c00i.get()).BX3(userKey)) {
            return (((1XZ) c00i.get()).DAK(userKey, i) && z) ? C2fd.A0a : C2fd.A0T;
        }
        this.A01.get();
        return C2fd.A01;
    }
}
