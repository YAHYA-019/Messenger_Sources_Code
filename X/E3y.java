package X;

/* loaded from: E3y.class */
public final class E3y extends ExW {
    public final C00i A00 = 1BQ.A01();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public /* bridge */ /* synthetic */ Object A02(FFX ffx, GL7 gl7, FyG fyG) {
        int i;
        int i2;
        int i3;
        String A05 = GL7.A05(gl7);
        if (!0AT.A02(EWg.A00(fyG).BDl())) {
            try {
                i3 = A05.hashCode();
            } catch (Exception e) {
                DKE.A1U(R2C.class, A05, e);
                i3 = 0;
            }
            i2 = 167772160;
            switch (i3) {
                case -1923613764:
                    i2 = -6278145;
                    break;
                case -789823281:
                    i2 = -16777216;
                    break;
                case -385178991:
                case -385178990:
                    break;
                case -385178988:
                    i2 = 251658240;
                    break;
                case 81009:
                    i2 = -50637;
                    break;
                case 2041946:
                    i2 = -16089857;
                    break;
                case 68081379:
                    i2 = -13513658;
                    break;
                case 944353155:
                    i2 = 520093696;
                    break;
                case 944353184:
                    i2 = 855638016;
                    break;
                case 944353219:
                    i2 = 1442840576;
                    break;
                case 944353277:
                    i2 = (-1) << (-1);
                    break;
                default:
                    1BK.A09(this.A00).D0v("NTMigSemanticColorReferenceSubscriber", 0Pz.A0W("Unexpected light semantic color: ", A05));
                    i2 = -16777216;
                    break;
            }
        } else {
            try {
                i = A05.hashCode();
            } catch (Exception e2) {
                DKE.A1U(R2C.class, A05, e2);
                i = 0;
            }
            i2 = -1;
            switch (i) {
                case -1923613764:
                    i2 = -5683201;
                    break;
                case -789823281:
                    break;
                case -385178991:
                case -385178990:
                case -385178988:
                case 944353155:
                    i2 = 872415231;
                    break;
                case 81009:
                    i2 = -46782;
                    break;
                case 2041946:
                    i2 = -12412161;
                    break;
                case 68081379:
                    i2 = -12200360;
                    break;
                case 944353184:
                    i2 = 1476395007;
                    break;
                case 944353219:
                case 944353277:
                    i2 = -2130706433;
                    break;
                default:
                    1BK.A09(this.A00).D0v("NTMigSemanticColorReferenceSubscriber", 0Pz.A0W("Unexpected dark semantic color: ", A05));
                    break;
            }
        }
        return Integer.toHexString(i2);
    }
}
