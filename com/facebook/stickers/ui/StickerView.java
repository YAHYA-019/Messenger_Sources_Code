package com.facebook.stickers.ui;

import X.C09s;
import X.C62j;
import X.C66h;
import X.C66i;
import X.DKC;
import X.GOp;
import X.H0C;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.widget.CustomRelativeLayout;

/* loaded from: StickerView.class */
public class StickerView extends CustomRelativeLayout {
    public static final C66h A05 = C66h.A03(80.0d, 9.0d);
    public FbDraweeView A00;
    public GlyphView A01;
    public C66i A02;
    public C62j A03;
    public final Rect A04;

    public StickerView(Context context) {
        super(context);
        this.A04 = DKC.A0C();
        A00();
    }

    public StickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = DKC.A0C();
        A00();
    }

    public StickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = DKC.A0C();
        A00();
    }

    private void A00() {
        this.A03 = GOp.A0x();
        A0C(2132543400);
        this.A00 = DKC.A0M(this, 2131367611);
        this.A01 = (GlyphView) C09s.A01(this, 2131367612);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(2130971809, typedValue, false);
        if (typedValue.type == 18) {
            typedValue.coerceToString().toString();
        }
        C66i c66i = new C66i(this.A03);
        this.A02 = c66i;
        c66i.A09(A05);
        this.A02.A03();
        this.A02.A0A(new H0C(this, 11));
    }
}
