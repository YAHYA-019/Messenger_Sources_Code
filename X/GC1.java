package X;

import android.content.Context;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import kotlin.jvm.functions.Function2;

/* loaded from: GC1.class */
public final class GC1 extends C00q implements Function2 {
    public static final GC1 A00 = new GC1();

    public GC1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        ComponentTree componentTree = (ComponentTree) obj2;
        11T.A0H(context, componentTree);
        return LithoView.A04(7zL.A0W(context), componentTree);
    }
}
