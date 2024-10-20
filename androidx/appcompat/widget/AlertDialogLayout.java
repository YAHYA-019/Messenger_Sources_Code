package androidx.appcompat.widget;

import X.DKE;
import X.JQx;
import X.JQy;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: AlertDialogLayout.class */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context, null);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int A00(View view) {
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight <= 0) {
            minimumHeight = 0;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getChildCount() == 1) {
                    return A00(viewGroup.getChildAt(0));
                }
            }
        }
        return minimumHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r302, int r303, int r304, int r305, int r306) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i8 >= childCount) {
                int mode = View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i2);
                int mode2 = View.MeasureSpec.getMode(i);
                int A07 = JQy.A07(this);
                if (view != null) {
                    view.measure(i, 0);
                    A07 += view.getMeasuredHeight();
                    i3 = JQx.A0G(view, 0);
                } else {
                    i3 = 0;
                }
                if (view2 != null) {
                    view2.measure(i, 0);
                    i4 = A00(view2);
                    i5 = view2.getMeasuredHeight() - i4;
                    A07 += i4;
                    i3 = JQx.A0G(view2, i3);
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (view3 != null) {
                    view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(JQx.A0C(size, A07, 0), mode));
                    i6 = view3.getMeasuredHeight();
                    A07 += i6;
                    i3 = JQx.A0G(view3, i3);
                } else {
                    i6 = 0;
                }
                int i9 = size - A07;
                if (view2 != null) {
                    int i10 = A07 - i4;
                    int min = Math.min(i9, i5);
                    if (min > 0) {
                        i9 -= min;
                        i4 += min;
                    }
                    JQx.A1A(view2, i4, 1073741824, i);
                    A07 = i10 + view2.getMeasuredHeight();
                    i3 = JQx.A0G(view2, i3);
                }
                if (view3 != null && i9 > 0) {
                    JQx.A1A(view3, i6 + i9, mode, i);
                    A07 = (A07 - i6) + view3.getMeasuredHeight();
                    i3 = JQx.A0G(view3, i3);
                }
                int i11 = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() != 8) {
                        i11 = Math.max(i11, childAt.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(i11 + DKE.A07(this), i, i3), View.resolveSizeAndState(A07, i2, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt2 = getChildAt(i13);
                        if (childAt2.getVisibility() != 8) {
                            ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                            if (layoutParams.width == -1) {
                                int i14 = layoutParams.height;
                                layoutParams.height = childAt2.getMeasuredHeight();
                                measureChildWithMargins(childAt2, makeMeasureSpec, 0, i2, 0);
                                layoutParams.height = i14;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            View childAt3 = getChildAt(i8);
            if (childAt3.getVisibility() != 8) {
                int id = childAt3.getId();
                if (id == 2131368132) {
                    view = childAt3;
                } else if (id == 2131362719) {
                    view2 = childAt3;
                } else if ((id == 2131363334 || id == 2131363497) && view3 == null) {
                    view3 = childAt3;
                }
            }
            i7 = i8 + 1;
        }
        super.onMeasure(i, i2);
    }
}
