package X;

import android.graphics.Color;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* loaded from: I6p.class */
public abstract class I6p {
    public static final C01i A00 = C01g.A01(J9i.A00);

    public static final int[] A00() {
        int[] A1b = GOn.A1b();
        A1b[0] = -12369090;
        A1b[1] = -8355712;
        return A1b;
    }

    public static final int[] A01(HzK hzK) {
        int[] iArr = {-12369090, -8355712};
        Iterator A1G = GOn.A1G(A00.getValue());
        while (A1G.hasNext()) {
            Function2 function2 = (Function2) A1G.next();
            if (iArr[0] != -12369090) {
                if (iArr[1] != -8355712) {
                    break;
                }
                iArr[1] = AnonymousClass001.A03(function2.invoke(hzK, -8355712));
            } else {
                iArr[0] = AnonymousClass001.A03(function2.invoke(hzK, -12369090));
            }
        }
        int i = iArr[0];
        iArr[0] = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
        int i2 = iArr[1];
        iArr[1] = Color.rgb(Color.red(i2), Color.green(i2), Color.blue(i2));
        return iArr;
    }
}
