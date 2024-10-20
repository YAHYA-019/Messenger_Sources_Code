package X;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.SeekBar;

/* loaded from: DQt.class */
public final class DQt extends SeekBar implements SeekBar.OnSeekBarChangeListener {
    public int A00;
    public int A01;
    public boolean A02;
    public ValueAnimator A03;
    public SeekBar.OnSeekBarChangeListener A04;
    public final int A05;
    public final int A06;
    public final Paint A07;
    public final RectF A08;

    public DQt(Context context) {
        super(context, null, 0);
        this.A02 = true;
        this.A08 = DKC.A0D();
        this.A07 = DKC.A09();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C1oo.A0a, 0, 0);
        11T.A0A(obtainStyledAttributes);
        this.A00 = obtainStyledAttributes.getColor(1, context.getColor(2132213859));
        this.A01 = obtainStyledAttributes.getColor(1, context.getColor(2132213821));
        this.A06 = obtainStyledAttributes.getDimensionPixelSize(3, 30);
        this.A05 = obtainStyledAttributes.getDimensionPixelSize(0, 30);
        obtainStyledAttributes.recycle();
    }

    public static final void A01(DQt dQt, int i, long j) {
        int progress = dQt.getProgress();
        ValueAnimator valueAnimator = dQt.A03;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
        dQt.A03 = null;
        dQt.A02 = true;
        ValueAnimator ofInt = ValueAnimator.ofInt(progress, i);
        ofInt.setDuration(j);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new FJU(i, 0, dQt));
        0K6.A00(ofInt);
        dQt.A03 = ofInt;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        synchronized (this) {
            11T.A0F(canvas, 0);
            Drawable thumb = getThumb();
            11T.A0A(getThumb().getBounds());
            float max = getMax() - getMin();
            float max2 = (getMax() - getMin()) / 2.0f;
            float f = this.A06 / 2.0f;
            int height = getHeight() / 2;
            float A09 = DKE.A09(this) - getPaddingLeft();
            float f2 = A09 / 2.0f;
            RectF rectF = this.A08;
            float f3 = height;
            float f4 = f3 - f;
            float f5 = f3 + f;
            rectF.set(getPaddingLeft(), f4, A09, f5);
            Paint paint = this.A07;
            paint.setColor(this.A01);
            float f6 = this.A05;
            canvas.drawRoundRect(rectF, f6, f6, paint);
            if (getProgress() < max2) {
                float progress = f2 - ((A09 / max) * (max2 - getProgress()));
                rectF.set(7zM.A00(((float) thumb.getBounds().left) > progress ? Integer.valueOf(thumb.getBounds().left) : Float.valueOf(progress)), f4, f2, f5);
                paint.setColor(this.A00);
                canvas.drawRoundRect(rectF, f6, f6, paint);
            }
            if (getProgress() > max2) {
                rectF.set(f2, f4, 7zM.A00(thumb.getBounds().right < getLeft() ? Integer.valueOf(thumb.getBounds().right) : Float.valueOf(((A09 / max) * (getProgress() - max2)) + f2)), f5);
                paint.setColor(this.A00);
                canvas.drawRoundRect(rectF, f6, f6, paint);
            }
            thumb.draw(canvas);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onMeasure(int i, int i2) {
        synchronized (this) {
            int size = View.MeasureSpec.getMode(i) != 0 ? View.MeasureSpec.getSize(i) : 0;
            int intrinsicHeight = getThumb().getIntrinsicHeight();
            if (View.MeasureSpec.getMode(i2) != 0) {
                intrinsicHeight = (int) Math.min(intrinsicHeight, View.MeasureSpec.getSize(i2));
            }
            setMeasuredDimension(size, intrinsicHeight);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener;
        11T.A0F(seekBar, 0);
        if ((z || this.A02) && (onSeekBarChangeListener = this.A04) != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        11T.A0F(seekBar, 0);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A04;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        11T.A0F(seekBar, 0);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A04;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.A04 = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(this);
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        A01(this, i, getResources().getInteger(R.integer.config_mediumAnimTime));
    }
}
