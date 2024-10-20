package androidx.appcompat.widget;

import X.0FI;
import X.0Sk;
import X.6QN;
import X.C7ya;
import X.DKC;
import X.LLg;
import X.LQD;
import X.MB5;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: ContentFrameLayout.class */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue A00;
    public TypedValue A01;
    public TypedValue A02;
    public TypedValue A03;
    public TypedValue A04;
    public TypedValue A05;
    public MB5 A06;
    public final Rect A07;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A07 = DKC.A0C();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(212873832);
        super.onAttachedToWindow();
        0FI.A0C(-1668530698, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-227356373);
        super.onDetachedFromWindow();
        LLg lLg = this.A06;
        if (lLg != null) {
            6QN r0 = lLg.A00;
            C7ya c7ya = r0.A0N;
            if (c7ya != null) {
                c7ya.ANh();
            }
            if (r0.A0B != null) {
                r0.A0A.getDecorView().removeCallbacks(r0.A0Q);
                if (r0.A0B.isShowing()) {
                    try {
                        r0.A0B.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                r0.A0B = null;
            }
            0Sk r02 = r0.A0O;
            if (r02 != null) {
                r02.A01();
            }
            LQD lqd = r0.A0X(0).A0A;
            if (lqd != null) {
                lqd.close();
            }
        }
        0FI.A0C(1192132330, A06);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }
}
