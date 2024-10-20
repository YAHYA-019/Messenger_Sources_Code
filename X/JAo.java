package X;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* loaded from: JAo.class */
public final class JAo extends C00q implements Function1 {
    public static final JAo A00 = new JAo();

    public JAo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        11T.A0F(context, 0);
        Object systemService = context.getSystemService("connectivity");
        11T.A0I(systemService, 1BJ.A00(8));
        return systemService;
    }
}
