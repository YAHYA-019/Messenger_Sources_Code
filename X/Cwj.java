package X;

import android.view.View;
import com.facebook.graphql.enums.GraphQLEventsLoggerActionMechanism;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: Cwj.class */
public final class Cwj implements AnonymousClass553 {
    public final 1Iw A00;
    public final C1769As3 A01;
    public final ThreadKey A02;

    public Cwj(1Iw r302, C1769As3 c1769As3, ThreadKey threadKey) {
        11T.A0F(r302, 1);
        this.A00 = r302;
        this.A02 = threadKey;
        this.A01 = c1769As3;
    }

    @Override // X.AnonymousClass553
    public void onClick(View view) {
        11T.A0F(view, 0);
        C1296Ad8 A0W = 7zR.A0W();
        String A0w = 1BK.A0w(this.A02);
        long j = this.A01.A00;
        A0W.A04(new CommunityMessagingLoggerModel(null, null, null, null, A0w, null, null, "event_list", "transition_to_fb_group", null, null, 1BK.A1D("event_id", String.valueOf(j))));
        7zU.A0R().A0E(this.A00.A0D, BTh.A00(GraphQLEventsLoggerActionMechanism.A02, "SOCIAL_CHANNEL", j));
    }
}
