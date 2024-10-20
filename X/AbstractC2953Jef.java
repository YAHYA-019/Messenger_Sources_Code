package X;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: X.Jef, reason: case insensitive filesystem */
/* loaded from: Jef.class */
public abstract class AbstractC2953Jef extends Ktu {
    public static Class A00;
    public static Constructor A01;
    public static Method A02;
    public static Method A03;
    public static boolean A04;

    public static void A00() {
        Method method;
        Class<?> cls;
        Method method2;
        if (A04) {
            return;
        }
        A04 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            android.util.Log.e("TypefaceCompatApi21Impl", AnonymousClass001.A0Y(e), e);
            method = null;
            cls = null;
            method2 = null;
        }
        A01 = constructor;
        A00 = cls;
        A02 = method2;
        A03 = method;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        r0.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v30, types: [android.graphics.Typeface] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.reflect.Method] */
    @Override // X.Ktu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface A01(android.content.Context r302, android.content.res.Resources r303, X.LQB r304, int r305) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2953Jef.A01(android.content.Context, android.content.res.Resources, X.LQB, int):android.graphics.Typeface");
    }
}
