package X;

/* loaded from: Lis.class */
public final class Lis implements Comparable {
    public final float A00;

    public static String A00(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(f);
        return AnonymousClass001.A0d(".dp", A0k);
    }

    public static final boolean A01(float f, float f2) {
        return AnonymousClass001.A1O(Float.compare(f, f2));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Float.compare(this.A00, ((Lis) obj).A00);
    }

    public boolean equals(Object obj) {
        float f = this.A00;
        boolean z = false;
        if ((obj instanceof Lis) && Float.compare(f, ((Lis) obj).A00) == 0) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public String toString() {
        return A00(this.A00);
    }
}
