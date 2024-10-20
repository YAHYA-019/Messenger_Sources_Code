package com.facebook.video.videohighlights;

import X.11T;
import X.C09s;
import X.DKF;
import X.DKG;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.facebook.widget.CustomFrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: VideoHighlightsView.class */
public final class VideoHighlightsView extends CustomFrameLayout {
    public final LinearLayout A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoHighlightsView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoHighlightsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoHighlightsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A0U(2132543549);
        this.A00 = (LinearLayout) C09s.A01(this, 2131368347);
    }

    public /* synthetic */ VideoHighlightsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }
}
