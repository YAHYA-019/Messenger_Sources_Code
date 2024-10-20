package com.facebook.messaging.pinnedmessages.plugins.production.messagerowdata;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;

/* loaded from: PinnedMessagesV2RowData.class */
public final class PinnedMessagesV2RowData {
    public final Context A00;
    public final FbUserSession A01;
    public final Message A02;

    public PinnedMessagesV2RowData(Context context, FbUserSession fbUserSession, Message message) {
        this.A00 = context;
        this.A02 = message;
        this.A01 = fbUserSession;
    }
}
