package X;

/* renamed from: X.0zb, reason: invalid class name */
/* loaded from: 0zb.class */
public abstract class C0zb {
    public static final ThreadLocal[] A00;

    static {
        int i = 0;
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        do {
            threadLocalArr[i] = new ThreadLocal();
            i++;
        } while (i < 4);
        A00 = threadLocalArr;
    }
}
