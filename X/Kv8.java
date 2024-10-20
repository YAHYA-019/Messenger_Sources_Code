package X;

/* loaded from: Kv8.class */
public abstract class Kv8 {
    public static void A00(Object obj, String str, String str2, int i, int i2) {
        11T.A0A(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Error while pushing ");
        sb.append(obj);
        sb.append(". Not all arguments were provided. Missing ");
        sb.append(i);
        sb.append(" int arguments (");
        sb.append(str2);
        sb.append(") and ");
        sb.append(i2);
        sb.append(" object arguments (");
        sb.append(str);
        sb.append(").");
        A01(sb.toString());
        throw 0Q8.createAndThrow();
    }

    public static final void A01(String str) {
        throw AnonymousClass001.A0N(str);
    }
}
