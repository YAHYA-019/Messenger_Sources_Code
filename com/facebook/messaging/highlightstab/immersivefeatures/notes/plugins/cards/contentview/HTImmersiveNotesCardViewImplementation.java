package com.facebook.messaging.highlightstab.immersivefeatures.notes.plugins.cards.contentview;

import X.06Z;
import X.7zT;
import X.95J;
import android.content.Context;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;

/* loaded from: HTImmersiveNotesCardViewImplementation.class */
public final class HTImmersiveNotesCardViewImplementation {
    public Context A00;
    public final 06Z A01;
    public final 95J A02;
    public final HighlightsFeedContent A03;

    public HTImmersiveNotesCardViewImplementation(Context context, 06Z r303, 95J r304, HighlightsFeedContent highlightsFeedContent) {
        7zT.A1W(highlightsFeedContent, r304, context, r303);
        this.A03 = highlightsFeedContent;
        this.A02 = r304;
        this.A00 = context;
        this.A01 = r303;
    }
}
