package com.facebook.messaging.aibot.plugins.core.threadsettings.aistudio.clickhandler;

import X.06Z;
import X.1BL;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadSettingsAiStudioClickHandler.class */
public final class ThreadSettingsAiStudioClickHandler {
    public final Context A00;
    public final 06Z A01;
    public final ThreadKey A02;

    public ThreadSettingsAiStudioClickHandler(Context context, 06Z r303, ThreadKey threadKey) {
        1BL.A1H(context, threadKey, r303);
        this.A00 = context;
        this.A02 = threadKey;
        this.A01 = r303;
    }
}
