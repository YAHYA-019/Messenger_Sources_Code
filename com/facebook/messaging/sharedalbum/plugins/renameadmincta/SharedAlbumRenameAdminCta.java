package com.facebook.messaging.sharedalbum.plugins.renameadmincta;

import X.06Z;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.AdminMessageCta;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: SharedAlbumRenameAdminCta.class */
public final class SharedAlbumRenameAdminCta {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final AdminMessageCta A04;
    public final ThreadKey A05;
    public final String A06;
    public final 06Z A07;

    public SharedAlbumRenameAdminCta(Context context, 06Z r303, FbUserSession fbUserSession, AdminMessageCta adminMessageCta, ThreadKey threadKey, String str) {
        1BL.A1H(context, fbUserSession, threadKey);
        1BL.A1G(adminMessageCta, r303);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A05 = threadKey;
        this.A06 = str;
        this.A04 = adminMessageCta;
        this.A07 = r303;
        this.A03 = 1Bq.A00(16456);
        this.A02 = 1Bu.A00(68433);
    }
}
