package X;

/* loaded from: H06.class */
public final class H06 extends C66m {
    public final /* synthetic */ H4C A00;

    public H06(H4C h4c) {
        this.A00 = h4c;
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        if (GOq.A01(c66i) == 0.0d) {
            H4C.A00(this.A00);
        }
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        float A01 = (float) GOq.A01(c66i);
        if (A01 != 0.0f) {
            6cN r0 = this.A00;
            float A00 = C7W1.A00(4YU.A08(r0));
            r0.setY(A00 - (A01 * A00));
        }
    }
}
