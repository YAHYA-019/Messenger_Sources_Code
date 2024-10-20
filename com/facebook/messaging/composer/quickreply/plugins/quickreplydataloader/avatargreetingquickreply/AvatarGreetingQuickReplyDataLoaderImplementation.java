package com.facebook.messaging.composer.quickreply.plugins.quickreplydataloader.avatargreetingquickreply;

import X.11T;
import X.1BY;
import X.1Lo;
import X.6S0;
import X.C2a2;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbavatar.config.AvatarConfigRepository;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AvatarGreetingQuickReplyDataLoaderImplementation.class */
public final class AvatarGreetingQuickReplyDataLoaderImplementation {
    public ThreadKey A00;
    public C2a2 A01;
    public final FbUserSession A02;
    public final AvatarConfigRepository A03;
    public final 6S0 A04;
    public final Context A05;

    public AvatarGreetingQuickReplyDataLoaderImplementation(Context context, FbUserSession fbUserSession, 6S0 r304) {
        11T.A0F(fbUserSession, 1);
        11T.A0F(context, 2);
        11T.A0F(r304, 3);
        this.A02 = fbUserSession;
        this.A05 = context;
        this.A04 = r304;
        this.A03 = (AvatarConfigRepository) 1Lo.A04(context, fbUserSession, (1BY) null, 66197);
    }
}
