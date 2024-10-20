package X;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: X.4fO, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4fO.class */
public final class C05884fO implements 1Ve {
    public final 1De A00;
    public final 1Br A01;

    public C05884fO(1De r302) {
        this.A00 = r302;
        this.A01 = 1Bu.A03(r302.A00, 83719);
    }

    public C3rz ARI(InterfaceC01753sq interfaceC01753sq, InterfaceC01743sp interfaceC01743sp, C3s4 c3s4) {
        11T.A0F(c3s4, 0);
        1Fw.A04((1EZ) 1De.A00(this.A00, 16428));
        Context context = (Context) 1Br.A0B(this.A01);
        C00s.A00();
        C3rz ARI = 1VX.A0D(context).ARI(interfaceC01753sq, interfaceC01743sp, c3s4);
        11T.A0A(ARI);
        return ARI;
    }

    public C3rz ARJ(InterfaceC01753sq interfaceC01753sq, InterfaceC01743sp interfaceC01743sp, C3s4 c3s4, Executor executor) {
        1BK.A1J(c3s4, 0, executor);
        1Fw.A04((1EZ) 1De.A00(this.A00, 16428));
        Context context = (Context) 1Br.A0B(this.A01);
        C00s.A00();
        C3rz A00 = 1Vd.A00(1VX.A0D(context), interfaceC01753sq, interfaceC01743sp, c3s4, executor);
        11T.A0A(A00);
        return A00;
    }
}
