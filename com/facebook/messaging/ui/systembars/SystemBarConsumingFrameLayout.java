package com.facebook.messaging.ui.systembars;

import X.KfL;
import X.Kla;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.facebook.common.ui.keyboard.SoftInputDetectingFrameLayout;

/* loaded from: SystemBarConsumingFrameLayout.class */
public class SystemBarConsumingFrameLayout extends SoftInputDetectingFrameLayout {
    public Kla A00;
    public final KfL A01;

    public SystemBarConsumingFrameLayout(Context context) {
        super(context);
        KfL kfL = new KfL(this);
        this.A01 = kfL;
        this.A00 = new Kla(context, null, kfL);
    }

    public SystemBarConsumingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        KfL kfL = new KfL(this);
        this.A01 = kfL;
        this.A00 = new Kla(context, attributeSet, kfL);
    }

    public SystemBarConsumingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        KfL kfL = new KfL(this);
        this.A01 = kfL;
        this.A00 = new Kla(context, attributeSet, kfL);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint paint = this.A00.A00;
        if (paint.getAlpha() != 0) {
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), r0.A01.top, paint);
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        Kla kla = this.A00;
        kla.A01.set(rect);
        if (kla.A04) {
            rect.top = 0;
        }
        if (kla.A03) {
            rect.bottom = 0;
        }
        super.fitSystemWindows(rect);
        return false;
    }
}
