package X;

/* renamed from: X.Gci, reason: case insensitive filesystem */
/* loaded from: Gci.class */
public abstract class AbstractC2421Gci extends Ic7 implements JQ2 {
    public int A00;
    public final I4V A01;

    public AbstractC2421Gci(JOW jow) {
        super.A00 = jow;
        this.A01 = I4V.A00();
    }

    public I1R A0F() {
        JNk jNk = ((C2420Gch) this).A0g;
        if (jNk == null || !jNk.isConnected()) {
            return null;
        }
        try {
            return jNk.Abc();
        } catch (J77 unused) {
            return null;
        }
    }
}
