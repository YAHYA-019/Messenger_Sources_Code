package com.facebook.rtc.plugins.calllifecycle.roommetadata;

import X.1BL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: RoomMetadataCallLifecycle.class */
public final class RoomMetadataCallLifecycle {
    public final Context A00;
    public final FbUserSession A01;

    public RoomMetadataCallLifecycle(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = fbUserSession;
    }
}
