package X;

/* renamed from: X.2lu, reason: invalid class name */
/* loaded from: 2lu.class */
public final class C2lu {
    public final long A00;

    public static final int A00() {
        return 0;
    }

    public static final int A01(C1qo c1qo, long j) {
        11T.A0F(c1qo, 1);
        if ((j & 9221120237041090560L) != 9221120237041090560L) {
            return c1qo.A02((float) Double.longBitsToDouble(j));
        }
        if ((j & 9221401712017801216L) == 9221401712017801216L) {
            return (int) (j & 4294967295L);
        }
        if ((j & 9221683186994511872L) == 9221683186994511872L) {
            return c1qo.A03(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw 0Pz.A05("Got unexpected NaN: ", Long.toHexString(j));
    }

    public static final long A02(long j, int i) {
        double d;
        int floatToRawIntBits;
        if ((j & 9221120237041090560L) == 9221120237041090560L) {
            long j2 = 9221401712017801216L;
            if ((j & 9221401712017801216L) == 9221401712017801216L) {
                floatToRawIntBits = ((int) (j & 4294967295L)) * i;
            } else {
                j2 = 9221683186994511872L;
                if ((j & 9221683186994511872L) == 9221683186994511872L) {
                    floatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * i);
                } else {
                    d = 0.0d / 0.0d;
                }
            }
            return floatToRawIntBits | j2;
        }
        d = Double.longBitsToDouble(j) * i;
        return Double.doubleToRawLongBits(d);
    }

    public static String A03(long j) {
        StringBuilder A0k;
        String str;
        if ((j & 9221120237041090560L) != 9221120237041090560L) {
            A0k = AnonymousClass001.A0k();
            A0k.append((float) Double.longBitsToDouble(j));
            str = " dp";
        } else if ((j & 9221401712017801216L) == 9221401712017801216L) {
            A0k = AnonymousClass001.A0k();
            A0k.append((int) (j & 4294967295L));
            str = " px";
        } else {
            if ((j & 9221683186994511872L) != 9221683186994511872L) {
                return "NaN";
            }
            A0k = AnonymousClass001.A0k();
            A0k.append(Float.intBitsToFloat((int) (j & 4294967295L)));
            str = " sp";
        }
        return AnonymousClass001.A0d(str, A0k);
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        boolean z = false;
        if ((obj instanceof C2lu) && j == ((C2lu) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return A03(this.A00);
    }
}
