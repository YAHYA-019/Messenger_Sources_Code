package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: I4y.class */
public final class I4y {
    public long A00;
    public long A01;
    public long A02;
    public C3Oh A03;
    public ImmutableMap A04;
    public Integer A05;
    public Integer A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public Set A0C;
    public byte[] A0D;

    public I4y() {
        this.A0C = AnonymousClass001.A0v();
        this.A04 = RegularImmutableMap.A03;
    }

    public I4y(I9O i9o) {
        this.A0C = AnonymousClass001.A0v();
        this.A04 = i9o.A04;
        this.A05 = i9o.A05;
        this.A07 = i9o.A07;
        this.A03 = i9o.A03;
        this.A08 = i9o.A08;
        this.A09 = i9o.A09;
        this.A00 = i9o.A00;
        this.A01 = i9o.A01;
        this.A02 = i9o.A02;
        this.A0D = i9o.A0D;
        this.A06 = i9o.A06;
        this.A0A = i9o.A0A;
        this.A0B = i9o.A0B;
        this.A0C = AbF.A1E(i9o.A0C);
    }

    public void A00(C3Oh c3Oh) {
        this.A03 = c3Oh;
        C1pq.A08("endpointInfo", c3Oh);
    }

    public void A01(Integer num) {
        this.A05 = num;
        C1pq.A08("coworkerStatus", num);
        if (this.A0C.contains("coworkerStatus")) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A0C);
        this.A0C = A1E;
        A1E.add("coworkerStatus");
    }

    public void A02(Integer num) {
        this.A06 = num;
        C1pq.A08("participantSource", num);
        if (this.A0C.contains("participantSource")) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A0C);
        this.A0C = A1E;
        A1E.add("participantSource");
    }
}
