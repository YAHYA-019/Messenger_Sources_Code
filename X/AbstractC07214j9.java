package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4j9, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4j9.class */
public abstract class AbstractC07214j9 {
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0IT, java.lang.Object] */
    public void A00(List list) {
        if (this instanceof ShortcutInfoCompatSaverImpl) {
            ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new 4jT((4iO) it.next()).A00());
            }
            shortcutInfoCompatSaverImpl.A05.submit((Runnable) new 4jU((0IT) new Object(), shortcutInfoCompatSaverImpl, arrayList));
        }
    }
}
