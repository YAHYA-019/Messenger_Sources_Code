package X;

/* loaded from: Hag.class */
public final class Hag {
    public HSk A00;
    public ICU A01;

    public static String A00(C6x5 c6x5) {
        switch (c6x5.ordinal()) {
            case 0:
            case 1:
                return "messenger_camera_inbox";
            case 2:
                return "messenger_camera_chathead";
            case 3:
            case 4:
                return "messenger_camera_composer";
            case 5:
                return "messenger_camera_preview";
            case 6:
                return "qr_code";
            default:
                return "messenger_camera";
        }
    }
}
