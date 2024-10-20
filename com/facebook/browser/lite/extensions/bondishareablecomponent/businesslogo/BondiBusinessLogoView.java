package com.facebook.browser.lite.extensions.bondishareablecomponent.businesslogo;

import X.0Q8;
import X.11T;
import X.2MR;
import X.2Me;
import X.4YU;
import X.DKG;
import X.JQz;
import X.JR1;
import X.LDi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.fbui.widget.glyph.GlyphButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: BondiBusinessLogoView.class */
public final class BondiBusinessLogoView extends ConstraintLayout {
    public View A00;
    public GlyphButton A01;
    public GlyphButton A02;
    public String A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BondiBusinessLogoView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BondiBusinessLogoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BondiBusinessLogoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        11T.A0F(context, 1);
        View.inflate(context, 2132541582, this);
        this.A00 = JQz.A0M(this, 2131362497);
        GlyphButton glyphButton = (GlyphButton) DKG.A0B(this, 2131362510);
        this.A02 = glyphButton;
        View view = this.A00;
        if (view == null) {
            str = "businessImageView";
        } else if (glyphButton == null) {
            str = "fbImageView";
        } else {
            Context A08 = 4YU.A08(this);
            2Me A02 = LDi.A02(A08);
            2MR r0 = 2MR.A01;
            glyphButton.A02(A02.A01(r0));
            2Me A022 = LDi.A02(A08);
            2MR r02 = 2MR.A19;
            JR1.A1C(glyphButton, r02, A022);
            view.setBackgroundTintList(ColorStateList.valueOf(LDi.A08(A08) ? -1 : -16777216));
            GlyphButton glyphButton2 = (GlyphButton) DKG.A0B(this, 2131362511);
            this.A01 = glyphButton2;
            if (glyphButton2 != null) {
                glyphButton2.A02(LDi.A02(A08).A01(r0));
                JR1.A1C(glyphButton2, r02, LDi.A02(A08));
                return;
            }
            str = "fbBusinessImageView";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public /* synthetic */ BondiBusinessLogoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
