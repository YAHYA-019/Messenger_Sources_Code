package com.facebook.messaging.rtc.incall.impl.effect.uicontrol;

import X.11T;
import X.1BL;
import X.2NB;
import X.2NQ;
import X.C2lg;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: PickerLayoutManager.class */
public final class PickerLayoutManager extends LinearLayoutManager {
    public int A00;
    public int A01;

    private final void A00() {
        int A0U = A0U();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A0U) {
                return;
            }
            float f = 1.0f;
            View A0d = A0d(i2);
            if (A0d != null) {
                float right = ((A0d.getRight() + ((C2lg) A0d.getLayoutParams()).A02.right) + (A0d.getLeft() - ((C2lg) A0d.getLayoutParams()).A02.left)) / 2.0f;
                int i3 = this.A00;
                float f2 = i3;
                if (right < f2 && i3 > 0) {
                    f = Math.max(0.0f, right) / f2;
                }
                A0d.setScaleX(f);
                A0d.setScaleY(f);
                A0d.setAlpha(f);
                int i4 = 0;
                if (f < 0.2f) {
                    i4 = 8;
                }
                A0d.setVisibility(i4);
            }
            i = i2 + 1;
        }
    }

    public int A0X() {
        return this.A00;
    }

    public int A0Y() {
        return this.A01;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A15(2NB r302, 2NQ r303, int i) {
        1BL.A1F(r302, r303);
        if (super.A01 != 0) {
            return 0;
        }
        A00();
        return super.A15(r302, r303, i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1T(2NQ r302) {
        11T.A0F(r302, 0);
        super.A1T(r302);
        A00();
    }
}
