package com.facebook.messaging.highlightstab.immersivefeatures.fbposts.plugins.cards.contentview;

import X.06Z;
import X.7zT;
import X.95J;
import android.content.Context;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;

/* loaded from: HTImmersiveFbPostCardViewImplementation.class */
public final class HTImmersiveFbPostCardViewImplementation {
    public final 06Z A00;
    public final 95J A01;
    public final HighlightsFeedContent A02;
    public final Context A03;

    public HTImmersiveFbPostCardViewImplementation(Context context, 06Z r303, 95J r304, HighlightsFeedContent highlightsFeedContent) {
        7zT.A1W(highlightsFeedContent, context, r303, r304);
        this.A02 = highlightsFeedContent;
        this.A03 = context;
        this.A00 = r303;
        this.A01 = r304;
    }
}
