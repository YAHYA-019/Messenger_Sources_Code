package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerView;

/* loaded from: GX2.class */
public final class GX2 extends 2kG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CircularArtPickerView A01;
    public final /* synthetic */ boolean A02;

    public GX2(CircularArtPickerView circularArtPickerView, int i, boolean z) {
        this.A01 = circularArtPickerView;
        this.A02 = z;
        this.A00 = i;
    }

    public void A05(Rect rect, View view, 2NQ r304, RecyclerView recyclerView) {
        boolean z = this.A02;
        int i = this.A00;
        if (z) {
            rect.top = i;
        } else {
            rect.left = i;
        }
    }
}
