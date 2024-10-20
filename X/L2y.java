package X;

import android.content.res.TypedArray;
import com.facebook.inject.FbInjector;
import java.util.ArrayList;

/* loaded from: L2y.class */
public final class L2y {
    public MFZ A00;
    public final C00i A01 = FbInjector.A00;

    public static void A00(C00i c00i, LXb lXb) {
        lXb.A05 = ((L2y) c00i.get()).A01();
    }

    public MFZ A01() {
        LXe lXe = this.A00;
        if (lXe == null) {
            C00i c00i = this.A01;
            lXe = new LXe(1BL.A0B(c00i).getDimension(2132279620), 1BL.A0B(c00i).getDimension(2132279369));
            this.A00 = lXe;
        }
        return lXe;
    }

    public ArrayList A02(int i) {
        ArrayList A0s = AnonymousClass001.A0s();
        TypedArray obtainTypedArray = 1BL.A0B(this.A01).obtainTypedArray(i);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= obtainTypedArray.length()) {
                obtainTypedArray.recycle();
                return A0s;
            }
            A0s.add(obtainTypedArray.getDrawable(i3));
            i2 = i3 + 1;
        }
    }
}
