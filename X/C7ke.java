package X;

/* renamed from: X.7ke, reason: invalid class name */
/* loaded from: 7ke.class */
public abstract class C7ke {
    public static String A00(String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf("access_token")) > -1) {
            int indexOf2 = str.indexOf(38, indexOf);
            if (indexOf2 <= indexOf) {
                return str.substring(0, indexOf);
            }
            str = 0Pz.A0W(str.substring(0, indexOf), AnonymousClass001.A0W(indexOf2, str));
        }
        return str;
    }
}
