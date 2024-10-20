package X;

import android.os.Build;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: Kxn.class */
public abstract class Kxn {
    public static final ThreadLocal A00;

    static {
        KMC kmc = KMC.A01;
        A00 = new Lxr();
    }

    public static AlgorithmParameterSpec A00(byte[] bArr) {
        Integer valueOf;
        int length = bArr.length;
        return (!2Go.A00(System.getProperty("java.vendor"), "The Android Project") || (valueOf = Integer.valueOf(Build.VERSION.SDK_INT)) == null || valueOf.intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, length) : new IvParameterSpec(bArr, 0, length);
    }
}
