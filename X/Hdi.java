package X;

import android.os.Environment;
import java.io.File;

/* loaded from: Hdi.class */
public final class Hdi {
    public final 1Br A00;
    public final 1Br A01;
    public final File A02;

    public Hdi() {
        1Br A00 = 1Bq.A00(116153);
        this.A01 = A00;
        this.A00 = 1Bu.A00(99944);
        1Br.A0C(A00);
        synchronized (0LL.class) {
        }
        this.A02 = AnonymousClass001.A0D(Environment.getExternalStorageDirectory(), (String) 1Br.A0B(this.A00));
    }
}
