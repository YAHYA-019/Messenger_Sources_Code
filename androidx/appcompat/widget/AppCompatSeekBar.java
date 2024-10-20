package androidx.appcompat.widget;

import X.C53g;
import X.DKF;
import X.DRD;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: AppCompatSeekBar.class */
public class AppCompatSeekBar extends SeekBar {
    public final DRD A00;

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971599);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C53g.A03(getContext(), this);
        DRD drd = new DRD(this);
        this.A00 = drd;
        drd.A02(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        DRD drd = this.A00;
        Drawable drawable = drd.A00;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = drd.A05;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A00.A00;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            DRD drd = this.A00;
            if (drd.A00 != null) {
                int max = drd.A05.getMax();
                int i = 1;
                if (max > 1) {
                    int intrinsicWidth = drd.A00.getIntrinsicWidth();
                    int intrinsicHeight = drd.A00.getIntrinsicHeight();
                    int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                    if (intrinsicHeight >= 0) {
                        i = intrinsicHeight / 2;
                    }
                    drd.A00.setBounds(-i2, -i, i2, i);
                    float A03 = DKF.A03(r0) / max;
                    int save = canvas.save();
                    canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                    int i3 = 0;
                    do {
                        drd.A00.draw(canvas);
                        canvas.translate(A03, 0.0f);
                        i3++;
                    } while (i3 <= max);
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
