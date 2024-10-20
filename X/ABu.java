package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* loaded from: ABu.class */
public final class ABu implements 1K9 {
    public final String A00;
    public final WeakReference A01;
    public final Function1 A02;
    public final /* synthetic */ C9gw A03;

    public ABu(6RU r302, C9gw c9gw, String str, Function1 function1) {
        this.A03 = c9gw;
        this.A00 = str;
        this.A02 = function1;
        this.A01 = 7zL.A14(r302);
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        this.A02.invoke(th);
        0fH.A0v("MediaMessageSendHelper", "Failed to adapt media resources to a message builder.", th);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        6RU r0;
        C5fq c5fq = (C5fq) obj;
        if (c5fq == null || (r0 = (6RU) this.A01.get()) == null) {
            return;
        }
        C9gw c9gw = this.A03;
        String str = this.A00;
        if (!C9gw.A00(c9gw)) {
            C7m6.A00(r0, c5fq instanceof C5fp ? "image" : c5fq instanceof C5w8 ? "video" : "unknown", c5fq.A0B, str, 0, 0L, false);
        }
        7FI.A02(r0, new 7Ad(c5fq, str, (String) null));
    }
}
