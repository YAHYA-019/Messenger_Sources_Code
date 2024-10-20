package X;

/* renamed from: X.1ly, reason: invalid class name */
/* loaded from: 1ly.class */
public final class C1ly {
    public static final 1G2 A01;
    public static final 1G2 A02;
    public static final 1G2 A03;
    public static final 1G2 A04;
    public static final 1G2 A05;
    public static final 1G2 A06;
    public static final 1G9 A07;
    public final C00i A00 = 1BQ.A02(100239);

    static {
        1G2 A0D = 1G0.A00.A0D("mqtt/");
        A05 = A0D;
        1G2 A0D2 = 1G0.A05.A0D("mqtt/");
        A06 = A0D2;
        A07 = 1G0.A0C.A0F("mqtt/");
        A04 = A0D2.A0D("mqtt_data_restriction_history");
        A03 = A0D.A0D("config_server");
        1G2 r0 = 1G0.A04;
        A02 = r0.A0D("fbns/").A0D("token");
        A01 = r0.A0D("fbns_lite/").A0D("token");
    }

    public 1G2 A00() {
        return ((1LF) this.A00.get()).A02(1G0.A0B, "settings/mqtt/mqtt_connect_hash");
    }
}
