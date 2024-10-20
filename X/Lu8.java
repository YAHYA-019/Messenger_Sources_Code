package X;

import android.os.Handler;
import java.util.function.Function;

/* loaded from: Lu8.class */
public final class Lu8 implements Function {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C00m A01;

    public Lu8(Handler handler, C00m c00m) {
        this.A00 = handler;
        this.A01 = c00m;
    }

    @Override // java.util.function.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        if (!AnonymousClass001.A1V(obj)) {
            return null;
        }
        this.A00.post(new LkU(this.A01));
        return null;
    }
}
