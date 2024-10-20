package X;

/* renamed from: X.Jpc, reason: case insensitive filesystem */
/* loaded from: Jpc.class */
public final class C3282Jpc extends 5M7 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final /* synthetic */ 6D9 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3282Jpc(5M2 r302, 6D9 r303, 5LX r304, String str, String str2, String str3, String str4) {
        super(r302, r304, false);
        this.A04 = r303;
        if (str == null) {
            this.A00 = "x-bwe-mean";
        } else {
            this.A00 = str;
        }
        this.A02 = str2;
        this.A03 = str3;
        this.A01 = str4;
    }

    public String A01() {
        return this.A01;
    }

    public String A02() {
        return this.A02;
    }

    public String A03() {
        return this.A03;
    }

    public String A04() {
        return this.A00;
    }

    public void A05(final C5fe c5fe) {
        if (c5fe.A08 > 0 || c5fe.A09 > 0 || c5fe.A07 > 0) {
            6D9 r0 = this.A04;
            7qX r02 = r0.A07;
            KMQ kmq = 6D9.A0B;
            java.util.Map map = r02.A00;
            final long currentTimeMillis = System.currentTimeMillis();
            map.put(kmq, new Object(c5fe, currentTimeMillis) { // from class: X.7p3
                public final long A00;
                public final C5fe A01;

                {
                    this.A01 = c5fe;
                    this.A00 = currentTimeMillis;
                }
            });
            7qX r03 = r0.A06;
            if (r03 != null) {
                java.util.Map map2 = r03.A00;
                final long currentTimeMillis2 = System.currentTimeMillis();
                map2.put(kmq, new Object(c5fe, currentTimeMillis2) { // from class: X.7p3
                    public final long A00;
                    public final C5fe A01;

                    {
                        this.A01 = c5fe;
                        this.A00 = currentTimeMillis2;
                    }
                });
            }
        }
    }

    public void A06(String str, String str2) {
        this.A04.A03 = str2;
    }
}
