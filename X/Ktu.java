package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: Ktu.class */
public abstract class Ktu {
    public ConcurrentHashMap A00 = JQx.A13();

    public abstract Typeface A01(Context context, Resources resources, LQB lqb, int i);

    /* JADX WARN: Finally extract failed */
    public Typeface A02(Context context, Resources resources, String str, int i, int i2) {
        File A00 = L5n.A00(context);
        if (A00 == null) {
            return null;
        }
        try {
            if (!L5n.A02(resources, A00, i)) {
                A00.delete();
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(A00.getPath());
            A00.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            A00.delete();
            return null;
        } catch (Throwable th) {
            A00.delete();
            throw th;
        }
    }

    public Typeface A03(Context context, CancellationSignal cancellationSignal, Kkl[] kklArr, int i) {
        Object obj;
        Object obj2;
        boolean z;
        Typeface A05;
        boolean z2;
        C2952Jee c2952Jee = (C2952Jee) this;
        int length = kklArr.length;
        if (length < 1) {
            return null;
        }
        Method method = c2952Jee.A02;
        if (method == null) {
            android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        try {
            if (!AnonymousClass001.A1T(method)) {
                Kkl A04 = c2952Jee.A04(kklArr, i);
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(A04.A03, "r", null);
                if (openFileDescriptor == null) {
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(A04.A02).setItalic(A04.A04).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            }
            HashMap A0u = AnonymousClass001.A0u();
            for (Kkl kkl : kklArr) {
                if (kkl.A00 == 0) {
                    Uri uri = kkl.A03;
                    if (!A0u.containsKey(uri)) {
                        A0u.put(uri, L5n.A01(context, uri));
                    }
                }
            }
            java.util.Map unmodifiableMap = Collections.unmodifiableMap(A0u);
            try {
                obj = c2952Jee.A00.newInstance(AnonymousClass001.A1Z());
                obj2 = obj;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
                obj2 = null;
            }
            if (obj == null) {
                return null;
            }
            boolean z3 = false;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < length) {
                    Kkl kkl2 = kklArr[i3];
                    Object obj3 = unmodifiableMap.get(kkl2.A03);
                    if (obj3 != null) {
                        try {
                            z2 = AnonymousClass001.A1V(c2952Jee.A03.invoke(obj2, obj3, Integer.valueOf(kkl2.A01), null, Integer.valueOf(kkl2.A02), Integer.valueOf(kkl2.A04 ? 1 : 0)));
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            z2 = false;
                        }
                        if (!z2) {
                            break;
                        }
                        z3 = true;
                    }
                    i2 = i3 + 1;
                    z3 = z3;
                } else if (z3) {
                    try {
                        z = AnonymousClass001.A1V(AnonymousClass001.A0S(obj2, c2952Jee.A04));
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z = false;
                    }
                    if (!z || (A05 = c2952Jee.A05(obj2)) == null) {
                        return null;
                    }
                    return Typeface.create(A05, i);
                }
            }
            c2952Jee.A01.invoke(obj2, AnonymousClass001.A1Z());
            return null;
        } catch (IOException | IllegalAccessException | InvocationTargetException unused4) {
            return null;
        }
    }

    public Kkl A04(Kkl[] kklArr, int i) {
        int i2 = 700;
        if ((i & 1) == 0) {
            i2 = 400;
        }
        boolean A1N = AnonymousClass001.A1N(i & 2);
        int length = kklArr.length;
        Kkl kkl = null;
        int i3 = (-1) >>> 1;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= length) {
                return kkl;
            }
            Kkl kkl2 = kklArr[i5];
            int A05 = GOn.A05(kkl2.A02, i2) * 2;
            int i6 = 1;
            if (kkl2.A04 == A1N) {
                i6 = 0;
            }
            int i7 = A05 + i6;
            if (kkl == null || i3 > i7) {
                kkl = kkl2;
                i3 = i7;
            }
            i4 = i5 + 1;
        }
    }
}
