package X;

import android.os.Handler;
import com.facebook.smartcapture.components.RectDetectionVisualizerView;

/* loaded from: G0x.class */
public final class G0x implements Runnable {
    public static final String __redex_internal_original_name = "RectDetectionVisualizerView$iterateAnimation$1";
    public final /* synthetic */ RectDetectionVisualizerView A00;

    public G0x(RectDetectionVisualizerView rectDetectionVisualizerView) {
        this.A00 = rectDetectionVisualizerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        RectDetectionVisualizerView rectDetectionVisualizerView = this.A00;
        int[] iArr = rectDetectionVisualizerView.A02;
        if (iArr != null) {
            int[] iArr2 = rectDetectionVisualizerView.A01;
            if (iArr2 == null) {
                iArr2 = new int[iArr.length];
                rectDetectionVisualizerView.A01 = iArr2;
            }
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                iArr2[i] = (int) (iArr2[i] + (0.3f * (iArr[i] - r0)));
            }
        }
        if (rectDetectionVisualizerView.A01 != null) {
            rectDetectionVisualizerView.postInvalidate();
        }
        Handler handler = rectDetectionVisualizerView.A00;
        if (handler != null) {
            handler.postDelayed(this, 33);
        }
    }
}
