package X;

/* loaded from: Est.class */
public final class Est {
    public final CharSequence A00;
    public final Integer A01;

    public Est(CharSequence charSequence, Integer num) {
        this.A00 = charSequence;
        this.A01 = num;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Dg7, X.EnN] */
    public final C2179Dg7 A00() {
        ?? enN = new EnN();
        ((EnN) enN).A02 = this.A00;
        Integer num = this.A01;
        ((EnN) enN).A00 = num != null ? num.intValue() : (-1) >>> 1;
        return enN;
    }
}
