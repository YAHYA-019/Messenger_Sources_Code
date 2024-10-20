package X;

import android.view.View;

/* loaded from: HL8.class */
public abstract class HL8 {
    public static final View A00(View view, int i) {
        11T.A0F(view, 0);
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw AnonymousClass001.A0N("Required View not found. Your layout is missing the ID requested.");
    }
}
