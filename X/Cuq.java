package X;

import android.content.Context;
import android.view.View;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.BitSet;

/* loaded from: Cuq.class */
public final class Cuq implements DHf {
    public final 1Br A00;
    public final 1Br A01;
    public final BnD A02;
    public final DGB A03;
    public final C5xv A04;
    public final Context A05;
    public final LithoView A06;
    public final ThreadKey A07;

    public Cuq(Context context, ThreadKey threadKey, BnD bnD, DGB dgb) {
        11T.A0F(threadKey, 2);
        this.A05 = context;
        this.A07 = threadKey;
        this.A02 = bnD;
        this.A03 = dgb;
        this.A01 = 1Bu.A01(context, 17158);
        this.A00 = 7zM.A0f(context);
        this.A06 = 7zO.A0V(context);
        this.A04 = CxE.A00(this, 91);
    }

    @Override // X.DHf
    public View BJw() {
        return this.A06;
    }

    @Override // X.DHf
    public void CfR(CLu cLu) {
        11T.A0F(cLu, 0);
        LithoView lithoView = this.A06;
        1Iw A0U = AbF.A0U(lithoView);
        0fH.A0j("ThreadSettingsLithoRenderer", "render");
        C1885Avm c1885Avm = new C1885Avm(A0U, new AzY());
        C5yu A0K = cLu.A00.isEmpty() ? null : ((C2xd) 1Br.A0B(this.A01)).A0K(new CuU(cLu), new CuW(this), null, 0);
        AzY azY = c1885Avm.A01;
        azY.A02 = A0K;
        BitSet bitSet = c1885Avm.A02;
        bitSet.set(1);
        azY.A04 = 0DW.A00(cLu.A01);
        bitSet.set(4);
        azY.A03 = this.A02.A01;
        bitSet.set(3);
        azY.A00 = 7zQ.A0m(this.A00);
        bitSet.set(0);
        azY.A01 = this.A04;
        bitSet.set(2);
        C1rs.A04(bitSet, c1885Avm.A03);
        c1885Avm.A0J();
        lithoView.A0y(azY);
    }
}
