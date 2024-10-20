package X;

import android.util.JsonWriter;
import com.facebook.common.util.TriState;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: Erk.class */
public final class Erk {
    public final 1Br A00 = 1Bu.A00(131254);

    public final void A00(JsonWriter jsonWriter) {
        boolean z;
        C00i c00i = this.A00.A00;
        TreeMap A07 = ((1CQ) c00i.get()).A07();
        jsonWriter.beginObject();
        Iterator it = A07.keySet().iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            TriState A06 = ((1CQ) c00i.get()).A06(A0i);
            1CQ r0 = (1CQ) c00i.get();
            synchronized (r0) {
                int A00 = 1CQ.A00(r0, A0i);
                1CQ.A02(r0, A00);
                1CU r02 = r0.A05;
                synchronized (r02) {
                    z = !TriState.UNSET.equals(r02.A01[A00]);
                }
            }
            if (z) {
                1CQ r03 = (1CQ) c00i.get();
                synchronized (r03) {
                    int A002 = 1CQ.A00(r03, A0i);
                    1CQ.A02(r03, A002);
                    1CU r04 = r03.A05;
                    synchronized (r04) {
                        A06 = r04.A02[A002];
                    }
                }
                A0i = 0Pz.A0W(A0i, "(Overridden)");
            }
            jsonWriter.name(A0i);
            if (A06.isSet()) {
                jsonWriter.value(A06.asBoolean());
            }
        }
        jsonWriter.endObject();
    }
}
