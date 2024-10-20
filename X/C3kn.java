package X;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;

/* renamed from: X.3kn, reason: invalid class name */
/* loaded from: 3kn.class */
public final class C3kn extends C00q implements Function1 {
    public static final C3kn A00 = new C3kn();

    public C3kn() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        11T.A0F(view, 0);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return parent;
        }
        return null;
    }
}
