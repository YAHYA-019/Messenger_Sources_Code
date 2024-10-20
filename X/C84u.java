package X;

import android.util.Pair;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.84u, reason: invalid class name */
/* loaded from: 84u.class */
public final class C84u implements C5jw {
    public final int A00;
    public final Object A01;

    public C84u(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C5jw
    public /* bridge */ /* synthetic */ Object AGz(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        ImmutableList immutableList;
        switch (this.A00) {
            case 0:
                return Pair.create(obj, obj2);
            case 1:
                7ED r0 = (7ED) obj;
                List list = (List) obj2;
                11T.A0F(r0, 1);
                7EC r02 = new 7EC(r0);
                if (list != null) {
                    r02.A00(new 82W(list, 11));
                }
                return new 7ED(r02);
            default:
                5nW r03 = (5nW) obj;
                5nW r303 = (5nW) obj2;
                11T.A0F(r303, 2);
                if (r03 != null && (immutableList = r03.A09) != null && !immutableList.isEmpty()) {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    ImmutableList immutableList2 = r303.A09;
                    11T.A0A(immutableList2);
                    builder.addAll(C7T9.A00(immutableList, immutableList2));
                    builder.addAll(immutableList2);
                    ImmutableList build = builder.build();
                    5nQ r04 = new 5nQ(r303);
                    r04.A01(build);
                    r303 = new 5nW(r04);
                }
                return r303;
        }
    }
}
