package X;

import java.util.Arrays;

/* renamed from: X.46q, reason: invalid class name */
/* loaded from: 46q.class */
public final class C46q {
    public C46r A00;
    public final C46r A01;
    public final String A02;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.46r, java.lang.Object] */
    public C46q(String str) {
        ?? obj = new Object();
        this.A01 = obj;
        this.A00 = obj;
        str.getClass();
        this.A02 = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.46r, java.lang.Object] */
    public static void A00(C46q c46q, Object obj, String str) {
        ?? obj2 = new Object();
        c46q.A00.A00 = obj2;
        c46q.A00 = obj2;
        obj2.A01 = obj;
        obj2.A02 = str;
    }

    public void A01(String str, int i) {
        A00(this, String.valueOf(i), str);
    }

    public void A02(String str, boolean z) {
        A00(this, String.valueOf(z), str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.A02);
        sb.append('{');
        String str = "";
        for (C46r c46r = this.A01.A00; c46r != null; c46r = c46r.A00) {
            Object obj = c46r.A01;
            sb.append(str);
            if (c46r.A02 != null) {
                sb.append(c46r.A02);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
