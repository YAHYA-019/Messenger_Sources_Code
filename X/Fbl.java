package X;

/* loaded from: Fbl.class */
public final class Fbl implements GEI {
    public final /* synthetic */ GEI A00;
    public final /* synthetic */ Fcf A01;
    public final /* synthetic */ FEf A02;

    public Fbl(GEI gei, Fcf fcf, FEf fEf) {
        this.A01 = fcf;
        this.A02 = fEf;
        this.A00 = gei;
    }

    public boolean cancel() {
        F5l f5l = this.A01.A04;
        FEf fEf = this.A02;
        F5l.A00(f5l);
        JNI jni = f5l.A01;
        if (jni != null) {
            jni.endCancel(jni.getInstanceIdWithString(16321564, fEf.A00), "ARD Fetch Canceled");
        }
        return this.A00.cancel();
    }
}
