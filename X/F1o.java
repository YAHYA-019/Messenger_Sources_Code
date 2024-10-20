package X;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;

/* loaded from: F1o.class */
public abstract class F1o {
    public static final int A00(Activity activity, String str) {
        if (0Em.A00(activity, str) == 0) {
            return 0;
        }
        return DRY.A05(activity, str) ? -1 : -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [androidx.lifecycle.LifecycleOwner] */
    public static final Esz A01(C2k5 c2k5, String str, Function1 function1) {
        Context A00 = 3vP.A00(c2k5);
        ComponentActivity componentActivity = (ComponentActivity) 2rO.A00(c2k5, new DKb(A00, 35), new Object[]{A00});
        Euv euv = (Euv) 2rO.A00(c2k5, new AKY(str, componentActivity, 0), new Object[]{str});
        C2lh A002 = C2lc.A00(c2k5, new DKb(euv, 37));
        4FL.A00(c2k5, new JR6(A002, euv, 47), new Object[]{euv});
        ComponentActivity componentActivity2 = (LifecycleOwner) 3vP.A01(c2k5, C3oi.A00);
        if (componentActivity2 == null) {
            componentActivity2 = componentActivity;
        }
        Lifecycle lifecycle = componentActivity2.getLifecycle();
        Object A003 = 2rO.A00(c2k5, new DKb(euv, 36), new Object[]{euv});
        4FL.A00(c2k5, new JR6(A003, lifecycle, 49), new Object[]{lifecycle, A003});
        Object A004 = 2rO.A00(c2k5, G9c.A00, new Object[0]);
        11T.A0A(A004);
        String str2 = (String) A004;
        4FL.A00(c2k5, new G9N(componentActivity, function1, euv, str2, 3), new Object[]{str2, euv});
        return new Esz(euv, ((Exf) A002.A02).A00);
    }
}
