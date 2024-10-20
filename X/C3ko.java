package X;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: X.3ko, reason: invalid class name */
/* loaded from: 3ko.class */
public final class C3ko extends C00q implements Function1 {
    public static final C3ko A00 = new C3ko();

    public C3ko() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        11T.A0F(view, 0);
        Object tag = view.getTag(2131368402);
        if (tag instanceof C05s) {
            return tag;
        }
        return null;
    }
}
