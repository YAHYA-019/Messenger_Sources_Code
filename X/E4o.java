package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import java.util.concurrent.Executor;

/* loaded from: E4o.class */
public final class E4o extends ERx {
    public final C00i A00;
    public final C00i A01;
    public final C00i A02;

    public E4o() {
        1BQ A02 = 1BQ.A02(16556);
        this.A00 = A02;
        1BQ A022 = 1BQ.A02(16477);
        this.A02 = A022;
        this.A01 = 1BQ.A02(68406);
        A02.get();
        Context A00 = FbInjector.A00();
        11T.A0F(A00, 0);
        if (0Zi.A01(A00).A6e) {
            return;
        }
        ((Executor) A022.get()).execute(new S8o(this));
    }

    public E4o(int i) {
    }
}
