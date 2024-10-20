package com.facebook.messaging.photos.editing;

import X.AnonymousClass001;
import X.C12;
import X.DKC;
import X.DKE;
import X.DKH;
import X.H4F;
import X.HAH;
import X.HRY;
import X.HUM;
import X.HoK;
import X.IQ1;
import X.RQ6;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.montage.composer.ColorAdjustmentGLSurfaceView;

/* loaded from: ColorAdjustmentSliderView.class */
public class ColorAdjustmentSliderView extends SeekBar implements SeekBar.OnSeekBarChangeListener {
    public HUM A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Paint A07;
    public RectF A08;

    public ColorAdjustmentSliderView(Context context) {
        super(context);
        A00();
    }

    public ColorAdjustmentSliderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public ColorAdjustmentSliderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        Context context = getContext();
        this.A05 = DKE.A03(context);
        this.A06 = DKH.A02(context);
        this.A04 = context.getResources().getDimensionPixelSize(2132279379);
        this.A03 = context.getResources().getDimensionPixelSize(2132279602);
        this.A02 = context.getResources().getDimensionPixelSize(2132279309);
        this.A01 = context.getResources().getDimensionPixelSize(2132279351);
        setOnSeekBarChangeListener(this);
        Paint A09 = DKC.A09();
        this.A07 = A09;
        A09.setColor(-1);
        this.A07.setStyle(Paint.Style.FILL);
        this.A08 = DKC.A0D();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        int width = getWidth() - (this.A05 * 2);
        int width2 = getWidth() / 2;
        float progress = (float) (this.A05 + ((width * (((getProgress() - 100.0d) / 100.0d) + 1.0d)) / 2.0d));
        this.A07.setAlpha(127);
        RectF rectF = this.A08;
        rectF.left = this.A05;
        rectF.top = (DKC.A03(this) / 2.0f) - (this.A04 / 2.0f);
        RectF rectF2 = this.A08;
        rectF2.right = this.A05 + width;
        rectF2.bottom = (DKC.A03(this) / 2.0f) + (this.A04 / 2.0f);
        RectF rectF3 = this.A08;
        float f = this.A03;
        canvas.drawRoundRect(rectF3, f, f, this.A07);
        this.A07.setAlpha(255);
        float f2 = width2;
        RectF rectF4 = this.A08;
        if (progress < f2) {
            rectF4.left = progress;
            rectF4.right = f2;
        } else {
            rectF4.left = f2;
            rectF4.right = progress;
        }
        canvas.drawRect(rectF4, this.A07);
        canvas.drawCircle(progress, DKC.A03(this) / 2.0f, this.A06, this.A07);
        RectF rectF5 = this.A08;
        float f3 = this.A02 / 2.0f;
        rectF5.left = f2 - f3;
        rectF5.top = 0.0f;
        rectF5.right = f2 + f3;
        rectF5.bottom = DKC.A03(this);
        RectF rectF6 = this.A08;
        float f4 = this.A01;
        canvas.drawRoundRect(rectF6, f4, f4, this.A07);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        ColorAdjustmentControlsLayout colorAdjustmentControlsLayout;
        ColorAdjustmentGLSurfaceView colorAdjustmentGLSurfaceView;
        HUM hum = this.A00;
        if (hum != null) {
            if (z) {
                int i2 = i - 100;
                RQ6 rq6 = hum.A00.A03;
                if (rq6 != null) {
                    H4F h4f = rq6.A00;
                    ColorAdjustmentControlsLayout colorAdjustmentControlsLayout2 = h4f.A01;
                    if (colorAdjustmentControlsLayout2 != null) {
                        AnonymousClass001.A1A(colorAdjustmentControlsLayout2.A02, h4f.A02, i2);
                    }
                    HRY hry = h4f.A00;
                    if (hry != null && (colorAdjustmentControlsLayout = h4f.A01) != null) {
                        HAH hah = colorAdjustmentControlsLayout.A02;
                        C12 c12 = hry.A00.A0A;
                        if (c12 != null) {
                            IQ1 iq1 = c12.A00;
                            CallerContext callerContext = IQ1.A1m;
                            HoK hoK = iq1.A03;
                            if (hoK != null) {
                                int ordinal = hah.ordinal();
                                if (ordinal == 1) {
                                    colorAdjustmentGLSurfaceView = hoK.A01;
                                    if (colorAdjustmentGLSurfaceView != null) {
                                        colorAdjustmentGLSurfaceView.A00.A00 = i2 / 100.0f;
                                        colorAdjustmentGLSurfaceView.requestRender();
                                    }
                                } else if (ordinal == 2) {
                                    colorAdjustmentGLSurfaceView = hoK.A01;
                                    if (colorAdjustmentGLSurfaceView != null) {
                                        colorAdjustmentGLSurfaceView.A00.A01 = i2 / 100.0f;
                                        colorAdjustmentGLSurfaceView.requestRender();
                                    }
                                } else if (ordinal == 3) {
                                    colorAdjustmentGLSurfaceView = hoK.A01;
                                    if (colorAdjustmentGLSurfaceView != null) {
                                        colorAdjustmentGLSurfaceView.A00.A02 = i2 / 100.0f;
                                        colorAdjustmentGLSurfaceView.requestRender();
                                    }
                                } else if (ordinal == 4) {
                                    colorAdjustmentGLSurfaceView = hoK.A01;
                                    if (colorAdjustmentGLSurfaceView != null) {
                                        colorAdjustmentGLSurfaceView.A00.A03 = i2 / 100.0f;
                                        colorAdjustmentGLSurfaceView.requestRender();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.A00.A00.A0V(i - 100);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        RQ6 rq6;
        HUM hum = this.A00;
        if (hum == null || (rq6 = hum.A00.A03) == null) {
            return;
        }
        rq6.A00.A0V();
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        super.setProgress(i);
    }
}
