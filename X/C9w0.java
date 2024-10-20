package X;

import com.facebook.messaging.highlightstab.model.bottomsheet.HighlightsFeedMenuItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9w0, reason: invalid class name */
/* loaded from: 9w0.class */
public final class C9w0 implements AXv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C9w0(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.AXv
    public void C2Z(HighlightsFeedMenuItem highlightsFeedMenuItem) {
        0D2 r306;
        Object obj;
        C00m Acg;
        if (this.A00 != 0) {
            Iterator it = ((List) this.A01).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (11T.A0O(((AZN) obj).Awd(), highlightsFeedMenuItem)) {
                        break;
                    }
                }
            }
            AZN azn = (AZN) obj;
            if (azn != null && (Acg = azn.Acg(highlightsFeedMenuItem)) != null) {
                Acg.invoke();
            }
            r306 = ((9O7) this.A02).A01;
            if (r306 == null || !r306.isAdded() || r306.isStateSaved()) {
                return;
            } else {
                r306.A04 = false;
            }
        } else {
            ((Function1) this.A01).invoke(Integer.valueOf(highlightsFeedMenuItem.A00));
            C9f6 c9f6 = (C9f6) this.A02;
            String str = C9f6.A01;
            r306 = c9f6.A00;
            if (r306 == null || !r306.isAdded() || r306.isStateSaved()) {
                return;
            }
        }
        r306.A0o();
    }
}
