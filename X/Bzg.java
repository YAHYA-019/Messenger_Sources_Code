package X;

/* loaded from: Bzg.class */
public final class Bzg {
    public final boolean A00(String str, String str2, String str3) {
        11T.A0H(str, str2);
        if (str3.equals("active_groups")) {
            return false;
        }
        if (str.equals("create_mode")) {
            return true;
        }
        return str.equals("edit_mode") && "rooms_management_invite".equals(str2);
    }
}
