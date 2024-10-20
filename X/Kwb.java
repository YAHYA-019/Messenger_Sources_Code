package X;

import android.graphics.RectF;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: Kwb.class */
public class Kwb {
    public static RectF A00(View view, TabLayout tabLayout) {
        float left;
        float top;
        float right;
        float bottom;
        if (view == null) {
            return DKC.A0D();
        }
        if (tabLayout.A0N || !(view instanceof JZ1)) {
            left = view.getLeft();
            top = view.getTop();
            right = view.getRight();
            bottom = view.getBottom();
        } else {
            JZ1 jz1 = (JZ1) view;
            int i = 0;
            View[] viewArr = {jz1.A02, jz1.A01, null};
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            do {
                View view2 = viewArr[i];
                if (view2 != null && view2.getVisibility() == 0) {
                    if (z) {
                        i3 = Math.min(i3, view2.getLeft());
                        i2 = Math.max(i2, view2.getRight());
                    } else {
                        i3 = view2.getLeft();
                        i2 = view2.getRight();
                    }
                    z = true;
                }
                i++;
            } while (i < 3);
            int i4 = i2 - i3;
            int i5 = 0;
            View[] viewArr2 = {jz1.A02, jz1.A01, null};
            int i6 = 0;
            int i7 = 0;
            boolean z2 = false;
            do {
                View view3 = viewArr2[i5];
                if (view3 != null && view3.getVisibility() == 0) {
                    if (z2) {
                        i7 = Math.min(i7, view3.getTop());
                        i6 = Math.max(i6, view3.getBottom());
                    } else {
                        i7 = view3.getTop();
                        i6 = view3.getBottom();
                    }
                    z2 = true;
                }
                i5++;
            } while (i5 < 3);
            int i8 = i6 - i7;
            int A00 = (int) KwZ.A00(jz1.getContext(), 24);
            if (i4 < A00) {
                i4 = A00;
            }
            int left2 = (jz1.getLeft() + jz1.getRight()) / 2;
            int top2 = (jz1.getTop() + jz1.getBottom()) / 2;
            int i9 = i4 / 2;
            int i10 = left2 - i9;
            left = i10;
            top = top2 - (i8 / 2);
            right = i9 + left2;
            bottom = top2 + (left2 / 2);
        }
        return new RectF(left, top, right, bottom);
    }
}
