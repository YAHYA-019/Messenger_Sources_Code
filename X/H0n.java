package X;

import com.google.common.collect.ArrayListMultimap;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: H0n.class */
public final class H0n extends IQF {
    public final /* synthetic */ 5iG A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0n(1RN r302, 5iG r303, Object obj) {
        super(r302, r303, obj);
        this.A00 = r303;
    }

    public void onSuccess(Object obj) {
        ArrayListMultimap arrayListMultimap;
        Object obj2;
        ArrayList A02;
        5iG r0 = this.A00;
        synchronized (r0) {
            arrayListMultimap = r0.A00;
            obj2 = ((IQF) this).A01;
            A02 = 1JW.A02(arrayListMultimap.AUe(obj2));
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            2eS r02 = (2eS) it.next();
            if (r02.A00 != this) {
                A0s.add(r02);
            } else if (!BRi()) {
                synchronized (r0) {
                    Iterator it2 = A0s.iterator();
                    while (it2.hasNext()) {
                        2eS r03 = (2eS) it2.next();
                        r03.A00(false);
                        arrayListMultimap.remove(obj2, r03);
                    }
                }
            }
        }
        super.onSuccess(obj);
    }
}
