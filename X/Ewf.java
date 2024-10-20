package X;

/* loaded from: Ewf.class */
public final class Ewf {
    public final C00i A01 = 1BV.A00(100113);
    public final C00i A02 = 1BQ.A02(16386);
    public final 1Fi A00 = ((1Fe) 1Bi.A03(16496)).A00("pw_enc_key");

    public FEX A00() {
        if (!((ErU) this.A01.get()).A00()) {
            C00i c00i = this.A02;
            return new FEX(new Long(1BK.A0N(c00i).Auy(18579367097599540L)).intValue(), 1BK.A0N(c00i).BCz(18860842074374610L, ""), 1000L);
        }
        1Fi r0 = this.A00;
        int i = r0.getInt("pw_enc_key_id", -1);
        FEX fex = null;
        String string = r0.getString("pw_enc_public_key", (String) null);
        long j = -1;
        long j2 = r0.getLong("pw_enc_key_expiry_timestamp_ms", j);
        String string2 = r0.getString("pw_enc_key_state", (String) null);
        if (i != -1 && string != null && j2 != j && string2 != null) {
            fex = new FEX(j2, string, i, string2);
        }
        return fex;
    }

    public void A01(FEX fex) {
        if (((ErU) this.A01.get()).A00()) {
            int i = fex.A00;
            String str = fex.A03;
            long j = fex.A01;
            String str2 = 1 - fex.A02.intValue() != 0 ? "ENCRYPTION_WITH_TAGGING" : "PLAINTEXT_WITH_TAGGING";
            InterfaceC00051a0 AP5 = this.A00.AP5();
            AP5.CaD("pw_enc_key_id", i);
            AP5.CaK("pw_enc_public_key", str);
            AP5.CaG("pw_enc_key_expiry_timestamp_ms", j);
            AP5.CaK("pw_enc_key_state", str2);
            AP5.commit();
        }
    }
}
