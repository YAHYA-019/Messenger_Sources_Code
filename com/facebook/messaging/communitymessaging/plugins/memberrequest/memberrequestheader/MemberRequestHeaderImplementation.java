package com.facebook.messaging.communitymessaging.plugins.memberrequest.memberrequestheader;

import X.06Z;
import X.0QD;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.AbJ;
import X.AnonymousClass001;
import X.Cj9;
import X.DI1;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.messaging.communitymessaging.model.MemberRequestApprovalSetting;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.util.List;

/* loaded from: MemberRequestHeaderImplementation.class */
public final class MemberRequestHeaderImplementation {
    public static CommunityExtraData A0A;
    public static MemberRequestApprovalSetting A0B;
    public final Context A00;
    public final Fragment A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final DI1 A05;
    public final CommunityExtraData A06;
    public final MigColorScheme A07;
    public final 06Z A08;
    public final ParcelableSecondaryData A09;

    public MemberRequestHeaderImplementation(Context context, 06Z r303, FbUserSession fbUserSession, MigColorScheme migColorScheme, ParcelableSecondaryData parcelableSecondaryData) {
        List A0A2;
        Fragment fragment;
        11T.A0F(migColorScheme, 3);
        this.A00 = context;
        this.A02 = fbUserSession;
        this.A07 = migColorScheme;
        this.A09 = parcelableSecondaryData;
        this.A08 = r303;
        this.A03 = 1Bu.A01(context, 82784);
        this.A04 = 1Bq.A00(82448);
        CommunityExtraData A0R = AbJ.A0R(parcelableSecondaryData);
        if (A0R == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A06 = A0R;
        if (r303 == null || (A0A2 = r303.A0T.A0A()) == null || (fragment = (Fragment) 0QD.A0F(A0A2)) == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = fragment;
        this.A05 = new Cj9(this);
    }
}
