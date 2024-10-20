package com.facebook.video.plugins;

import X.11T;
import X.C09s;
import X.DKF;
import X.DKG;
import X.GOo;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.CustomFrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: SeekBarPreviewThumbnailView.class */
public final class SeekBarPreviewThumbnailView extends CustomFrameLayout {
    public final ImageView A00;
    public final LinearLayout A01;
    public final FbTextView A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeekBarPreviewThumbnailView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeekBarPreviewThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekBarPreviewThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A0U(2132543285);
        this.A01 = (LinearLayout) C09s.A01(this, 2131366641);
        this.A00 = (ImageView) C09s.A01(this, 2131366651);
        this.A02 = GOo.A0X(this, 2131366643);
    }

    public /* synthetic */ SeekBarPreviewThumbnailView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }
}
