package X;

import java.util.Arrays;

/* loaded from: Hts.class */
public final class Hts {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public String A05 = "";
    public String A04 = "";

    public Hts() {
        long j = -1;
        this.A03 = j;
        this.A00 = j;
        this.A02 = j;
        this.A01 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Hts hts = (Hts) obj;
            if (this.A03 != hts.A03 || this.A00 != hts.A00 || this.A02 != hts.A02 || this.A01 != hts.A01 || !this.A05.equals(hts.A05) || !this.A04.equals(hts.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A03), Long.valueOf(this.A00), Long.valueOf(this.A02), Long.valueOf(this.A01), this.A05, this.A04});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("startReadTimeUs:");
        A0k.append(this.A03);
        A0k.append("\nendReadTimeUs:");
        A0k.append(this.A00);
        A0k.append("\nframeBeforeStartReadTimeUs:");
        A0k.append(this.A02);
        A0k.append("\nframeAfterEndReadTimeUs:");
        A0k.append(this.A01);
        A0k.append("\ntrackInfoMap:");
        A0k.append(this.A05);
        A0k.append("\nexceptions:");
        return AnonymousClass001.A0d(this.A04, A0k);
    }
}
