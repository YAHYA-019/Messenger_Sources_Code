package X;

import android.os.Build;
import kotlin.jvm.functions.Function1;

/* loaded from: Kjw.class */
public final class Kjw {
    public final KoU A00;
    public final C00m A01;
    public final C00m A02;
    public final Function1 A03;

    public Kjw(KoU koU, C00m c00m, C00m c00m2, Function1 function1) {
        this.A00 = koU;
        this.A02 = c00m;
        this.A01 = c00m2;
        this.A03 = function1;
        if (Build.VERSION.SDK_INT >= 34) {
            11T.A0D(koU);
        }
    }
}
