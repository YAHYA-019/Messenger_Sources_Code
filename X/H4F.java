package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.montage.composer.ColorAdjustmentGLSurfaceView;
import com.facebook.messaging.photos.editing.ColorAdjustmentControlsLayout;
import com.facebook.widget.CustomFrameLayout;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: H4F.class */
public final class H4F extends CustomFrameLayout {
    public HRY A00;
    public ColorAdjustmentControlsLayout A01;
    public HashMap A02;

    public void A0V() {
        if (this.A01 != null) {
            boolean A0Y = A0Y();
            GoE goE = this.A01.A01;
            if (A0Y) {
                if (goE != null) {
                    goE.A01();
                }
            } else if (goE != null) {
                goE.A00();
            }
        }
    }

    public void A0W() {
        C12 c12;
        ColorAdjustmentGLSurfaceView colorAdjustmentGLSurfaceView;
        for (HAH hah : HAH.values()) {
            AnonymousClass001.A1A(hah, this.A02, 0);
        }
        ColorAdjustmentControlsLayout colorAdjustmentControlsLayout = this.A01;
        if (colorAdjustmentControlsLayout != null) {
            GoE goE = colorAdjustmentControlsLayout.A01;
            if (goE != null) {
                goE.A00();
            }
            ColorAdjustmentControlsLayout colorAdjustmentControlsLayout2 = this.A01;
            colorAdjustmentControlsLayout2.A04.setProgress(100);
            colorAdjustmentControlsLayout2.A0V(0);
        }
        HRY hry = this.A00;
        if (hry == null || (c12 = hry.A00.A0A) == null) {
            return;
        }
        IQ1 iq1 = c12.A00;
        CallerContext callerContext = IQ1.A1m;
        HoK hoK = iq1.A03;
        if (hoK == null || (colorAdjustmentGLSurfaceView = hoK.A01) == null) {
            return;
        }
        Rj4 rj4 = colorAdjustmentGLSurfaceView.A00;
        float f = 0.0f / 100.0f;
        rj4.A00 = f;
        rj4.A01 = f;
        rj4.A02 = f;
        rj4.A03 = f;
        colorAdjustmentGLSurfaceView.requestRender();
    }

    public void A0X(HAH hah) {
        ColorAdjustmentControlsLayout colorAdjustmentControlsLayout = this.A01;
        if (colorAdjustmentControlsLayout != null) {
            colorAdjustmentControlsLayout.A0W(hah);
            HashMap hashMap = this.A02;
            if (!hashMap.containsKey(hah)) {
                AnonymousClass001.A1A(hah, hashMap, 0);
            }
            ColorAdjustmentControlsLayout colorAdjustmentControlsLayout2 = this.A01;
            int A0E = GOq.A0E(hah, hashMap);
            colorAdjustmentControlsLayout2.A04.setProgress(A0E + 100);
            colorAdjustmentControlsLayout2.A0V(A0E);
        }
    }

    public boolean A0Y() {
        Iterator A13 = GOo.A13(this.A02);
        while (A13.hasNext()) {
            if (DKE.A0F(A13) != 0) {
                return true;
            }
        }
        return false;
    }
}
