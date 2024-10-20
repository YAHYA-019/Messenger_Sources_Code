package X;

import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.communityprofile.CommunityEditingProfileFragment;

/* renamed from: X.9ad, reason: invalid class name */
/* loaded from: 9ad.class */
public final class C9ad {
    public 9NN A00;
    public 8Jy A01;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.8Jy] */
    public C9ad() {
        ?? obj = new Object();
        ((8Jy) obj).A05 = null;
        ((8Jy) obj).A03 = null;
        ((8Jy) obj).A00 = null;
        ((8Jy) obj).A04 = null;
        ((8Jy) obj).A01 = null;
        ((8Jy) obj).A06 = null;
        ((8Jy) obj).A02 = null;
        this.A01 = obj;
    }

    public final void A00(String str, Long l) {
        8Jy r0 = this.A01;
        r0.A03 = str;
        r0.A00 = l;
        9NN r02 = this.A00;
        if (r02 != null) {
            CommunityEditingProfileFragment communityEditingProfileFragment = r02.A01;
            LithoView lithoView = communityEditingProfileFragment.A00;
            if (lithoView == null) {
                11T.A0L("lithoView");
                throw 0Q8.createAndThrow();
            }
            lithoView.A0y(CommunityEditingProfileFragment.A05(r02.A00, communityEditingProfileFragment));
        }
    }

    public final void A01(String str, Long l) {
        8Jy r0 = this.A01;
        r0.A04 = str;
        r0.A01 = l;
        9NN r02 = this.A00;
        if (r02 != null) {
            CommunityEditingProfileFragment communityEditingProfileFragment = r02.A01;
            LithoView lithoView = communityEditingProfileFragment.A00;
            if (lithoView == null) {
                11T.A0L("lithoView");
                throw 0Q8.createAndThrow();
            }
            lithoView.A0y(CommunityEditingProfileFragment.A05(r02.A00, communityEditingProfileFragment));
        }
    }
}
