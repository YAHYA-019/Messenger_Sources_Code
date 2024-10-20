package X;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: ABv.class */
public final class ABv implements 1K9 {
    public final 7FT A00;
    public final WeakReference A01;
    public final Function1 A02;
    public final /* synthetic */ C9gw A03;

    public ABv(6RU r302, C9gw c9gw, 7FT r304, Function1 function1) {
        this.A03 = c9gw;
        this.A00 = r304;
        this.A02 = function1;
        this.A01 = 7zL.A14(r302);
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        WeakReference weakReference = this.A01;
        7FT r0 = this.A00;
        this.A02.invoke(th);
        0fH.A0v("MediaMessageSendHelper", "Failed to adapt media resources to message builders.", th);
        6RU r02 = (6RU) weakReference.get();
        if (r02 != null) {
            11T.A0F(r0, 0);
            7FI.A02(r02, new 7FU(r0, 0S2.A0N, 0S2.A00));
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list = (List) obj;
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    return;
                }
            }
        }
        6RU r0 = (6RU) this.A01.get();
        if (r0 != null) {
            7FI.A02(r0, 7Ss.A00(this.A00));
        }
    }
}
