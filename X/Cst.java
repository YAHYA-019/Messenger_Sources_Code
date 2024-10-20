package X;

/* loaded from: Cst.class */
public final class Cst implements DHV {
    public final String A00;
    public final String A01;
    public final String A02;

    public Cst(String str, String str2, String str3) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public String BHk() {
        return this.A02;
    }

    public String getId() {
        StringBuilder sb = new StringBuilder(this.A01);
        String str = this.A00;
        if (str != null) {
            sb.append(str);
        }
        return sb.toString();
    }
}
