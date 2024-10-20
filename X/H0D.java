package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: H0D.class */
public final class H0D extends C66m {
    public final LinkedList A00 = AbF.A1F();

    private final void A00(View view, float f) {
        if (!(view instanceof ViewGroup)) {
            view.setRotation(f);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            11T.A0A(childAt);
            A00(childAt, f);
        }
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        float A01 = (float) GOq.A01(c66i);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            11T.A0D(view);
            A00(view, A01);
        }
    }
}
