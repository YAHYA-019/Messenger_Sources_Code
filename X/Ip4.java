package X;

import android.R;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupMenu;

/* loaded from: Ip4.class */
public final class Ip4 implements Runnable {
    public static final String __redex_internal_original_name = "ImagePerfOverlay$updateConfigWithLatestSharedPreferences$1";
    public final /* synthetic */ 1cD A00;

    public Ip4(1cD r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GV8 gv8;
        1cD r0 = this.A00;
        WindowManager windowManager = r0.A01;
        if (windowManager != null) {
            r0.A00 = new WindowManager.LayoutParams(-1, -1, 2038, 24, -3);
            GV8 gv82 = new GV8(7zL.A09());
            r0.A03 = gv82;
            if (!gv82.isShown()) {
                C00i c00i = r0.A07.A00;
                if (((1Rv) c00i.get()).A0B()) {
                    WindowManager.LayoutParams layoutParams = r0.A00;
                    if (layoutParams == null) {
                        11T.A0L("layoutParams");
                        throw 0Q8.createAndThrow();
                    }
                    windowManager.addView(gv82, layoutParams);
                } else if (!r0.A0A) {
                    ((1Rv) c00i.get()).A03();
                    r0.A0A = true;
                }
            }
        }
        WindowManager windowManager2 = r0.A01;
        if (windowManager2 != null && (gv8 = r0.A03) != null) {
            Button button = new Button(7zL.A09());
            r0.A02 = button;
            AbH.A1K(button, 7zL.A09().getColor(R.color.holo_blue_dark));
            button.setText(" Overlay options ");
            PopupMenu popupMenu = new PopupMenu(7zL.A09(), button);
            popupMenu.getMenu().add(0, 1, 1, "Hide overlay");
            popupMenu.getMenu().add(0, 2, 2, "Highlight outliers");
            popupMenu.getMenu().add(0, 3, 3, "Show full calling class + context chain");
            popupMenu.getMenu().add(0, 4, 4, "Show full counter labels");
            popupMenu.getMenu().add(0, 5, 5, "Clear entire overlay (counters + overall)");
            popupMenu.getMenu().add(0, 6, 6, "Clear counters, keep overall");
            popupMenu.setOnMenuItemClickListener(new IL7(gv8));
            IKE.A01(button, popupMenu, 5);
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-2, -2, 2038, 8388616, -1);
            layoutParams2.gravity = 85;
            if (!button.isShown()) {
                C00i c00i2 = r0.A07.A00;
                if (((1Rv) c00i2.get()).A0B()) {
                    windowManager2.addView(button, layoutParams2);
                } else if (!r0.A0A) {
                    ((1Rv) c00i2.get()).A03();
                    r0.A0A = true;
                }
            }
        }
        GV8 gv83 = r0.A03;
        if (gv83 != null) {
            C0ft.A03(new IR3(r0, gv83));
        }
    }
}
