package X;

import android.content.Intent;
import java.lang.reflect.Method;

/* renamed from: X.189, reason: invalid class name */
/* loaded from: 189.class */
public final class AnonymousClass189 extends 01G {
    public final /* synthetic */ 0iT A00;
    public final /* synthetic */ C0hr A01;

    public AnonymousClass189(0iT r302, C0hr c0hr) {
        this.A00 = r302;
        this.A01 = c0hr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass028 Aal(C01c c01c, String str, Method method, Object[] objArr) {
        C0pf c0pf;
        C0pf c0pf2;
        if (!str.equals("activity") && !str.equals("activity_task")) {
            return null;
        }
        String name = method.getName();
        try {
            if (name.startsWith("startActivity")) {
                int i = 0;
                for (Class<?> cls : method.getParameterTypes()) {
                    if (cls != Intent.class) {
                        i++;
                    } else {
                        if (i == -1 || (c0pf2 = this.A01.A0C) == 0) {
                            return null;
                        }
                        synchronized (c0pf2) {
                            AnonymousClass001.A14(c0pf2, 0S2.A0E);
                            name = c0pf2;
                        }
                    }
                }
                return null;
            }
            if (!name.startsWith("finishActivity")) {
                return null;
            }
            int i2 = 0;
            for (Class<?> cls2 : method.getParameterTypes()) {
                if (cls2 != Intent.class) {
                    i2++;
                } else {
                    if (i2 == -1 || (c0pf = this.A01.A0C) == 0) {
                        return null;
                    }
                    synchronized (c0pf) {
                        AnonymousClass001.A14(c0pf, 0S2.A0F);
                        name = c0pf;
                    }
                }
            }
            return null;
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
