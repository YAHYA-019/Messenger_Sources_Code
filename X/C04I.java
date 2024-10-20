package X;

import android.os.StrictMode;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.04I, reason: invalid class name */
/* loaded from: 04I.class */
public abstract class C04I {
    public static final AtomicReference A00 = new AtomicReference();

    public static UUID A00() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return UUID.randomUUID();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
