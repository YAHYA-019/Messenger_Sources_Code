package com.facebookpay.widget.button;

import X.0S2;
import X.11T;
import X.1BK;
import X.AnonymousClass001;
import X.C06014fk;
import X.C1oo;
import X.DKG;
import X.FAF;
import X.JR0;
import X.KXu;
import X.L9O;
import X.LBg;
import X.Qqb;
import X.RVu;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: FBPayButton.class */
public final class FBPayButton extends Button {
    public Qqb A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBPayButton(Context context) {
        this(context, null);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBPayButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, Qqb.A02);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBPayButton(Context context, AttributeSet attributeSet, int i, Qqb qqb) {
        super(context, attributeSet, i);
        1BK.A1K(context, 1, qqb);
        this.A00 = qqb;
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        RVu.A01(this, 0S2.A01, (String) null);
        LBg.A03(this, this.A00.widgetStyleType, false);
        A00(this.A00);
        setFocusable(true);
    }

    public /* synthetic */ FBPayButton(Context context, AttributeSet attributeSet, int i, Qqb qqb, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, i, (i2 & 8) != 0 ? Qqb.A02 : qqb);
    }

    /* JADX WARN: Type inference failed for: r0v116, types: [int[], int[][]] */
    public final void A00(Qqb qqb) {
        11T.A0F(qqb, 0);
        this.A00 = qqb;
        KXu.A00(this, qqb.widgetStyleType);
        Qqb qqb2 = this.A00;
        11T.A0F(qqb2, 1);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C06014fk.A04().A02(qqb2.widgetStyleType), C1oo.A0p);
        11T.A0A(obtainStyledAttributes);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {-16842910};
        FAF A04 = C06014fk.A04();
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        stateListDrawable.addState(iArr, JR0.A0Y(context, drawable, C06014fk.A04(), A04, qqb2.backgroundColor));
        int[] iArr2 = {R.attr.state_pressed};
        FAF A042 = C06014fk.A04();
        Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
        if (drawable2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        stateListDrawable.addState(iArr2, JR0.A0Y(context, drawable2, C06014fk.A04(), A042, qqb2.pressedBackgroundColor));
        int[] iArr3 = {-16842919};
        FAF A043 = C06014fk.A04();
        Drawable drawable3 = obtainStyledAttributes.getDrawable(1);
        if (drawable3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        stateListDrawable.addState(iArr3, JR0.A0Y(context, drawable3, C06014fk.A04(), A043, qqb2.backgroundColor));
        int[] iArr4 = {R.attr.state_focused};
        FAF A044 = C06014fk.A04();
        Drawable drawable4 = obtainStyledAttributes.getDrawable(1);
        if (drawable4 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        stateListDrawable.addState(iArr4, JR0.A0Y(context, drawable4, C06014fk.A04(), A044, qqb2.pressedBackgroundColor));
        int[] iArr5 = {-16842908};
        FAF A045 = C06014fk.A04();
        Drawable drawable5 = obtainStyledAttributes.getDrawable(1);
        if (drawable5 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        stateListDrawable.addState(iArr5, JR0.A0Y(context, drawable5, C06014fk.A04(), A045, qqb2.backgroundColor));
        setBackground(stateListDrawable);
        obtainStyledAttributes.recycle();
        L9O.A01(this, this.A00.textStyle);
        Qqb qqb3 = this.A00;
        setTextColor(DKG.A07((int[][]) new int[]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, C06014fk.A04().A01(qqb3.enabledTextColor), C06014fk.A04().A01(qqb3.disabledTextColor)));
    }
}
