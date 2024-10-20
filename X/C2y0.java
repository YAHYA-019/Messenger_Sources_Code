package X;

/* renamed from: X.2y0, reason: invalid class name */
/* loaded from: 2y0.class */
public final class C2y0 extends C00q implements C00m {
    public final int A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2y0(String str, int i) {
        super(0);
        this.A01 = str;
        this.A00 = i;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj = this.A01;
        if (obj == null) {
            obj = Integer.valueOf(this.A00);
        }
        return String.valueOf(obj);
    }
}
