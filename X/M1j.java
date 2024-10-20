package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* loaded from: M1j.class */
public final class M1j extends C00q implements C00m {
    public static final M1j A00 = new M1j();

    public M1j() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        Choreographer choreographer;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            choreographer = Choreographer.getInstance();
        } else {
            2Zs r0 = 2aN.A00;
            choreographer = (Choreographer) 44X.A00(4ZJ.A00, new M01(1, null));
        }
        M9U m9u = new M9U(Handler.createAsync(Looper.getMainLooper()), choreographer);
        return 0DK.A02(m9u, m9u.A06);
    }
}
