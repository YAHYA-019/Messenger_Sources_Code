package com.facebook.inject;

import X.1BO;
import X.1BP;
import X.1BR;
import X.1BT;
import X.1BU;
import X.AnonymousClass001;
import android.app.Application;
import android.content.Context;
import com.facebook.inject.FbInjector;

/* loaded from: FbInjector.class */
public abstract class FbInjector implements 1BO {
    public static volatile Context A03;
    public static 1BP A00 = new 1BP();
    public static final 1BT A02 = new 1BT(A02());
    public static ThreadLocal A01 = new 1BU();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
    public static Context A00() {
        if (A03 == null) {
            int i = 0;
            while (A03 == null) {
                ?? r0 = 1;
                try {
                    Thread.sleep(1L);
                    i++;
                    if (i >= 5 && A03 == null) {
                        r0 = AnonymousClass001.A0N("Application is Null, was FbInjector.setApplication() called?");
                        throw r0;
                    }
                } catch (InterruptedException unused) {
                    throw AnonymousClass001.A0U(r0);
                }
            }
        }
        return A03;
    }

    public static Context A01() {
        return (Context) A01.get();
    }

    public static 1BR A02() {
        final int i = 3;
        return new 1BR(i) { // from class: X.3Vc
            public final int A00;

            {
                this.A00 = i;
            }

            public /* bridge */ /* synthetic */ Object BYP(Object obj) {
                switch (this.A00) {
                    case 0:
                        return new 1Lo((FbInjector) obj);
                    case 1:
                        return new 1Bi((FbInjector) obj);
                    case 2:
                        return new 1Hv((FbInjector) obj);
                    case 3:
                        Context context = (Context) obj;
                        if (FbInjector.A03 == null) {
                            FbInjector.A03 = context.getApplicationContext();
                            if (FbInjector.A03 == null) {
                                throw AnonymousClass001.A0N("An application must be set on the injector ```FbInjector.setApplication(app)``` before you can start performing injections");
                            }
                        }
                        return new 1Bc(context, new 1BX(FbInjector.A03));
                    default:
                        return null;
                }
            }
        };
    }

    public static 1BP A03() {
        return A00;
    }

    public static void A04(Context context) {
        A01.set(context);
    }

    public static FbInjector get(Context context) {
        return (FbInjector) A02.A00(context);
    }

    public static void setApplication(Application application) {
        if (application == null) {
            throw AnonymousClass001.A0N("SetApplication called with a null application");
        }
        A03 = application;
    }
}
