package X;

/* renamed from: X.MhR, reason: case insensitive filesystem */
/* loaded from: MhR.class */
public abstract class AbstractC3531MhR {
    public static byte A00(byte b) {
        byte b2 = 8;
        switch (b) {
            case 1:
                b2 = 1;
                break;
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 4;
            case 5:
            case 7:
            case 9:
            case 17:
            case 18:
            default:
                throw new IllegalArgumentException(0Pz.A0T("type=", b));
            case 6:
                return (byte) 6;
            case 8:
            case 16:
                break;
            case 10:
                return (byte) 10;
            case 11:
            case 20:
                return (byte) 11;
            case 12:
                return (byte) 12;
            case 13:
                return (byte) 13;
            case 14:
                return (byte) 14;
            case 15:
                return (byte) 15;
            case 19:
                return (byte) 19;
        }
        return b2;
    }
}
