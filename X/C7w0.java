package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.7w0, reason: invalid class name */
/* loaded from: 7w0.class */
public final class C7w0 implements InterfaceC07434jv {
    @Override // X.InterfaceC07434jv
    public /* bridge */ /* synthetic */ Object A4o(Object obj, Object obj2) {
        List list = (List) obj;
        11T.A0F(list, 0);
        ImmutableList.of();
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Object obj3 : list) {
            if ((obj3 instanceof 6Ku) && obj3 != null) {
                builder.add(obj3);
            }
        }
        return new 7J6(1Fj.A01(builder));
    }
}
