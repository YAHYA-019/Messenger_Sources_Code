package X;

import android.os.StrictMode;
import java.util.UUID;

/* renamed from: X.1q3, reason: invalid class name */
/* loaded from: 1q3.class */
public abstract class C1q3 {
    public static final UUID A00() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID randomUUID = UUID.randomUUID();
            11T.A0D(randomUUID);
            return randomUUID;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
