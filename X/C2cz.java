package X;

/* renamed from: X.2cz, reason: invalid class name */
/* loaded from: 2cz.class */
public final class C2cz implements 1xJ {
    public final /* synthetic */ 1xH A00;
    public final /* synthetic */ 1xF A01;

    public C2cz(1xH r302, 1xF r303) {
        this.A01 = r303;
        this.A00 = r302;
    }

    public /* bridge */ /* synthetic */ void Cit(Object obj) {
        final 0EJ r0 = (0EJ) obj;
        final 1xF r02 = this.A01;
        1xH r03 = new 1xH();
        1xF.A00(r02).A01().addResultCallback(new N6q(r03, r02, 3));
        final 1xH r04 = this.A00;
        r03.A03(new 1xJ() { // from class: X.2wy
            public /* bridge */ /* synthetic */ void Cit(Object obj2) {
                0EI r05 = 0EI.A00;
                if (!11T.A0O(obj2, r05) || !11T.A0O(r0, r05)) {
                    r04.A04(new C19d(null));
                    1xF.A01(r02).A04("DISABLE_MESSAGE_EXPIRATION_FAIL");
                } else {
                    r04.A04(r05);
                    1xF r06 = r02;
                    1xF.A01(r06).A05("DISABLE_ALL_AUTOMATIC_EXPIRATION_SUCCESSFUL");
                    1xF.A01(r06).A01();
                }
            }
        });
    }
}
