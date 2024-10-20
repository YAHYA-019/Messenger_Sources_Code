package com.facebook.messaging.friending.intent;

import X.11T;
import X.1BJ;
import X.7zL;
import X.7zQ;
import X.7zT;
import X.AbK;
import X.BTj;
import X.C01643sd;
import X.C1723Aqt;
import X.D4q;
import X.DgU;
import android.content.Context;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: FriendRequestHomeIntentHandler.class */
public final class FriendRequestHomeIntentHandler {
    public static final void A00(Context context, String str) {
        BTj bTj = new BTj();
        GraphQlCallInput dgU = new DgU(43);
        dgU.A0A("notif_ids", 11T.A03(str));
        dgU.A09("environment", "MAIN_SURFACE");
        dgU.A09(Property.SYMBOL_Z_ORDER_SOURCE, "msgr_friend_request_notif");
        dgU.A09(1BJ.A00(580), "MARK_READ");
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A01(dgU, "input");
        D4q.A02(AbK.A0K(context).A01().A09(7zT.A0B(A0M, new C01643sd(C1723Aqt.class, "MSGNotificationsUpdateSeenOrReadMutation", null, "input", "fbandroid", -841089725, 192, 4131073646L, 4131073646L, false, true))), bTj, 7zQ.A15(), 34);
    }
}
