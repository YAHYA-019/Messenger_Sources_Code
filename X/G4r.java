package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: G4r.class */
public final /* synthetic */ class G4r implements Runnable {
    public static final String __redex_internal_original_name = "AuthLogoutCommonHelper$$ExternalSyntheticLambda3";
    public final /* synthetic */ int A00;
    public final /* synthetic */ FAA A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ AtomicBoolean A03;

    public /* synthetic */ G4r(FAA faa, Runnable runnable, AtomicBoolean atomicBoolean, int i) {
        this.A01 = faa;
        this.A02 = runnable;
        this.A03 = atomicBoolean;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A02(this.A02, this.A03, this.A00);
    }
}
