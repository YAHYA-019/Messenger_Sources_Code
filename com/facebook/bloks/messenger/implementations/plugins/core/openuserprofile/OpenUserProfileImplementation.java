package com.facebook.bloks.messenger.implementations.plugins.core.openuserprofile;

import X.06Z;
import X.11T;
import X.1BK;
import X.1Bn;
import X.1Bu;
import X.1F9;
import X.7XU;
import X.7zN;
import X.7zR;
import X.AbF;
import X.AbG;
import X.AnonymousClass016;
import X.C1296Ad8;
import X.C2050DaD;
import X.C3R9;
import X.C6a;
import X.DKc;
import X.Fwk;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.profile.logging.ContextualProfileLoggingData;
import com.google.common.collect.RegularImmutableMap;
import java.util.List;

/* loaded from: OpenUserProfileImplementation.class */
public final class OpenUserProfileImplementation {
    public final Object A00(Fwk fwk, DKc dKc) {
        06Z BDe;
        11T.A0F(fwk, 0);
        List list = dKc.A00;
        Object obj = list.get(0);
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = list.get(1);
        11T.A0I(obj2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj2;
        Object obj3 = list.get(2);
        11T.A0I(obj3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) obj3;
        ThreadKey A07 = ThreadKey.A07(Long.parseLong(str2));
        if (fwk instanceof C2050DaD) {
            BDe = ((C2050DaD) fwk).A02;
        } else {
            FragmentActivity fragmentActivity = (FragmentActivity) AnonymousClass016.A00(fwk.A00, FbFragmentActivity.class);
            if (fragmentActivity == null) {
                return null;
            }
            BDe = fragmentActivity.BDe();
        }
        User A0d = 7zN.A0d(AbF.A0y(), str);
        Context context = fwk.A00;
        7XU r0 = (7XU) 1Bu.A06(context, 50218);
        C1296Ad8 A0W = 7zR.A0W();
        C6a c6a = (C6a) 1Bn.A0A(83119);
        String str4 = A0d.A13;
        A0W.A04(new CommunityMessagingLoggerModel(null, null, str2, str3, null, str4, "community_member_profile", "activity_log", "render_profile_menu", "messenger", null, null));
        if (str4 == null) {
            throw 1BK.A0h();
        }
        c6a.A01(str4);
        ContextualProfileLoggingData contextualProfileLoggingData = new ContextualProfileLoggingData(A07, RegularImmutableMap.A03, "", "", false);
        06Z r2 = BDe;
        r0.A03(context, r2, 1F9.A0C, A07, A0d, AbG.A0w(new CommunityExtraData(false, null, null, null, str3, null, Long.parseLong(str2)), new C3R9()), contextualProfileLoggingData);
        return null;
    }
}
