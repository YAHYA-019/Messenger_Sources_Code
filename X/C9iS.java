package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9iS, reason: invalid class name */
/* loaded from: 9iS.class */
public final class C9iS {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.EAX, X.DeZ] */
    public static C2120DeZ A00(Context context, C92i c92i) {
        ?? eax = new EAX(context, ((MigColorScheme) 1Bn.A0E(context, (1BY) null, 16979)).AZw());
        C2120DeZ.A00(context, eax, c92i);
        return eax;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.92i, X.Deh] */
    public static C92i A01(Context context) {
        return new C2128Deh(new ContextThemeWrapper(context, ((MigColorScheme) 1Bn.A0E(context, (1BY) null, 16979)).Aho()));
    }
}
