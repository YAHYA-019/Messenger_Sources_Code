package X;

import java.util.ArrayList;

/* loaded from: DqJ.class */
public final class DqJ extends C04v {
    public long A00;
    public Object A01;
    public final int A02;

    public DqJ() {
        this.A02 = 0;
        ArrayList A0s = AnonymousClass001.A0s();
        long A00 = EXL.A00(0.0f, 0.0f);
        this.A02 = 0;
        this.A01 = A0s;
        this.A00 = A00;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DqJ(int i) {
        this(250L, EaI.A00, 2);
        this.A02 = i;
        this.A02 = 2;
    }

    public DqJ(long j, Object obj, int i) {
        this.A02 = i;
        this.A00 = j;
        this.A01 = obj;
    }

    public boolean equals(Object obj) {
        int i;
        switch (this.A02) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DqJ)) {
                    return false;
                }
                DqJ dqJ = (DqJ) obj;
                return dqJ.A02 == 0 && 11T.A0O(this.A01, dqJ.A01) && this.A00 == dqJ.A00;
            case 1:
                if (this == obj) {
                    return true;
                }
                i = 1;
                break;
            case 2:
                if (this == obj) {
                    return true;
                }
                i = 2;
                break;
            default:
                return super.equals(obj);
        }
        if (!(obj instanceof DqJ)) {
            return false;
        }
        DqJ dqJ2 = (DqJ) obj;
        return dqJ2.A02 == i && this.A00 == dqJ2.A00 && 11T.A0O(this.A01, dqJ2.A01);
    }

    public int hashCode() {
        int A03;
        int A01;
        switch (this.A02) {
            case 0:
                A03 = 1BL.A03(this.A01);
                A01 = 1BL.A01(this.A00);
                break;
            case 1:
            case 2:
                A03 = 7zQ.A02(this.A00);
                A01 = AnonymousClass001.A02(this.A01);
                break;
            default:
                return super.hashCode();
        }
        return A03 + A01;
    }

    public String toString() {
        if (2 - this.A02 != 0) {
            return super.toString();
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GridItemAnimationOption(duration=");
        A0k.append(this.A00);
        A0k.append(", interpolator=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
