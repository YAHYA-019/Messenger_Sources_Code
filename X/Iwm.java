package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: Iwm.class */
public final class Iwm implements Runnable {
    public static final String __redex_internal_original_name = "ActiveLocalCallIdState$dispatchUpdate$1";
    public final /* synthetic */ HeM A00;
    public final /* synthetic */ String A01;

    public Iwm(HeM heM, String str) {
        this.A00 = heM;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00.A01;
        String str = this.A01;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((HmY) it.next()).A00(str);
        }
    }
}
