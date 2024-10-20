package X;

import android.graphics.Canvas;
import android.widget.SeekBar;

/* loaded from: DQr.class */
public final class DQr extends SeekBar {
    public SeekBar.OnSeekBarChangeListener A00;

    public static boolean A00(DQr dQr, int i) {
        synchronized (dQr) {
            int progress = dQr.getProgress();
            super.setProgress(i);
            if (progress == dQr.getProgress()) {
                return false;
            }
            dQr.onSizeChanged(dQr.getWidth(), dQr.getHeight(), 0, 0);
            return true;
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.rotate(-90.0f);
        canvas.translate(-getHeight(), 0.0f);
        super.onDraw(canvas);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onMeasure(int i, int i2) {
        synchronized (this) {
            super.onMeasure(i2, i);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(1559369316);
        super.onSizeChanged(i2, i, i4, i3);
        0FI.A0C(-1996461759, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r0 != 3) goto L14;
     */
    @Override // android.widget.AbsSeekBar, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DQr.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.A00 = onSeekBarChangeListener;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        synchronized (this) {
            boolean A1W = 4YV.A1W(i, getProgress());
            super.setProgress(i);
            onSizeChanged(getWidth(), getHeight(), 0, 0);
            if (A1W) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A00;
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onProgressChanged(this, getProgress(), false);
                }
            }
        }
    }
}
