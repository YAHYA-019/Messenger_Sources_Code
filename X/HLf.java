package X;

/* loaded from: HLf.class */
public abstract class HLf {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "image";
            case 2:
                return "image_photo";
            default:
                return "audio";
        }
    }
}
