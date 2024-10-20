package X;

import android.content.Context;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import java.util.BitSet;

/* loaded from: Ihb.class */
public final class Ihb implements C6ca {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;

    public Ihb(Context context) {
        11T.A0F(context, 1);
        this.A01 = AbG.A0M();
        this.A06 = 1Bu.A01(context, 99954);
        this.A05 = 1Bu.A00(99958);
        this.A03 = 1Bu.A00(99957);
        this.A04 = 1Bu.A00(99953);
        this.A02 = 1Bu.A00(99956);
        this.A07 = 1Bu.A00(99959);
        this.A00 = 1Bu.A00(115849);
    }

    @Override // X.C6ca
    public Integer AWj() {
        return 0S2.A0u;
    }

    @Override // X.C6ca
    public 1LI AdE(1Iw r302, 1Im r303, 6TN r304, PlayerOrigin playerOrigin, GRD grd, 6UR r307, 6TI r308, IhX ihX, C6ce c6ce, GRX grx) {
        1BL.A11(1, grd, ihX, grx);
        11T.A0F(r307, 6);
        11T.A0F(playerOrigin, 7);
        11T.A0F(r304, 8);
        if (ihX.A00 == null) {
            1Br.A04(this.A01).D11("Groot_no_event_bus", "DebugOverlayDescriptor");
            return null;
        }
        C1rq A00 = C1rg.A00(r302);
        A00.A1F(0.0f);
        A00.A0c();
        7zP.A13(A00);
        C2656GkW c2656GkW = new C2656GkW(r302, new GlL());
        GlL glL = c2656GkW.A01;
        glL.A02 = grd;
        BitSet bitSet = c2656GkW.A02;
        bitSet.set(1);
        glL.A03 = r308;
        bitSet.set(8);
        6U2 r0 = ihX.A00;
        11T.A0I(r0, "null cannot be cast to non-null type com.facebook.video.player.events.common.RichVideoPlayerEventBus");
        glL.A04 = r0;
        bitSet.set(7);
        glL.A00 = playerOrigin;
        bitSet.set(6);
        glL.A09 = AbL.A1H(this.A05);
        bitSet.set(5);
        glL.A07 = AbL.A1H(this.A03);
        bitSet.set(3);
        glL.A08 = AbL.A1H(this.A04);
        bitSet.set(4);
        glL.A01 = (HLM) 1Br.A0B(this.A00);
        bitSet.set(0);
        glL.A06 = AbL.A1H(this.A02);
        bitSet.set(2);
        glL.A05 = (String) 1Br.A0B(this.A07);
        bitSet.set(9);
        7zP.A19(c2656GkW, bitSet, c2656GkW.A03);
        A00.A2f(glL);
        return A00.A00;
    }

    @Override // X.C6ca
    public String AuU() {
        return "DebugOverlayDescriptor";
    }

    @Override // X.C6cb
    public boolean BUW(6TN r302, PlayerOrigin playerOrigin, GRD grd, 6TI r305) {
        return AbL.A1H(this.A06);
    }
}
