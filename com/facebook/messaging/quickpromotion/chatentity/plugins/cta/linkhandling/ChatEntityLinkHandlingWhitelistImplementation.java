package com.facebook.messaging.quickpromotion.chatentity.plugins.cta.linkhandling;

import X.7zR;
import android.content.Context;
import android.net.Uri;
import com.facebook.messaging.model.messages.Message;

/* loaded from: ChatEntityLinkHandlingWhitelistImplementation.class */
public final class ChatEntityLinkHandlingWhitelistImplementation {
    public final Context A00;
    public final Uri A01;
    public final Message A02;

    public ChatEntityLinkHandlingWhitelistImplementation(Context context, Uri uri, Message message) {
        7zR.A1N(context, uri);
        this.A00 = context;
        this.A02 = message;
        this.A01 = uri;
    }
}
