package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: X.Jee, reason: case insensitive filesystem */
/* loaded from: Jee.class */
public final class C2952Jee extends AbstractC2953Jef {
    public final Constructor A00;
    public final Method A01;
    public final Method A02;
    public final Method A03;
    public final Method A04;
    public final Class A05;
    public final Method A06;

    public C2952Jee() {
        this(0);
    }

    public C2952Jee(int i) {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            Class<?> cls3 = Integer.TYPE;
            method2 = cls2.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, Boolean.TYPE, cls3, cls3, cls3, FontVariationAxis[].class);
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", new Class[0]);
            method5 = cls2.getMethod("abortCreation", new Class[0]);
            method = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls2, 1).getClass(), String.class, cls3, cls3);
            method.setAccessible(true);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            android.util.Log.e("TypefaceCompatApi26Impl", 0Pz.A0W("Unable to collect necessary methods for class ", AnonymousClass001.A0Y(e)), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.A05 = cls;
        this.A00 = constructor;
        this.A02 = method2;
        this.A03 = method3;
        this.A04 = method4;
        this.A01 = method5;
        this.A06 = method;
    }

    @Override // X.AbstractC2953Jef, X.Ktu
    public Typeface A01(Context context, Resources resources, LQB lqb, int i) {
        Object obj;
        boolean z;
        Method method = this.A02;
        if (method == null) {
            android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (!AnonymousClass001.A1T(method)) {
            return super.A01(context, resources, lqb, i);
        }
        try {
            obj = this.A00.newInstance(AnonymousClass001.A1Z());
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (KlJ klJ : lqb.A00) {
            boolean z2 = false;
            try {
                z2 = AnonymousClass001.A1V(method.invoke(obj, context.getAssets(), klJ.A03, 0, false, Integer.valueOf(klJ.A01), Integer.valueOf(klJ.A02), Integer.valueOf(klJ.A05 ? 1 : 0), FontVariationAxis.fromFontVariationSettings(klJ.A04)));
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            if (!z2) {
                try {
                    this.A01.invoke(obj, AnonymousClass001.A1Z());
                    return null;
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                    return null;
                }
            }
        }
        try {
            z = AnonymousClass001.A1V(AnonymousClass001.A0S(obj, this.A04));
        } catch (IllegalAccessException | InvocationTargetException unused4) {
            z = false;
        }
        if (z) {
            return A05(obj);
        }
        return null;
    }

    @Override // X.Ktu
    public Typeface A02(Context context, Resources resources, String str, int i, int i2) {
        Object obj;
        Typeface typeface;
        boolean z;
        Method method = this.A02;
        if (method == null) {
            android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (AnonymousClass001.A1T(method)) {
            try {
                obj = this.A00.newInstance(AnonymousClass001.A1Z());
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            typeface = null;
            if (obj != null) {
                boolean z2 = false;
                try {
                    z2 = AnonymousClass001.A1V(method.invoke(obj, context.getAssets(), str, 0, false, 0, -1, -1, null));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                if (z2) {
                    try {
                        z = AnonymousClass001.A1V(AnonymousClass001.A0S(obj, this.A04));
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z = false;
                    }
                    if (z) {
                        return A05(obj);
                    }
                } else {
                    try {
                        this.A01.invoke(obj, new Object[0]);
                        return null;
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                    }
                }
            }
        } else {
            typeface = super.A02(context, resources, str, i, i2);
        }
        return typeface;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [android.graphics.Typeface, java.lang.Throwable] */
    public Typeface A05(Object obj) {
        ?? r0;
        try {
            Object newInstance = Array.newInstance((Class<?>) this.A05, 1);
            Array.set(newInstance, 0, obj);
            Method method = this.A06;
            Integer A0h = 7zN.A0h();
            r0 = (Typeface) method.invoke(null, newInstance, "sans-serif", A0h, A0h);
            return r0;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }
}
