package X;

/* renamed from: X.6b3, reason: invalid class name */
/* loaded from: 6b3.class */
public final class C6b3 {
    public final 6YP A00;
    public final int[] A01;

    public C6b3(6YP r302, int[] iArr) {
        if (iArr.length == 0) {
            5My.A05("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.A00 = r302;
        this.A01 = iArr;
    }
}
