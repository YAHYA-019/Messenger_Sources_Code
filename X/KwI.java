package X;

/* loaded from: KwI.class */
public abstract class KwI {
    public static Integer A00(String str) {
        if (str.equals("NONE")) {
            return 0S2.A00;
        }
        if (str.equals("EDITABLE")) {
            return 0S2.A01;
        }
        if (str.equals("SELECTED")) {
            return 0S2.A0C;
        }
        if (str.equals("UNSELECTED")) {
            return 0S2.A0N;
        }
        if (str.equals("UNEDITABLE")) {
            return 0S2.A0Y;
        }
        throw AnonymousClass001.A0L(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "EDITABLE";
            case 2:
                return "SELECTED";
            case 3:
                return "UNSELECTED";
            case 4:
                return "UNEDITABLE";
            default:
                return "NONE";
        }
    }
}
