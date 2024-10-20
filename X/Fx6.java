package X;

/* loaded from: Fx6.class */
public final class Fx6 implements GH6 {
    public final /* synthetic */ Emk A00;
    public final /* synthetic */ Emk A01;

    public Fx6(Emk emk, Emk emk2) {
        this.A01 = emk;
        this.A00 = emk2;
    }

    @Override // X.GH6
    public final boolean DA1(DLQ dlq) {
        Emk emk = this.A01;
        11T.A0D(dlq);
        Emk emk2 = this.A00;
        int i = dlq.A04;
        Object obj = emk.A02.get(i);
        if (obj != null) {
            emk2.A02.put(i, obj);
        }
        Object obj2 = emk.A00.get(i);
        if (obj2 != null) {
            emk2.A00.put(i, obj2);
        }
        Object obj3 = emk.A01.get(i);
        if (obj3 == null) {
            return false;
        }
        emk2.A01.put(i, obj3);
        return false;
    }
}
