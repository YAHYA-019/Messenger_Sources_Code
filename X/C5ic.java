package X;

import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5ic, reason: invalid class name */
/* loaded from: 5ic.class */
public final class C5ic {
    public static final DR6 A00(Context context, AYR ayr, MigColorScheme migColorScheme, List list, int i) {
        11T.A0F(migColorScheme, 1);
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(false);
        }
        11T.A0F(arrayList, 0);
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (i >= 0 && i < arrayList2.size()) {
            arrayList2.set(i, true);
        }
        DR6 dr6 = new DR6(context, migColorScheme);
        dr6.A0L(ayr, 0S2.A01, list, arrayList2);
        return dr6;
    }

    public static final DR6 A01(Context context, MigColorScheme migColorScheme) {
        11T.A0F(context, 0);
        11T.A0F(migColorScheme, 1);
        return new DR6(context, migColorScheme);
    }

    public final DR6 A02(Context context) {
        11T.A0F(context, 0);
        return A01(context, (MigColorScheme) 1Bn.A0E(context, (1BY) null, 16979));
    }

    public final C2121Dea A03(Context context) {
        11T.A0F(context, 0);
        MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0E(context, (1BY) null, 16979);
        11T.A0F(migColorScheme, 1);
        return new C2121Dea(context, migColorScheme.Aho());
    }
}
