package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* loaded from: Hw1.class */
public abstract class Hw1 {
    public static long A00(Context context, JO9 jo9, HAy hAy, Hkg hkg) {
        I9d i9d = hkg.A08;
        if (i9d != null) {
            return IEs.A00(jo9, hAy, i9d, hkg.A0A.A1e());
        }
        File file = hkg.A0C;
        if (file == null) {
            throw new Exception("No input data source provided");
        }
        long j = hkg.A04;
        if (j < 0) {
            j = 0;
        }
        long j2 = hkg.A00;
        if (j2 < 0) {
            Uri fromFile = Uri.fromFile(file);
            11T.A0F(fromFile, 0);
            Hqj A01 = IFS.A01(context, fromFile, false);
            if (A01 == null) {
                return -1;
            }
            j2 = A01.A07;
        }
        return TimeUnit.MILLISECONDS.toMicros(j2 - j);
    }

    public static void A01(JNX jnx, Hkg hkg) {
        I9d i9d = hkg.A08;
        if (i9d != null) {
            jnx.Cnu(i9d);
            return;
        }
        File file = hkg.A0C;
        if (file == null) {
            throw new Exception("No valid data source provided");
        }
        jnx.Cnv(file);
        jnx.Cvn(new I9V(TimeUnit.MILLISECONDS, hkg.A04, hkg.A00));
    }
}
