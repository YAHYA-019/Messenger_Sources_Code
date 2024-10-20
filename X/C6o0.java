package X;

import com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.6o0, reason: invalid class name */
/* loaded from: 6o0.class */
public final class C6o0 implements 1Vf {
    public final 1Br A00 = 1Bq.A00(84363);

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnPause")) {
            C6o6 c6o6 = (C6o6) this.A00.A00.get();
            CopyOnWriteArraySet copyOnWriteArraySet = c6o6.A0A;
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                1Br r0 = c6o6.A01;
                FH9 fh9 = (FH9) 1Br.A0B(r0);
                11T.A0D(number);
                int intValue = number.intValue();
                FH9.A00(fh9).markerPoint(814299525, intValue, "left_surface");
                FH9.A02((FH9) 1Br.A0B(r0), intValue, (short) 4);
            }
            c6o6.A07.clear();
            copyOnWriteArraySet.clear();
            c6o6.A00 = null;
            return;
        }
        if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible")) {
            throw 4YV.A0f(str);
        }
        OnThreadVisible onThreadVisible = (OnThreadVisible) r302;
        11T.A0F(onThreadVisible, 0);
        C6o6 c6o62 = (C6o6) this.A00.A00.get();
        if (onThreadVisible.A00.equals(c6o62.A00)) {
            Iterator it2 = c6o62.A0A.iterator();
            while (it2.hasNext()) {
                Number number2 = (Number) it2.next();
                FH9 fh92 = (FH9) 1Br.A0B(c6o62.A01);
                11T.A0D(number2);
                int intValue2 = number2.intValue();
                FH9.A00(fh92).markerPoint(814299525, intValue2, "thread_view_visible");
                FH9.A00(fh92).markerAnnotate(814299525, intValue2, "thread_view_visible", true);
            }
        }
    }
}
