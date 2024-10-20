package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.communitymessaging.model.CommunityChannelPrivacyType;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: Cj5.class */
public final class Cj5 implements DEu {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ Intent A03;
    public final /* synthetic */ ViewGroup A04;
    public final /* synthetic */ 06Z A05;
    public final /* synthetic */ FbUserSession A06;
    public final /* synthetic */ DGl A07;
    public final /* synthetic */ CQc A08;
    public final /* synthetic */ boolean A09;

    public Cj5(Context context, Intent intent, ViewGroup viewGroup, 06Z r305, FbUserSession fbUserSession, DGl dGl, CQc cQc, long j, long j2, boolean z) {
        this.A08 = cQc;
        this.A02 = context;
        this.A04 = viewGroup;
        this.A05 = r305;
        this.A07 = dGl;
        this.A03 = intent;
        this.A06 = fbUserSession;
        this.A01 = j;
        this.A00 = j2;
        this.A09 = z;
    }

    @Override // X.DEu
    public void CHT(Community community) {
        String queryParameter;
        if (community != null) {
            CQc cQc = this.A08;
            Context context = this.A02;
            ViewGroup viewGroup = this.A04;
            DGl dGl = this.A07;
            Intent intent = this.A03;
            FbUserSession fbUserSession = this.A06;
            long j = this.A01;
            long j2 = this.A00;
            boolean z = this.A09;
            if (CQc.A07(viewGroup, cQc, community.A0a)) {
                return;
            }
            Uri data = intent.getData();
            String str = null;
            String queryParameter2 = data != null ? data.getQueryParameter("parent_surface") : null;
            if (!11T.A0O(queryParameter2, "admin_autocreate_chat_interstitial")) {
                11T.A0A(community.A0W);
                CQc.A03(context, fbUserSession, dGl, cQc, community, (String) null, (String) null, false);
            }
            Uri data2 = intent.getData();
            int chatPrivacy = (data2 == null || (queryParameter = data2.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) == null) ? CommunityChannelPrivacyType.PUBLIC.getChatPrivacy() : Integer.parseInt(queryParameter);
            Uri data3 = intent.getData();
            if (data3 != null) {
                str = data3.getQueryParameter(Property.SYMBOL_Z_ORDER_SOURCE);
            }
            CQc.A01(context, intent, viewGroup, cQc, str, queryParameter2, chatPrivacy, j, j2, z);
        }
    }
}
