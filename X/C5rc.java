package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: X.5rc, reason: invalid class name */
/* loaded from: 5rc.class */
public final class C5rc implements Runnable {
    public static final String __redex_internal_original_name = "ShortcutInfoCompatSaverImpl$2";
    public final /* synthetic */ 0IT A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ List A02;

    public C5rc(0IT r302, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, List list) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A02 = list;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (Object obj : this.A02) {
            ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = this.A01;
            shortcutInfoCompatSaverImpl.A04.remove(obj);
            Future future = (Future) shortcutInfoCompatSaverImpl.A03.remove(obj);
            if (future != null) {
                future.cancel(false);
            }
        }
        this.A01.A01(this.A00);
    }
}
