package X;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Kto.class */
public final class Kto {
    public KrO A00;
    public KTZ A01;
    public KpQ A02;
    public KMr A03;
    public KMr A04;
    public UUID A05;
    public UUID A06;
    public UUID A07;
    public UUID A08;
    public final AtomicBoolean A09;

    public Kto(KTZ ktz, KMr kMr, KMr kMr2, UUID uuid, UUID uuid2, AtomicBoolean atomicBoolean) {
        C3o5.A0k(kMr, 4, kMr2);
        this.A01 = ktz;
        this.A06 = uuid;
        this.A05 = uuid2;
        this.A04 = kMr;
        this.A03 = kMr2;
        this.A09 = atomicBoolean;
        this.A02 = null;
        this.A08 = null;
        this.A07 = null;
        this.A00 = null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Kto)) {
                return false;
            }
            Kto kto = (Kto) obj;
            if (!11T.A0O(this.A01, kto.A01) || !11T.A0O(this.A06, kto.A06) || !11T.A0O(this.A05, kto.A05) || this.A04 != kto.A04 || this.A03 != kto.A03 || !11T.A0O(this.A09, kto.A09) || !11T.A0O(this.A02, kto.A02) || !11T.A0O(this.A08, kto.A08) || !11T.A0O(this.A07, kto.A07) || !11T.A0O(this.A00, kto.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass002.A05(this.A09, AnonymousClass002.A05(this.A03, AnonymousClass002.A05(this.A04, AnonymousClass002.A05(this.A05, AnonymousClass002.A05(this.A06, 1BL.A03(this.A01)))))) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A08)) * 31) + AnonymousClass001.A02(this.A07)) * 31) + 4YU.A03(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SessionData(currentLink=");
        A0k.append(this.A01);
        A0k.append(", currentTxLinkId=");
        A0k.append(this.A06);
        A0k.append(", currentRxLinkId=");
        A0k.append(this.A05);
        A0k.append(", currentTxLinkType=");
        A0k.append(this.A04);
        A0k.append(", currentRxLinkType=");
        A0k.append(this.A03);
        A0k.append(", shouldSwitchInput=");
        A0k.append(this.A09);
        A0k.append(", inputRolloverData=");
        A0k.append(this.A02);
        A0k.append(", txLinkToSwitchToId=");
        A0k.append(this.A08);
        A0k.append(", rxLinkToSwitchToId=");
        A0k.append(this.A07);
        A0k.append(", linkSwitchBlockingResult=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
