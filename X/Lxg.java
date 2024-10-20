package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* loaded from: Lxg.class */
public final class Lxg extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public /* bridge */ /* synthetic */ Object initialValue() {
        Choreographer choreographer = Choreographer.getInstance();
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            throw AnonymousClass001.A0N("no Looper on this thread");
        }
        M9U m9u = new M9U(Handler.createAsync(myLooper), choreographer);
        return 0DK.A02(m9u, m9u.A06);
    }
}
