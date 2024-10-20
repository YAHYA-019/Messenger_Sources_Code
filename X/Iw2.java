package X;

import android.net.Uri;
import java.util.Iterator;

/* loaded from: Iw2.class */
public final class Iw2 implements Runnable {
    public static final String __redex_internal_original_name = "AudioCache$1";
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ C6H8 A01;

    public Iw2(Uri uri, C6H8 c6h8) {
        this.A01 = c6h8;
        this.A00 = uri;
    }

    @Override // java.lang.Runnable
    public void run() {
        5YZ r0 = (5YZ) this.A01.A00.get();
        Uri uri = this.A00;
        IDp iDp = r0.A01;
        if (iDp != null && C2qv.A01(iDp.A00, uri)) {
            r0.A01.A0A();
            return;
        }
        Iterator it = r0.A08.iterator();
        while (it.hasNext()) {
            IDp iDp2 = (IDp) it.next();
            if (C2qv.A01(iDp2.A00, uri)) {
                iDp2.A06();
                iDp2.A0A();
                it.remove();
                return;
            }
        }
    }
}
