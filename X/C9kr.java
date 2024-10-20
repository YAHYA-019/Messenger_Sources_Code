package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.contactstab.FriendsTabFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;

/* renamed from: X.9kr, reason: invalid class name */
/* loaded from: 9kr.class */
public final class C9kr {
    public final /* synthetic */ FriendsTabFragment A00;

    public C9kr() {
    }

    public C9kr(FriendsTabFragment friendsTabFragment) {
        this.A00 = friendsTabFragment;
    }

    public static void A00(C9kr c9kr, C3Z5 c3z5, ThreadKey threadKey, User user) {
        FriendsTabFragment friendsTabFragment = c9kr.A00;
        FriendsTabFragment.A0B(friendsTabFragment, c3z5, threadKey);
        3yB r0 = (3yB) friendsTabFragment.A0k.get();
        long parseLong = Long.parseLong(user.A13);
        String str = c3z5.A07;
        FbUserSession fbUserSession = friendsTabFragment.A03;
        if (((C1gb) r0.A03.get()).A0B()) {
            3yB.A02(fbUserSession, r0, Long.valueOf(parseLong), "tab", "an", str, 4, -1);
        }
    }

    public void A01(C3Z5 c3z5, User user) {
        FriendsTabFragment friendsTabFragment = this.A00;
        ((C3Z6) friendsTabFragment.A0h.get()).A07(c3z5);
        4iI r0 = (4iI) friendsTabFragment.A1A.get();
        UserKey userKey = user.A0k;
        11T.A0F(userKey, 0);
        ThreadKey A00 = 4iI.A00(r0, userKey);
        if (((C1gs) friendsTabFragment.A0t.get()).A02()) {
            A00(this, c3z5, A00, user);
            return;
        }
        1FV A03 = ((CNa) friendsTabFragment.A19.get()).A03(friendsTabFragment.A03, user, false);
        1Kd.A0D(friendsTabFragment.A15, new ABt(2, this, c3z5, user), A03);
    }
}
