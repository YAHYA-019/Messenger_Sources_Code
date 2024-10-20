package X;

/* loaded from: Jys.class */
public final class Jys extends 3BX {
    public final String A00;
    public final String A01;

    public Jys(24S r302, C24j c24j, 24R r304) {
        super(r302, c24j, r304);
        String name = r302._class.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this.A00 = "";
            this.A01 = ".";
        } else {
            this.A01 = name.substring(0, lastIndexOf + 1);
            this.A00 = name.substring(0, lastIndexOf);
        }
    }

    public 24S A01(C26d c26d, String str) {
        if (str.startsWith(".")) {
            int length = str.length();
            String str2 = this.A00;
            StringBuilder A0l = AnonymousClass001.A0l(length + str2.length());
            if (str2.isEmpty()) {
                str = str.substring(1);
            } else {
                A0l.append(str2);
            }
            str = AnonymousClass001.A0d(str, A0l);
        }
        return super.A01(c26d, str);
    }

    public String BOS(Object obj) {
        String A0Y = AnonymousClass001.A0Y(obj);
        if (A0Y.startsWith(this.A01)) {
            A0Y = A0Y.substring(r0.length() - 1);
        }
        return A0Y;
    }
}
