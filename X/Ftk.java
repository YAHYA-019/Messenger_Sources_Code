package X;

/* loaded from: Ftk.class */
public final class Ftk implements GGj {
    public final F5i A00;

    public Ftk(F5i f5i) {
        this.A00 = f5i;
    }

    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        AbstractC10314t5 abstractC10314t5 = (AbstractC10314t5) obj;
        if (abstractC10314t5.A01()) {
            1UG A08 = 1BK.A08(1BK.A07(this.A00.A02), "zero_sdk_dispatched_event");
            if (A08.isSampled()) {
                A08.A7R("action_name", abstractC10314t5.A00());
                A08.A6H("dispatch_time", Long.valueOf(abstractC10314t5.A00));
                A08.BZL();
            }
        }
    }
}
