package com.facebook.messaging.photos.editing;

import X.0FI;
import X.0S2;
import X.1BJ;
import X.1BV;
import X.2OB;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C00i;
import X.C09s;
import X.C2rp;
import X.DKC;
import X.DKE;
import X.GOo;
import X.GTa;
import X.GoE;
import X.HAH;
import X.HUM;
import X.IJo;
import X.RQ6;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.acra.constants.ActionId;
import com.facebook.resources.compat.RedexResourcesCompat;
import com.facebook.ui.compat.fbrelativelayout.FbRelativeLayout;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.text.BetterTextView;
import java.util.EnumMap;

/* loaded from: ColorAdjustmentControlsLayout.class */
public class ColorAdjustmentControlsLayout extends CustomFrameLayout {
    public View A00;
    public GoE A01;
    public HAH A02;
    public RQ6 A03;
    public ColorAdjustmentSliderView A04;
    public FbRelativeLayout A05;
    public BetterTextView A06;
    public BetterTextView A07;
    public boolean A08;
    public GestureDetector A09;
    public View A0A;
    public C00i A0B;
    public EnumMap A0C;

    public ColorAdjustmentControlsLayout(Context context) {
        super(context);
        A00();
    }

    public ColorAdjustmentControlsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public ColorAdjustmentControlsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        this.A0B = 1BV.A00(473);
        A0U(2132542456);
        View A01 = C09s.A01(this, 2131366926);
        this.A0A = A01;
        A01.setOnClickListener(new IJo(this));
        this.A01 = DKC.A0V(this.A0B).A0f(this.A0A);
        C2rp.A01(this.A0A);
        this.A05 = (FbRelativeLayout) C09s.A01(this, 2131363098);
        this.A06 = DKC.A0g(this, 2131363091);
        this.A07 = DKC.A0g(this, 2131363099);
        ColorAdjustmentSliderView colorAdjustmentSliderView = (ColorAdjustmentSliderView) C09s.A01(this, 2131363096);
        this.A04 = colorAdjustmentSliderView;
        colorAdjustmentSliderView.A00 = new HUM(this);
        C2rp.A02(colorAdjustmentSliderView, 0S2.A03);
        this.A00 = C09s.A01(this, 2131363095);
        Context context = getContext();
        int A03 = DKE.A03(context);
        Resources resources = context.getResources();
        int identifier = RedexResourcesCompat.getIdentifier(resources, 1BJ.A00(33), "dimen", AnonymousClass000.A00(ActionId.DISPLAYED));
        if (A03 == (identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0)) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2132279310);
            ViewGroup.MarginLayoutParams A0I = DKC.A0I(this.A04);
            if (A0I != null) {
                A0I.setMargins(A0I.leftMargin, A0I.topMargin, A0I.rightMargin, A0I.bottomMargin + dimensionPixelSize);
            }
            ViewGroup.MarginLayoutParams A0I2 = DKC.A0I(this.A05);
            if (A0I2 != null) {
                A0I2.setMargins(A0I2.leftMargin, A0I2.topMargin, A0I2.rightMargin, A0I2.bottomMargin + dimensionPixelSize);
            }
            ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height += dimensionPixelSize;
                this.A00.setLayoutParams(layoutParams);
            }
        }
        HAH hah = HAH.A03;
        this.A02 = hah;
        this.A04.setVisibility(8);
        this.A00.setVisibility(8);
        EnumMap enumMap = new EnumMap(HAH.class);
        this.A0C = enumMap;
        enumMap.put((EnumMap) hah, (HAH) 2131960560);
        EnumMap enumMap2 = this.A0C;
        HAH hah2 = HAH.A01;
        enumMap2.put((EnumMap) hah2, (HAH) 2131960558);
        this.A0C.put((EnumMap) HAH.A02, (HAH) 2131960559);
        this.A0C.put((EnumMap) HAH.A04, (HAH) 2131960562);
        this.A0C.put((EnumMap) HAH.A05, (HAH) 2131960563);
        this.A09 = new GestureDetector(context, (GestureDetector.OnGestureListener) new GTa(this));
        A0W(hah2);
    }

    public void A0V(int i) {
        2OB r0 = this.A07;
        if (r0 != null) {
            if (i == 0) {
                r0.setVisibility(8);
                return;
            }
            r0.setVisibility(0);
            2OB r02 = this.A07;
            Resources A0A = GOo.A0A(this);
            int i2 = 2131960565;
            if (i > 0) {
                i2 = 2131960564;
            }
            r02.setText(A0A.getString(i2, AnonymousClass001.A1a(i)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v22, types: [android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0W(X.HAH r302) {
        /*
            r301 = this;
            r0 = r301
            X.HAH r0 = r0.A02
            r303 = r0
            r0 = r303
            r1 = r302
            if (r0 == r1) goto L6b
            r0 = r301
            r1 = r302
            r0.A02 = r1
            r0 = r302
            int r0 = r0.ordinal()
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            r1 = 0
            if (r0 == r1) goto L6c
            r0 = r301
            com.facebook.widget.text.BetterTextView r0 = r0.A06
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = r306
            if (r0 == 0) goto L48
            r0 = r301
            java.util.EnumMap r0 = r0.A0C
            r303 = r0
            r0 = r302
            r1 = r303
            int r0 = X.GOq.A0E(r0, r1)
            r305 = r0
            r0 = r306
            r1 = r305
            r0.setText(r1)
            r0 = r301
            com.facebook.widget.text.BetterTextView r0 = r0.A06
            r303 = r0
        L43:
            r0 = r303
            r1 = r304
            r0.setVisibility(r1)
        L48:
            r0 = r301
            com.facebook.messaging.photos.editing.ColorAdjustmentSliderView r0 = r0.A04
            r1 = r304
            r0.setVisibility(r1)
            r0 = r301
            android.view.View r0 = r0.A00
            r1 = r304
            r0.setVisibility(r1)
            r0 = r301
            X.RQ6 r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6b
            r0 = r303
            X.H4F r0 = r0.A00
            r303 = r0
            r0 = r303
            r1 = r302
            r0.A0X(r1)
        L6b:
            return
        L6c:
            r0 = r301
            com.facebook.widget.text.BetterTextView r0 = r0.A06
            r303 = r0
            r0 = 8
            r304 = r0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.photos.editing.ColorAdjustmentControlsLayout.A0W(X.HAH):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        RQ6 rq6;
        int A05 = 0FI.A05(1867044130);
        if (this.A08) {
            onTouchEvent = this.A09.onTouchEvent(motionEvent);
            if (!onTouchEvent && motionEvent.getAction() == 1 && (rq6 = this.A03) != null) {
                rq6.A00(true);
            }
            i = 408793575;
        } else {
            onTouchEvent = false;
            i = 1005590336;
        }
        0FI.A0B(i, A05);
        return onTouchEvent;
    }
}
