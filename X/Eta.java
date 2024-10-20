package X;

/* loaded from: Eta.class */
public final class Eta {
    public final Object A00 = AnonymousClass001.A0R();
    public final java.util.Map A01 = AnonymousClass001.A0u();

    public int A00(DLQ dlq, DLQ dlq2, String str) {
        int incrementAndGet;
        Ewq ewq = new Ewq(dlq2.A04, dlq.A04, str);
        synchronized (this.A00) {
            java.util.Map map = this.A01;
            Integer num = (Integer) map.get(ewq);
            if (num != null) {
                incrementAndGet = num.intValue();
            } else {
                incrementAndGet = EaO.A00.incrementAndGet();
                1BK.A1P(ewq, map, incrementAndGet);
            }
        }
        return incrementAndGet;
    }
}
