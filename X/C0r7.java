package X;

/* renamed from: X.0r7, reason: invalid class name */
/* loaded from: 0r7.class */
public final class C0r7 implements C1A0 {
    public final 1Fe A00;

    public C0r7(1Fe r302) {
        this.A00 = r302;
    }

    @Override // X.C1A0
    public void Btd(int i, String str) {
    }

    @Override // X.C1A0
    public void C3z(int i, String str, String[] strArr) {
    }

    @Override // X.C1A0
    public void C4i(int i, String str, boolean z) {
    }

    @Override // X.C1A0
    public void C4j(int i, String str) {
    }

    @Override // X.C1A0
    public void C4k(String str) {
        1Fe r0 = this.A00;
        1Fi A00 = r0.A00("AppModules::InitialLoadTimestamp");
        if (!A00.contains(str)) {
            InterfaceC00051a0 AP5 = A00.AP5();
            AP5.CaG(str, System.currentTimeMillis());
            AP5.apply();
        }
        InterfaceC00051a0 AP52 = r0.A00("AppModules::LastLoadTimestamp").AP5();
        AP52.CaG(str, System.currentTimeMillis());
        AP52.apply();
    }

    @Override // X.C1A0
    public void C8Q(int i, String str) {
    }
}
