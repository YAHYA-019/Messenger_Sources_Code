package X;

/* loaded from: AHz.class */
public final class AHz implements 0zU {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 0Pn A01;
    public final /* synthetic */ 0zU A02;

    public AHz(0Pn r302, 0zU r303, long j) {
        this.A01 = r302;
        this.A00 = j;
        this.A02 = r303;
    }

    public final Object emit(Object obj, 0DR r303) {
        long currentTimeMillis = System.currentTimeMillis();
        0Pn r0 = this.A01;
        if (currentTimeMillis - r0.element >= this.A00) {
            r0.element = currentTimeMillis;
            Object emit = this.A02.emit(obj, r303);
            if (emit == 0Ds.A02) {
                return emit;
            }
        }
        return 04S.A00;
    }
}
