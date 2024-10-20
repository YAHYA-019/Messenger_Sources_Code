package X;

import android.graphics.PointF;

/* renamed from: X.4hy, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4hy.class */
public final class C06804hy extends C2r9 {
    public static final C06804hy A03 = new C06804hy(new 5Q7());
    public final int A00;
    public final PointF A01;
    public final boolean A02;

    public C06804hy(5Q7 r302) {
        super(r302);
        this.A00 = r302.A00;
        this.A01 = r302.A01;
        this.A02 = r302.A02;
    }

    @Override // X.C2r9
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            C06804hy c06804hy = (C06804hy) obj;
            if (this.A00 != c06804hy.A00 || this.A01 != c06804hy.A01 || this.A02 != c06804hy.A02) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C2r9
    public int hashCode() {
        int hashCode = (super.hashCode() * 31) + this.A00;
        PointF pointF = this.A01;
        return ((hashCode + ((int) (pointF.x * 191.0f)) + ((int) (pointF.y * 137.0f))) * 31) + (this.A02 ? 1 : 0);
    }

    @Override // X.C2r9
    public String toString() {
        Integer valueOf = Integer.valueOf(this.A00);
        PointF pointF = this.A01;
        return String.format(null, "%x %f %f %b %s", valueOf, Float.valueOf(pointF.x), Float.valueOf(pointF.y), Boolean.valueOf(this.A02), super.toString());
    }
}
