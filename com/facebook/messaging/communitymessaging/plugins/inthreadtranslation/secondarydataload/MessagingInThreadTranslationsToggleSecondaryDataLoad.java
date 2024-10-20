package com.facebook.messaging.communitymessaging.plugins.inthreadtranslation.secondarydataload;

import X.11T;
import X.6iB;
import X.7PX;
import X.7PY;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: MessagingInThreadTranslationsToggleSecondaryDataLoad.class */
public final class MessagingInThreadTranslationsToggleSecondaryDataLoad {
    public final Context A00;
    public final FbUserSession A01;
    public final ThreadKey A02;
    public final 6iB A03;
    public final 7PY A04;

    public MessagingInThreadTranslationsToggleSecondaryDataLoad(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 6iB r305) {
        11T.A0F(context, 1);
        11T.A0F(threadKey, 2);
        11T.A0F(r305, 3);
        11T.A0F(fbUserSession, 4);
        this.A00 = context;
        this.A02 = threadKey;
        this.A03 = r305;
        this.A01 = fbUserSession;
        this.A04 = new 7PX(this);
    }
}
