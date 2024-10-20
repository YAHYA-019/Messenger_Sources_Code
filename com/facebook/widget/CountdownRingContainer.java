package com.facebook.widget;

import X.0FI;
import X.1BL;
import X.7zL;
import X.AbH;
import X.C00i;
import X.C1oo;
import X.DKC;
import X.DKD;
import X.GTC;
import X.HVN;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.mobileconfig.init.MobileConfigSessionlessInit;

/* loaded from: CountdownRingContainer.class */
public class CountdownRingContainer extends FrameLayout {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Paint A06;
    public Paint A07;
    public Paint A08;
    public RectF A09;
    public C00i A0A;
    public HVN A0B;
    public GTC A0C;
    public boolean A0D;

    public CountdownRingContainer(Context context) {
        this(context, null);
    }

    public CountdownRingContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Handler handler = new Handler(Looper.getMainLooper());
        ((GTC) handler).A00 = 7zL.A14(this);
        this.A0C = handler;
        this.A0A = AbH.A0a();
        setWillNotDraw(false);
        if (attributeSet == null) {
            this.A00 = (int) ((2.0f * DKD.A09(this).density) + 0.5d);
            this.A04 = 3000L;
            this.A01 = 0;
            this.A02 = -1;
            this.A03 = context.getColor(2132213803);
        } else {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1oo.A0U, 0, 0);
            try {
                this.A00 = obtainStyledAttributes.getDimensionPixelSize(4, (int) ((2.0f * DKD.A09(this).density) + 0.5d));
                this.A04 = obtainStyledAttributes.getInt(1, MobileConfigSessionlessInit.SYNC_UPDATE_WAIT_TIME_MS);
                this.A01 = obtainStyledAttributes.getColor(0, 0);
                this.A02 = obtainStyledAttributes.getColor(2, -1);
                this.A03 = obtainStyledAttributes.getColor(3, getContext().getColor(2132213803));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.A06 = DKC.A09();
        this.A07 = DKC.A09();
        this.A08 = DKC.A09();
        this.A06.setColor(this.A01);
        this.A06.setStyle(Paint.Style.FILL);
        this.A06.setAntiAlias(true);
        this.A07.setColor(this.A02);
        this.A07.setStrokeWidth(this.A00);
        Paint paint = this.A07;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.A07.setAntiAlias(true);
        this.A08.setColor(this.A03);
        this.A08.setStrokeWidth(this.A00);
        this.A08.setStyle(style);
        this.A08.setAntiAlias(true);
    }

    private void A00() {
        float f = this.A00 * 0.5f;
        this.A09 = new RectF(f, f, DKC.A02(this) - f, DKC.A03(this) - f);
    }

    public void A01() {
        if (this.A0D) {
            this.A0D = false;
            this.A0C.removeMessages(1);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1838683910);
        super.onDetachedFromWindow();
        this.A0C.removeMessages(1);
        0FI.A0C(1691775568, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float A02 = DKC.A02(this) * 0.5f;
        canvas.drawCircle(A02, A02, A02 - this.A00, this.A06);
        if (this.A09 == null) {
            A00();
        }
        RectF rectF = this.A09;
        rectF.getClass();
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.A07);
        if (this.A0D) {
            if (this.A09 == null) {
                A00();
            }
            float min = Math.min(360.0f, (360.0f / ((float) this.A04)) * ((float) (1BL.A08(this.A0A) - this.A05)));
            RectF rectF2 = this.A09;
            rectF2.getClass();
            canvas.drawArc(rectF2, -90.0f, min, false, this.A08);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(376365619);
        super.onSizeChanged(i, i2, i3, i4);
        A00();
        0FI.A0C(-1863972453, A06);
    }
}
