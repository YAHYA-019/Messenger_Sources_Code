package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.publicchats.broadcastchats.join.DiscoverablePublicBroadcastChatJoinNuxFragment;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* loaded from: AGh.class */
public final /* synthetic */ class AGh implements Runnable {
    public static final String __redex_internal_original_name = "FriendsTabFragment$13$$ExternalSyntheticLambda0";
    public final /* synthetic */ long A00;
    public final /* synthetic */ C9x6 A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ AGh(C9x6 c9x6, Boolean bool, String str, long j) {
        this.A01 = c9x6;
        this.A00 = j;
        this.A03 = str;
        this.A02 = bool;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
    @Override // java.lang.Runnable
    public final void run() {
        C9x6 c9x6 = this.A01;
        long j = this.A00;
        String str = this.A03;
        Boolean bool = this.A02;
        NavigationTrigger A03 = NavigationTrigger.A03(((9Oe) 1Bi.A03(68471)).A01 ? 4YT.A00(27) : "friends_tab_recommended_public_channels_trigger");
        ThreadKey A05 = ThreadKey.A05(j);
        ?? r0 = c9x6.A00;
        if (r0.mListener != null) {
            if (r0.getContext() != null) {
                06Z r02 = r0.mFragmentManager;
                9dP r03 = DiscoverablePublicBroadcastChatJoinNuxFragment.A02;
                9dP.A00(r02);
            }
            r0.mListener.CA0(A05, A03, bool, str);
        }
    }
}
