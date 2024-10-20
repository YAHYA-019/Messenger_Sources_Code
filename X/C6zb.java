package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.6zb, reason: invalid class name */
/* loaded from: 6zb.class */
public final class C6zb {
    public AnonymousClass703 A00;
    public final java.util.Map A01 = new 0QO(0);

    public final void A00(C5fx c5fx, AnonymousClass703 anonymousClass703, AnonymousClass703... anonymousClass703Arr) {
        ArrayList A0s;
        java.util.Map map = this.A01;
        Iterable iterable = (Iterable) map.get(c5fx);
        if (iterable == null) {
            iterable = C0ty.A00;
        }
        11T.A0I(iterable, "null cannot be cast to non-null type kotlin.collections.Iterable<com.facebook.xapp.messaging.threadview.renderer.interfaces.MessageRenderer<out com.facebook.xapp.messaging.threadview.model.interfaces.Message>>");
        if (iterable instanceof Collection) {
            A0s = 0QD.A0P(anonymousClass703, (Collection) iterable);
        } else {
            A0s = AnonymousClass001.A0s();
            0QU.A0t(iterable, A0s);
            A0s.add(anonymousClass703);
        }
        ArrayList arrayList = new ArrayList(A0s.size());
        arrayList.addAll(A0s);
        0QU.A0u(arrayList, anonymousClass703Arr);
        map.put(c5fx, arrayList);
    }

    public final void A01(C5fx c5fx, AnonymousClass703 anonymousClass703, AnonymousClass703... anonymousClass703Arr) {
        java.util.Map map = this.A01;
        Iterable iterable = (Iterable) map.get(c5fx);
        if (iterable == null) {
            iterable = C0ty.A00;
        }
        11T.A0I(iterable, "null cannot be cast to non-null type kotlin.collections.Iterable<com.facebook.xapp.messaging.threadview.renderer.interfaces.MessageRenderer<out com.facebook.xapp.messaging.threadview.model.interfaces.Message>>");
        List singletonList = Collections.singletonList(anonymousClass703);
        11T.A0A(singletonList);
        ArrayList arrayList = new ArrayList(singletonList.size());
        arrayList.addAll(singletonList);
        0QU.A0u(arrayList, anonymousClass703Arr);
        ArrayList A0O = 0QD.A0O(iterable, arrayList);
        11T.A0F(A0O, 1);
        map.put(c5fx, A0O);
    }

    public final void A02(C5fx c5fx, AnonymousClass703 anonymousClass703, AnonymousClass703... anonymousClass703Arr) {
        11T.A0F(anonymousClass703, 1);
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.m11011add((Object) anonymousClass703);
        int length = anonymousClass703Arr.length;
        for (int i = 0; i < length; i = 1) {
            AnonymousClass703 anonymousClass7032 = anonymousClass703Arr[i];
            if (anonymousClass7032 != null) {
                builder.m11011add((Object) anonymousClass7032);
            }
        }
        java.util.Map map = this.A01;
        ImmutableList build = builder.build();
        11T.A0A(build);
        map.put(c5fx, build);
    }

    public final void A03(C5fx c5fx, C00m c00m) {
        java.util.Map map = this.A01;
        if (map.containsKey(c5fx)) {
            return;
        }
        Object invoke = c00m.invoke();
        11T.A0F(invoke, 1);
        map.put(c5fx, invoke);
    }

    public final void A04(C5fx c5fx, C00m c00m) {
        if (this.A01.containsKey(c5fx)) {
            return;
        }
        A02(c5fx, (AnonymousClass703) c00m.invoke(), new AnonymousClass703[0]);
    }

    public final void A05(C5fx c5fx, Function1 function1) {
        java.util.Map map = this.A01;
        Object obj = map.get(c5fx);
        if (obj == null) {
            obj = C0ty.A00;
        }
        Object invoke = function1.invoke(obj);
        11T.A0F(invoke, 1);
        map.put(c5fx, invoke);
    }

    public final void A06(AnonymousClass703 anonymousClass703) {
        11T.A0F(anonymousClass703, 0);
        this.A00 = anonymousClass703;
    }
}
