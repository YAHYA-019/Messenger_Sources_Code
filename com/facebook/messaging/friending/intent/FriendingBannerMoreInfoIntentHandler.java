package com.facebook.messaging.friending.intent;

import X.0CW;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Br;
import X.1De;
import X.1HH;
import X.1Lo;
import X.4iI;
import X.7zO;
import X.AbF;
import X.AbI;
import X.AbstractC00603o4;
import X.AnonymousClass545;
import X.C1yg;
import X.C3o5;
import X.RbM;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.friending.messenger.MessengerQPMoreDetailsActivity;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: FriendingBannerMoreInfoIntentHandler.class */
public final class FriendingBannerMoreInfoIntentHandler {
    public final 1De A00;
    public final 1Br A01 = 1BK.A0C();

    public FriendingBannerMoreInfoIntentHandler(1De r302) {
        this.A00 = r302;
    }

    public Intent A00(Context context, Intent intent, FbUserSession fbUserSession) {
        Uri data;
        Long A0e;
        ThreadKey A02;
        Long A022;
        Intent intent2 = null;
        if (1Br.A07(this.A01).AZk(36322967919020158L) && (data = intent.getData()) != null) {
            Context A04 = AbI.A04(this.A00);
            11T.A0F(A04, 1);
            1HH A0Q = AbF.A0Q(A04, 67720);
            String queryParameter = data.getQueryParameter("thread_id");
            if (queryParameter != null && (A0e = 0CW.A0e(queryParameter)) != null) {
                long longValue = A0e.longValue();
                String queryParameter2 = data.getQueryParameter("thread_type");
                if (queryParameter2 != null) {
                    C1yg[] values = C1yg.values();
                    int i = 0;
                    int length = values.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        C1yg c1yg = values[i];
                        if (11T.A0O(c1yg.name(), queryParameter2)) {
                            int ordinal = c1yg.ordinal();
                            if (ordinal == 0) {
                                A02 = ((4iI) A0Q.get()).A02(longValue);
                            } else if (ordinal == 1) {
                                A0Q.get();
                                A02 = ThreadKey.A08(longValue);
                            } else if (ordinal == 17) {
                                A0Q.get();
                                A02 = ThreadKey.A03(longValue);
                            }
                            if (A02 != null && (A022 = RbM.A02(data)) != null) {
                                long longValue2 = A022.longValue();
                                AnonymousClass545 anonymousClass545 = (AnonymousClass545) 1Lo.A04(context, fbUserSession, (1BY) null, 49481);
                                String A03 = anonymousClass545.A02.A03(anonymousClass545.A02(A02));
                                if (A03 != null) {
                                    Long A01 = RbM.A01(data);
                                    long A0C = 7zO.A0C(fbUserSession);
                                    if (A01 == null || A01.longValue() != A0C) {
                                        0fH.A0o("FriendingBannerMoreInfoIntentHandler", AbstractC00603o4.A00(ActionId.RTMP_PACKET_RECEIVED));
                                        return null;
                                    }
                                    int A00 = RbM.A00(data);
                                    intent2 = C3o5.A0D(context, MessengerQPMoreDetailsActivity.class);
                                    intent2.putExtra("short_name", A03);
                                    intent2.putExtra("target_user_id", longValue2);
                                    intent2.putExtra("entry_point", A00);
                                }
                            }
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return intent2;
    }
}
