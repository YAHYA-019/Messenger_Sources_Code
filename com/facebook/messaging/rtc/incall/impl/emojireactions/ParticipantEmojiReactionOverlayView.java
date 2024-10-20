package com.facebook.messaging.rtc.incall.impl.emojireactions;

import X.11T;
import X.1Iw;
import X.AbL;
import X.DKG;
import X.DqA;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.litho.LithoView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: ParticipantEmojiReactionOverlayView.class */
public final class ParticipantEmojiReactionOverlayView extends LithoView {
    public DqA A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ParticipantEmojiReactionOverlayView(Context context) {
        this(context, null);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParticipantEmojiReactionOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        1Iw r0 = ((LithoView) this).A09;
        if (r0 != null) {
            AbL.A11(r0, this);
        }
    }

    public /* synthetic */ ParticipantEmojiReactionOverlayView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i));
    }
}
