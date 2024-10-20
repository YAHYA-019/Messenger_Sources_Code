package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.TouchDelegate;
import com.facebook.messaging.rtc.incall.impl.active.ActiveCallControls;
import com.facebook.resources.ui.FbImageButton;

/* loaded from: Iwp.class */
public final class Iwp implements Runnable {
    public static final String __redex_internal_original_name = "ActiveCallControls$updateCallSettingsTouchDelegate$1";
    public final /* synthetic */ ActiveCallControls A00;
    public final /* synthetic */ boolean A01;

    public Iwp(ActiveCallControls activeCallControls, boolean z) {
        this.A01 = z;
        this.A00 = activeCallControls;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TouchDelegate touchDelegate;
        boolean z = this.A01;
        ActiveCallControls activeCallControls = this.A00;
        if (z) {
            Resources resources = activeCallControls.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(2132279347);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(2132279315);
            Rect A0C = DKC.A0C();
            FbImageButton fbImageButton = activeCallControls.A0R;
            if (fbImageButton == null) {
                return;
            }
            fbImageButton.getHitRect(A0C);
            int height = (dimensionPixelSize - A0C.height()) / 2;
            int width = (dimensionPixelSize2 - A0C.width()) / 2;
            A0C.top -= height;
            A0C.right += width;
            A0C.bottom += height;
            A0C.left -= width;
            touchDelegate = new TouchDelegate(A0C, activeCallControls.A0R);
        } else {
            touchDelegate = null;
        }
        activeCallControls.setTouchDelegate(touchDelegate);
    }
}
