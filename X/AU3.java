package X;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* loaded from: AU3.class */
public final class AU3 extends C00q implements Function1 {
    public static final AU3 A00 = new AU3();

    public AU3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        11T.A0F(context, 0);
        return new JVX(context);
    }
}
