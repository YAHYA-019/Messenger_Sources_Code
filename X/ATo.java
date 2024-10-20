package X;

import com.facebook.user.model.User;
import kotlin.jvm.functions.Function1;

/* loaded from: ATo.class */
public final class ATo extends C00q implements Function1 {
    public static final ATo A00 = new ATo();

    public ATo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C13h c13h = (C13h) obj;
        11T.A0F(c13h, 0);
        return 0Pz.A0N(((User) c13h.A01).A13, '-', c13h.A00);
    }
}
