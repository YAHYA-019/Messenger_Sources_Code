package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.52k, reason: invalid class name */
/* loaded from: 52k.class */
public final class C52k implements Runnable {
    public static final String __redex_internal_original_name = "InlineVideoSoundSettings$notifyListenersOnSettingChanged$1";
    public final /* synthetic */ C52c A00;
    public final /* synthetic */ C52j A01;

    public C52k(C52c c52c, C52j c52j) {
        this.A00 = c52c;
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
