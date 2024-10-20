package X;

import com.facebook.dialtone.common.IsDialtoneEnabled;

/* renamed from: X.30l, reason: invalid class name */
/* loaded from: 30l.class */
public final class C30l implements 1iL {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C30l(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public /* bridge */ /* synthetic */ Object get() {
        boolean z;
        2yD r303;
        long j;
        switch (this.A00) {
            case 0:
                r303 = (2yD) this.A02;
                j = 36310731561305153L;
                z = r303.AZk(j);
                return Boolean.valueOf(z);
            case 1:
                r303 = (2yD) this.A02;
                j = 36310731561501762L;
                z = r303.AZk(j);
                return Boolean.valueOf(z);
            case 2:
                return Double.valueOf(((2yD) this.A02).Ai7(37155156491567162L));
            case 3:
                r303 = (2yD) this.A02;
                j = 36310731561894980L;
                z = r303.AZk(j);
                return Boolean.valueOf(z);
            case 4:
                z = true;
                if (((Boolean) (((2yD) ((2DG) this.A01).A04.get()).AZk(36310675734659998L) ? 1Bn.A09(Boolean.class, IsDialtoneEnabled.class) : (C00i) this.A02).get()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                return this.A02;
        }
    }
}
