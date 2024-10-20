package X;

import com.facebook.acra.constants.ActionId;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* loaded from: KuL.class */
public final class KuL {
    public int A00;
    public long A01;
    public long A02;
    public Integer A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final C4Kb A09;
    public final int A0A;
    public final int A0B;
    public final C4Ke A0C;
    public final C4Kc A0D;
    public final String A0E;
    public final List A0F;
    public final List A0G;

    public KuL(C4Ke c4Ke, C4Kc c4Kc, C4Kb c4Kb, Integer num, String str, List list, List list2, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6) {
        1BL.A1H(str, c4Kb, c4Kc);
        11T.A0F(num, 9);
        this.A0E = str;
        this.A09 = c4Kb;
        this.A0D = c4Kc;
        this.A06 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A0C = c4Ke;
        this.A04 = i;
        this.A03 = num;
        this.A01 = j4;
        this.A02 = j5;
        this.A00 = i2;
        this.A0A = i3;
        this.A08 = j6;
        this.A0B = i4;
        this.A0G = list;
        this.A0F = list2;
    }

    public final Ktq A00() {
        long j;
        List list = this.A0F;
        C4Kc c4Kc = 1BK.A1Y(list) ? (C4Kc) 1BK.A0r(list) : C4Kc.A01;
        UUID fromString = UUID.fromString(this.A0E);
        11T.A0A(fromString);
        C4Kb c4Kb = this.A09;
        HashSet A1E = AbF.A1E(this.A0G);
        C4Kc c4Kc2 = this.A0D;
        11T.A0C(c4Kc);
        int i = this.A04;
        int i2 = this.A0A;
        C4Ke c4Ke = this.A0C;
        long j2 = this.A06;
        long j3 = this.A07;
        Ksj ksj = j3 != 0 ? new Ksj(j3, this.A05) : null;
        if (c4Kb == C4Kb.ENQUEUED) {
            j = C4Kk.A00(this.A03, i, this.A00, this.A01, this.A02, j2, this.A05, j3, this.A08, AnonymousClass001.A1P(i), AnonymousClass001.A1N((j3 > 0L ? 1 : (j3 == 0L ? 0 : -1))));
        } else {
            j = Long.MAX_VALUE;
        }
        return new Ktq(c4Ke, c4Kc2, c4Kc, ksj, c4Kb, A1E, fromString, i, i2, this.A0B, j2, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof KuL)) {
                return false;
            }
            KuL kuL = (KuL) obj;
            if (!11T.A0O(this.A0E, kuL.A0E) || this.A09 != kuL.A09 || !11T.A0O(this.A0D, kuL.A0D) || this.A06 != kuL.A06 || this.A07 != kuL.A07 || this.A05 != kuL.A05 || !11T.A0O(this.A0C, kuL.A0C) || this.A04 != kuL.A04 || this.A03 != kuL.A03 || this.A01 != kuL.A01 || this.A02 != kuL.A02 || this.A00 != kuL.A00 || this.A0A != kuL.A0A || this.A08 != kuL.A08 || this.A0B != kuL.A0B || !11T.A0O(this.A0G, kuL.A0G) || !11T.A0O(this.A0F, kuL.A0F)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A05 = (AnonymousClass002.A05(this.A0C, AnonymousClass002.A02(this.A05, AnonymousClass002.A02(this.A07, AnonymousClass002.A02(this.A06, AnonymousClass002.A05(this.A0D, AnonymousClass002.A05(this.A09, 4YV.A02(this.A0E))))))) + this.A04) * 31;
        int intValue = this.A03.intValue();
        return 1BK.A03(this.A0F, AnonymousClass002.A05(this.A0G, (AnonymousClass002.A02(this.A08, (((AnonymousClass002.A02(this.A02, AnonymousClass002.A02(this.A01, (A05 + (1 != intValue ? "EXPONENTIAL" : "LINEAR").hashCode() + intValue) * 31)) + this.A00) * 31) + this.A0A) * 31) + this.A0B) * 31));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("WorkInfoPojo(id=");
        A0k.append(this.A0E);
        A0k.append(", state=");
        A0k.append(this.A09);
        A0k.append(", output=");
        A0k.append(this.A0D);
        A0k.append(", initialDelay=");
        A0k.append(this.A06);
        A0k.append(", intervalDuration=");
        A0k.append(this.A07);
        A0k.append(", flexDuration=");
        A0k.append(this.A05);
        A0k.append(", constraints=");
        A0k.append(this.A0C);
        A0k.append(", runAttemptCount=");
        A0k.append(this.A04);
        A0k.append(", backoffPolicy=");
        A0k.append(1 - this.A03.intValue() != 0 ? "EXPONENTIAL" : "LINEAR");
        A0k.append(", backoffDelayDuration=");
        A0k.append(this.A01);
        A0k.append(", lastEnqueueTime=");
        A0k.append(this.A02);
        A0k.append(DKB.A00(ActionId.OFFLINE));
        A0k.append(this.A00);
        A0k.append(", generation=");
        A0k.append(this.A0A);
        A0k.append(", nextScheduleTimeOverride=");
        A0k.append(this.A08);
        A0k.append(", stopReason=");
        A0k.append(this.A0B);
        A0k.append(", tags=");
        A0k.append(this.A0G);
        A0k.append(", progress=");
        return AnonymousClass002.A0K(this.A0F, A0k);
    }
}
