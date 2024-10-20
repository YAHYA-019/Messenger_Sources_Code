package com.facebook.video.plugins;

import X.11T;
import X.6TI;
import X.C09s;
import X.C6d6;
import X.DKF;
import X.DKG;
import X.IKB;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.fbui.widget.glyph.GlyphView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: Video360SensorTogglePlugin.class */
public final class Video360SensorTogglePlugin extends C6d6 {
    public boolean A00;
    public final GlyphView A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Video360SensorTogglePlugin(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Video360SensorTogglePlugin(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Video360SensorTogglePlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A0C(2132543520);
        this.A01 = (GlyphView) C09s.A01(this, 2131367304);
    }

    public /* synthetic */ Video360SensorTogglePlugin(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    @Override // X.C6d6
    public String A0H() {
        return "Video360SensorTogglePlugin";
    }

    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        11T.A0F(r302, 0);
        if (this.A00) {
            return;
        }
        this.A00 = true;
        GlyphView glyphView = this.A01;
        glyphView.setVisibility(0);
        glyphView.setSelected(false);
        IKB.A00(glyphView, this, 67);
    }
}
