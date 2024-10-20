package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

/* loaded from: KR3.class */
public final class KR3 extends Number {
    public final String value;

    public KR3(String str) {
        this.value = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException(4YT.A00(581));
    }

    private Object writeReplace() {
        return new BigDecimal(this.value);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.value);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof KR3)) {
                return false;
            }
            String str = this.value;
            String str2 = ((KR3) obj).value;
            if (str != str2 && !str.equals(str2)) {
                z = false;
            }
        }
        return z;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            return Integer.parseInt(this.value);
        } catch (NumberFormatException unused) {
            try {
                return (int) Long.parseLong(this.value);
            } catch (NumberFormatException unused2) {
                return new BigDecimal(this.value).intValue();
            }
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.value);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.value).longValue();
        }
    }

    public String toString() {
        return this.value;
    }
}
