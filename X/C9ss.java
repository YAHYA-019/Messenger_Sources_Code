package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9ss, reason: invalid class name */
/* loaded from: 9ss.class */
public final class C9ss implements C3mB {
    public List A00;
    public final C66s A01;
    public final Function1 A02;
    public final Object[] A03;

    public C9ss(C66s c66s, Function1 function1, Object[] objArr) {
        this.A01 = c66s;
        this.A03 = objArr;
        this.A02 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    @Override // X.C3mB
    public C3s9 ALE(3lE r302) {
        List list;
        if (r302 != null && !(r302 instanceof Rp4)) {
            throw AnonymousClass001.A0L("Failed requirement.");
        }
        Rp4 rp4 = (Rp4) r302;
        C3s9 c3s9 = null;
        if (!C28q.A02(rp4 != null ? rp4.A01 : null, this.A03)) {
            if (rp4 != null) {
                c3s9 = rp4.A00;
            }
            c3s9 = (C3s9) this.A02.invoke(new 9HB(c3s9));
            if (c3s9 != null) {
                5XD.A01(c3s9, this.A01.A00);
            }
            if (this.A00 == null) {
                list = C0ty.A00;
            }
            return c3s9;
        }
        list = rp4 != null ? rp4.A00 : null;
        this.A00 = list;
        return c3s9;
    }

    @Override // X.C3mB
    public C66s Aps() {
        return this.A01;
    }

    @Override // X.C3mB
    public boolean BDj() {
        return true;
    }

    @Override // X.C3mB
    public 3lE Cba() {
        return new Rp4(this.A00, this.A03);
    }
}
