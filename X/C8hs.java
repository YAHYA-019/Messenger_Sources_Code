package X;

import android.view.View;
import com.facebook.messaging.communitymessaging.invitelink.joinv2.graphqlfetcher.JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData;
import com.facebook.messaging.communitymessaging.invitelink.model.CommunityMessagingInviteLinkData;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8hs, reason: invalid class name */
/* loaded from: 8hs.class */
public final class C8hs extends 1LH {
    public final View.OnClickListener A00;
    public final 9VA A01;
    public final JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData A02;
    public final MigColorScheme A03;
    public final boolean A04;
    public final boolean A05;
    public final CommunityMessagingInviteLinkData A06;

    public C8hs(View.OnClickListener onClickListener, 9VA r303, JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData joinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData, CommunityMessagingInviteLinkData communityMessagingInviteLinkData, MigColorScheme migColorScheme, boolean z, boolean z2) {
        11T.A0F(migColorScheme, 3);
        this.A06 = communityMessagingInviteLinkData;
        this.A03 = migColorScheme;
        this.A05 = z;
        this.A01 = r303;
        this.A00 = onClickListener;
        this.A04 = z2;
        this.A02 = joinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r301.A04 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String A01(X.C2k6 r302, X.C96j r303, boolean r304, boolean r305, boolean r306) {
        /*
            r301 = this;
            r0 = 2131958452(0x7f131ab4, float:1.9553517E38)
            r307 = r0
            r0 = r304
            if (r0 != 0) goto L1c
            r0 = r306
            if (r0 == 0) goto L27
            r0 = r301
            boolean r0 = r0.A04
            r308 = r0
            r0 = 2131958420(0x7f131a94, float:1.9553452E38)
            r307 = r0
            r0 = r308
            if (r0 == 0) goto L20
        L1c:
            r0 = 2131958416(0x7f131a90, float:1.9553444E38)
            r307 = r0
        L20:
            r0 = r302
            r1 = r307
            java.lang.String r0 = X.3yH.A09(r0, r1)
            return r0
        L27:
            X.96j r0 = X.C96j.A02
            r309 = r0
            r0 = r303
            r1 = r309
            if (r0 != r1) goto L42
            r0 = 2131958417(0x7f131a91, float:1.9553446E38)
            r307 = r0
            r0 = r305
            if (r0 == 0) goto L20
            r0 = 2131958421(0x7f131a95, float:1.9553454E38)
            r307 = r0
            goto L20
        L42:
            X.96j r0 = X.C96j.A04
            r309 = r0
            r0 = r303
            r1 = r309
            if (r0 != r1) goto L20
            r0 = 2131958451(0x7f131ab3, float:1.9553515E38)
            r307 = r0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8hs.A01(X.2k6, X.96j, boolean, boolean, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r303 == com.facebook.messaging.communitymessaging.model.CommunityMessagingFbGroupType.A02) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String A0L(X.C2k6 r302, com.facebook.messaging.communitymessaging.model.CommunityMessagingFbGroupType r303) {
        /*
            r301 = this;
            com.facebook.messaging.communitymessaging.model.CommunityMessagingFbGroupType r0 = com.facebook.messaging.communitymessaging.model.CommunityMessagingFbGroupType.A03
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L5d
            r0 = 2131958444(0x7f131aac, float:1.95535E38)
            r305 = r0
        Ld:
            r0 = r302
            r1 = r305
            java.lang.String r0 = X.3yH.A09(r0, r1)
            r306 = r0
            r0 = r302
            r1 = 2131958444(0x7f131aac, float:1.95535E38)
            java.lang.String r0 = X.3yH.A09(r0, r1)
            r307 = r0
            r0 = r306
            r1 = r307
            boolean r0 = X.11T.A0O(r0, r1)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L5a
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L3f
            com.facebook.messaging.communitymessaging.model.CommunityMessagingFbGroupType r0 = com.facebook.messaging.communitymessaging.model.CommunityMessagingFbGroupType.A02
            r309 = r0
            r0 = 2131958437(0x7f131aa5, float:1.9553486E38)
            r308 = r0
            r0 = r303
            r1 = r309
            if (r0 != r1) goto L43
        L3f:
            r0 = 2131958457(0x7f131ab9, float:1.9553527E38)
            r308 = r0
        L43:
            r0 = r302
            r1 = r308
            java.lang.String r0 = X.3yH.A09(r0, r1)
            r309 = r0
            java.lang.String r0 = " · "
            r307 = r0
            r0 = r309
            r1 = r307
            r2 = r306
            java.lang.String r0 = X.0Pz.A0j(r0, r1, r2)
            r306 = r0
        L5a:
            r0 = r306
            return r0
        L5d:
            r0 = r301
            boolean r0 = r0.A05
            r308 = r0
            r0 = 2131958442(0x7f131aaa, float:1.9553496E38)
            r305 = r0
            r0 = r308
            if (r0 == 0) goto Ld
            r0 = 2131958439(0x7f131aa7, float:1.955349E38)
            r305 = r0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8hs.A0L(X.2k6, com.facebook.messaging.communitymessaging.model.CommunityMessagingFbGroupType):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x06fe, code lost:
    
        if (r0 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x005d, code lost:
    
        if (r0.A07 == r0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0s(X.C2k5 r302) {
        /*
            Method dump skipped, instructions count: 2766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8hs.A0s(X.2k5):X.1LI");
    }
}
