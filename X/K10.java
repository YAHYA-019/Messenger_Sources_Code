package X;

import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;

/* loaded from: K10.class */
public final class K10 extends JTT {
    public KLo A00;
    public long A01;
    public long A02;
    public K0z A03;
    public final long A04;
    public final long A05;
    public final 6Xp A06;
    public final ArrayList A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K10(6ZJ r302, long j, long j2) {
        super(r302);
        r302.getClass();
        6DP.A03(1BL.A1S((j > 0L ? 1 : (j == 0L ? 0 : -1))));
        this.A05 = j;
        this.A04 = j2;
        this.A07 = AnonymousClass001.A0s();
        this.A06 = new 6Xp();
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [X.K0z, com.google.android.exoplayer2.Timeline] */
    public static void A00(Timeline timeline, K10 k10) {
        long j;
        ArrayList arrayList;
        6Xp r0 = k10.A06;
        timeline.A0F(r0, 0, 0L);
        long j2 = r0.A05;
        try {
            if (k10.A03 != null) {
                arrayList = k10.A07;
                if (!arrayList.isEmpty()) {
                    j = k10.A02 - j2;
                    if (k10.A04 != Long.MIN_VALUE) {
                        r311 = k10.A01 - j2;
                    }
                    ?? k0z = new K0z(timeline, j, r311);
                    k10.A03 = k0z;
                    k10.A0D((Timeline) k0z);
                    return;
                }
            }
            ?? k0z2 = new K0z(timeline, j, r311);
            k10.A03 = k0z2;
            k10.A0D((Timeline) k0z2);
            return;
        } catch (KLo e) {
            k10.A00 = e;
            for (int i = 0; i < arrayList.size(); i++) {
                ((C6a6) arrayList.get(i)).A03 = e;
            }
            return;
        }
        j = k10.A05;
        long j3 = k10.A04;
        long j4 = j2 + j;
        k10.A02 = j4;
        r311 = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
        k10.A01 = r311;
        arrayList = k10.A07;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                break;
            }
            C6a6 c6a6 = (C6a6) arrayList.get(i3);
            c6a6.A02 = j4;
            c6a6.A00 = r311;
            i2 = i3 + 1;
        }
        r311 = j3;
    }

    public void A0E() {
        super/*X.JTS*/.A0E();
        this.A00 = null;
        this.A03 = null;
    }

    public 6Zm AKZ(6YR r302, 6XD r303, long j) {
        C6a6 c6a6 = new C6a6(((JTT) this).A00.AKZ(r302, r303, j), this.A02, this.A01);
        this.A07.add(c6a6);
        return c6a6;
    }

    public void Bdm() {
        KLo kLo = this.A00;
        if (kLo != null) {
            throw kLo;
        }
        super/*X.JTS*/.Bdm();
    }

    public void Ccv(6Zm r302) {
        ArrayList arrayList = this.A07;
        6DP.A04(arrayList.remove(r302));
        ((JTT) this).A00.Ccv(((C6a6) r302).A06);
        if (arrayList.isEmpty()) {
            K0z k0z = this.A03;
            k0z.getClass();
            A00(((6Yo) k0z).A00, this);
        }
    }
}
