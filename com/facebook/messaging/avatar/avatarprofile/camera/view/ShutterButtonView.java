package com.facebook.messaging.avatar.avatarprofile.camera.view;

import X.11T;
import X.3yK;
import X.7zO;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.resources.ui.FbImageButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: ShutterButtonView.class */
public final class ShutterButtonView extends FbImageButton {
    public static final 3yK A02 = new 3yK(-16777216, -1);
    public final int A00;
    public final int A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShutterButtonView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShutterButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShutterButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        Resources resources = getResources();
        this.A00 = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        this.A01 = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
    }

    public /* synthetic */ ShutterButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void A00(MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {R.attr.state_pressed};
        GradientDrawable A0G = 7zO.A0G(1);
        A0G.setColor(migColorScheme.Chx(A02));
        stateListDrawable.addState(iArr, A0G);
        int[] iArr2 = StateSet.WILD_CARD;
        GradientDrawable A0G2 = 7zO.A0G(1);
        int i = this.A00;
        A0G2.setStroke(i, migColorScheme.B4h());
        GradientDrawable A0G3 = 7zO.A0G(1);
        A0G3.setColor(migColorScheme.AYz());
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{A0G3, A0G2});
        int i2 = i + this.A01;
        layerDrawable.setLayerInset(0, i2, i2, i2, i2);
        stateListDrawable.addState(iArr2, layerDrawable);
        setImageDrawable(stateListDrawable);
    }
}
