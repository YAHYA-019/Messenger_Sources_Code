package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.5o6, reason: invalid class name */
/* loaded from: 5o6.class */
public final class C5o6 {
    public int A00;
    public long A01;
    public long A02;
    public ThreadKey A03;
    public C07684ke A04;
    public Capabilities A05;
    public HeterogeneousMap A06;
    public 5nV A07;
    public C5o9 A08;
    public C5o7 A09;
    public Throwable A0A;
    public List A0B;
    public Set A0C;

    public C5o6() {
        this.A0C = new HashSet();
    }

    public C5o6(5oG r302) {
        this.A0C = new HashSet();
        r302.getClass();
        if (r302 instanceof C5oF) {
            C5oF c5oF = (C5oF) r302;
            this.A09 = c5oF.A09;
            this.A05 = c5oF.A05;
            this.A0A = c5oF.A0A;
            this.A01 = c5oF.A01;
            this.A02 = c5oF.A02;
            this.A07 = c5oF.A07;
            this.A00 = c5oF.A00;
            this.A06 = c5oF.A06;
            this.A0B = c5oF.A0B;
            this.A04 = c5oF.A04;
            this.A03 = c5oF.A03;
            this.A08 = c5oF.A08;
            this.A0C = new HashSet(c5oF.A0C);
            return;
        }
        C5o7 AWk = r302.AWk();
        this.A09 = AWk;
        C1pq.A08("anchoredMessageParams", AWk);
        A00(this, "anchoredMessageParams");
        Capabilities Abd = r302.Abd();
        this.A05 = Abd;
        C1pq.A08("capabilities", Abd);
        A00(this, "capabilities");
        C5oF c5oF2 = (C5oF) r302;
        this.A0A = c5oF2.A0A;
        this.A01 = c5oF2.A01;
        this.A02 = c5oF2.A02;
        5nV AuM = r302.AuM();
        this.A07 = AuM;
        C1pq.A08("loadMoreData", AuM);
        A00(this, "loadMoreData");
        this.A00 = c5oF2.A00;
        HeterogeneousMap AxS = r302.AxS();
        this.A06 = AxS;
        C1pq.A08("metadata", AxS);
        A00(this, "metadata");
        this.A0B = c5oF2.A0B;
        this.A04 = c5oF2.A04;
        this.A03 = c5oF2.A03;
        C5o9 BFF = r302.BFF();
        this.A08 = BFF;
        C1pq.A08("threadReadState", BFF);
        A00(this, "threadReadState");
    }

    public static void A00(C5o6 c5o6, String str) {
        if (c5o6.A0C.contains(str)) {
            return;
        }
        HashSet hashSet = new HashSet(c5o6.A0C);
        c5o6.A0C = hashSet;
        hashSet.add(str);
    }
}
