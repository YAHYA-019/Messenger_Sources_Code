package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* renamed from: X.2ln, reason: invalid class name */
/* loaded from: 2ln.class */
public final class C2ln {
    public String A00;
    public boolean A01;
    public final List A02 = new ArrayList();

    public final void A00(final Object obj, final Object obj2, final 01N r304) {
        List list = this.A02;
        29L r0 = new 29L(new C2zt(new C3lz() { // from class: X.3bu
            @Override // X.C3lz
            public C2md ABq(C2lo c2lo, Object obj3, Object obj4) {
                11T.A0F(c2lo, 1);
                11T.A0F(obj3, 1);
                Function2 function2 = r304;
                function2.invoke(obj3, obj);
                return new C2md(new AQh(47, function2, obj3, obj2));
            }

            @Override // X.C3lz
            public boolean Cyz(Object obj3, Object obj4, Object obj5, Object obj6) {
                return !C28q.A02(obj3, obj4);
            }
        }, new C2y0(this.A00, list.size())), obj);
        11T.A0I(r0, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<Model of com.facebook.rendercore.primitives.KBinderKt.binder, Content of com.facebook.rendercore.primitives.KBinderKt.binder, kotlin.Any>");
        list.add(r0);
    }

    public final void A01(final Object obj, final C0Fz c0Fz) {
        List list = this.A02;
        29L r0 = new 29L(new C2zt(new C3lz() { // from class: X.3bt
            @Override // X.C3lz
            public C2md ABq(C2lo c2lo, Object obj2, Object obj3) {
                11T.A0F(c2lo, 1);
                11T.A0F(obj2, 1);
                C0Fz c0Fz2 = c0Fz;
                c0Fz2.A02(obj2, obj);
                return new C2md(new AQh(48, c0Fz2, obj2, null));
            }

            @Override // X.C3lz
            public boolean Cyz(Object obj2, Object obj3, Object obj4, Object obj5) {
                return !C28q.A02(obj2, obj3);
            }
        }, new 3kF(this.A00, list.size())), obj);
        11T.A0I(r0, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<Model of com.facebook.rendercore.primitives.KBinderKt.binder, Content of com.facebook.rendercore.primitives.KBinderKt.binder, kotlin.Any>");
        list.add(r0);
    }

    public final void A02(Function2 function2, Object[] objArr) {
        List list = this.A02;
        29L r0 = new 29L(new C2zt(new C3bs(function2, 0), new C2y0(this.A00, list.size())), objArr);
        11T.A0I(r0, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<Model of com.facebook.rendercore.primitives.KBinderKt.binder, Content of com.facebook.rendercore.primitives.KBinderKt.binder, kotlin.Any>");
        list.add(r0);
    }

    public final void A03(C0Bd c0Bd, Object[] objArr) {
        List list = this.A02;
        29L r0 = new 29L(new C2zt(new C3bs(c0Bd, 1), new C2y0(this.A00, list.size())), objArr);
        11T.A0I(r0, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<Model of com.facebook.rendercore.primitives.KBinderKt.binder, Content of com.facebook.rendercore.primitives.KBinderKt.binder, kotlin.Any>");
        list.add(r0);
    }
}
