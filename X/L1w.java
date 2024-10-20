package X;

/* loaded from: L1w.class */
public final class L1w {
    public int A00;
    public String A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.L1w, java.lang.Object] */
    public static L1w A00(String str, int i) {
        ?? obj = new Object();
        obj.A00 = i;
        obj.A01 = str;
        return obj;
    }

    public String toString() {
        return 0Pz.A0v("Response Code: ", LEC.A06(this.A00), ", Debug Message: ", this.A01);
    }
}
