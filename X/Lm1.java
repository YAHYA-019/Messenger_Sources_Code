package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: Lm1.class */
public final class Lm1 implements Runnable {
    public static final String __redex_internal_original_name = "BaseTransientBottomBar$3";
    public final /* synthetic */ LBS A00;

    public Lm1(LBS lbs) {
        this.A00 = lbs;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        LBS lbs = this.A00;
        JYg jYg = lbs.A0D;
        if (jYg == null || (context = lbs.A0A) == null) {
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int[] A1b = GOn.A1b();
        jYg.getLocationOnScreen(A1b);
        int height = (i - (A1b[1] + jYg.getHeight())) + ((int) jYg.getTranslationY());
        if (height < lbs.A02) {
            ViewGroup.LayoutParams layoutParams = jYg.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                android.util.Log.w("BaseTransientBottomBar", "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += lbs.A02 - height;
            jYg.requestLayout();
        }
    }
}
