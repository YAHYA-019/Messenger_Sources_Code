package X;

/* loaded from: Fwv.class */
public final class Fwv implements GJ2 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Fwv(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.GJ2
    public void onFailure(Throwable th) {
        if (this.A00 != 0) {
            ((F99) this.A02).A05.invoke(new FZe(this.A01, 2));
        } else {
            AnonymousClass001.A07().post(new S6Z((Runnable) this.A01));
        }
    }

    @Override // X.GJ2
    public void onSuccess() {
        if (this.A00 != 0) {
            ((F99) this.A02).A04.invoke();
        } else {
            AnonymousClass001.A07().post(new S6a((Runnable) this.A02));
        }
    }
}
