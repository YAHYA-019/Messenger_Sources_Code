package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.Iterator;
import java.util.concurrent.Future;

/* loaded from: Lmd.class */
public final class Lmd implements Runnable {
    public static final String __redex_internal_original_name = "ShortcutInfoCompatSaverImpl$3";
    public final /* synthetic */ 0IT A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;

    public Lmd(0IT r302, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = this.A01;
        shortcutInfoCompatSaverImpl.A04.clear();
        java.util.Map map = shortcutInfoCompatSaverImpl.A03;
        Iterator A1A = 1BK.A1A(map);
        while (A1A.hasNext()) {
            ((Future) A1A.next()).cancel(false);
        }
        map.clear();
        shortcutInfoCompatSaverImpl.A01(this.A00);
    }
}
