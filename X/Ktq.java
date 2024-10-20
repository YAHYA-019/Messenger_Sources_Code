package X;

import java.util.Set;
import java.util.UUID;

/* loaded from: Ktq.class */
public final class Ktq {
    public final int A00;
    public final int A01;
    public final C4Kc A02;
    public final C4Kc A03;
    public final C4Kb A04;
    public final Set A05;
    public final UUID A06;
    public final int A07;
    public final long A08;
    public final long A09;
    public final C4Ke A0A;
    public final Ksj A0B;

    public Ktq(C4Ke c4Ke, C4Kc c4Kc, C4Kc c4Kc2, Ksj ksj, C4Kb c4Kb, Set set, UUID uuid, int i, int i2, int i3, long j, long j2) {
        this.A06 = uuid;
        this.A04 = c4Kb;
        this.A05 = set;
        this.A02 = c4Kc;
        this.A03 = c4Kc2;
        this.A01 = i;
        this.A00 = i2;
        this.A0A = c4Ke;
        this.A08 = j;
        this.A0B = ksj;
        this.A09 = j2;
        this.A07 = i3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            z = false;
            if (obj != null && 1BL.A1V(this, obj)) {
                Ktq ktq = (Ktq) obj;
                if (this.A01 == ktq.A01 && this.A00 == ktq.A00 && 11T.A0O(this.A06, ktq.A06) && this.A04 == ktq.A04 && 11T.A0O(this.A02, ktq.A02) && 11T.A0O(this.A0A, ktq.A0A) && this.A08 == ktq.A08 && 11T.A0O(this.A0B, ktq.A0B) && this.A09 == ktq.A09 && this.A07 == ktq.A07 && 11T.A0O(this.A05, ktq.A05)) {
                    z = 11T.A0O(this.A03, ktq.A03);
                }
            }
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A09, (AnonymousClass002.A02(this.A08, AnonymousClass002.A05(this.A0A, (((AnonymousClass002.A05(this.A03, AnonymousClass002.A05(this.A05, AnonymousClass002.A05(this.A02, AnonymousClass002.A05(this.A04, 1BL.A03(this.A06))))) + this.A01) * 31) + this.A00) * 31)) + AnonymousClass002.A04(this.A0B)) * 31) + this.A07;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("WorkInfo{id='");
        A0k.append(this.A06);
        A0k.append("', state=");
        A0k.append(this.A04);
        A0k.append(", outputData=");
        A0k.append(this.A02);
        A0k.append(", tags=");
        A0k.append(this.A05);
        A0k.append(", progress=");
        A0k.append(this.A03);
        A0k.append(", runAttemptCount=");
        A0k.append(this.A01);
        A0k.append(", generation=");
        A0k.append(this.A00);
        A0k.append(", constraints=");
        A0k.append(this.A0A);
        A0k.append(", initialDelayMillis=");
        A0k.append(this.A08);
        A0k.append(", periodicityInfo=");
        A0k.append(this.A0B);
        A0k.append(", nextScheduleTimeMillis=");
        A0k.append(this.A09);
        A0k.append("}, stopReason=");
        return GOn.A1B(A0k, this.A07);
    }
}
