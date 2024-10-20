package X;

import androidx.lifecycle.Observer;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Ca1.class */
public final class Ca1 implements Observer {
    public final /* synthetic */ C1553Al8 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public Ca1(C1553Al8 c1553Al8, String str, String str2, String str3, boolean z) {
        this.A00 = c1553Al8;
        this.A04 = z;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.fragment.app.Fragment, X.Al8] */
    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        ThreadSummary threadSummary = 7zU.A0N(obj).A00;
        if (threadSummary != null) {
            ?? r0 = this.A00;
            06Z r02 = r0.mFragmentManager;
            boolean z = this.A04;
            String str = this.A01;
            boolean A06 = C1553Al8.A06(r0, str, this.A02, z);
            11T.A0D(r02);
            CQN.A05(r02, threadSummary, this.A03, str, "community_invite_link_sheet", A06);
            7zR.A0W().A04(new CommunityMessagingLoggerModel(null, null, str, null, null, null, null, "invite_link_settings", "view_qr_code", "channel_list_menu", null, null));
        }
    }
}
