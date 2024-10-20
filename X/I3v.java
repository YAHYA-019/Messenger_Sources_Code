package X;

/* loaded from: I3v.class */
public final class I3v {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public final long A03;
    public final HPm A04;
    public final Double A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public static final Integer A0A = 0S2.A00;
    public static final Integer A09 = 0S2.A01;

    public I3v(Double d, Integer num, String str) {
        String str2;
        int i;
        1CO A0F;
        long j;
        int i2;
        long j2;
        HPm hPm = (HPm) 1Bn.A0A(115548);
        this.A04 = hPm;
        Integer num2 = 0S2.A00;
        this.A02 = A0A;
        this.A00 = A09;
        this.A01 = num2;
        this.A06 = num;
        this.A07 = str;
        int intValue = num.intValue();
        switch (intValue) {
            case 2:
                str2 = "living_room";
                break;
            case 3:
                str2 = "living_room_cvc";
                break;
            case 4:
                str2 = "messaging_in_blue_thread";
                break;
            case 5:
                str2 = "vod";
                break;
            default:
                str2 = "shadow";
                break;
        }
        this.A08 = str2;
        switch (intValue) {
            case 2:
                A0F = C3o5.A0F(hPm.A00);
                j = 36592348268004037L;
                i2 = 10;
                i = C1Ur.A00(A0F, i2, j);
                j2 = i * 1000;
                break;
            case 3:
                A0F = C3o5.A0F(hPm.A00);
                j = 36592348268462791L;
                i2 = 10;
                i = C1Ur.A00(A0F, i2, j);
                j2 = i * 1000;
                break;
            case 4:
                A0F = C3o5.A0F(hPm.A00);
                j = 36592348268593864L;
                i2 = 3;
                i = C1Ur.A00(A0F, i2, j);
                j2 = i * 1000;
                break;
            case 5:
                i = 15;
                j2 = i * 1000;
                break;
            default:
                j2 = 3000;
                break;
        }
        this.A03 = j2;
        this.A05 = d;
        02W.A04(AnonymousClass001.A1P((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1))));
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            I3v i3v = (I3v) obj;
            if (!this.A08.equals(i3v.A08) || !this.A07.equals(i3v.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 0Pz.A0j(this.A08, "/", this.A07).hashCode();
    }
}
