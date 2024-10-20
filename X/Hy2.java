package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Hy2.class */
public final class Hy2 {
    public final I4V A00 = I4V.A00();
    public final AtomicBoolean A01 = new AtomicBoolean();

    public static HZi A00(Hy2 hy2, JJE jje) {
        HZi hZi;
        List list = hy2.A00.A00;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                hZi = null;
                break;
            }
            hZi = (HZi) list.get(i2);
            if (hZi.A00 == jje) {
                break;
            }
            i = i2 + 1;
        }
        return hZi;
    }
}
