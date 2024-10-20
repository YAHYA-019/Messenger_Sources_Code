package X;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: Lo6.class */
public final class Lo6 implements Runnable {
    public static final String __redex_internal_original_name = "VisibilityFlippedItemAnimator$1";
    public final /* synthetic */ 6LP A00;
    public final /* synthetic */ ArrayList A01;

    public Lo6(6LP r302, ArrayList arrayList) {
        this.A00 = r302;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            KSt kSt = (KSt) it.next();
            this.A00.A0X(kSt.A04, kSt.A00, kSt.A01, kSt.A02, kSt.A03);
        }
        arrayList.clear();
        this.A00.A0A.remove(arrayList);
    }
}
