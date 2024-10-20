package X;

/* renamed from: X.0ec, reason: invalid class name */
/* loaded from: 0ec.class */
public abstract class C0ec {
    public static boolean A00(float f, float f2) {
        boolean isNaN = Float.isNaN(f);
        boolean isNaN2 = Float.isNaN(f2);
        return !isNaN ? !isNaN2 && Math.abs(f2 - f) < 1.0E-5f : isNaN2;
    }
}
