package X;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* loaded from: JAq.class */
public final class JAq extends C00q implements Function1 {
    public static final JAq A00 = new JAq();

    public JAq() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.HEw] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        11T.A0F(context, 0);
        ?? obj2 = new Object();
        ((HEw) obj2).A00 = new HnI(context.getAssets());
        return obj2;
    }
}
