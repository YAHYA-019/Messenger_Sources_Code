package com.facebook.messaging.permissions;

import X.11T;
import X.1BK;
import X.2OB;
import X.AbstractC00793on;
import X.C09s;
import X.C1oo;
import X.C2rp;
import X.DKC;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.text.BetterTextView;

/* loaded from: PermissionRequestIconView.class */
public final class PermissionRequestIconView extends CustomFrameLayout {
    public GlyphView A00;
    public BetterTextView A01;
    public BetterTextView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionRequestIconView(Context context) {
        super(context);
        11T.A0F(context, 1);
        A00(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionRequestIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        A00(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionRequestIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A00(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.facebook.widget.text.BetterTextView, android.view.View] */
    private final void A00(Context context, AttributeSet attributeSet) {
        GlyphView glyphView;
        2OB r0;
        A0U(2132543090);
        this.A00 = (GlyphView) C09s.A01(this, 2131366407);
        this.A02 = DKC.A0g(this, 2131366409);
        ?? A0g = DKC.A0g(this, 2131366405);
        this.A01 = A0g;
        if (A0g == 0) {
            throw 1BK.A0h();
        }
        C2rp.A01(A0g);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A27);
        11T.A0A(obtainStyledAttributes);
        A0V(obtainStyledAttributes.getResourceId(0, -1));
        CharSequence A01 = AbstractC00793on.A01(getContext(), obtainStyledAttributes, 2);
        if (A01 == null) {
            A01 = "";
        }
        2OB r02 = this.A02;
        if (r02 != null) {
            r02.setText(A01);
        }
        int i = (-1) << (-1);
        int color = obtainStyledAttributes.getColor(3, i);
        if (color != i && (r0 = this.A02) != null) {
            r0.setTextColor(color);
        }
        int color2 = obtainStyledAttributes.getColor(1, i);
        if (color2 != i && (glyphView = this.A00) != null) {
            glyphView.A00(color2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void A0V(int i) {
        int i2;
        GlyphView glyphView = this.A00;
        if (i != -1) {
            if (glyphView != null) {
                glyphView.setImageDrawable(getResources().getDrawable(i));
            }
            glyphView = this.A00;
            if (glyphView == null) {
                return;
            } else {
                i2 = 0;
            }
        } else if (glyphView == null) {
            return;
        } else {
            i2 = 8;
        }
        glyphView.setVisibility(i2);
    }

    public final void setTextColor(int i) {
        2OB r0 = this.A02;
        if (r0 != null) {
            r0.setTextColor(i);
        }
    }
}
