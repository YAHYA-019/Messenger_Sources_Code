package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: L4x.class */
public final class L4x {
    public float A00;
    public long A01;
    public long A02;
    public long A03;
    public InbandTelemetryBweEstimate A04;
    public 6Yl A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public final int A0D;
    public final long A0E;
    public final long A0F;
    public final long A0G;
    public final long A0H;
    public final 6Yl A0I;
    public final 6Yl A0J;
    public final 6Yl A0K;
    public final String A0L;
    public final String A0M;
    public final boolean A0P;
    public final 6Yl[] A0Q;
    public final List A0R;
    public final ArrayList A0O = AnonymousClass001.A0s();
    public final StringBuilder A0N = AnonymousClass001.A0k();
    public java.util.Map A0C = AnonymousClass001.A0u();
    public java.util.Map A0B = AnonymousClass001.A0u();

    public L4x(6Yl r302, 6Yl r303, 6Yl r304, String str, String str2, String str3, String str4, String str5, String str6, List list, 6Yl[] r312, float f, int i, long j, long j2, long j3, long j4, boolean z) {
        this.A0F = j / 1000;
        this.A0E = j2 / 1000;
        this.A0G = j4 / 1000;
        this.A0H = j3 / 1000;
        this.A0I = r302;
        this.A0Q = r312;
        this.A0J = r303;
        this.A0K = r304;
        this.A0R = list;
        this.A0D = i;
        this.A0M = str;
        this.A0L = str2;
        this.A0P = z;
        this.A09 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A0A = str6;
        this.A00 = f;
    }

    public static void A00(Kkx kkx, String str, StringBuilder sb) {
        StringBuilder A0n = AnonymousClass001.A0n(str);
        A0n.append(":[");
        A0n.append(kkx.A01);
        A0n.append("-");
        A0n.append(kkx.A02);
        A0n.append("-");
        A0n.append(kkx.A04);
        A0n.append("-");
        A0n.append(kkx.A03);
        A0n.append("];");
        1BK.A1R(sb, A0n);
    }

    public String A01() {
        StringBuilder A0k = AnonymousClass001.A0k();
        for (KO8 ko8 : this.A0R) {
            if (A0k.length() > 0) {
                A0k.append(";");
            }
            A0k.append(ko8.shortName);
        }
        return A0k.toString();
    }

    public String A02() {
        StringBuilder A0k = AnonymousClass001.A0k();
        Iterator it = this.A0O.iterator();
        while (it.hasNext()) {
            String str = ((KOt) it.next()).shortName;
            if (A0k.length() > 0) {
                A0k.append(";");
            }
            A0k.append(str);
        }
        return A0k.toString();
    }

    public void A03(KOA koa, String str) {
        String str2 = koa.shortName;
        StringBuilder sb = this.A0N;
        String A0j = 0Pz.A0j(str2, " ", str);
        if (sb.length() > 0) {
            sb.append(";");
        }
        sb.append(A0j);
    }

    public void A04(String str, int i, long j, long j2, long j3, long j4) {
        if (str == null || str.isEmpty()) {
            str = "default";
        }
        this.A0C.put(str, new Kkx(i, j, j2, j3, j4));
    }
}
