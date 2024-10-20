package X;

/* loaded from: Bzs.class */
public final class Bzs {
    public final C00i A00 = AbH.A0P();

    /* JADX WARN: Type inference failed for: r0v19, types: [X.2J3, X.Afq] */
    public void A00(String str, String str2) {
        2Jy A0H = 4YU.A0H("invalid_contact_field");
        A0H.A0D("contact_id", str);
        A0H.A0D("contact_field", str2);
        A0H.A0D("pigeon_reserved_keyword_module", "contacts_iterator");
        C1kw A06 = 1BK.A06(this.A00);
        if (C1383Afq.A00 == null) {
            synchronized (C1383Afq.class) {
                if (C1383Afq.A00 == null) {
                    C1383Afq.A00 = new C2J3(A06);
                }
            }
        }
        C1383Afq.A00.A03(A0H);
    }
}
