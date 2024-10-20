package X;

import android.os.FileObserver;
import com.google.common.base.Platform;
import java.io.File;
import java.io.IOException;

/* renamed from: X.32p, reason: invalid class name */
/* loaded from: 32p.class */
public final class C32p extends FileObserver {
    public String A00;
    public int A01;
    public 3LC A02;

    public C32p(3LC r302, String str, int i) {
        super(str, 963);
        this.A00 = str;
        this.A02 = r302;
        this.A01 = i;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        if ((i & 963) == i) {
            try {
                int i2 = this.A01;
                if (i2 <= 0) {
                    stopWatching();
                    return;
                }
                this.A01 = i2 - 1;
                3LC r0 = this.A02;
                String canonicalPath = Platform.stringIsNullOrEmpty(str) ? this.A00 : new File(this.A00, str).getCanonicalPath();
                1UG A08 = 1BK.A08(1BK.A07(r0.A01), "fb_file_utilization");
                if (A08.isSampled()) {
                    String str2 = i != 1 ? i != 2 ? i != 64 ? i != 128 ? i != 256 ? i != 512 ? null : "delete" : "create" : "moved_to" : "moved_from" : "modify" : "access";
                    try {
                        String A0W = 0Pz.A0W("data_dir", canonicalPath.substring(AnonymousClass001.A0E(r0.A00.getApplicationInfo().dataDir).getCanonicalPath().length()));
                        A08.A7R("file_event", str2);
                        A08.A7R("path", A0W);
                        A08.BZL();
                    } catch (IOException e) {
                        0fH.A0r("FBFileMetricsReporter", "logEvent errors", e);
                    }
                }
            } catch (IOException e2) {
                0fH.A0r("FileListener", "onEvent errors", e2);
            }
        }
    }
}
