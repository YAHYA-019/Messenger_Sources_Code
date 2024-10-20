package X;

import com.google.common.base.Optional;
import com.google.common.base.Platform;
import java.util.List;

/* loaded from: GL7.class */
public interface GL7 {
    static int A00(GL7 gl7, float f, int i) {
        return F3H.A00(gl7.Amm(i, f));
    }

    static Optional A01(GL7 gl7, Class cls, String str, int i) {
        String BCx = gl7.BCx(i, str);
        BCx.getClass();
        return Platform.getEnumIfPresent(cls, BCx);
    }

    static GL7 A02(GL7 gl7) {
        return gl7.Ay2(32);
    }

    static Boolean A03(GL7 gl7, int i) {
        return Boolean.valueOf(gl7.getBoolean(i, false));
    }

    static String A04(GL7 gl7) {
        return gl7.getString(33);
    }

    static String A05(GL7 gl7) {
        return gl7.getString(35);
    }

    static String A06(GL7 gl7) {
        return gl7.getString(36);
    }

    static String A07(GL7 gl7) {
        return gl7.getString(38);
    }

    static String A08(GL7 gl7) {
        return gl7.getString(40);
    }

    static String A09(GL7 gl7, String str, int i) {
        String BCx = gl7.BCx(i, str);
        11T.A0A(BCx);
        return BCx;
    }

    static List A0A(GL7 gl7) {
        return gl7.AcV(32);
    }

    GGz ACy();

    List AcV(int i);

    int Acj();

    int Ad0(GHM ghm, int i, int i2, int i3);

    GJj AlB(int i);

    float Amm(int i, float f);

    List Aso();

    List Aty(int i);

    GL7 Ay2(int i);

    GJy BBh();

    String BCx(int i, String str);

    int BDE();

    Object BI5(int i);

    boolean D56(GGy gGy);

    boolean getBoolean(int i, boolean z);

    String getId();

    int getInt(int i, int i2);

    long getLong(int i, long j);

    String getString(int i);
}
