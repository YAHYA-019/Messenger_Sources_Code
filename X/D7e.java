package X;

import androidx.lifecycle.MutableLiveData;

/* loaded from: D7e.class */
public final class D7e implements Runnable {
    public static final String __redex_internal_original_name = "CommunityMessagingJoinChannelHandler$joinChannel$3";
    public final /* synthetic */ 8L0 A00;
    public final /* synthetic */ CFU A01;

    public D7e(8L0 r302, CFU cfu) {
        this.A01 = cfu;
        this.A00 = r302;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.BwC, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        CFU cfu = this.A01;
        8L0 r0 = this.A00;
        synchronized (cfu) {
            if (11T.A0O(r0, cfu.A01)) {
                C1x1 A0O = 7zP.A0O(cfu.A04);
                MutableLiveData mutableLiveData = cfu.A00;
                ?? obj = new Object();
                ((BwC) obj).A05 = false;
                ((BwC) obj).A04 = true;
                ((BwC) obj).A01 = "join_timeout";
                AbH.A1N(mutableLiveData, A0O, (BwC) obj);
                CFU.A00(cfu);
            }
        }
    }
}
