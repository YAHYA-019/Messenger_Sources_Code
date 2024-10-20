package X;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: CsO.class */
public final class CsO implements DFn {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public CsO(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.DFn
    public final void CAF(View view, Object obj) {
        if (this.A00 != 0) {
            11T.A0F(obj, 1);
            ((C2lh) this.A01).A02(obj);
            QGl qGl = (QGl) this.A02;
            Function1 function1 = qGl.A01.A00;
            if (function1 != null) {
                function1.invoke(obj);
            }
            qGl.A02.invoke();
            return;
        }
        11T.A0F(obj, 1);
        1Iw r0 = (1Iw) this.A01;
        String str = (String) obj;
        if (r0.A02 != null) {
            r0.A0G(7zQ.A0V(str, 4), "updateState:MuteMemberOptionsLayout.updateSelectedMuteLengthIndex");
        }
        Bcg bcg = (Bcg) this.A02;
        11T.A0F(str, 0);
        bcg.A00.A0A = str;
    }
}
