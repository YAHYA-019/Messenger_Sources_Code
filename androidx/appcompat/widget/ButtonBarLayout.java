package androidx.appcompat.widget;

import X.53Y;
import X.C0Ad;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: ButtonBarLayout.class */
public class ButtonBarLayout extends LinearLayout {
    public boolean A00;
    public int A01;
    public boolean A02;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = -1;
        int[] iArr = 53Y.A0A;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C0Ad.A07(context, obtainStyledAttributes, attributeSet, this, iArr, 0, 0);
        this.A02 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            A00(this.A02);
        }
    }

    private void A00(boolean z) {
        if (this.A00 == z) {
            return;
        }
        if (z && !this.A02) {
            return;
        }
        this.A00 = z;
        setOrientation(z ? 1 : 0);
        int i = 80;
        if (z) {
            i = 8388613;
        }
        setGravity(i);
        View findViewById = findViewById(2131367503);
        if (findViewById != null) {
            int i2 = 4;
            if (z) {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
        int childCount = getChildCount();
        int i3 = -2;
        while (true) {
            int i4 = childCount + i3;
            if (i4 < 0) {
                return;
            }
            bringChildToFront(getChildAt(i4));
            childCount = i4;
            i3 = -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a4, code lost:
    
        if (r304 != false) goto L22;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }
}
