package X;

/* renamed from: X.82v, reason: invalid class name */
/* loaded from: 82v.class */
public final class C82v extends C00q implements C00m {
    public final long A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82v(long j) {
        super(0);
        this.A00 = j;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z = false;
        if (this.A00 == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
