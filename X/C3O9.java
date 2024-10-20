package X;

/* renamed from: X.3O9, reason: invalid class name */
/* loaded from: 3O9.class */
public abstract class C3O9 {
    public long A00 = -1;
    public Integer A01 = 0S2.A0N;
    public final long A02 = System.currentTimeMillis();
    public final String A03;

    public C3O9(String str) {
        this.A03 = str;
    }

    public String A00() {
        switch (this.A01.intValue()) {
            case 0:
                return "mismatch_updated";
            case 1:
                return "mismatch_not_updated";
            case 2:
                return "failed";
            case 3:
                return "no_response";
            case 4:
                return "null";
            case 5:
                return "same";
            case 6:
                return "older";
            case 7:
                return "new";
            default:
                return "newer";
        }
    }
}
