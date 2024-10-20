package X;

/* renamed from: X.595, reason: invalid class name */
/* loaded from: 595.class */
public final class AnonymousClass595 implements 55E {
    public final int A00;
    public final int A01;
    public final int A02;

    public AnonymousClass595(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public boolean BVi(55E r302) {
        11T.A0F(r302, 0);
        boolean z = false;
        if (!11T.A0O(r302.getClass(), getClass())) {
            return false;
        }
        AnonymousClass595 anonymousClass595 = (AnonymousClass595) r302;
        if (this.A02 == anonymousClass595.A02 && this.A01 == anonymousClass595.A01 && this.A00 == anonymousClass595.A00) {
            z = true;
        }
        return z;
    }
}
