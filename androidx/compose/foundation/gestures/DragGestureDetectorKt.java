package androidx.compose.foundation.gestures;

import X.KiX;
import X.Kts;
import java.util.List;

/* loaded from: DragGestureDetectorKt.class */
public abstract class DragGestureDetectorKt {
    public static final float A00 = 0.125f / 18.0f;

    public static final boolean A00(KiX kiX, long j) {
        Object obj;
        List list = kiX.A02;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (((Kts) obj).A05 == j) {
                break;
            }
            i = i2 + 1;
        }
        Kts kts = (Kts) obj;
        if (kts != null && kts.A0B) {
            z = true;
        }
        return !z;
    }
}
