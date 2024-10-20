package X;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.resources.compat.RedexResourcesCompat;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1au, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1au.class */
public abstract class AbstractC00351au {
    public static final 1bA A00(Context context) {
        String A01 = A01(context, "google_app_id");
        String A012 = A01(context, "google_api_key");
        if (A01 == null || A012 == null) {
            return null;
        }
        String A013 = A01(context, "firebase_database_url");
        String A014 = A01(context, "gcm_defaultSenderId");
        String A015 = A01(context, "project_id");
        AbstractC00481b7.A06(A01, "ApplicationId must be set.");
        AbstractC00481b7.A06(A012, "ApiKey must be set.");
        return new 1bA(A01, A012, A013, A014, A015);
    }

    public static final String A01(Context context, String str) {
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        int identifier = RedexResourcesCompat.getIdentifier(resources, str, "string", packageName);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static final boolean A02(Context context) {
        C1bL c1bL;
        1bA A00 = A00(context);
        if (A00 == null) {
            0fH.A0k("FirebaseInitHelper", "FirebaseApp custom init failure: options is null.");
            return false;
        }
        try {
            if (context.getApplicationContext() instanceof Application) {
                Application application = (Application) context.getApplicationContext();
                AtomicReference atomicReference = 1bC.A00;
                if (atomicReference.get() == null) {
                    Object obj = new Object();
                    if (1MG.A00(atomicReference, (Object) null, obj)) {
                        BackgroundDetector.A00(application);
                        BackgroundDetector backgroundDetector = BackgroundDetector.A04;
                        synchronized (backgroundDetector) {
                            try {
                                backgroundDetector.A01.add(obj);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    }
                }
            }
            String trim = "[DEFAULT]".trim();
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            synchronized (C1bL.A09) {
                try {
                    java.util.Map map = C1bL.A0A;
                    boolean z = false;
                    if (!map.containsKey(trim)) {
                        z = true;
                    }
                    AbstractC00481b7.A09(z, 0Pz.A0j("FirebaseApp name ", trim, " already exists!"));
                    AbstractC00481b7.A03(context, "Application context cannot be null.");
                    c1bL = new C1bL(context, A00, trim);
                    map.put(trim, c1bL);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            C1bL.A02(c1bL);
            return true;
        } catch (RuntimeException e) {
            if (!AnonymousClass001.A1Y(e)) {
                throw e;
            }
            0fH.A0r("FirebaseInitHelper", "DeadObjectException thrown during Firebase initialization.", e);
            return false;
        }
    }
}
