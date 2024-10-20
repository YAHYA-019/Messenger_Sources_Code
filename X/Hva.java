package X;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: Hva.class */
public final class Hva {
    public static final void A00(ViewGroup viewGroup, Hva hva, List list) {
        Object cast;
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= childCount) {
                return;
            }
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof ViewGroup) {
                A00((ViewGroup) childAt, hva, list);
            }
            if (TextureView.class.isInstance(childAt) && (cast = TextureView.class.cast(childAt)) != null) {
                list.add(cast);
            }
            i = i2 + 1;
        }
    }
}
