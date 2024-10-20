package X;

import java.util.List;

/* renamed from: X.2oy, reason: invalid class name */
/* loaded from: 2oy.class */
public final class C2oy implements C2om {
    public final java.util.Map A00;
    public final C01i A01;

    public C2oy(C2ov c2ov) {
        this.A01 = c2ov.A00;
        this.A00 = new C04r(c2ov.A02);
    }

    @Override // X.C2om
    public List AUm(C2ot c2ot, Object obj) {
        C01i c01i = (C01i) this.A00.get(obj.getClass());
        if (c01i == null) {
            c01i = this.A01;
        }
        11T.A0I(c01i, "null cannot be cast to non-null type kotlin.Lazy<kotlin.collections.List<com.facebook.xapp.messaging.renderer.interfaces.RenderedModelDecorator<ConcreteModel of com.facebook.xapp.messaging.renderer.config.ModelClassDecoratorMap.get>?>>");
        return 0QD.A0S((Iterable) c01i.getValue());
    }
}
