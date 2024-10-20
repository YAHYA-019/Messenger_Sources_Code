package X;

import android.content.res.Resources;
import com.facebook.common.draggableview.DraggableViewContainer;
import com.facebook.user.model.UserKey;
import com.facebook.widget.RoundedCornersFrameLayout;

/* loaded from: Ig1.class */
public final class Ig1 implements JKR {
    public final /* synthetic */ GvG A00;

    public Ig1(GvG gvG) {
        this.A00 = gvG;
    }

    public void CAs() {
    }

    public void CFy() {
        int i;
        int i2;
        GvG gvG = this.A00;
        C2630Gjf ADL = gvG.A02.ADL();
        C2630Gjf c2630Gjf = ADL != null ? new C2630Gjf(ADL.A01, ADL.A00, 6) : new C2630Gjf();
        DraggableViewContainer draggableViewContainer = gvG.A01;
        int width = draggableViewContainer.getWidth() * draggableViewContainer.getHeight();
        float f = width * 0.08f;
        if (width <= 0 || f <= 0.0f || (i = c2630Gjf.A00) <= 0 || (i2 = c2630Gjf.A01) <= 0) {
            c2630Gjf = new C2630Gjf();
        } else {
            float f2 = i;
            float f3 = f * f2;
            float f4 = i2;
            int sqrt = (int) Math.sqrt(f3 / f4);
            c2630Gjf.A01 = (int) ((sqrt * f4) / f2);
            c2630Gjf.A00 = sqrt;
        }
        RoundedCornersFrameLayout roundedCornersFrameLayout = gvG.A03;
        int i3 = c2630Gjf.A01;
        int i4 = c2630Gjf.A00;
        Resources resources = gvG.getResources();
        DraggableViewContainer.A03(null, roundedCornersFrameLayout, null, draggableViewContainer, null, i3, i4, resources.getDimensionPixelSize(2132279298), resources.getDimensionPixelSize(2132279342), resources.getDimensionPixelSize(2132279298), resources.getDimensionPixelSize(2132279451), true);
    }

    public void CKs(UserKey userKey) {
    }
}
