package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.007, reason: invalid class name */
/* loaded from: 007.class */
public final class AnonymousClass007 {
    public static Set A05;
    public static final Charset A06 = StandardCharsets.US_ASCII;
    public final C0pe A01;
    public final Object A02 = new Object();
    public int A00 = 0;
    public final java.util.Map A04 = new HashMap();
    public final java.util.Map A03 = new HashMap();

    public AnonymousClass007(C0pe c0pe) {
        this.A01 = c0pe;
    }

    public static void A00(C00C c00c, String str, MappedByteBuffer mappedByteBuffer, int i) {
        mappedByteBuffer.position(i);
        String A00 = C0o8.A00(c00c.mShortKey, true);
        Charset charset = A06;
        mappedByteBuffer.put(A00.getBytes(charset));
        mappedByteBuffer.put(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR.getBytes(charset));
        mappedByteBuffer.put(C0o8.A00(str, false).getBytes(charset));
        mappedByteBuffer.put("\n#".getBytes(charset));
        int length = str.length();
        while (true) {
            int i2 = length;
            if (i2 >= c00c.mMaxLength) {
                mappedByteBuffer.put("\n".getBytes(charset));
                return;
            } else {
                mappedByteBuffer.put("#".getBytes(charset));
                length = i2 + 1;
            }
        }
    }

    public boolean A01(String str) {
        boolean contains;
        synchronized (this.A02) {
            if (A05 == null) {
                A05 = new HashSet();
                C00C[] values = C00C.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        break;
                    }
                    A05.add(values[i2].name());
                    i = i2 + 1;
                }
            }
            contains = A05.contains(str);
        }
        return contains;
    }
}
