package com.facebook.messaging.reactions.plugins.reactions.suggestion;

import X.06Z;
import X.11T;
import X.1Lm;
import X.5zD;
import X.7Y0;
import X.AnonymousClass622;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Map;

/* loaded from: CustomReactionSuggestionImplementation.class */
public final class CustomReactionSuggestionImplementation {
    public final 06Z A00;
    public final FbUserSession A01;
    public final 5zD A02;
    public final AnonymousClass622 A03;
    public final Capabilities A04;

    public CustomReactionSuggestionImplementation(06Z r302, FbUserSession fbUserSession, 5zD r304, AnonymousClass622 anonymousClass622, Capabilities capabilities) {
        11T.A0F(fbUserSession, 1);
        11T.A0F(r304, 4);
        11T.A0F(r302, 5);
        this.A01 = fbUserSession;
        this.A03 = anonymousClass622;
        this.A04 = capabilities;
        this.A02 = r304;
        this.A00 = r302;
    }

    public static final void A00(Context context, FbUserSession fbUserSession, AnonymousClass622 anonymousClass622, String str, String str2, Map map) {
        7Y0 r0 = (7Y0) 1Lm.A05(context, fbUserSession, 50222);
        Message message = anonymousClass622.A03;
        ParticipantInfo participantInfo = message.A0K;
        r0.A01(message, Integer.valueOf(anonymousClass622.A00), "quick_reaction_pill", str, (String) null, str2, participantInfo != null ? participantInfo.A00() : null, map);
    }
}
