package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: DqD.class */
public final class DqD extends C04v {
    public final int A00;
    public final MigColorScheme A01;
    public final DLQ A02;
    public final String A03;
    public final String A04;
    public final java.util.Map A05;
    public final java.util.Map A06;
    public final boolean A07;

    public DqD(MigColorScheme migColorScheme, DLQ dlq, String str, String str2, java.util.Map map, java.util.Map map2, int i, boolean z) {
        this.A03 = str;
        this.A06 = map;
        this.A05 = map2;
        this.A00 = i;
        this.A04 = str2;
        this.A07 = z;
        this.A02 = dlq;
        this.A01 = migColorScheme;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DqD)) {
                return false;
            }
            DqD dqD = (DqD) obj;
            if (!11T.A0O(this.A03, dqD.A03) || !11T.A0O(this.A06, dqD.A06) || !11T.A0O(this.A05, dqD.A05) || this.A00 != dqD.A00 || !11T.A0O(this.A04, dqD.A04) || this.A07 != dqD.A07 || !11T.A0O(this.A02, dqD.A02) || !11T.A0O(this.A01, dqD.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AnonymousClass002.A05(this.A05, AnonymousClass002.A05(this.A06, 4YV.A02(this.A03))) + this.A00) * 31) + 1BL.A05(this.A04)) * 31) + AnonymousClass002.A00(this.A07 ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + 4YU.A03(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MSGBloksScreen(appId=");
        A0k.append(this.A03);
        A0k.append(", params=");
        A0k.append(this.A06);
        A0k.append(", nativeProps=");
        A0k.append(this.A05);
        A0k.append(", ttiMarkerId=");
        A0k.append(this.A00);
        A0k.append(", screenId=");
        A0k.append(this.A04);
        A0k.append(", hasNoNavBar=");
        A0k.append(this.A07);
        A0k.append(", screenData=");
        A0k.append(this.A02);
        A0k.append(", colorScheme=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
