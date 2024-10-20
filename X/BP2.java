package X;

/* loaded from: BP2.class */
public enum BP2 implements C4zn {
    FIRST("first"),
    SEE_MORE("see_more");

    public final String loggingName;

    BP2(String str) {
        this.loggingName = str;
    }

    public static BP2 A00(BP5 bp5) {
        switch (bp5.ordinal()) {
            case 12:
            case 13:
            case 14:
            case 15:
            case 22:
            case 23:
                return SEE_MORE;
            default:
                return FIRST;
        }
    }

    @Override // X.C4zn
    public String Aus() {
        throw 0Q8.createAndThrow();
    }
}
