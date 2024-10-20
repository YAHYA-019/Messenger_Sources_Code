package com.facebook.messaging.data.repository.error.plugins.errordisplay.threadsettingslifecycle;

import X.1BL;
import X.1Br;
import X.1Bu;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: ThreadSettingsErrorDisplay.class */
public final class ThreadSettingsErrorDisplay {
    public final Context A00;
    public final LifecycleOwner A01;
    public final FbUserSession A02;
    public final 1Br A03;

    public ThreadSettingsErrorDisplay(Context context, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession) {
        1BL.A1H(fbUserSession, context, lifecycleOwner);
        this.A02 = fbUserSession;
        this.A00 = context;
        this.A01 = lifecycleOwner;
        this.A03 = 1Bu.A00(33208);
    }
}
