package X;

import android.graphics.Matrix;
import android.view.View;
import kotlin.jvm.functions.Function2;

/* loaded from: M7v.class */
public final class M7v extends C00q implements Function2 {
    public static final M7v A00 = new M7v();

    public M7v() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Matrix) obj2).set(((View) obj).getMatrix());
        return 04S.A00;
    }
}
