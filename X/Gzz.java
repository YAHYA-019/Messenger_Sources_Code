package X;

import com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerView;
import com.facebook.widget.recyclerview.BetterRecyclerView;

/* loaded from: Gzz.class */
public final class Gzz extends C66m {
    public final /* synthetic */ CircularArtPickerView A00;

    public Gzz(CircularArtPickerView circularArtPickerView) {
        this.A00 = circularArtPickerView;
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        float f = (float) c66i.A09.A00;
        CircularArtPickerView circularArtPickerView = this.A00;
        int i = 0;
        while (true) {
            int i2 = i;
            BetterRecyclerView betterRecyclerView = circularArtPickerView.A0i;
            if (i2 >= betterRecyclerView.getChildCount()) {
                circularArtPickerView.A0g.setRotation(f);
                return;
            } else {
                betterRecyclerView.getChildAt(i2).setRotation(f);
                i = i2 + 1;
            }
        }
    }
}
