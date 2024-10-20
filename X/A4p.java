package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: A4p.class */
public final class A4p implements AYi {
    public final /* synthetic */ AYh A00;
    public final /* synthetic */ String A01;

    public A4p(AYh aYh, String str) {
        this.A00 = aYh;
        this.A01 = str;
    }

    @Override // X.AYi
    public final void BkT(List list, boolean z) {
        Object obj;
        11T.A0F(list, 0);
        AYh aYh = this.A00;
        String str = this.A01;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (11T.A0O(((8O0) obj).emoji.A07(), str)) {
                    break;
                }
            }
        }
        aYh.BkS((8O0) obj, str, z);
    }
}
