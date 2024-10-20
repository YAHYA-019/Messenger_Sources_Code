package com.facebook.messaging.highlightstab.immersivefeatures.plugins.immersivecardviews.lifeevents;

import X.06Z;
import X.11T;
import X.7zT;
import X.95J;
import android.content.Context;
import com.facebook.messaging.highlightstab.immersivecolorschemes.HTImmersiveFixedColorScheme;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;

/* loaded from: HTImmersiveLifeEventViewImplementation.class */
public final class HTImmersiveLifeEventViewImplementation {
    public final 06Z A00;
    public final HTImmersiveFixedColorScheme A01;
    public final 95J A02;
    public final HighlightsFeedContent A03;
    public final Context A04;

    public HTImmersiveLifeEventViewImplementation(Context context, 06Z r303, HTImmersiveFixedColorScheme hTImmersiveFixedColorScheme, 95J r305, HighlightsFeedContent highlightsFeedContent) {
        7zT.A1W(highlightsFeedContent, context, r303, r305);
        11T.A0F(hTImmersiveFixedColorScheme, 5);
        this.A03 = highlightsFeedContent;
        this.A04 = context;
        this.A00 = r303;
        this.A02 = r305;
        this.A01 = hTImmersiveFixedColorScheme;
    }
}
