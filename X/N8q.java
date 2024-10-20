package X;

/* loaded from: N8q.class */
public final class N8q implements Runnable {
    public static final String __redex_internal_original_name = "MessageExpirationFlagsBackupManagerImpl$syncLatestLockboxFlagsToLocalStorage$1";
    public final /* synthetic */ 1xH A00;
    public final /* synthetic */ 5Nv A01;

    public N8q(1xH r302, 5Nv r303) {
        this.A01 = r303;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        5Nv r0 = this.A01;
        8Lb A09 = r0.A09();
        8Lb A0A = r0.A0A();
        5Nv.A04(A09, r0);
        5Nv.A05(A0A, r0);
        this.A00.A04(0EI.A00);
    }
}
