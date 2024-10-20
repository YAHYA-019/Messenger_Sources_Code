package com.facebook.messaging.friending.intent;

import X.0fH;
import X.1Bq;
import X.1Br;
import X.7KN;
import X.7Ka;
import X.7zM;
import X.7zO;
import X.AbstractC00603o4;
import X.C1766As0;
import X.C3o5;
import X.RbM;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.friending.messenger.MessengerQPMoreDetailsActivity;

/* loaded from: MoreOptionsInSmallGroupRequestIntentHandler.class */
public final class MoreOptionsInSmallGroupRequestIntentHandler {
    public final 1Br A00 = 1Bq.A00(82491);

    public Intent A00(Context context, Intent intent) {
        Uri data;
        Long A02;
        String str;
        Intent intent2 = null;
        if (((7Ka) 1Br.A0B(this.A00)).A00() && (data = intent.getData()) != null && (A02 = RbM.A02(data)) != null) {
            long longValue = A02.longValue();
            C1766As0 c1766As0 = 7KN.A00;
            if (c1766As0 != null && (str = c1766As0.A02) != null) {
                Long A01 = RbM.A01(data);
                long A0C = 7zO.A0C(1Br.A03(7zM.A0e(context)));
                if (A01 == null || A01.longValue() != A0C) {
                    0fH.A0o("MoreInfoOptionsInSmallGroupRequestIntentHandler", AbstractC00603o4.A00(ActionId.RTMP_PACKET_RECEIVED));
                    return null;
                }
                int A00 = RbM.A00(data);
                intent2 = C3o5.A0D(context, MessengerQPMoreDetailsActivity.class);
                intent2.putExtra("short_name", str);
                intent2.putExtra("target_user_id", longValue);
                intent2.putExtra("entry_point", A00);
            }
        }
        return intent2;
    }
}
