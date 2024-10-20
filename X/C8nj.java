package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.8nj, reason: invalid class name */
/* loaded from: 8nj.class */
public final class C8nj extends C1rj {
    public static final CallerContext A04 = CallerContext.A0B("MigRemoteImageSpec");
    public float A00;
    public int A01;
    public int A02;
    public int A03;

    public C8nj() {
        super("MigRemoteImage");
        this.A02 = 0;
    }

    public static 8St A00(1Iw r301) {
        return new 8St(r301, new C8nj());
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A01), Float.valueOf(this.A00), Integer.valueOf(this.A02), Integer.valueOf(this.A03)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i = this.A03;
        int i2 = this.A02;
        int i3 = this.A01;
        float f = this.A00;
        Uri A03 = C0A2.A03(((5Ge) 1Bi.A03(49629)).A06(4YU.A0E(r302), i));
        InterfaceC07034in interfaceC07034in = InterfaceC07034in.A04;
        C07004ik A00 = C06984ii.A00();
        A00.A00(interfaceC07034in);
        A00.A03(i2);
        A00.A0E = interfaceC07034in;
        A00.A01(i3);
        A00.A0D = interfaceC07034in;
        C06974ih A0L = 7zL.A0L(A00);
        5BH A0B = 7zN.A0B(A03, r302);
        A0B.A2Z(A0L);
        A0B.A2b(A04);
        A0B.A2W(f);
        return 7zL.A0K(A0B);
    }
}
