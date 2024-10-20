package com.facebook.messaging.aibot.plugins.feedback.gutterfeedback;

import X.1BV;
import X.1Br;
import X.5zD;
import X.7zM;
import X.7zR;
import X.AnonymousClass622;
import X.C9f3;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;

/* loaded from: AIFeedbackGutterDecoration.class */
public final class AIFeedbackGutterDecoration {
    public static final 1Br A03 = 7zM.A0a();
    public final FbUserSession A00;
    public final 5zD A01;
    public final AnonymousClass622 A02;

    public AIFeedbackGutterDecoration(FbUserSession fbUserSession, 5zD r303, AnonymousClass622 anonymousClass622) {
        7zR.A1O(r303, fbUserSession);
        this.A02 = anonymousClass622;
        this.A01 = r303;
        this.A00 = fbUserSession;
    }

    public static final void A00(ThreadKey threadKey, AnonymousClass622 anonymousClass622, String str, boolean z) {
        ImmutableList immutableList;
        1BV A00 = 1BV.A00(68261);
        ThreadSummary threadSummary = anonymousClass622.A05;
        String str2 = null;
        Integer valueOf = (threadSummary == null || (immutableList = threadSummary.A1L) == null) ? null : Integer.valueOf(immutableList.size());
        ParticipantInfo participantInfo = anonymousClass622.A03.A0K;
        if (participantInfo != null) {
            str2 = participantInfo.A00();
        }
        if (valueOf == null || str2 == null) {
            return;
        }
        C9f3.A00(threadKey, (C9f3) A00.get(), z ? "ai_feedback_positive" : "ai_feedback_negative", str2, str, "message_action_shortcuts", "text", null, valueOf.intValue());
    }
}
