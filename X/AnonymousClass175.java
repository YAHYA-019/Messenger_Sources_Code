package X;

/* renamed from: X.175, reason: invalid class name */
/* loaded from: 175.class */
public final class AnonymousClass175 implements C0zw {
    public final float A00;
    public final float A01;

    public AnonymousClass175(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass175)) {
            return false;
        }
        float f = this.A01;
        float f2 = this.A00;
        if (f > f2) {
            AnonymousClass175 anonymousClass175 = (AnonymousClass175) obj;
            if (anonymousClass175.A01 > anonymousClass175.A00) {
                return true;
            }
        }
        AnonymousClass175 anonymousClass1752 = (AnonymousClass175) obj;
        return f == anonymousClass1752.A01 && f2 == anonymousClass1752.A00;
    }

    public int hashCode() {
        float f = this.A01;
        float f2 = this.A00;
        if (f > f2) {
            return -1;
        }
        return (Float.floatToIntBits(f) * 31) + Float.floatToIntBits(f2);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.A01);
        A0k.append("..");
        A0k.append(this.A00);
        return A0k.toString();
    }
}
