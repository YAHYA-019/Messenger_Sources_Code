package X;

/* renamed from: X.6bl, reason: invalid class name */
/* loaded from: 6bl.class */
public abstract class C6bl {
    public static final 6V9 A00(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -77771114) {
                if (hashCode == 2527 && str.equals("ON")) {
                    return 6V9.A04;
                }
            } else if (str.equals("WIFI_ONLY")) {
                return 6V9.A05;
            }
        }
        return 6V9.A03;
    }
}
