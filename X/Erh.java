package X;

import android.view.View;
import com.facebook.inject.FbInjector;
import com.google.common.base.Preconditions;
import java.util.List;

/* loaded from: Erh.class */
public final class Erh {
    public final C00i A00 = FbInjector.A00;

    public void A00(View view, List list, List list2, List list3, int i) {
        boolean z = true;
        Preconditions.checkArgument(AnonymousClass001.A1Q(list.size(), list2.size()), "Expected linkedIds and smallDimenIds list lengths to match");
        if (list.size() != list3.size()) {
            z = false;
        }
        Preconditions.checkArgument(z, "Expected linkedIds and normalDimenIds list lengths to match");
        view.getViewTreeObserver().addOnGlobalLayoutListener(new RkC(view, this, list, list2, list3, i));
    }
}
