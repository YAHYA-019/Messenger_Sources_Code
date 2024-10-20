package X;

import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.File;
import java.io.IOException;

/* loaded from: Fs2.class */
public final class Fs2 implements 1aQ, 1aR {
    public final C00i A00;
    public final AbstractC00401az A01;
    public final C1Zg A02;

    public Fs2() {
        C1Zg c1Zg = (C1Zg) 1Bn.A0A(33057);
        this.A02 = c1Zg;
        this.A01 = c1Zg.A00(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY);
        this.A00 = 1BQ.A02(68406);
    }

    public static String A00(Fs2 fs2, File file, String str) {
        String str2 = null;
        if (file != null && !file.getName().isEmpty()) {
            if (file.getName().equals(0Pz.A0W("v", str))) {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    try {
                        return parentFile.getCanonicalPath();
                    } catch (IOException unused) {
                        return parentFile.getAbsolutePath();
                    }
                }
            } else {
                str2 = A00(fs2, file.getParentFile(), str);
            }
        }
        return str2;
    }

    public /* bridge */ /* synthetic */ void CAv(1Z6 r302, 1Yu r303, File file) {
        E9q e9q = (E9q) r303;
        LightweightQuickPerformanceLogger A0c = DKC.A0c(this.A00);
        try {
            A0c.markerStart(38469637);
            if (A0c.isMarkerOn(38469637, true)) {
                A0c.markerAnnotate(38469637, "feature", r302.A03);
                A0c.markerAnnotate(38469637, "plugin", DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY);
            }
            1BK.A1E(this.A02.A01).execute(new G4R(this, e9q, file));
        } finally {
            A0c.markerEnd(38469637, (short) 2);
        }
    }

    public int CWV() {
        return -100;
    }

    public /* bridge */ /* synthetic */ String CWl(1Z6 r302, 1Yu r303) {
        return 0Pz.A0W("v", ((E9q) r303).A00);
    }
}
