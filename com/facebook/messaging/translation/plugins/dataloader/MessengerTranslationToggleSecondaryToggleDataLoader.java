package com.facebook.messaging.translation.plugins.dataloader;

import X.11T;
import X.1Bn;
import X.1Lm;
import X.6iB;
import X.7PY;
import X.7Pa;
import X.7Pn;
import X.C5jj;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: MessengerTranslationToggleSecondaryToggleDataLoader.class */
public final class MessengerTranslationToggleSecondaryToggleDataLoader {
    public final ThreadKey A00;
    public final 6iB A01;
    public final 7PY A02;
    public final Context A03;
    public final FbUserSession A04;

    public MessengerTranslationToggleSecondaryToggleDataLoader(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 6iB r305) {
        11T.A0F(context, 1);
        11T.A0F(threadKey, 2);
        11T.A0F(r305, 3);
        11T.A0F(fbUserSession, 4);
        this.A03 = context;
        this.A00 = threadKey;
        this.A01 = r305;
        this.A04 = fbUserSession;
        this.A02 = new 7Pn(this);
    }

    public static final 7Pa A00(MessengerTranslationToggleSecondaryToggleDataLoader messengerTranslationToggleSecondaryToggleDataLoader) {
        if (!((C5jj) 1Bn.A0A(68348)).A01()) {
            return null;
        }
        return (7Pa) 1Lm.A05(messengerTranslationToggleSecondaryToggleDataLoader.A03, messengerTranslationToggleSecondaryToggleDataLoader.A04, 81934);
    }
}
