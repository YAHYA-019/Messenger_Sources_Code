package com.facebook.messaging.communitymessaging.plugins.broadcastchats.speakerhintcard;

import X.1BK;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: CommunityBroadcastChatSpeakerHintCardPluginImplementation.class */
public final class CommunityBroadcastChatSpeakerHintCardPluginImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final ThreadSummary A02;

    public CommunityBroadcastChatSpeakerHintCardPluginImplementation(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        1BK.A1J(context, 1, fbUserSession);
        this.A00 = context;
        this.A02 = threadSummary;
        this.A01 = fbUserSession;
    }
}
