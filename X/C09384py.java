package X;

/* renamed from: X.4py, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4py.class */
public final class C09384py {
    public static final 1G2 A01;
    public static final 1G2 A02;
    public static final 1G2 A03;
    public static final 1G2 A04;
    public static final 1G2 A05;
    public final C00i A00 = new 1BQ(100239);

    static {
        1G2 r0 = 1G0.A05;
        1G2 A0D = r0.A0D("contacts_persist/");
        A03 = A0D;
        1G2 A0D2 = r0.A0D("persisted_contacts_upload_settings/");
        A04 = A0D2;
        A05 = A0D.A0D("continuous_import");
        A02 = A0D2.A0D("continuous_import");
        A01 = A0D.A0D("last_contacts_upload_attempt_timestamp");
    }

    public 1G2 A00() {
        return ((1LF) this.A00.get()).A04(1G0.A0B, "contacts_upload/contacts_upload_import_id", true);
    }

    public 1G2 A01() {
        return ((1LF) this.A00.get()).A04(1G0.A0B, "contacts_upload/last_full_upload_success_timestamp", true);
    }
}
