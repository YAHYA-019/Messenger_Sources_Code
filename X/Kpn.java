package X;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: Kpn.class */
public final class Kpn {
    public long A00;
    public 1xH A01;
    public KSx A02;

    public void A00(Integer num, String str, long j, long j2, long j3) {
        String str2;
        String A0W;
        String str3;
        KSx kSx = this.A02;
        Integer num2 = kSx.A01;
        Integer num3 = 0S2.A00;
        if (num2 == num3) {
            num3 = 0S2.A01;
        }
        try {
            str2 = kSx.A02;
            A0W = AnonymousClass001.A0e(":", AnonymousClass001.A0n(InetAddress.getByName(str2).getHostAddress()), 443);
        } catch (UnknownHostException unused) {
            String A00 = 1BJ.A00(738);
            str2 = kSx.A02;
            A0W = 0Pz.A0W(A00, str2);
        }
        Integer num4 = 0S2.A01;
        boolean A1T = AnonymousClass001.A1T(str);
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str3 = "CONNECTION";
                    break;
                case 2:
                    str3 = "GENERATE_REQUEST_PAYLOAD";
                    break;
                case 3:
                    str3 = "WRITE_REQUEST_PAYLOAD";
                    break;
                case 4:
                    str3 = "DISCONNECTION_AFTER_INTERRUPTION";
                    break;
                case 5:
                    str3 = "READ_RESPONSE";
                    break;
                case 6:
                    str3 = "DISCONNECTION";
                    break;
                default:
                    str3 = "INITIALIZATION";
                    break;
            }
        } else {
            str3 = null;
        }
        RPA rpa = new RPA(num4, num3, A0W, str2, str, str3, j2, A1T);
        rpa.A00 = this.A00;
        rpa.A03 = j;
        rpa.A01 = j3;
        this.A01.A04(rpa);
    }
}
