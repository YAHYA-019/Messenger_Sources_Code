package com.facebook.messaging.rtc.rsys.pytorchloader;

import X.1Br;
import X.AbG;
import X.C00j;
import X.C01s;
import X.C06w;
import X.C06z;
import X.C0il;

/* loaded from: PyTorchLoader.class */
public final class PyTorchLoader {
    public static final String TAG = "RsysPyTorchLoader";
    public static boolean isLoaded;
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(PyTorchLoader.class, "errorReporter", "getErrorReporter()Lcom/facebook/common/errorreporting/FbErrorReporter;", 0)};
    public static final PyTorchLoader INSTANCE = new Object();
    public static final 1Br errorReporter$delegate = AbG.A0M();

    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.messaging.rtc.rsys.pytorchloader.PyTorchLoader, java.lang.Object] */
    static {
        boolean z = true;
        try {
            C00j.A05("PyTorchLoader.SoLoader.pytorch", -1785105840);
            boolean A0C = C0il.A0C("dynamic_pytorch_impl", 16);
            isLoaded = A0C;
            if (!A0C || !C0il.A0C("torch-code-gen", 16)) {
                z = false;
            }
            isLoaded = z;
            C00j.A01(-206258874);
        } catch (UnsatisfiedLinkError e) {
            isLoaded = false;
            1Br.A04(errorReporter$delegate).softReport(TAG, "SoLoader pytorch library exception:", e);
        }
    }

    public static final boolean ensureInitialized() {
        return isLoaded;
    }

    public final C01s getErrorReporter() {
        return 1Br.A04(errorReporter$delegate);
    }

    public final boolean isLoaded() {
        return isLoaded;
    }

    public final void setLoaded(boolean z) {
        isLoaded = z;
    }
}
