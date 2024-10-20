package X;

/* renamed from: X.GjH, reason: case insensitive filesystem */
/* loaded from: GjH.class */
public final class C2624GjH extends C04v {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public HCZ A0A;
    public HCa A0B;
    public C2622GjC A0C;
    public Integer A0D;
    public boolean A0E;

    public C2624GjH() {
        Integer A0h = 7zN.A0h();
        HCa hCa = HCa.A02;
        long j = -1;
        this.A0C = null;
        this.A0D = A0h;
        this.A0E = false;
        this.A0B = hCa;
        this.A0A = null;
        this.A07 = j;
        this.A03 = j;
        this.A04 = j;
        this.A00 = j;
        this.A01 = j;
        this.A08 = j;
        this.A09 = j;
        this.A02 = j;
        this.A06 = j;
        this.A05 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2624GjH)) {
                return false;
            }
            C2624GjH c2624GjH = (C2624GjH) obj;
            if (!11T.A0O(this.A0C, c2624GjH.A0C) || !11T.A0O(this.A0D, c2624GjH.A0D) || this.A0E != c2624GjH.A0E || this.A0B != c2624GjH.A0B || this.A0A != c2624GjH.A0A || this.A07 != c2624GjH.A07 || this.A03 != c2624GjH.A03 || this.A04 != c2624GjH.A04 || this.A00 != c2624GjH.A00 || this.A01 != c2624GjH.A01 || this.A08 != c2624GjH.A08 || this.A09 != c2624GjH.A09 || this.A02 != c2624GjH.A02 || this.A06 != c2624GjH.A06 || this.A05 != c2624GjH.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = AnonymousClass002.A02(this.A06, AnonymousClass002.A02(this.A02, AnonymousClass002.A02(this.A09, AnonymousClass002.A02(this.A08, AnonymousClass002.A02(this.A01, AnonymousClass002.A02(this.A00, AnonymousClass002.A02(this.A04, AnonymousClass002.A02(this.A03, AnonymousClass002.A02(this.A07, (AnonymousClass002.A05(this.A0B, ((((AnonymousClass001.A02(this.A0C) * 31) + AnonymousClass001.A02(this.A0D)) * 31) + AnonymousClass002.A00(this.A0E ? 1 : 0)) * 31) + 4YU.A03(this.A0A)) * 31)))))))));
        long j = this.A05;
        return A02 + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DeviceHealthInfo(memInfo=");
        A0k.append(this.A0C);
        A0k.append(", batteryPercentage=");
        A0k.append(this.A0D);
        A0k.append(", batteryCharging=");
        A0k.append(this.A0E);
        A0k.append(", wifiState=");
        A0k.append(this.A0B);
        A0k.append(", diskSpaceCondition=");
        A0k.append(this.A0A);
        A0k.append(", networkUploadSpeed=");
        A0k.append(this.A07);
        A0k.append(", keepAliveLatency=");
        A0k.append(this.A03);
        A0k.append(", keepAliveLatencyPrev=");
        A0k.append(this.A04);
        A0k.append(", connectLatency=");
        A0k.append(this.A00);
        A0k.append(", connectLatencyPrev=");
        A0k.append(this.A01);
        A0k.append(", publishLatency=");
        A0k.append(this.A08);
        A0k.append(", publishLatencyPrev=");
        A0k.append(this.A09);
        A0k.append(", e2eLatencyPrev=");
        A0k.append(this.A02);
        A0k.append(", networkLatencyPrev=");
        A0k.append(this.A06);
        A0k.append(", latencyPrev=");
        A0k.append(this.A05);
        return 4YV.A0x(A0k);
    }
}
