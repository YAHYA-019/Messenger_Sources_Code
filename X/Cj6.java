package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.communitymessaging.model.CommunityChannelPrivacyType;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: Cj6.class */
public final class Cj6 implements DEu {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ Intent A04;
    public final /* synthetic */ ViewGroup A05;
    public final /* synthetic */ 06Z A06;
    public final /* synthetic */ FbUserSession A07;
    public final /* synthetic */ DGl A08;
    public final /* synthetic */ CQc A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    public Cj6(Context context, Intent intent, ViewGroup viewGroup, 06Z r305, FbUserSession fbUserSession, DGl dGl, CQc cQc, String str, long j, long j2, long j3, boolean z) {
        this.A09 = cQc;
        this.A03 = context;
        this.A05 = viewGroup;
        this.A06 = r305;
        this.A08 = dGl;
        this.A07 = fbUserSession;
        this.A04 = intent;
        this.A02 = j;
        this.A00 = j2;
        this.A0B = z;
        this.A01 = j3;
        this.A0A = str;
    }

    @Override // X.DEu
    public void CHT(Community community) {
        String queryParameter;
        if (community != null) {
            CQc cQc = this.A09;
            Context context = this.A03;
            ViewGroup viewGroup = this.A05;
            06Z r0 = this.A06;
            DGl dGl = this.A08;
            FbUserSession fbUserSession = this.A07;
            Intent intent = this.A04;
            long j = this.A02;
            long j2 = this.A00;
            boolean z = this.A0B;
            long j3 = this.A01;
            String str = this.A0A;
            if (CQc.A07(viewGroup, cQc, community.A0a) || !C0D1.A01(r0)) {
                return;
            }
            11T.A0A(community.A0W);
            Uri data = intent.getData();
            String str2 = null;
            String queryParameter2 = data != null ? data.getQueryParameter("parent_surface") : null;
            Uri data2 = intent.getData();
            CQc.A03(context, fbUserSession, dGl, cQc, community, queryParameter2, data2 != null ? data2.getQueryParameter(Property.SYMBOL_Z_ORDER_SOURCE) : null, false);
            CommunityMessagingLoggerModel communityMessagingLoggerModel = (CommunityMessagingLoggerModel) intent.getParcelableExtra("logger");
            if (communityMessagingLoggerModel == null) {
                communityMessagingLoggerModel = new CommunityMessagingLoggerModel(null, null, String.valueOf(j2), String.valueOf(j), null, null, null, "messenger", null, null, null, null);
            }
            1BY r02 = cQc.A01.A00;
            C1296Ad8.A01(intent, r02, (C1296Ad8) 1Bn.A0E((Context) null, r02, 83118), communityMessagingLoggerModel);
            Uri data3 = intent.getData();
            String queryParameter3 = data3 != null ? data3.getQueryParameter("parent_surface") : null;
            if (11T.A0O(queryParameter3, "admin_nux_gc_interstitial") && community.A01 > 0) {
                Uri data4 = intent.getData();
                int chatPrivacy = (data4 == null || (queryParameter = data4.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) == null) ? CommunityChannelPrivacyType.PUBLIC.getChatPrivacy() : Integer.parseInt(queryParameter);
                Uri data5 = intent.getData();
                if (data5 != null) {
                    str2 = data5.getQueryParameter(Property.SYMBOL_Z_ORDER_SOURCE);
                }
                CQc.A01(context, intent, viewGroup, cQc, str2, queryParameter3, chatPrivacy, j, j2, z);
            }
            if (j3 > 0) {
                1Bi.A03(147560);
                CP0 A00 = CP0.A00("com.bloks.www.msg.cm.scheduledconversations.details.bottomsheet");
                A00.A05("group_id", String.valueOf(j));
                A00.A05("event_id", String.valueOf(j3));
                A00.A05(Property.SYMBOL_Z_ORDER_SOURCE, str);
                DKT.A05(context, r0, 7zQ.A0P(), A00.A03(), 85, 50);
            }
        }
    }
}
