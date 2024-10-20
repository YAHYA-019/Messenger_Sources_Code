package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: D4e.class */
public final class D4e implements 1K9 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ CHl A03;
    public final /* synthetic */ Ct1 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public D4e(Context context, FbUserSession fbUserSession, CHl cHl, Ct1 ct1, String str, String str2, long j, boolean z) {
        this.A03 = cHl;
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = ct1;
        this.A07 = z;
        this.A00 = j;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        C1296Ad8.A02(7zR.A0W(), new CommunityMessagingLoggerModel(null, null, String.valueOf(this.A00), null, null, null, null, "direct_invite_sheet", "send_direct_invite_message_failure", null, null, 1BK.A1D("direct_invite_message_failure_reason", 0Pz.A0W(th.getMessage(), " can not find cutover threadkey"))), null);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ThreadKey threadKey = (ThreadKey) obj;
        if (threadKey != null) {
            Context context = this.A01;
            FbUserSession fbUserSession = this.A02;
            String str = this.A06;
            String str2 = this.A05;
            Ct1 ct1 = this.A04;
            boolean z = this.A07;
            CHl.A00(context, fbUserSession, threadKey, ct1, 0Pz.A0Y(str, str2, ' '), str2, this.A00, z);
        }
    }
}
