package com.facebook.payments.ui.ctabutton;

import X.2MR;
import X.5B0;
import X.7zM;
import X.DKD;
import X.DKG;
import X.GJa;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.widget.text.BetterTextView;

/* loaded from: SingleTextCtaButtonView.class */
public class SingleTextCtaButtonView extends ConstraintLayout implements GJa {
    public ProgressBar A00;
    public GlyphView A01;
    public BetterTextView A02;
    public 5B0 A03;

    public SingleTextCtaButtonView(Context context) {
        super(context);
        A00(context);
    }

    public SingleTextCtaButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public SingleTextCtaButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    private void A00(Context context) {
        this.A03 = DKD.A0L();
        LayoutInflater.from(context).inflate(2132543358, (ViewGroup) this, true);
        this.A02 = (BetterTextView) findViewById(2131362741);
        this.A01 = (GlyphView) findViewById(2131362733);
        this.A00 = (ProgressBar) findViewById(2131366701);
        Clr();
        this.A00.setElevation(getResources().getDimensionPixelOffset(2132279309));
    }

    public void A05(CharSequence charSequence) {
        this.A02.setText(charSequence);
        setContentDescription(charSequence);
    }

    @Override // X.GJa
    public void A6E(boolean z) {
        this.A01.setImageResource(2132345425);
        int i = 0;
        this.A01.setVisibility(0);
        this.A01.A00(7zM.A02(getContext(), 2MR.A1i));
        GlyphView glyphView = this.A01;
        if (!z) {
            i = 8;
        }
        glyphView.setVisibility(i);
    }

    @Override // X.GJa
    public void Clr() {
        DKG.A1E(getContext(), this, 2132411346);
    }

    @Override // X.GJa
    public void Cls() {
        DKG.A1E(getContext(), this, 2132411348);
    }
}
