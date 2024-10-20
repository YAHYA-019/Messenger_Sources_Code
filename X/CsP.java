package X;

/* loaded from: CsP.class */
public final class CsP implements 7yD {
    public final /* synthetic */ CMh A00;

    public CsP(CMh cMh) {
        this.A00 = cMh;
    }

    public final void CUs(String str) {
        BNu bNu;
        11T.A0F(str, 0);
        CMh cMh = this.A00;
        BfE bfE = (BfE) 1Br.A0B(cMh.A01);
        String str2 = cMh.A0F;
        Number A0o = 1BK.A0o(str, cMh.A0H);
        11T.A0F(str2, 1);
        if (str.equals("hidden_contacts")) {
            return;
        }
        1UG A08 = 1BK.A08(1Br.A02(bfE.A00), "msg_setting_privacy_event");
        BNu[] values = BNu.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bNu = null;
                break;
            }
            bNu = values[i];
            String str3 = bNu.mValue;
            if (str3 != null && str3.equalsIgnoreCase(str)) {
                break;
            } else {
                i++;
            }
        }
        if (!A08.isSampled() || bNu == null) {
            return;
        }
        A08.A7R("msg_setting_privacy_session_id", str2);
        AbF.A1L(A08, "item_impression");
        AbI.A1J(A08, AbK.A05(A0o));
        A08.A5c(bNu, "item");
        A08.BZL();
    }
}
