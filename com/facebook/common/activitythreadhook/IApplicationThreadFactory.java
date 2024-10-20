package com.facebook.common.activitythreadhook;

import X.0KO;
import X.0Pz;
import X.0cX;
import X.0dY;
import X.0kV;
import X.AnonymousClass001;
import X.C0cW;
import X.C0cZ;
import X.C0jp;
import X.C0s6;
import android.os.Binder;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.binderhooker.BinderHook;

/* loaded from: IApplicationThreadFactory.class */
public class IApplicationThreadFactory {
    public static Class A01;
    public static boolean A02;
    public static final 0KO A03 = new 0KO("IApplicationThreadFactory");
    public static final Object A04 = AnonymousClass001.A0R();
    public static volatile IApplicationThreadFactory A05;
    public final C0cZ A00;

    public IApplicationThreadFactory(C0cZ c0cZ) {
        this.A00 = c0cZ;
    }

    public static IApplicationThreadFactory A00(C0cZ c0cZ) {
        IApplicationThreadFactory iApplicationThreadFactory = A05;
        if (iApplicationThreadFactory != null) {
            return iApplicationThreadFactory;
        }
        synchronized (A04) {
            if (A05 != null) {
                return A05;
            }
            A05 = new IApplicationThreadFactory(c0cZ);
            return A05;
        }
    }

    public static Class A01(C0cZ c0cZ) {
        0cX r0 = 0cX.A00;
        Class A0K = c0cZ.A0K(r0, "com.facebook.common.activitythreadhook.IApplicationThreadBinderHookWrapper");
        if (A0K == null) {
            String A032 = A03();
            if ("com.facebook.common.activitythreadhook".equals(A032)) {
                return null;
            }
            A0K = c0cZ.A0K(r0, 0Pz.A0j(A032, ".", "IApplicationThreadBinderHookWrapper"));
            if (A0K == null) {
                return null;
            }
        }
        return A0K;
    }

    public static Class A02(C0cZ c0cZ) {
        boolean z = A02;
        Class cls = A01;
        if (!z) {
            cls = A01(c0cZ);
            A01 = cls;
            A02 = true;
        }
        return cls;
    }

    public static String A03() {
        String name = IApplicationThreadFactory.class.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            return name.substring(0, lastIndexOf);
        }
        throw AnonymousClass001.A0T(String.format("Cannot deduce package name from name %s", name));
    }

    public BinderHook A04(Binder binder, BinderHook binderHook) {
        Throwable th;
        0KO r0 = A03;
        binderHook.getInterfaceDescriptor();
        Class<?> cls = binderHook.getClass();
        Class A022 = A02(this.A00);
        if (A022 == null) {
            r0.A07("Failled to construct an AppThreadWrapper %s for binder hook %s.", new Object[]{"IApplicationThreadBinderHookWrapper", binderHook.getInterfaceDescriptor()});
            return null;
        }
        try {
            Object A052 = C0cZ.A05(A022, new C0s6(BinderHook.class, binderHook), new C0s6(Binder.class, binder));
            if (A052 != null) {
                String name = BinderHook.class.getName();
                Class<?> cls2 = A052.getClass();
                try {
                    if (!BinderHook.class.isAssignableFrom(cls2)) {
                        throw new ClassCastException(String.format("Class %s is not assignable from %s. Cls Id: %s", name, cls2.getName(), A022));
                    }
                    BinderHook binderHook2 = (BinderHook) A052;
                    boolean A1T = AnonymousClass001.A1T(binderHook2);
                    Object[] objArr = {binderHook2 == null ? "<UNDEFINED CLASS>" : AnonymousClass001.A0Y(binderHook2)};
                    0dY r02 = 0kV.A05;
                    0dY r03 = C0jp.A02;
                    0dY.A02(0kV.A05, new Object[]{Integer.valueOf(ActionId.LEGACY_MARKER), Boolean.valueOf(A1T), null, r03.A03 != null ? 0dY.A01(r03, "(cls: %s)", objArr, 0, 0) : 0dY.A02(r03, new Object[]{"(cls: %s)", objArr})});
                    binderHook.getInterfaceDescriptor();
                    return binderHook2;
                } catch (ClassCastException e) {
                    new Exception(String.format("Could not construct cls %s because %s is not a base class.", A022, name), e);
                }
            } else {
                new Exception(String.format("Could not construct cls %s because we got a null instance..", A022));
            }
            throw th;
        } catch (C0cW e2) {
            r0.A0A(e2, "Cannot construct AppThread wrapper %s for binder hook %s (cls: %s).", new Object[]{A022, binderHook.getInterfaceDescriptor(), cls});
            return null;
        }
    }
}
