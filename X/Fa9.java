package X;

/* loaded from: Fa9.class */
public final class Fa9 implements InterfaceC08314mj {
    public final C09864rq A00 = (C09864rq) 1Bn.A0A(82436);

    @Override // X.InterfaceC08314mj
    public 2Jy AU5(String str, long j) {
        if (str == null) {
            return null;
        }
        2Jy A0H = 4YU.A0H("contacts_upload_state");
        A0H.A0D("pigeon_reserved_keyword_module", "contacts_upload");
        A0H.A0B("continuous_upload_state", this.A00.A00().getDbValue());
        return A0H;
    }
}
