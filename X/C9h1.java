package X;

import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9h1, reason: invalid class name */
/* loaded from: 9h1.class */
public final class C9h1 {
    public final 1Br A00;
    public final 1Br A01;

    public C9h1(Context context) {
        11T.A0F(context, 1);
        this.A00 = 1Bu.A00(68734);
        this.A01 = 1HG.A00(context, 68735);
    }

    public static final String A00(8KQ r301) {
        List list = r301.A0J;
        return 4YV.A0t("_", C0s8.A14(r301.A0G, r301.A0H, list.isEmpty() ? "empty" : 4YV.A0t("-", list, (Function1) null)), (Function1) null);
    }

    public final Object A01(8KQ r302, AnonymousClass958 anonymousClass958, File file, 0DR r305) {
        return 2aG.A00(r305, new AJg(r302, this, file, anonymousClass958, (0DR) null, 7, 42));
    }
}
