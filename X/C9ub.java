package X;

import com.facebook.messaging.contactstab.FriendsTabFragment;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.user.model.UserKey;

/* renamed from: X.9ub, reason: invalid class name */
/* loaded from: 9ub.class */
public final class C9ub implements 6Gp {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 9Hz A01;
    public final /* synthetic */ 9PF A02;
    public final /* synthetic */ UserKey A03;

    public C9ub(9Hz r302, 9PF r303, UserKey userKey, long j) {
        this.A02 = r303;
        this.A01 = r302;
        this.A03 = userKey;
        this.A00 = j;
    }

    public boolean C6c(MenuDialogItem menuDialogItem, Object obj) {
        int i = menuDialogItem.A01;
        boolean z = true;
        if (i == 0) {
            9Hz r0 = this.A01;
            UserKey userKey = this.A03;
            FriendsTabFragment friendsTabFragment = r0.A00.A00;
            Aa0 aa0 = friendsTabFragment.mListener;
            if (aa0 != null) {
                aa0.C9z(7zU.A0S(userKey, friendsTabFragment.A1A.get()), NavigationTrigger.A03("friends_tab_stories_thread"));
                return true;
            }
        } else {
            if (i == 1) {
                9Hz r02 = this.A01;
                long j = this.A00;
                FriendsTabFragment friendsTabFragment2 = r02.A00.A00;
                friendsTabFragment2.A1Y(friendsTabFragment2.A1X(), j);
                return true;
            }
            if (i == 2) {
                ((C4Nu) this.A01.A00.A00.A0A.get()).A00(this.A03);
                return true;
            }
            if (i != 3 && i != 4) {
                z = false;
            }
        }
        return z;
    }
}
