package X;

import android.util.JsonWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: F23.class */
public final class F23 {
    public static final void A00(JsonWriter jsonWriter) {
        List list = ((1Cg) 1Bi.A03(98718)).A03;
        HashSet A0v = AnonymousClass001.A0v();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((3oR) it.next()).A00;
            11T.A09(str);
            A0v.add(str);
        }
        ArrayList A17 = 1BK.A17(A0v);
        Collections.sort(A17);
        jsonWriter.beginObject();
        Iterator it2 = A17.iterator();
        while (it2.hasNext()) {
            jsonWriter.name(AnonymousClass001.A0i(it2));
            jsonWriter.value("null");
        }
        jsonWriter.endObject();
    }
}
