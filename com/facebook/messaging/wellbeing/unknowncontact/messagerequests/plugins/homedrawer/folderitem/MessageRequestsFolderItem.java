package com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.homedrawer.folderitem;

import X.11T;
import X.1Br;
import X.1Lm;
import X.2OV;
import X.C4Vr;
import X.C4Xo;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: MessageRequestsFolderItem.class */
public final class MessageRequestsFolderItem {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 2OV A03;
    public final C4Xo A04;

    public MessageRequestsFolderItem(Context context, FbUserSession fbUserSession, C4Xo c4Xo) {
        11T.A0F(context, 1);
        11T.A0F(c4Xo, 2);
        11T.A0F(fbUserSession, 3);
        this.A00 = context;
        this.A04 = c4Xo;
        this.A01 = fbUserSession;
        this.A02 = 1Lm.A00(context, fbUserSession, 67931);
        this.A03 = new C4Vr(this, 1);
    }
}
