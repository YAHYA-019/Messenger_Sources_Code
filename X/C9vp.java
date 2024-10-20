package X;

import com.facebook.messaging.contactstab.FriendsTabFragment;

/* renamed from: X.9vp, reason: invalid class name */
/* loaded from: 9vp.class */
public final class C9vp implements C3lu {
    public final /* synthetic */ FriendsTabFragment A00;

    public C9vp(FriendsTabFragment friendsTabFragment) {
        this.A00 = friendsTabFragment;
    }

    @Override // X.C3lu
    public void BiW() {
        FriendsTabFragment friendsTabFragment = this.A00;
        9Zd r0 = friendsTabFragment.A0O;
        if (r0 != null) {
            r0.A04.A00();
            friendsTabFragment.A0O.A03.A02();
        }
    }

    @Override // X.C3lu
    public void BlK(long j) {
        FriendsTabFragment friendsTabFragment = this.A00;
        9Zd r0 = friendsTabFragment.A0O;
        if (r0 != null) {
            r0.A03.A05(Long.valueOf(1Br.A01(r0.A02) - j));
            friendsTabFragment.A0O.A04.A01();
        }
    }
}
