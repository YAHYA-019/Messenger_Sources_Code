package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.loader.AssetsProvider;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.15l, reason: invalid class name */
/* loaded from: 15l.class */
public final class C15l {
    public static final String A00;
    public static final ConcurrentLinkedQueue A01;
    public static volatile boolean A02;

    static {
        String A022 = 11T.A02(C15l.class);
        A00 = A022;
        A01 = new ConcurrentLinkedQueue();
        A02 = "true".equals(0WL.A02("fb.enable_resource_coverage"));
        if (A02) {
            0fH.A0l(A022, "Resource logger is enabled");
        }
    }

    public static final void A00(Context context) {
        if (A02) {
            Resources resources = context.getResources();
            11T.A0A(resources);
            List A03 = 11T.A03(context.getPackageResourcePath());
            if (A02) {
                ResourcesLoader resourcesLoader = new ResourcesLoader();
                Object obj = new Object();
                Iterator it = A03.iterator();
                while (it.hasNext()) {
                    String A0i = AnonymousClass001.A0i(it);
                    String str = A00;
                    0fH.A0h(A0i, str, "Creating a new provider for apk path %s");
                    try {
                        ResourcesProvider loadFromApk = ResourcesProvider.loadFromApk(ParcelFileDescriptor.open(AnonymousClass001.A0E(A0i), 268435456), (AssetsProvider) obj);
                        11T.A0A(loadFromApk);
                        resourcesLoader.addProvider(loadFromApk);
                    } catch (IOException e) {
                        0fH.A0r(str, "Failed to load apks due to error: %s", e);
                    }
                }
                resources.addLoaders(resourcesLoader);
                context.createConfigurationContext(resources.getConfiguration());
                0oD r0 = C0fl.A00;
                if (r0 != null) {
                    r0.A01(AnonymousClass001.A09("resource_logging_running", -2, true), "true");
                }
            }
        }
    }

    public static final boolean A01(Context context) {
        if (0Zi.A01(context).A85) {
            A02 = true;
            0fH.A0l(A00, "Resource logger is enabled");
        }
        return A02;
    }
}
