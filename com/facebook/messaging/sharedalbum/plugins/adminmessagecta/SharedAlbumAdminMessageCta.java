package com.facebook.messaging.sharedalbum.plugins.adminmessagecta;

import X.06Z;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.AdminMessageCta;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: SharedAlbumAdminMessageCta.class */
public final class SharedAlbumAdminMessageCta {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final AdminMessageCta A05;
    public final ThreadKey A06;
    public final String A07;

    public SharedAlbumAdminMessageCta(Context context, 06Z r303, FbUserSession fbUserSession, AdminMessageCta adminMessageCta, ThreadKey threadKey, String str) {
        1BL.A1H(context, fbUserSession, threadKey);
        1BL.A1G(adminMessageCta, r303);
        this.A00 = context;
        this.A02 = fbUserSession;
        this.A06 = threadKey;
        this.A07 = str;
        this.A05 = adminMessageCta;
        this.A01 = r303;
        this.A04 = 1Bq.A00(16456);
        this.A03 = 1Bu.A00(68433);
    }
}
