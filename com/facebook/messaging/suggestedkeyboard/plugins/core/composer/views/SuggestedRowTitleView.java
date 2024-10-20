package com.facebook.messaging.suggestedkeyboard.plugins.core.composer.views;

import X.11T;
import X.DKF;
import X.DKG;
import X.GOn;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.facebook.resources.ui.FbTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: SuggestedRowTitleView.class */
public final class SuggestedRowTitleView extends FbTextView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SuggestedRowTitleView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SuggestedRowTitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuggestedRowTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        setTextSize(16.0f);
        Resources resources = getResources();
        setPadding(GOn.A07(resources, 2132279314), GOn.A07(resources, 2132279298), GOn.A07(resources, 2132279314), GOn.A07(resources, 2132279298));
    }

    public /* synthetic */ SuggestedRowTitleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }
}
