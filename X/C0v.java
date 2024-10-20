package X;

/* loaded from: C0v.class */
public final class C0v {
    public final 1De A00;

    public C0v(1De r302) {
        this.A00 = r302;
    }

    public final DIc A00(String str) {
        int i;
        Object obj;
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1338910485) {
            if (hashCode == 96634189) {
                if (!str.equals("empty")) {
                    return null;
                }
                obj = new Object();
                return (DIc) obj;
            }
            if (hashCode != 300911179 || !str.equals("marketplace")) {
                return null;
            }
            i = 83467;
        } else {
            if (!str.equals("dating")) {
                return null;
            }
            i = 83466;
        }
        obj = 1De.A00(this.A00, i);
        return (DIc) obj;
    }
}
