package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: DA2.class */
public final class DA2 implements Runnable {
    public static final String __redex_internal_original_name = "CommunityProfileComponentSpec$onCreateInitialState$1";
    public final /* synthetic */ LifecycleOwner A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ 1Iw A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ ParcelableSecondaryData A04;

    public DA2(LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, 1Iw r304, User user, ParcelableSecondaryData parcelableSecondaryData) {
        this.A02 = r304;
        this.A01 = fbUserSession;
        this.A03 = user;
        this.A04 = parcelableSecondaryData;
        this.A00 = lifecycleOwner;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        String str3;
        1Iw r0 = this.A02;
        FbUserSession fbUserSession = this.A01;
        User user = this.A03;
        ParcelableSecondaryData parcelableSecondaryData = this.A04;
        LifecycleOwner lifecycleOwner = this.A00;
        Community community = (Community) ParcelableSecondaryData.A00(parcelableSecondaryData, Community.class, null);
        Long A0n = (community == null || (str3 = community.A0T) == null) ? null : 1BK.A0n(str3);
        Context context = r0.A0D;
        C1I c1i = (C1I) 7zN.A0k(context, 83066);
        String str4 = user.A13;
        CaE.A03(lifecycleOwner, c1i.A00(context, fbUserSession, A0n, 4YV.A0j(), AbG.A03(str4)), r0, 35);
        Community community2 = (Community) ParcelableSecondaryData.A00(parcelableSecondaryData, Community.class, null);
        Long l = null;
        Long A0n2 = (community2 == null || (str2 = community2.A0T) == null) ? null : 1BK.A0n(str2);
        Community community3 = (Community) ParcelableSecondaryData.A00(parcelableSecondaryData, Community.class, null);
        if (community3 != null && (str = community3.A0U) != null) {
            l = 1BK.A0n(str);
        }
        AdC adC = (AdC) 1Lm.A05(context, fbUserSession, 82391);
        MutableLiveData A0H = 7zL.A0H();
        adC.A01 = A0H;
        adC.A04(context, A0n2, l, AbG.A03(str4), 0L);
        CaE.A03(lifecycleOwner, A0H, r0, 34);
    }
}
