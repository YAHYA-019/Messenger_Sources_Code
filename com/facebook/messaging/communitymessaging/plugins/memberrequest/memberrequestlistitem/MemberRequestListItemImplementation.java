package com.facebook.messaging.communitymessaging.plugins.memberrequest.memberrequestlistitem;

import X.06Z;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.AbG;
import X.AbJ;
import X.AbN;
import X.C1296Ad8;
import X.D55;
import android.content.Context;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: MemberRequestListItemImplementation.class */
public final class MemberRequestListItemImplementation {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final D55 A05;
    public final MigColorScheme A06;
    public final ParcelableSecondaryData A07;
    public final CommunityExtraData A08;

    public MemberRequestListItemImplementation(Context context, 06Z r303, D55 d55, MigColorScheme migColorScheme, ParcelableSecondaryData parcelableSecondaryData) {
        CommunityExtraData A0L;
        11T.A0F(migColorScheme, 2);
        this.A00 = context;
        this.A06 = migColorScheme;
        this.A01 = r303;
        this.A07 = parcelableSecondaryData;
        this.A05 = d55;
        this.A04 = 1Bu.A01(context, 67784);
        this.A03 = 1Bu.A01(context, 82784);
        this.A02 = AbG.A0c();
        if (parcelableSecondaryData == null || (A0L = AbN.A0L(parcelableSecondaryData)) == null) {
            throw 1BK.A0h();
        }
        this.A08 = A0L;
    }

    public static final void A00(MemberRequestListItemImplementation memberRequestListItemImplementation, String str, String str2) {
        C1296Ad8 A0O = AbJ.A0O(memberRequestListItemImplementation.A02);
        CommunityExtraData communityExtraData = memberRequestListItemImplementation.A08;
        A0O.A04(new CommunityMessagingLoggerModel(null, null, String.valueOf(communityExtraData.A00), communityExtraData.A06, null, null, str, "member_requests", str2, "messenger", null, null));
    }
}
