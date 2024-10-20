package X;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

/* loaded from: A98.class */
public final class A98 implements 7Lc {
    public final int A00;
    public final Object A01;

    public A98(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CFT(String[] strArr) {
        if (this.A00 != 0) {
            C9lz c9lz = (C9lz) this.A01;
            c9lz.A07 = 02L.A05(strArr);
            c9lz.A06 = 02L.A05(strArr);
            C9lz.A02(c9lz);
            return;
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            Uri A01 = ((C9gv) 1Br.A0B(((A7Q) this.A01).A00)).A01(strArr[i2], null);
            if (A01 != null) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(A01.getPath()));
                String path = A01.getPath();
                LDc.A05(new Lk8(bufferedInputStream), path, new Ltd(path, bufferedInputStream, 2));
            }
            i = i2 + 1;
        }
    }
}
