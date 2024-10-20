package X;

/* loaded from: CsQ.class */
public final class CsQ implements 7yD {
    public final /* synthetic */ C1600Amh A00;

    public CsQ(C1600Amh c1600Amh) {
        this.A00 = c1600Amh;
    }

    public void CUs(String str) {
        C6q c6q = (C6q) this.A00.A03.get();
        11T.A0F(str, 0);
        1UG A08 = 1BK.A08(1Br.A02(c6q.A00), "messenger_account_settings_event");
        if (A08.isSampled()) {
            AbF.A1L(A08, "item_impression");
            A08.A7R("setting_type", str);
            A08.BZL();
        }
    }
}
