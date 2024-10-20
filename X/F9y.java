package X;

/* loaded from: F9y.class */
public final class F9y {
    public final ETe A00;
    public final EzU A01;
    public final Integer A02;
    public final String A03;

    public F9y() {
        this(null, null, 0S2.A00, null);
    }

    public F9y(ETe eTe, EzU ezU, Integer num, String str) {
        this.A02 = num;
        this.A01 = ezU;
        this.A03 = str;
        this.A00 = eTe;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof F9y)) {
                return false;
            }
            F9y f9y = (F9y) obj;
            if (this.A02 != f9y.A02 || !11T.A0O(this.A01, f9y.A01) || !11T.A0O(this.A03, f9y.A03) || !11T.A0O(this.A00, f9y.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 0:
                str = "LOADING";
                break;
            case 1:
                str = "SUCCESS";
                break;
            default:
                str = "FAILED";
                break;
        }
        return (((((7zM.A04(str, intValue) * 31) + AnonymousClass001.A02(this.A01)) * 31) + 1BL.A05(this.A03)) * 31) + 4YU.A03(this.A00);
    }

    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ImagineGeneratedImageWithStatus(imageStatus=");
        switch (this.A02.intValue()) {
            case 0:
                str = "LOADING";
                break;
            case 1:
                str = "SUCCESS";
                break;
            default:
                str = "FAILED";
                break;
        }
        A0k.append(str);
        A0k.append(", image=");
        A0k.append(this.A01);
        A0k.append(", prompt=");
        A0k.append(this.A03);
        A0k.append(", imagineError=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
