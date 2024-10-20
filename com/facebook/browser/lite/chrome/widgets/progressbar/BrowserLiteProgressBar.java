package com.facebook.browser.lite.chrome.widgets.progressbar;

import X.DKC;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: BrowserLiteProgressBar.class */
public class BrowserLiteProgressBar extends ProgressBar {
    public int A00;
    public Paint A01;
    public Rect A02;

    public BrowserLiteProgressBar(Context context) {
        super(context);
        A00();
    }

    public BrowserLiteProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public BrowserLiteProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        Paint A09 = DKC.A09();
        this.A01 = A09;
        DKC.A1M(A09);
        DKC.A1H(getContext(), this.A01, 2132213821);
        this.A00 = getResources().getDimensionPixelSize(2132279424);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        synchronized (this) {
            Rect rect = this.A02;
            if (rect != null) {
                Paint paint = this.A01;
                if (paint != null) {
                    canvas.drawRect(rect, paint);
                }
            }
            super.onDraw(canvas);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onMeasure(int i, int i2) {
        synchronized (this) {
            super.onMeasure(i, i2);
            Rect rect = this.A02;
            if (rect == null) {
                rect = DKC.A0C();
                this.A02 = rect;
            }
            rect.set(0, 0, getMeasuredWidth(), this.A00);
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        synchronized (this) {
            super.setProgress(i == 100 ? 0 : Math.max(i, 5));
        }
    }
}
