package X;

import java.util.Iterator;
import java.util.Set;

/* loaded from: Ivy.class */
public final class Ivy implements Runnable {
    public static final String __redex_internal_original_name = "UnifiedVideoAudioSettings$notifyListenersOnSettingChanged$1";
    public final /* synthetic */ ISf A00;
    public final /* synthetic */ C52j A01;

    public Ivy(ISf iSf, C52j c52j) {
        this.A00 = iSf;
        this.A01 = c52j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set = this.A00.A04;
        11T.A0A(set);
        C52j c52j = this.A01;
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((Hmy) it.next()).A00(c52j);
            }
        }
    }
}
