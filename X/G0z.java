package X;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import com.facebook.ui.legacynavbar.LegacyNavigationBar;

/* loaded from: G0z.class */
public final class G0z implements Runnable {
    public static final String __redex_internal_original_name = "LegacyNavigationBar$2";
    public final /* synthetic */ LegacyNavigationBar A00;

    public G0z(LegacyNavigationBar legacyNavigationBar) {
        this.A00 = legacyNavigationBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int color;
        LegacyNavigationBar legacyNavigationBar = this.A00;
        if (0AU.A00(21) && legacyNavigationBar.A0H()) {
            Context context = legacyNavigationBar.getContext();
            if (context instanceof Activity) {
                11T.A0I(context, 7zK.A00(2));
                Window window = ((Activity) context).getWindow();
                if (window == null || context == null) {
                    return;
                }
                1tJ.A09(window, false);
                if (0AU.A00(23)) {
                    int[] iArr = 2Mg.A00;
                    1tJ.A07(window, EVf.A00(context, iArr));
                    if (1BK.A0L(16387).AZk(72339378272011079L) && 1BK.A0L(16387).AZk(72339378263687912L)) {
                        2MR r0 = 2MR.A19;
                        2Mg r02 = 2Me.A02;
                        color = r02.A03(context, r0);
                        int A03 = r02.A03(context, 2MR.A03);
                        if (EVf.A00(context, iArr)) {
                            color = A03;
                        }
                    } else {
                        color = 7zM.A02(context, 2MR.A19);
                    }
                } else {
                    color = context.getColor(2132213820);
                }
                1tJ.A06(window, color);
            }
        }
    }
}
