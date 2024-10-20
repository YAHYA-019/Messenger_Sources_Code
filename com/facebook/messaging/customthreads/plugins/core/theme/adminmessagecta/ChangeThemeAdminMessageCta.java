package com.facebook.messaging.customthreads.plugins.core.theme.adminmessagecta;

import X.06Z;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.5zD;
import X.7zT;
import android.content.Context;
import com.facebook.messaging.model.messages.AdminMessageCta;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ChangeThemeAdminMessageCta.class */
public final class ChangeThemeAdminMessageCta {
    public final 06Z A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 5zD A03;
    public final AdminMessageCta A04;
    public final ThreadKey A05;
    public final String A06;
    public final Context A07;

    public ChangeThemeAdminMessageCta(Context context, 06Z r303, 5zD r304, AdminMessageCta adminMessageCta, ThreadKey threadKey, String str) {
        11T.A0F(context, 1);
        7zT.A11(2, adminMessageCta, threadKey, r304, r303);
        this.A07 = context;
        this.A04 = adminMessageCta;
        this.A06 = str;
        this.A05 = threadKey;
        this.A03 = r304;
        this.A00 = r303;
        this.A02 = 1Bu.A00(68191);
        this.A01 = 1Bq.A00(50079);
    }
}
