package X;

import android.app.RemoteInput;
import android.os.Build;
import java.util.Iterator;

/* renamed from: X.5sa, reason: invalid class name */
/* loaded from: 5sa.class */
public abstract class C5sa {
    public static RemoteInput A00(C5rn c5rn) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(c5rn.A03).setLabel(c5rn.A02).setChoices(c5rn.A06).setAllowFreeFormInput(c5rn.A05).addExtras(c5rn.A01);
        Iterator it = c5rn.A04.iterator();
        while (it.hasNext()) {
            addExtras.setAllowDataType(AnonymousClass001.A0i(it), true);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            69Q.A01(addExtras, c5rn.A00);
        }
        return addExtras.build();
    }
}
