package com.facebook.messaging.omnipicker.plugins.threadhostprovider.msys.forthreadkey;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: MsysThreadHostForThreadKeyProvider.class */
public final class MsysThreadHostForThreadKeyProvider {
    public final Context A00;
    public final FbUserSession A01;
    public final ThreadKey A02;

    public MsysThreadHostForThreadKeyProvider(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A02 = threadKey;
        this.A00 = context;
        this.A01 = fbUserSession;
    }
}
