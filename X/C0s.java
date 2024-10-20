package X;

/* loaded from: C0s.class */
public final class C0s {
    public final C00i A00 = AbH.A0P();

    /* JADX WARN: Type inference failed for: r0v29, types: [X.Afy, X.2J3] */
    public void A00(String str, String str2, String str3, String str4) {
        C1kw A06 = 1BK.A06(this.A00);
        if (C1391Afy.A00 == null) {
            synchronized (C1391Afy.class) {
                if (C1391Afy.A00 == null) {
                    C1391Afy.A00 = new C2J3(A06);
                }
            }
        }
        AbstractC01593ro A0A = AbJ.A0A(C1391Afy.A00, "messenger_link_open_thread");
        if (A0A.A0B()) {
            A0A.A06("domain", str);
            A0A.A06("target_fbid", str2);
            A0A.A06("query", str3);
            A0A.A06("vanity_name", str4);
            A0A.A0A();
        }
    }
}
