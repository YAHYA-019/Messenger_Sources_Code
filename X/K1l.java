package X;

import java.util.HashMap;

/* loaded from: K1l.class */
public final class K1l extends L7x {
    public double A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;

    public final String toString() {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("hitType", this.A01);
        A0u.put("clientId", this.A02);
        A0u.put("userId", this.A03);
        A0u.put("androidAdId", this.A04);
        A0u.put("AdTargetingEnabled", Boolean.valueOf(this.A06));
        A0u.put("sessionControl", this.A05);
        A0u.put("nonInteraction", Boolean.valueOf(this.A07));
        return L7x.A01("sampleRate", Double.valueOf(this.A00), A0u);
    }
}
