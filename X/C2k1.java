package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.2k1, reason: invalid class name */
/* loaded from: 2k1.class */
public final class C2k1 implements C1ru {
    public C1ru A00;

    private final Object A00(Function1 function1) {
        C1ru c1ru = this.A00;
        if (c1ru != null) {
            return function1.invoke(c1ru);
        }
        throw AnonymousClass001.A0N("Delegate StateUpdater not set");
    }

    @Override // X.C1ru
    public 2Yv A8u(2Yv r302, String str, boolean z) {
        11T.A0F(r302, 1);
        return (2Yv) A00(new C2y2(r302, str, 0, z));
    }

    @Override // X.C1ru
    public boolean ADm(Object obj, String str, int i, boolean z) {
        return ((Boolean) A00(new C2y3(obj, str, i, 0, z))).booleanValue();
    }

    @Override // X.C1ru
    public boolean ADn(String str, Function1 function1, int i, boolean z) {
        11T.A0F(function1, 0);
        return ((Boolean) A00(new C2y3(function1, str, i, 1, z))).booleanValue();
    }

    @Override // X.C1ru
    public Object Aan(Object obj, String str, int i, boolean z) {
        11T.A0F(obj, 2);
        return A00(new C2y3(obj, str, i, 2, z));
    }

    @Override // X.C1ru
    public C2ko Akn(C2iw c2iw, int i) {
        11T.A0F(c2iw, 0);
        return (C2ko) A00(new GAc(i, 6, c2iw));
    }

    @Override // X.C1ru
    public C2ko Ako(String str) {
        11T.A0F(str, 0);
        return (C2ko) A00(new M3m(str, 5));
    }

    @Override // X.C1ru
    public boolean BSl() {
        return ((Boolean) A00(C2lp.A00)).booleanValue();
    }

    @Override // X.C1ru
    public void Ca4(Object obj, Object obj2, String str, int i, boolean z) {
        11T.A0F(str, 0);
        11T.A0F(obj, 2);
        A00(new 2kK(obj, obj2, str, i, z));
    }

    @Override // X.C1ru
    public void Cey(String str, boolean z) {
        11T.A0F(str, 0);
        A00(new C3kk(str, z));
    }

    @Override // X.C1ru
    public void Coo(boolean z) {
        A00(new C2ls(z));
    }

    @Override // X.C1ru
    public void D72(6CS r302, String str, String str2, boolean z) {
        11T.A0F(r302, 1);
        A00(new C2y5(r302, str, str2, 0, z));
    }

    @Override // X.C1ru
    public void D73(6CS r302, String str, String str2, boolean z) {
        1BK.A1M(str, r302);
        A00(new GAl(r302, str, str2, 0, z));
    }

    @Override // X.C1ru
    public void D81(C2l4 c2l4, String str, String str2, boolean z) {
        11T.A0F(c2l4, 1);
        A00(new C2y5(c2l4, str, str2, 1, z));
    }

    @Override // X.C1ru
    public void D82(C2l4 c2l4, String str, boolean z) {
        11T.A0F(c2l4, 1);
        A00(new C2y2(c2l4, str, 1, z));
    }

    @Override // X.C1ru
    public void D83(C2l4 c2l4, String str, String str2, boolean z) {
        11T.A0F(c2l4, 1);
        A00(new C2y5(c2l4, str, str2, 2, z));
    }
}
