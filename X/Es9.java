package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.widget.CustomLinearLayout;

/* loaded from: Es9.class */
public final class Es9 {
    public CustomLinearLayout A00;

    public static void A00(View view, Es9 es9) {
        es9.A01(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r307v0, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r307v1 */
    /* JADX WARN: Type inference failed for: r307v2 */
    public void A01(View... viewArr) {
        View view;
        int length = viewArr.length;
        CustomLinearLayout customLinearLayout = this.A00;
        if (length == 1) {
            view = viewArr[0];
        } else {
            view = (ViewGroup) DKD.A0A(customLinearLayout).inflate(2132542030, (ViewGroup) customLinearLayout, false);
            for (View view2 : viewArr) {
                view.addView(view2, new LinearLayout.LayoutParams(0, -2, 1.0f));
            }
        }
        customLinearLayout.addView(view);
    }
}
