package com.facebook.messaging.communitymessaging.plugins.requesttojoin.requesttojoincommunityheader;

import X.06Z;
import X.0QD;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Um;
import X.22I;
import X.7zP;
import X.Aax;
import X.AbG;
import X.AbI;
import X.AbJ;
import X.AbM;
import X.AnonymousClass001;
import X.C00i;
import X.C2lh;
import X.CIy;
import X.CPj;
import X.CjA;
import X.RsX;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.messaging.data.communitymessaging.memberlist.model.CommunityMemberListSource;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.util.List;

/* loaded from: RequestToJoinCommunityHeaderImplementation.class */
public final class RequestToJoinCommunityHeaderImplementation {
    public final Context A00;
    public final Fragment A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final Aax A06;
    public final CommunityExtraData A07;
    public final MigColorScheme A08;
    public final ParcelableSecondaryData A09;
    public final List A0A;
    public final 06Z A0B;

    public RequestToJoinCommunityHeaderImplementation(Context context, 06Z r303, FbUserSession fbUserSession, MigColorScheme migColorScheme, ParcelableSecondaryData parcelableSecondaryData, List list) {
        List A0A;
        Fragment fragment;
        1BL.A1H(context, fbUserSession, migColorScheme);
        11T.A0F(list, 5);
        this.A00 = context;
        this.A02 = fbUserSession;
        this.A08 = migColorScheme;
        this.A09 = parcelableSecondaryData;
        this.A0A = list;
        this.A0B = r303;
        this.A03 = AbG.A0a();
        this.A04 = 1Bu.A01(context, 82784);
        CommunityExtraData A0R = AbJ.A0R(parcelableSecondaryData);
        if (A0R == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A07 = A0R;
        this.A05 = 1Bq.A00(82448);
        if (r303 == null || (A0A = r303.A0T.A0A()) == null || (fragment = (Fragment) 0QD.A0F(A0A)) == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = fragment;
        this.A06 = new CjA(this);
    }

    public static final void A00(C2lh c2lh, RequestToJoinCommunityHeaderImplementation requestToJoinCommunityHeaderImplementation) {
        boolean z = !7zP.A1V(c2lh);
        C00i c00i = requestToJoinCommunityHeaderImplementation.A04.A00;
        CIy cIy = (CIy) c00i.get();
        CommunityExtraData communityExtraData = requestToJoinCommunityHeaderImplementation.A07;
        String str = communityExtraData.A06;
        long parseLong = Long.parseLong(str);
        long j = communityExtraData.A00;
        int i = 2;
        if (!z) {
            i = 1;
        }
        22I A0C = AbI.A0C(cIy.A00);
        long A06 = AbM.A06(j, parseLong);
        1Um AQV = A0C.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new RsX(A0C, A0P, i, A06), A0P, false);
        if (!z) {
            ((CIy) c00i.get()).A04(CommunityMemberListSource.A0K, Long.parseLong(str), j);
        }
        c2lh.A02(Boolean.valueOf(z));
        AbJ.A0O(((CPj) 1Br.A0B(requestToJoinCommunityHeaderImplementation.A05)).A00).A04(new CommunityMessagingLoggerModel(null, null, String.valueOf(j), str, null, null, null, "member_requests", z ? "enable_require_approval_to_join" : "disable_require_approval_to_join", "community_settings", null, null));
    }
}
