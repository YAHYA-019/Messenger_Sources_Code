package X;

import java.util.Set;

/* loaded from: Frw.class */
public final class Frw implements C13b {
    public final /* synthetic */ Frx A00;
    public final /* synthetic */ C13b A01;
    public final /* synthetic */ 13S A02;

    public Frw(Frx frx, C13b c13b, 13S r304) {
        this.A00 = frx;
        this.A02 = r304;
        this.A01 = c13b;
    }

    @Override // X.C13b
    public void onFailure(Throwable th) {
        this.A01.onFailure(th);
    }

    @Override // X.C13b
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        for (13G r0 : (Set) obj) {
            if (r0.A00.equals(this.A02)) {
                this.A01.onSuccess(r0);
                return;
            }
        }
        this.A01.onFailure(AnonymousClass001.A0L("Key does not exist in remote key store"));
    }
}
