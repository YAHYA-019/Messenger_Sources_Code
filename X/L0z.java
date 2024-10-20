package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: L0z.class */
public final class L0z {
    public Bitmap A00;
    public ViewGroup.LayoutParams A01;
    public ViewGroup A02;
    public KM9 A03;
    public E8b A04;
    public boolean A05;
    public final int A06;
    public final Activity A07;
    public final Context A08;
    public final RectF A09;
    public final RectF A0A;
    public final ViewGroup A0B;
    public final FrameLayout A0C;
    public final ImageView A0D;
    public final boolean A0E;
    public final boolean A0F;

    public L0z(Context context) {
        this.A08 = context;
        Activity A00 = L9X.A00(context);
        if (A00 == null) {
            throw AnonymousClass001.A0N("Rendering fullscreen without an activity");
        }
        this.A07 = A00;
        View A0B = DKD.A0B(A00);
        11T.A0I(A0B, 7zK.A00(0));
        this.A0B = (ViewGroup) A0B;
        this.A0C = new FrameLayout(context);
        this.A03 = KM9.A05;
        this.A0A = DKC.A0D();
        this.A09 = DKC.A0D();
        this.A0D = new ImageView(context);
        this.A06 = 4YU.A0B(A00).orientation;
        Window window = A00.getWindow();
        this.A0F = (AnonymousClass001.A1N(window.getAttributes().flags & 1024) || AnonymousClass001.A1Q(window.getDecorView().getSystemUiVisibility() & 4, 4)) ? false : true;
        this.A0E = AnonymousClass001.A1O(DKD.A0B(A00).getSystemUiVisibility() & 2);
    }

    public static final void A00(L0z l0z) {
        FrameLayout frameLayout = l0z.A0C;
        if (frameLayout.getWindowToken() != null) {
            l0z.A05 = true;
            return;
        }
        if (l0z.A05) {
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 99, 8, -3);
        try {
            Object systemService = l0z.A08.getSystemService("window");
            11T.A0I(systemService, 7zK.A00(1));
            ((ViewManager) systemService).addView(frameLayout, layoutParams);
            l0z.A05 = true;
        } catch (WindowManager.BadTokenException e) {
            FGT.A03("FullScreenCoordinator", e);
        }
    }
}
