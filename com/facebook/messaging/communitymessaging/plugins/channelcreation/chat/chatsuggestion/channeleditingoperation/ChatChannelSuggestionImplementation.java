package com.facebook.messaging.communitymessaging.plugins.channelcreation.chat.chatsuggestion.channeleditingoperation;

import X.7zT;
import X.DGm;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: ChatChannelSuggestionImplementation.class */
public final class ChatChannelSuggestionImplementation {
    public final Context A00;
    public final LifecycleOwner A01;
    public final FbUserSession A02;
    public final DGm A03;

    public ChatChannelSuggestionImplementation(Context context, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, DGm dGm) {
        7zT.A1W(context, dGm, lifecycleOwner, fbUserSession);
        this.A00 = context;
        this.A03 = dGm;
        this.A01 = lifecycleOwner;
        this.A02 = fbUserSession;
    }
}
