package X;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* loaded from: L58.class */
public final class L58 {
    public View A00;
    public View A01;
    public Jvp A02;
    public Jvq A03;
    public final Rect A04 = DKC.A0C();
    public final Runnable A06 = new LlV(this);
    public final Handler A05 = AnonymousClass001.A07();

    /* JADX WARN: Type inference failed for: r0v20, types: [X.L91, X.Jvp] */
    public L58(View view, View view2, WindowManager windowManager, InputMethodManager inputMethodManager, boolean z) {
        this.A00 = view;
        this.A01 = view2;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2038, 65816, -3);
        if (z) {
            layoutParams.flags |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
        }
        layoutParams.gravity = 51;
        layoutParams.softInputMode = 16;
        layoutParams.layoutInDisplayCutoutMode = 1;
        ?? l91 = new L91(view, layoutParams, windowManager, inputMethodManager);
        this.A02 = l91;
        l91.A02();
        Jvq jvq = new Jvq(this.A01, windowManager);
        this.A03 = jvq;
        jvq.A03.setOnTouchListener(new LKW(this, 6));
        this.A03.A02();
    }

    public static void A00(L58 l58) {
        l58.A05.removeCallbacksAndMessages(null);
        Jvq jvq = l58.A03;
        jvq.A06(l58.A04);
        jvq.A02.setVisibility(0);
        l58.A02.A09();
    }

    public void A01() {
        this.A05.removeCallbacksAndMessages(null);
        Jvp jvp = this.A02;
        jvp.A05();
        L91.A01(jvp, 8, false);
        L91.A01(jvp, 16, false);
        jvp.A07(false);
        jvp.A03();
        this.A03.A07(true);
        if (jvp.A00) {
            return;
        }
        jvp.A02();
    }

    public void A02() {
        this.A05.removeCallbacksAndMessages(null);
        Jvq jvq = this.A03;
        jvq.A02.setVisibility(4);
        jvq.A06(this.A04);
        Jvp jvp = this.A02;
        jvp.A05();
        InputMethodManager inputMethodManager = jvp.A05;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(jvp.A03.getWindowToken(), 0);
        }
        L91.A01(jvp, 8, true);
        L91.A01(jvp, 16, true);
        jvp.A07(false);
        jvp.A03();
        if (jvp.A00) {
            return;
        }
        jvp.A02();
    }

    public void A03(boolean z) {
        Jvq jvq;
        int i = 0;
        View view = this.A00;
        if (z) {
            view.setBackgroundDrawable(new ColorDrawable(Color.argb(127, 0, 255, 0)));
            jvq = this.A03;
            i = Color.argb(127, 0, 0, 255);
        } else {
            view.setBackgroundDrawable(new ColorDrawable(0));
            jvq = this.A03;
        }
        AbH.A1K(jvq.A03, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r301.A03.A08() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04() {
        /*
            r301 = this;
            r0 = r301
            X.Jvp r0 = r0.A02
            r302 = r0
            r0 = r302
            boolean r0 = r0.A08()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1e
            r0 = r301
            X.Jvq r0 = r0.A03
            r302 = r0
            r0 = r302
            boolean r0 = r0.A08()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L22
        L1e:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L22:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L58.A04():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r0.A02.getVisibility() != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A05() {
        /*
            r301 = this;
            r0 = r301
            X.Jvp r0 = r0.A02
            r302 = r0
            r0 = r302
            boolean r0 = r0.A08()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2e
            r0 = r301
            X.Jvq r0 = r0.A03
            r304 = r0
            r0 = r304
            boolean r0 = r0.A08()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L2e
            r0 = r304
            android.view.View r0 = r0.A02
            r302 = r0
            r0 = r302
            int r0 = r0.getVisibility()
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L32
        L2e:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L32:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L58.A05():boolean");
    }
}
