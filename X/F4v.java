package X;

/* loaded from: F4v.class */
public final class F4v {
    public final 1Br A01 = 1BK.A0D();
    public final 1Br A00 = 7zM.A0Y();

    public static final void A00(F4v f4v, String str, String str2, String str3, String str4, java.util.Map map) {
        long A08 = 7zS.A08(0CW.A0e(7zS.A0E(f4v.A00).A05));
        1UG A082 = 1BK.A08(1Br.A02(f4v.A01), "nme_benefits");
        if (A082.isSampled()) {
            A082.A7R("event_type", str2);
            A082.A7R("benefit_type", "BRANDED_THREADS");
            A082.A7R("subject_type", "subscriber");
            A082.A6H("subscriber_id", Long.valueOf(A08));
            A082.A7R("object_type", str3);
            A082.A7R("surface", str);
            A082.A6J("extra", map);
            A082.A7R("entrypoint", str4);
            A082.BZL();
        }
    }
}
