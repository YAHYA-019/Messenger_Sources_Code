package X;

/* loaded from: Hmi.class */
public final class Hmi {
    public String A00;

    public static String A00(CPV cpv) {
        return CPV.A02(cpv).A01();
    }

    public final String A01() {
        String str = this.A00;
        if (str == null) {
            str = 1BK.A0t();
            this.A00 = str;
        }
        return str;
    }
}
