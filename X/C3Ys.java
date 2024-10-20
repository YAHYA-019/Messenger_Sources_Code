package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.3Ys, reason: invalid class name */
/* loaded from: 3Ys.class */
public final class C3Ys implements C1ru {
    public final 3lQ A00;
    public final C1s8 A01;

    public C3Ys(3lQ r302, C1s8 c1s8) {
        this.A01 = c1s8;
        this.A00 = r302;
    }

    @Override // X.C1ru
    public 2Yv A8u(2Yv r302, String str, boolean z) {
        11T.A0F(r302, 1);
        return this.A01.A01(r302, str, z);
    }

    @Override // X.C1ru
    public boolean ADm(Object obj, String str, int i, boolean z) {
        return this.A01.A0B(str, new C2xk(obj, 1), i, z);
    }

    @Override // X.C1ru
    public boolean ADn(String str, Function1 function1, int i, boolean z) {
        11T.A0F(function1, 0);
        return this.A01.A0B(str, function1, i, z);
    }

    @Override // X.C1ru
    public Object Aan(Object obj, String str, int i, boolean z) {
        11T.A0F(obj, 2);
        return this.A01.A02(obj, str, i, z);
    }

    @Override // X.C1ru
    public C2ko Akn(C2iw c2iw, int i) {
        C2ko A00;
        11T.A0F(c2iw, 0);
        1sE r0 = this.A01.A02;
        synchronized (r0) {
            A00 = r0.A00(c2iw, i);
        }
        return A00;
    }

    @Override // X.C1ru
    public C2ko Ako(String str) {
        11T.A0F(str, 0);
        return this.A01.A00(str);
    }

    @Override // X.C1ru
    public boolean BSl() {
        return this.A01.A06.A01;
    }

    @Override // X.C1ru
    public void Ca4(Object obj, Object obj2, String str, int i, boolean z) {
        11T.A0G(str, 0, obj);
        this.A01.A09(obj, obj2, str, i, z);
    }

    @Override // X.C1ru
    public void Cey(String str, boolean z) {
        throw AnonymousClass001.A0q("This API should not be invoked. Nested Litho Tree updates will\nbe cleared when nested layout state is committed.");
    }

    @Override // X.C1ru
    public void Coo(boolean z) {
        this.A01.A06.A01 = z;
    }

    @Override // X.C1ru
    public void D72(6CS r302, String str, String str2, boolean z) {
        11T.A0F(r302, 1);
        this.A00.Cgh(new EzD(r302, str, str2, z, true, false));
    }

    @Override // X.C1ru
    public void D73(6CS r302, String str, String str2, boolean z) {
        1BK.A1M(str, r302);
        this.A00.Cgh(new EzD(r302, str, str2, z, false, false));
    }

    @Override // X.C1ru
    public void D81(C2l4 c2l4, String str, String str2, boolean z) {
        11T.A0F(c2l4, 1);
        this.A00.Cgh(new EzD(c2l4, str, str2, z, true, false));
    }

    @Override // X.C1ru
    public void D82(C2l4 c2l4, String str, boolean z) {
        11T.A0F(c2l4, 1);
        this.A00.Cgh(new EzD(c2l4, str, (String) null, z, false, true));
    }

    @Override // X.C1ru
    public void D83(C2l4 c2l4, String str, String str2, boolean z) {
        11T.A0F(c2l4, 1);
        this.A00.Cgh(new EzD(c2l4, str, str2, z, false, false));
    }
}
