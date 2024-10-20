package X;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9gv, reason: invalid class name */
/* loaded from: 9gv.class */
public final class C9gv {
    public final 4xU A00 = (4xU) 1Bi.A03(49374);

    public static final 2qM A00(String str) {
        Object obj;
        switch (str.hashCode()) {
            case 10084:
                obj = "❤";
                break;
            case 377643:
                obj = "❤️";
                break;
            case 1772464:
                if (str.equals("��")) {
                    return 9GS.A0J;
                }
                return null;
            case 1772515:
                if (str.equals("��")) {
                    return 9GS.A0H;
                }
                return null;
            case 1772562:
                if (str.equals("��")) {
                    return 9GS.A0E;
                }
                return null;
            case 1772680:
                if (str.equals("��")) {
                    return 9GS.A06;
                }
                return null;
            case 1772719:
                if (str.equals("��")) {
                    return 9GS.A01;
                }
                return null;
            case 1772901:
                if (str.equals("��")) {
                    return 9GS.A05;
                }
                return null;
            case 1772905:
                if (str.equals("��")) {
                    return 9GS.A0D;
                }
                return null;
            case 1772912:
                if (str.equals("��")) {
                    return 9GS.A0I;
                }
                return null;
            case 1772923:
                if (str.equals("��")) {
                    return 9GS.A03;
                }
                return null;
            case 1772932:
                if (str.equals("��")) {
                    return 9GS.A00;
                }
                return null;
            case 1772933:
                if (str.equals("��")) {
                    return 9GS.A02;
                }
                return null;
            case 1772940:
                if (str.equals("��")) {
                    return 9GS.A0P;
                }
                return null;
            case 1772944:
                if (str.equals("��")) {
                    return 9GS.A0F;
                }
                return null;
            case 1772945:
                if (str.equals("��")) {
                    return 9GS.A04;
                }
                return null;
            case 1772978:
                if (str.equals("��")) {
                    return 9GS.A07;
                }
                return null;
            case 1705111279:
                if (str.equals("����")) {
                    return 9GS.A0K;
                }
                return null;
            case 1705111280:
                if (str.equals("����")) {
                    return 9GS.A0L;
                }
                return null;
            case 1705111281:
                if (str.equals("����")) {
                    return 9GS.A0M;
                }
                return null;
            case 1705111282:
                if (str.equals("����")) {
                    return 9GS.A0N;
                }
                return null;
            case 1705111283:
                if (str.equals("����")) {
                    return 9GS.A0O;
                }
                return null;
            case 1705605233:
                if (str.equals("����")) {
                    return 9GS.A08;
                }
                return null;
            case 1705605234:
                if (str.equals("����")) {
                    return 9GS.A09;
                }
                return null;
            case 1705605235:
                if (str.equals("����")) {
                    return 9GS.A0A;
                }
                return null;
            case 1705605236:
                if (str.equals("����")) {
                    return 9GS.A0B;
                }
                return null;
            case 1705605237:
                if (str.equals("����")) {
                    return 9GS.A0C;
                }
                return null;
            default:
                return null;
        }
        if (str.equals(obj)) {
            return 9GS.A0G;
        }
        return null;
    }

    public final Uri A01(String str, Function1 function1) {
        11T.A0F(str, 0);
        2qM A00 = A00(str);
        Uri uri = null;
        if (A00 != null) {
            4xU r0 = this.A00;
            C2d1 c2d1 = C2d1.A00;
            9sI r02 = new 9sI(function1);
            1Ph A002 = ((C11704xV) r0.A00.get()).A00(A00, c2d1);
            A002.A00 = r02;
            File file = (File) A002.A00();
            if (file != null) {
                uri = Uri.fromFile(file);
            }
        }
        return uri;
    }
}
