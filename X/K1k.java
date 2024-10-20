package X;

import java.util.HashMap;
import java.util.UUID;

/* loaded from: K1k.class */
public final class K1k extends L7x {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;

    public K1k() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0) {
            leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L);
            if (leastSignificantBits == 0) {
                android.util.Log.e("GAv4", "UUID.randomUUID() returned 0.");
                leastSignificantBits = (-1) >>> 1;
            }
        }
        this.A00 = leastSignificantBits;
        this.A06 = false;
    }

    public final String toString() {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("screenName", this.A02);
        A0u.put(4YT.A00(361), Boolean.valueOf(this.A05));
        A0u.put("automatic", Boolean.valueOf(this.A06));
        A0u.put("screenId", Integer.valueOf(this.A00));
        A0u.put("referrerScreenId", Integer.valueOf(this.A01));
        A0u.put("referrerScreenName", this.A03);
        return L7x.A01("referrerUri", this.A04, A0u);
    }
}
