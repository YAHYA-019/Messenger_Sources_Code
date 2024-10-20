package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.0As, reason: invalid class name */
/* loaded from: 0As.class */
public abstract class C0As {
    public static final C0Ap A00 = new Object();

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "REMOVED";
            case 1:
                return "VISIBLE";
            case 2:
                return "GONE";
            default:
                return "INVISIBLE";
        }
    }

    public static final void A01(View view, ViewGroup viewGroup, Integer num) {
        ViewGroup viewGroup2;
        int i = 0;
        int intValue = num.intValue();
        if (intValue == 0) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || (viewGroup2 = (ViewGroup) parent) == null) {
                return;
            }
            if (06Z.A0O(2)) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("SpecialEffectsController: Removing view ");
                A0k.append(view);
                AnonymousClass002.A0V(viewGroup2, " from container ", "FragmentManager", A0k);
            }
            viewGroup2.removeView(view);
            return;
        }
        if (intValue == 1) {
            if (06Z.A0O(2)) {
                AnonymousClass001.A1E(" to VISIBLE", "FragmentManager", AnonymousClass001.A0m(view, "SpecialEffectsController: Setting view "));
            }
            ViewParent parent2 = view.getParent();
            if (!(parent2 instanceof ViewGroup) || parent2 == null) {
                if (06Z.A0O(2)) {
                    StringBuilder A0k2 = AnonymousClass001.A0k();
                    A0k2.append("SpecialEffectsController: Adding view ");
                    A0k2.append(view);
                    AnonymousClass002.A0V(viewGroup, " to Container ", "FragmentManager", A0k2);
                }
                viewGroup.addView(view);
            }
        } else if (intValue != 2) {
            i = 4;
            if (06Z.A0O(2)) {
                AnonymousClass001.A1E(" to INVISIBLE", "FragmentManager", AnonymousClass001.A0m(view, "SpecialEffectsController: Setting view "));
            }
        } else {
            if (06Z.A0O(2)) {
                AnonymousClass001.A1E(" to GONE", "FragmentManager", AnonymousClass001.A0m(view, "SpecialEffectsController: Setting view "));
            }
            i = 8;
        }
        view.setVisibility(i);
    }
}
