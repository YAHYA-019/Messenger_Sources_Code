package X;

import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

/* loaded from: L91.class */
public abstract class L91 {
    public boolean A00;
    public int A01;
    public boolean A02;
    public final View A03;
    public final WindowManager A04;
    public final InputMethodManager A05;

    public L91(View view, WindowManager.LayoutParams layoutParams, WindowManager windowManager, InputMethodManager inputMethodManager) {
        this.A03 = view;
        this.A05 = inputMethodManager;
        this.A04 = windowManager;
        view.setLayoutParams(layoutParams);
        A07(true);
    }

    public static void A00(L91 l91) {
        if (l91.A01 > 0) {
            l91.A02 = true;
        } else if (l91.A00) {
            WindowManager windowManager = l91.A04;
            View view = l91.A03;
            windowManager.updateViewLayout(view, view.getLayoutParams());
        }
    }

    public static void A01(L91 l91, int i, boolean z) {
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) l91.A03.getLayoutParams();
        int i2 = layoutParams.flags;
        int i3 = i | i2;
        if (!z) {
            i3 = (i ^ (-1)) & i2;
        }
        if (i2 != i3) {
            layoutParams.flags = i3;
            A00(l91);
        }
    }

    public void A02() {
        if (this.A00) {
            return;
        }
        WindowManager windowManager = this.A04;
        View view = this.A03;
        windowManager.addView(view, view.getLayoutParams());
        this.A00 = true;
        new Handler().post(new LlU(this));
    }

    public void A03() {
        int max = Math.max(0, this.A01 - 1);
        this.A01 = max;
        if (max == 0 && this.A02) {
            A00(this);
            this.A02 = false;
        }
    }

    public void A04() {
        InputMethodManager inputMethodManager;
        if (this.A00) {
            View view = this.A03;
            if ((((WindowManager.LayoutParams) view.getLayoutParams()).flags & 8) != 8 && (inputMethodManager = this.A05) != null) {
                7zR.A12(view, inputMethodManager);
            }
            this.A04.removeView(view);
            this.A00 = false;
        }
    }

    public void A05() {
        int i = this.A01;
        if (i == 0) {
            this.A02 = false;
        }
        this.A01 = i + 1;
    }

    public void A06(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int width = rect.width();
        int height = rect.height();
        A05();
        A05();
        A01(this, 512, false);
        View view = this.A03;
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
        if (layoutParams.x != i) {
            layoutParams.x = i;
            A00(this);
        }
        A03();
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) view.getLayoutParams();
        if (layoutParams2.y != i2) {
            layoutParams2.y = i2;
            A00(this);
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3.width != width) {
            layoutParams3.width = width;
            A00(this);
        }
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        if (layoutParams4.height != height) {
            layoutParams4.height = height;
            A00(this);
        }
        A03();
    }

    public void A07(boolean z) {
        A05();
        A01(this, 512, z);
        int i = 0;
        if (z) {
            i = 10000;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.A03.getLayoutParams();
        if (layoutParams.x != i) {
            layoutParams.x = i;
            A00(this);
        }
        A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if ((r0.flags & 512) == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A08() {
        /*
            r301 = this;
            r0 = r301
            android.view.View r0 = r0.A03
            r302 = r0
            r0 = r302
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.WindowManager$LayoutParams r0 = (android.view.WindowManager.LayoutParams) r0
            r303 = r0
            r0 = r303
            int r0 = r0.x
            r304 = r0
            r0 = 10000(0x2710, float:1.4013E-41)
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L2d
            r0 = r303
            int r0 = r0.flags
            r1 = 512(0x200, float:7.17E-43)
            r0 = r0 & r1
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L32
        L2d:
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
        L32:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L91.A08():boolean");
    }
}
