package X;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: I6q.class */
public abstract class I6q {
    public static final IBB A01 = new IBB(1280, 720);
    public static final IBB A00 = new IBB(1920, 1080);

    public static List A00(IBB ibb, List list) {
        int size = list.size();
        ArrayList A0t = AnonymousClass001.A0t(size);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return Collections.unmodifiableList(A0t);
            }
            IBB ibb2 = (IBB) list.get(i2);
            int i3 = ibb2.A02;
            int i4 = ibb.A02;
            if ((i3 <= i4 && ibb2.A01 <= ibb.A01) || (ibb2.A02 <= ibb.A01 && ibb2.A01 <= i4)) {
                A0t.add(ibb2);
            }
            i = i2 + 1;
        }
    }

    public static List A01(Size[] sizeArr) {
        int length;
        if (sizeArr == null || (length = sizeArr.length) == 0) {
            return Collections.emptyList();
        }
        ArrayList A0t = AnonymousClass001.A0t(length);
        int i = 0;
        do {
            A0t.add(new IBB(sizeArr[i].getWidth(), sizeArr[i].getHeight()));
            i++;
        } while (i < length);
        return Collections.unmodifiableList(A0t);
    }
}
