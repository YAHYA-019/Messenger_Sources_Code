package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.model.Community;

/* loaded from: D7a.class */
public final class D7a implements Runnable {
    public static final String __redex_internal_original_name = "RequestToJoinDialogUtils$fetchMemberRequestCount$1$onResult$1";
    public final /* synthetic */ CHW A00;
    public final /* synthetic */ boolean A01;

    public D7a(CHW chw, boolean z) {
        this.A00 = chw;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        CHW chw = this.A00;
        FbUserSession fbUserSession = chw.A03;
        Context context = chw.A01;
        C1284Aco c1284Aco = (C1284Aco) 1Lm.A05(context, fbUserSession, 82370);
        long j = chw.A00;
        LiveData A00 = c1284Aco.A00(j);
        boolean z = this.A01;
        Community community = (Community) A00.getValue();
        int i = community != null ? community.A0B : 0;
        CPj cPj = (CPj) 1Br.A0B(chw.A07);
        String valueOf = String.valueOf(j);
        String str3 = chw.A09;
        C1296Ad8 A0O = AbJ.A0O(cPj.A00);
        if (z) {
            str = "approve_all_button";
            str2 = "approve_all_initiated";
        } else {
            str = "decline_all_button";
            str2 = "decline_all_initiated";
        }
        A0O.A04(new CommunityMessagingLoggerModel(null, null, valueOf, str3, null, null, str, "manage_members_requests_menu", str2, "member_requests", null, null));
        1Br.A0C(chw.A04);
        DR6 A01 = C5ic.A01(context, chw.A08);
        Resources resources = context.getResources();
        int i2 = 2131820592;
        if (z) {
            i2 = 2131820562;
        }
        A01.A03(4YV.A0o(resources, i, i2));
        int i3 = 2131959031;
        if (z) {
            i3 = 2131959030;
        }
        A01.A0J(context.getString(i3));
        int i4 = 2131955602;
        if (z) {
            i4 = 2131952869;
        }
        A01.A0D(new CR1(2, chw, z), i4);
        A01.A0B(CS0.A00, 2131954797);
        7zN.A13(A01);
    }
}
