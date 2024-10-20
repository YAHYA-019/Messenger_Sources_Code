package X;

/* renamed from: X.44i, reason: invalid class name */
/* loaded from: 44i.class */
public final class C44i extends C44j implements Runnable {
    public static final String __redex_internal_original_name = "TimeoutCoroutine";
    public final long A00;

    public C44i(0DR r302, long j) {
        super(r302, r302.getContext());
        this.A00 = j;
    }

    @Override // X.C2ak, X.C2a1
    public String A0F() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(super.A0F());
        A0k.append("(timeMillis=");
        A0k.append(this.A00);
        return AnonymousClass001.A0g(A0k, ')');
    }

    @Override // java.lang.Runnable
    public void run() {
        long j = this.A00;
        C44k.A03(((C2ak) this).A00);
        A0N(new 4EY(0Pz.A0h("Timed out waiting for ", " ms", j), this));
    }
}
