package X;

/* renamed from: X.5xp, reason: invalid class name */
/* loaded from: 5xp.class */
public abstract class C5xp {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void A00(C5xo c5xo) {
        Object obj;
        String BCK = c5xo.BCK();
        switch (BCK.hashCode()) {
            case -1149187101:
                obj = "SUCCESS";
                break;
            case -1031784143:
                obj = "CANCELLED";
                break;
            case -960575498:
                obj = "DATA_NOT_EXIST";
                break;
            case 66247144:
                if (BCK.equals("ERROR")) {
                    c5xo.AlZ().getClass();
                    return;
                }
                throw AnonymousClass001.A0T("Unknown status");
            case 1054633244:
                obj = "LOADING";
                break;
            default:
                throw AnonymousClass001.A0T("Unknown status");
        }
        if (BCK.equals(obj)) {
            return;
        }
        throw AnonymousClass001.A0T("Unknown status");
    }
}
