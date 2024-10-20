package X;

import android.app.ActivityManager;
import android.content.Context;

/* loaded from: I1z.class */
public final class I1z {
    public Context A00;
    public 1BY A01;
    public final C00i A02;

    public I1z(1BO r302) {
        Context A0J = 7zP.A0J();
        this.A00 = A0J;
        this.A02 = AbF.A0Q(A0J, 100171);
        this.A01 = 7zL.A0Q(r302);
    }

    public static final I1z A00(1BO r301) {
        return new I1z(r301);
    }

    public void A01() {
        String glEsVersion = ((ActivityManager) this.A02.get()).getDeviceConfigurationInfo().getGlEsVersion();
        try {
            if (Double.parseDouble(glEsVersion) < 2.0d) {
                0fH.A14("VectorMapVoltronDownloadUtil", "Map requires OpenGL ES 2.0 later, current %s", new Object[]{glEsVersion});
            } else {
                1Bn.A0E((Context) null, this.A01, 85096);
            }
        } catch (Exception e) {
            0fH.A0r("VectorMapVoltronDownloadUtil", "Parse GlEsVersion exception", e);
        }
    }
}
