package X;

import java.util.List;

/* loaded from: Ktp.class */
public final class Ktp {
    public final float A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;

    public Ktp(List list, float f, int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2) {
        this.A02 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A04 = j4;
        this.A0A = z;
        this.A00 = f;
        this.A01 = i;
        this.A09 = z2;
        this.A08 = list;
        this.A06 = j5;
        this.A03 = j6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ktp)) {
                return false;
            }
            Ktp ktp = (Ktp) obj;
            if (this.A02 != ktp.A02 || this.A07 != ktp.A07 || this.A05 != ktp.A05 || this.A04 != ktp.A04 || this.A0A != ktp.A0A || Float.compare(this.A00, ktp.A00) != 0 || this.A01 != ktp.A01 || this.A09 != ktp.A09 || !11T.A0O(this.A08, ktp.A08) || this.A06 != ktp.A06 || this.A03 != ktp.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A03(this.A03, AnonymousClass002.A02(this.A06, AnonymousClass002.A05(this.A08, (((1BL.A00((AnonymousClass002.A02(this.A04, AnonymousClass002.A02(this.A05, AnonymousClass002.A02(this.A07, AnonymousClass002.A01(this.A02)))) + AnonymousClass002.A00(this.A0A ? 1 : 0)) * 31, this.A00) + this.A01) * 31) + AnonymousClass002.A00(this.A09 ? 1 : 0)) * 31)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PointerInputEventData(id=");
        A0k.append((Object) 0Pz.A0Q("PointerId(value=", ')', this.A02));
        A0k.append(", uptime=");
        A0k.append(this.A07);
        A0k.append(", positionOnScreen=");
        A0k.append((Object) LE0.A07(this.A05));
        A0k.append(", position=");
        A0k.append((Object) LE0.A07(this.A04));
        A0k.append(", down=");
        A0k.append(this.A0A);
        A0k.append(", pressure=");
        A0k.append(this.A00);
        A0k.append(", type=");
        int i = this.A01;
        A0k.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch");
        A0k.append(", activeHover=");
        A0k.append(this.A09);
        A0k.append(", historical=");
        A0k.append(this.A08);
        A0k.append(", scrollDelta=");
        A0k.append((Object) LE0.A07(this.A06));
        A0k.append(", originalEventPosition=");
        A0k.append((Object) LE0.A07(this.A03));
        return AnonymousClass001.A0g(A0k, ')');
    }
}
