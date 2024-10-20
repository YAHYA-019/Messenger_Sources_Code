package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.1re, reason: invalid class name */
/* loaded from: 1re.class */
public final class C1re {
    public static C1re A02;
    public static final String[] A03 = {"", "-journal", "-uid", ".dat", "-wal", "-shm", "-selfcheck", ".back"};
    public final Context A00;
    public final C01i A01 = C01g.A01(new C2xm(this, 6));

    public C1re(Context context) {
        this.A00 = context;
    }

    public final List A00(String str) {
        String[] strArr = A03;
        11T.A0F(strArr, 0);
        return 0AI.A03(0AI.A04(C1s1.A00, 0AI.A08(new C1rw(this, str), new 0fR(strArr, 0))));
    }
}
