package X;

/* loaded from: Hwa.class */
public abstract class Hwa {
    public static final Integer[] A00 = DKD.A1a();

    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "MASK";
                break;
            case 2:
                str = "NONE";
                break;
            default:
                str = "OVERLAY";
                break;
        }
        return str.hashCode() + intValue;
    }
}
