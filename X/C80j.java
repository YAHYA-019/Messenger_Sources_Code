package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.80j, reason: invalid class name */
/* loaded from: 80j.class */
public final class C80j implements Runnable {
    public static final String __redex_internal_original_name = "VisibilityFlippedItemAnimator$3";
    public final /* synthetic */ 6LP A00;
    public final /* synthetic */ ArrayList A01;

    public C80j(6LP r302, ArrayList arrayList) {
        this.A00 = r302;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.A00.A0U((C2lb) it.next());
        }
        arrayList.clear();
        this.A00.A06.remove(arrayList);
    }
}
