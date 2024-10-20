package com.facebook.messaging.montage.msys.plugins.storiesthreadviewdata;

import X.0CU;
import X.0fH;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.6iB;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: StoriesThreadViewData.class */
public final class StoriesThreadViewData {
    public final 1Br A00;
    public final 1Br A01;
    public final 6iB A02;
    public final AtomicBoolean A03;
    public final Context A04;

    public StoriesThreadViewData(Context context, FbUserSession fbUserSession, 6iB r304) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(r304, 3);
        this.A04 = context;
        this.A02 = r304;
        this.A00 = 1Lm.A00(context, fbUserSession, 33203);
        this.A01 = 1Bq.A00(16467);
        this.A03 = new AtomicBoolean(false);
    }

    public static final Long A00(String str) {
        Long l = null;
        try {
            boolean z = false;
            if (0CU.A0O(str)) {
                z = true;
            }
            if (!z) {
                l = Long.valueOf(Long.parseLong(str));
            }
            return l;
        } catch (NumberFormatException e) {
            0fH.A0s("StoriesThreadViewData", "Story ID is not a number", e);
            return null;
        }
    }
}
