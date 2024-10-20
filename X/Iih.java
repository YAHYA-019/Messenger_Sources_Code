package X;

/* loaded from: Iih.class */
public final class Iih implements JJD {
    public Integer A00;

    public boolean AMl() {
        return true;
    }

    public HC9 BHT() {
        return HC9.A0J;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            if (this.A00 != ((Iih) obj).A00) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        Integer num = this.A00;
        if (num == null) {
            return 0;
        }
        int intValue = num.intValue();
        return (1 != intValue ? "FRONT" : "BACK").hashCode() + intValue;
    }
}
