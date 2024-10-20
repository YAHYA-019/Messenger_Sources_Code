package X;

import com.facebook.messaging.montage.util.colors.MontageBackgroundColor;
import java.util.List;

/* loaded from: Hyw.class */
public final class Hyw {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;

    public Hyw(int[] iArr, int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = iArr;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.messaging.montage.util.colors.MontageBackgroundColor, java.lang.Object] */
    public static MontageBackgroundColor A00(List list, int i) {
        int[] iArr = ((Hyw) list.get(i)).A03;
        11T.A0F(iArr, 1);
        ?? obj = new Object();
        obj.A01 = iArr;
        return obj;
    }
}
