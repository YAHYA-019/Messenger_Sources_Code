package com.facebook.messaging.threads.intents.intentskt;

import X.1Br;
import X.1De;
import X.7zM;
import X.9XS;
import android.content.Intent;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ArmadilloGroupJidIntentHandler.class */
public final class ArmadilloGroupJidIntentHandler {
    public final 1Br A00;
    public final 1De A01;

    public ArmadilloGroupJidIntentHandler(1De r302) {
        this.A01 = r302;
        this.A00 = 7zM.A0h(r302, 67491);
    }

    public static final ThreadKey A00(Intent intent, FbUserSession fbUserSession, ArmadilloGroupJidIntentHandler armadilloGroupJidIntentHandler) {
        String queryParameter;
        Uri data = intent.getData();
        ThreadKey threadKey = null;
        if (data != null && (queryParameter = data.getQueryParameter("thread_jid")) != null) {
            Number number = (Number) ((9XS) 1Br.A0B(armadilloGroupJidIntentHandler.A00)).A00(fbUserSession, Long.parseLong(queryParameter)).get();
            if (number != null) {
                threadKey = ThreadKey.A01(number.longValue());
            }
        }
        return threadKey;
    }
}
