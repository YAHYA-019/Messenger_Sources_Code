package X;

/* renamed from: X.185, reason: invalid class name */
/* loaded from: 185.class */
public abstract class AnonymousClass185 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "MqttLite";
            case 1:
                return "FBNS";
            case 2:
                return "PreloadedFBNS";
            case 3:
                return "MqttDirect";
            case 4:
                return "MqttSimpleClient";
            default:
                return "MultiuserMqtt";
        }
    }
}
