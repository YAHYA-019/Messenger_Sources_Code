package com.facebook.messaging.highlightstab.immersivefeatures.stories.plugins.cards.contentview;

import X.06Z;
import X.7zT;
import X.95J;
import android.view.View;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;

/* loaded from: HTImmersiveStoriesCardViewImplementation.class */
public final class HTImmersiveStoriesCardViewImplementation {
    public final View A00;
    public final 06Z A01;
    public final 95J A02;
    public final HighlightsFeedContent A03;

    public HTImmersiveStoriesCardViewImplementation(View view, 06Z r303, 95J r304, HighlightsFeedContent highlightsFeedContent) {
        7zT.A1W(highlightsFeedContent, r303, r304, view);
        this.A03 = highlightsFeedContent;
        this.A01 = r303;
        this.A02 = r304;
        this.A00 = view;
    }
}
