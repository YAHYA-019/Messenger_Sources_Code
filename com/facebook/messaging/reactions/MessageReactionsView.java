package com.facebook.messaging.reactions;

import X.0FI;
import X.1BQ;
import X.1BV;
import X.1Bn;
import X.6nG;
import X.7Wc;
import X.82O;
import X.AbR;
import X.C00i;
import X.C09s;
import X.C15h;
import X.C1u2;
import X.C1u3;
import X.C5rp;
import X.C62n;
import X.J5u;
import X.LWg;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.facebook.fbui.widget.text.ImageWithTextView;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.FbImageView;

/* loaded from: MessageReactionsView.class */
public class MessageReactionsView extends CustomLinearLayout {
    public ImageWithTextView A00;
    public 82O A01;
    public C00i A02;
    public C00i A03;
    public C00i A04;
    public C62n A05;
    public 7Wc A06;
    public 6nG A07;
    public FbImageView A08;
    public C15h A09;
    public AbR A0A;
    public C00i A0B;

    public MessageReactionsView(Context context) {
        super(context);
        A00();
    }

    public MessageReactionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public MessageReactionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        this.A01 = (82O) 1Bn.A0A(65583);
        this.A0A = (AbR) 1Bn.A0A(601);
        this.A09 = new J5u(this, 42);
        this.A07 = (6nG) 1Bn.A0A(50139);
        Context context = getContext();
        this.A0B = new 1BV(context, 68249);
        this.A04 = 1BV.A00(67632);
        this.A03 = 1BV.A00(66207);
        this.A02 = 1BQ.A02(16839);
        A0D(2132542551);
        setOrientation(0);
        this.A05 = new C62n(new LWg(this, 1), null);
        ((C5rp) this.A0B.get()).A01(context, null);
    }

    @Override // com.facebook.widget.CustomLinearLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A00.getVisibility();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1411087800);
        super.onAttachedToWindow();
        this.A05.A00();
        0FI.A0C(-271452250, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(958965944);
        super.onDetachedFromWindow();
        this.A05.A01();
        0FI.A0C(624679000, A06);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.View, com.facebook.fbui.widget.text.ImageWithTextView] */
    @Override // android.view.View
    public void onFinishInflate() {
        int A06 = 0FI.A06(-1717020811);
        super.onFinishInflate();
        this.A00 = (ImageWithTextView) C09s.A01(this, 2131365633);
        7Wc A0J = this.A01.A0J(getContext());
        this.A06 = A0J;
        ?? r0 = this.A00;
        ImageWithTextView.A03(A0J, r0);
        r0.requestLayout();
        r0.invalidate();
        this.A00.setBackgroundResource(2132411079);
        FbImageView fbImageView = (FbImageView) C09s.A01(this, 2131365629);
        this.A08 = fbImageView;
        fbImageView.setImageResource(((C1u2) this.A02.get()).A03(C1u3.A06));
        0FI.A0C(-610371459, A06);
    }

    @Override // com.facebook.widget.CustomLinearLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A00.getVisibility();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (super.verifyDrawable(r302) != false) goto L6;
     */
    @Override // com.facebook.widget.CustomLinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean verifyDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            if (r0 == r1) goto L13
            r0 = r301
            r1 = r302
            boolean r0 = super.verifyDrawable(r1)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L15
        L13:
            r0 = 1
            r303 = r0
        L15:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.reactions.MessageReactionsView.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
