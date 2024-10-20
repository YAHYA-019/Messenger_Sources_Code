package X;

import com.facebook.messaging.business.inboxads.postclick.fragment.InboxAdsPostClickFragment;

/* loaded from: Erm.class */
public final class Erm {
    public final /* synthetic */ InboxAdsPostClickFragment A00;

    public Erm(InboxAdsPostClickFragment inboxAdsPostClickFragment) {
        this.A00 = inboxAdsPostClickFragment;
    }

    public void A00() {
        InboxAdsPostClickFragment inboxAdsPostClickFragment = this.A00;
        ((EqW) inboxAdsPostClickFragment.A09.get()).A04 = 0S2.A00;
        ((Ets) inboxAdsPostClickFragment.A01.get()).A00("postclick_user_action_ad_click", inboxAdsPostClickFragment.A03.A00.A0F);
        EiH eiH = (EiH) inboxAdsPostClickFragment.A0A.get();
        C52j c52j = C52j.A2Z;
        if (eiH.A00) {
            ((IPf) eiH.A01.get()).A00(c52j);
        }
    }
}
