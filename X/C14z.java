package X;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* renamed from: X.14z, reason: invalid class name */
/* loaded from: 14z.class */
public final class C14z {
    public final C0qt A01;
    public final 0Yl A00 = new 0Yl(TimeUnit.HOURS, 16, 1);
    public final Function A02 = new Function() { // from class: X.0oo
        @Override // java.util.function.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            AnonymousClass158 anonymousClass158 = (AnonymousClass158) obj;
            Context context = C14z.this.A01.getContext();
            if (context != null) {
                return 02Q.A00(context, anonymousClass158.A00);
            }
            throw AnonymousClass001.A0N("Null context");
        }
    };

    public C14z(C0qt c0qt) {
        this.A01 = c0qt;
    }
}
