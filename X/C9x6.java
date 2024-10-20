package X;

import com.facebook.messaging.contactstab.FriendsTabFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.9x6, reason: invalid class name */
/* loaded from: 9x6.class */
public final class C9x6 implements Aa6 {
    public final /* synthetic */ FriendsTabFragment A00;

    public C9x6(FriendsTabFragment friendsTabFragment) {
        this.A00 = friendsTabFragment;
    }

    @Override // X.Aa6
    public void CEa(Boolean bool, String str, String str2, int i, long j) {
        FriendsTabFragment friendsTabFragment = this.A00;
        if (friendsTabFragment.mListener != null) {
            ThreadKey A05 = ThreadKey.A05(j);
            NavigationTrigger A03 = NavigationTrigger.A03("friends_tab_recommended_public_channels_trigger");
            CQo cQo = (CQo) 1Bi.A03(82689);
            Long valueOf = Long.valueOf(j);
            cQo.A0N(1Hb.A0I, 5SW.A0V, valueOf);
            friendsTabFragment.mListener.CA0(A05, A03, bool, str2);
        }
    }

    @Override // X.Aa6
    public void CEb(long j, String str, int i, Boolean bool) {
        ((BDc) this.A00.A09.get()).A00(new A0R(this, bool, str, 2, j), (MailboxCallback) null, EnumC3499Mfu.A0o.toString(), j);
    }

    @Override // X.Aa6
    public void CJn() {
        8Gt.A0F.A00(this.A00.A04, 5SW.A1O);
    }
}
