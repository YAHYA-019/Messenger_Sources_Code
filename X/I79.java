package X;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

/* loaded from: I79.class */
public final class I79 {
    public Handler A00;
    public HZb A01;

    public static Bitmap A00(View view, I79 i79) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        try {
            return Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e) {
            HZb hZb = i79.A01;
            hZb.A01.A02(new FEd("Insufficient memory to capture a screenshot. Sorry!"));
            AnonymousClass046 anonymousClass046 = hZb.A00;
            AnonymousClass047 ACu = anonymousClass046.ACu("screenshot_error", 30545840);
            ACu.Cmr(e);
            ACu.A8K("message", "Out of memory while creating screenshot");
            ACu.report();
            float f = DKD.A09(view).density;
            if (f < 2.0f) {
                return null;
            }
            float f2 = height;
            if (f2 < f) {
                return null;
            }
            float f3 = width;
            if (f3 < f) {
                return null;
            }
            try {
                return Bitmap.createBitmap((int) (f3 / f), (int) (f2 / f), Bitmap.Config.ARGB_8888);
            } catch (Exception e2) {
                hZb.A01.A02(new FEd("Failed to capture a screenshot. Sorry!"));
                AnonymousClass047 ACu2 = anonymousClass046.ACu("screenshot_error", 30545840);
                ACu2.Cmr(e2);
                ACu2.A8K("message", "Exception while creating screenshot");
                ACu2.report();
                return null;
            }
        }
    }

    public static List A01(06Z r301) {
        try {
            Field declaredField = r301.getClass().getDeclaredField("mAdded");
            declaredField.setAccessible(true);
            List list = (List) declaredField.get(r301);
            declaredField.setAccessible(false);
            if (list != null) {
                return list;
            }
        } catch (Exception e) {
            0fH.A0r("BasicScreenshotCaptureStrategy", "Could not access fragment list for screenshot.", e);
        }
        return AnonymousClass001.A0s();
    }

    public static void A02(Canvas canvas, List list) {
        Dialog dialog;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            0D2 r0 = (Fragment) it.next();
            if (r0 instanceof 0D2) {
                0D2 r02 = r0;
                if (!r02.isHidden() && (dialog = r02.A01) != null) {
                    View decorView = dialog.getWindow().getDecorView();
                    decorView.getLocationOnScreen(GOn.A1b());
                    canvas.translate(r0[0], r0[1]);
                    decorView.draw(canvas);
                    canvas.translate(-r0[0], -r0[1]);
                }
            }
            A02(canvas, A01(((Fragment) r0).getChildFragmentManager()));
        }
    }
}
