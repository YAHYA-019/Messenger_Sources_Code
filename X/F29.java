package X;

import android.view.MotionEvent;
import android.view.View;
import java.util.BitSet;

/* loaded from: F29.class */
public abstract class F29 {
    public static DtL A00(1LI r301, 1Iw r302, GHz gHz, boolean z) {
        DtL dtL = new DtL(r302, new DxW());
        DxW dxW = dtL.A01;
        dxW.A00 = 7zQ.A0T(r301);
        BitSet bitSet = dtL.A02;
        bitSet.set(1);
        dxW.A01 = gHz;
        bitSet.set(0);
        dtL.A2Q(z);
        if (gHz instanceof FkU) {
            E45 e45 = (E45) ((FkU) gHz);
            String str = e45.A00;
            if (str == null) {
                str = Integer.toString(e45.A04.Acj());
                e45.A00 = str;
            }
            dtL.A2J(str);
        }
        return dtL;
    }

    public static boolean A01(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        boolean z = false;
        if (iArr[0] <= rawX && rawX <= r0 + view.getWidth()) {
            if (iArr[1] <= rawY && rawY <= r0 + view.getHeight()) {
                z = true;
            }
        }
        return z;
    }
}
