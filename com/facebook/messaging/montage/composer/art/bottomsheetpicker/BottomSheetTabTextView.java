package com.facebook.messaging.montage.composer.art.bottomsheetpicker;

import X.11T;
import X.7zQ;
import X.C0ed;
import X.DKC;
import X.DKF;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.facebook.widget.text.BetterTextView;

/* loaded from: BottomSheetTabTextView.class */
public final class BottomSheetTabTextView extends BetterTextView {
    public float A00;
    public float A01;
    public Paint A02;
    public Rect A03;
    public RectF A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetTabTextView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A03 = new Rect();
        this.A04 = new RectF();
        this.A02 = new Paint(1);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetTabTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A03 = new Rect();
        this.A04 = new RectF();
        this.A02 = new Paint(1);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetTabTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A03 = new Rect();
        this.A04 = new RectF();
        this.A02 = new Paint(1);
        A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A00() {
        this.A03 = DKC.A0C();
        this.A04 = DKC.A0D();
        DKC.A1H(getContext(), this.A02, 2132213865);
        Resources resources = getResources();
        this.A00 = resources.getDimensionPixelOffset(2132279327);
        this.A01 = resources.getDimensionPixelOffset(2132279305);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.text.BetterTextView
    public void onDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        boolean isSelected = isSelected();
        Context context = getContext();
        if (isSelected) {
            DKF.A11(context, this, 2132213866);
            String obj = getText().toString();
            getPaint().getTextBounds(obj, 0, 7zQ.A05(obj), this.A03);
            float measureText = getPaint().measureText(obj);
            float A02 = (DKC.A02(this) - measureText) / 2.0f;
            float baseline = getBaseline() - this.A03.height();
            float f = this.A00;
            this.A04.set(C0ed.A00(A02 - f, 0.0f, DKC.A02(this)), C0ed.A00(baseline - this.A01, 0.0f, DKC.A03(this)), C0ed.A00(A02 + measureText + f, 0.0f, DKC.A02(this)), C0ed.A00(getBaseline() + this.A01, 0.0f, DKC.A03(this)));
            canvas.drawRoundRect(this.A04, 49.0f, 49.0f, this.A02);
        } else {
            DKF.A11(context, this, 2132213867);
        }
        super.onDraw(canvas);
    }
}
