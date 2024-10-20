package X;

import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* renamed from: X.23s, reason: invalid class name */
/* loaded from: 23s.class */
public abstract class C23s extends TreeJNI {
    public static final java.util.Map A01 = new LinkedHashMap();
    public final C01i A00;

    public C23s(int i) {
        super(i);
        this.A00 = C01g.A00(C03i.A03, new C2xm(this, 0));
    }

    private final Object A00(C00m c00m, Function1 function1, int i) {
        C01i c01i = this.A00;
        if (11T.A0O(((Object[]) c01i.getValue())[i], AnonymousClass312.A00)) {
            ((Object[]) c01i.getValue())[i] = function1.invoke(c00m.invoke());
        }
        return ((Object[]) c01i.getValue())[i];
    }

    public final double A01(String str, int i) {
        return ((Number) A00(new C2y1(str, this, 12), new C2xk(this, 17), i)).doubleValue();
    }

    public final int A02(int i, String str) {
        return ((Number) A00(new C2y1(str, this, 13), new C2xk(this, 18), i)).intValue();
    }

    public final C23s A03(Class cls) {
        Object A00 = A00(new C2xu(cls, this, 18), 5rP.A00, 0);
        11T.A0A(A00);
        return (C23s) A00;
    }

    public final C23s A04(Class cls, String str) {
        return A05(cls, str, 0);
    }

    public final C23s A05(Class cls, String str, int i) {
        return (C23s) A00(new C2y4(this, cls, str, 1), 5rP.A00, i);
    }

    public final C23s A06(Class cls, String str, int i) {
        return (C23s) A00(new 3kQ(this, cls, str), 5rP.A00, i);
    }

    public final ImmutableList A07(Enum r302, String str, int i) {
        return (ImmutableList) A00(new AKY(str, this, 24), new 83T(this, r302, 3), i);
    }

    public final ImmutableList A08(String str, int i) {
        Object A00 = A00(new AKY(str, this, 25), 5rP.A00, i);
        11T.A0A(A00);
        return (ImmutableList) A00;
    }

    public final ImmutableList A09(String str, Class cls, int i) {
        Object A00 = A00(new AKf(cls, this, str, 13), 5rP.A00, i);
        11T.A0A(A00);
        return (ImmutableList) A00;
    }

    public final Enum A0A(Enum r302, String str, int i) {
        return (Enum) A00(new AKY(str, this, 22), new AVE(r302, 35), i);
    }

    public final String A0B(int i, String str) {
        return (String) A00(new AKY(str, this, 23), 5rP.A00, i);
    }

    public final String A0C(String str) {
        return A0B(0, str);
    }

    public final boolean A0D(int i, String str) {
        return AnonymousClass001.A1V(A00(new AKY(str, this, 21), new AVE(this, 34), i));
    }

    public abstract AnonymousClass313 modelSelectionSet();
}
