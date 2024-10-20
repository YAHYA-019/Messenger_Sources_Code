package X;

import android.text.TextUtils;
import android.util.Base64;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3qm, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3qm.class */
public abstract class AbstractC01293qm {
    public static final String A00(long j, List list) {
        11T.A0F(list, 1);
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(';');
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] address = ((InetAddress) it.next()).getAddress();
            11T.A0A(address);
            String encodeToString = Base64.encodeToString(address, 3);
            11T.A0A(encodeToString);
            arrayList.add(encodeToString);
        }
        String join = TextUtils.join(";", arrayList);
        11T.A0A(join);
        sb.append(join);
        return sb.toString();
    }
}
