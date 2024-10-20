package X;

/* loaded from: Evo.class */
public final class Evo {
    public final C00i A00 = AbH.A0N();

    public void A00(String str, long j, int i) {
        1UG A08 = 1BK.A08(1BK.A07(this.A00), "bi_pex_gdpr_consent_impression");
        if (A08.isSampled()) {
            AbF.A1L(A08, "impression");
            A08.A7R("extra_logging_data", str);
            A08.A7R("pigeon_reserved_keyword_module", "business_integrity");
            if (j != -1) {
                A08.A6H("loading_time_ms", Long.valueOf(j));
            }
            if (i != -1) {
                A08.A5q(AnonymousClass000.A00(232), Integer.valueOf(i));
            }
            A08.BZL();
        }
    }

    public void A01(String str, String str2) {
        1UG A08 = 1BK.A08(1BK.A07(this.A00), "bi_pex_gdpr_consent_impression");
        if (A08.isSampled()) {
            AbF.A1L(A08, str2);
            A08.A7R("pigeon_reserved_keyword_module", "business_integrity");
            if (str != null) {
                A08.A7R("extra_logging_data", str);
            }
            A08.BZL();
        }
    }
}
