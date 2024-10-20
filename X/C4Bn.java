package X;

import java.util.Iterator;

/* renamed from: X.4Bn, reason: invalid class name */
/* loaded from: 4Bn.class */
public abstract /* synthetic */ class C4Bn {
    public static /* synthetic */ String A00(CharSequence charSequence, Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(charSequence);
            }
        }
        return sb.toString();
    }
}
