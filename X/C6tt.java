package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.fury.context.ReqContext;
import com.facebook.fury.context.ReqContextTypeResolver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.6tt, reason: invalid class name */
/* loaded from: 6tt.class */
public abstract class C6tt {
    public static final 5Tg A00 = 5Tg.A06;
    public static volatile C4h0 A01 = new Object();

    public static 5Tn A00(Context context, Bundle bundle, 5TY r303) {
        IllegalStateException A0N;
        ReqContext A04 = AnonymousClass018.A04("DataFetchProps_getData", ReqContextTypeResolver.resolveName("data_fetch"));
        try {
            boolean AZk = ((1CO) 1Bi.A03(16387)).AZk(72339824928885041L);
            if (bundle != null && !AZk) {
                Bundle bundle2 = bundle.getBundle("props_bundle");
                Class cls = (Class) bundle.getSerializable("surface_prop_class");
                if (bundle2 != null && cls != null && cls.equals(r303.getClass())) {
                    try {
                        try {
                            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                            if (declaredConstructors.length == 0) {
                                throw AnonymousClass001.A0N("More than one private constructors found");
                            }
                            Constructor<?> constructor = declaredConstructors[0];
                            constructor.setAccessible(true);
                            5TY A08 = ((5TY) (constructor.getParameterTypes().length == 0 ? constructor.newInstance(new Object[0]) : constructor.newInstance(context))).A08(context, bundle2);
                            if (r303.equals(A08)) {
                                r303 = A08;
                            }
                        } catch (InstantiationException unused) {
                            A0N = AnonymousClass001.A0N("DataFetchProps cannot be created from a private constructor with no parameter");
                            throw A0N;
                        } catch (InvocationTargetException e) {
                            new IllegalStateException(e.getCause());
                            throw A0N;
                        }
                    } catch (IllegalAccessException e2) {
                        A0N = AnonymousClass001.A0N(e2.getMessage());
                        throw A0N;
                    }
                }
            }
            5Tn A03 = A00.A04.A03(context, r303);
            if (A04 != null) {
                A04.close();
            }
            return A03;
        } catch (Throwable th) {
            if (A04 != null) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    7kF.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static 5Tn A01(Context context, 5TY r302) {
        ReqContext A04 = AnonymousClass018.A04("DataFetchProps_getDataFromProps", ReqContextTypeResolver.resolveName("data_fetch"));
        try {
            5Tn A03 = A00.A04.A03(context, r302);
            if (A04 != null) {
                A04.close();
            }
            return A03;
        } catch (Throwable th) {
            if (A04 != null) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    7kF.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static void A02(Context context, Intent intent, 5TY r303) {
        ReqContext A04 = AnonymousClass018.A04("props_prepareForNavigation", ReqContextTypeResolver.resolveName("data_fetch"));
        try {
            A01.CMs(r303, "prepareForNavigation", 0);
            A00.A04.A08(context, r303);
            if (intent != null) {
                intent.putExtra("props_bundle", r303.A06());
                intent.putExtra("surface_prop_class", r303.getClass());
            }
            if (A04 != null) {
                A04.close();
            }
        } catch (Throwable th) {
            if (A04 != null) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    7kF.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }
}
