package X;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.functions.Function1;

/* loaded from: M62.class */
public final class M62 extends C00q implements Function1 {
    public static final M62 A00 = new M62();

    public M62() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        11T.A0F(context, 0);
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
