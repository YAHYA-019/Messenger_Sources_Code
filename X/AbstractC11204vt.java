package X;

/* renamed from: X.4vt, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4vt.class */
public abstract class AbstractC11204vt {
    public static Object A00(int i, 1BO r302, Object obj) {
        if (((i >> 7) & 15) == 0) {
            return A01(i, r302, obj);
        }
        throw AnonymousClass001.A0L("Invalid Static DI binding id");
    }

    public static Object A01(int i, 1BO r302, Object obj) {
        Boolean A00;
        switch ((i >> 0) & 127) {
            case 0:
            case 17:
                A00 = PH9.A00();
                break;
            case 1:
            case 16:
                A00 = PHA.A00();
                break;
            case 2:
            case 18:
                A00 = PHC.A00();
                break;
            case 3:
            case 20:
                A00 = PHI.A01();
                break;
            case 4:
            case 19:
                A00 = PHD.A00();
                break;
            case 5:
            case 22:
                A00 = PHE.A00();
                break;
            case 6:
            case 21:
                A00 = PHG.A00();
                break;
            case 7:
            case 11:
            default:
                throw AnonymousClass001.A0L("Invalid Static DI binding id");
            case 8:
                A00 = PHH.A00();
                break;
            case 9:
                A00 = PHJ.A01();
                break;
            case 10:
                A00 = PHJ.A00();
                break;
            case 12:
                A00 = PHI.A00();
                break;
            case 13:
                A00 = 2yD.A01(5Q1.A00((5Q1) 1Bn.A0A(115935)), 2342157563291836461L);
                break;
            case 14:
                A00 = PHF.A00(r302);
                break;
            case 15:
                A00 = PHB.A00(r302);
                break;
        }
        return A00;
    }
}
