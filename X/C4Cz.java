package X;

/* renamed from: X.4Cz, reason: invalid class name */
/* loaded from: 4Cz.class */
public final class C4Cz {
    public final AnonymousClass046 A00;

    public C4Cz(AnonymousClass046 anonymousClass046) {
        this.A00 = anonymousClass046;
    }

    public void A00(String str, Throwable th, String... strArr) {
        AnonymousClass047 ACu = this.A00.ACu(str, 21373413);
        ACu.Cmr(th);
        int i = 0;
        while (true) {
            int i2 = i;
            int length = strArr.length;
            if (i2 >= length || i2 == length - 1) {
                break;
            }
            ACu.A8K(strArr[i2], strArr[i2 + 1]);
            i = i2 + 2;
        }
        ACu.report();
    }

    public void A01(String str, String... strArr) {
        AnonymousClass047 ACu = this.A00.ACu(str, 21373413);
        int i = 0;
        while (true) {
            int i2 = i;
            int length = strArr.length;
            if (i2 >= length || i2 == length - 1) {
                break;
            }
            ACu.A8K(strArr[i2], strArr[i2 + 1]);
            i = i2 + 2;
        }
        ACu.report();
    }
}
