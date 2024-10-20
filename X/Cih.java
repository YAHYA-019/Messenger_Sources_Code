package X;

import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.channelimageediting.model.EmojiGradientModel;
import com.google.common.collect.ImmutableList;

/* loaded from: Cih.class */
public final class Cih implements DIl {
    public final /* synthetic */ C1562Alh A00;

    public Cih(C1562Alh c1562Alh) {
        this.A00 = c1562Alh;
    }

    @Override // X.DIl
    public void Bvm(AXh aXh) {
        11T.A0F(aXh, 0);
        if (aXh instanceof EmojiGradientModel) {
            C1562Alh c1562Alh = this.A00;
            EmojiGradientModel emojiGradientModel = (EmojiGradientModel) aXh;
            c1562Alh.A06 = emojiGradientModel.emoji;
            c1562Alh.A05 = emojiGradientModel.integerGradientColors;
        }
        C1562Alh.A03(this.A00);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, X.Alh] */
    @Override // X.DIl
    public void Bvp(String str) {
        ImmutableList immutableList;
        ?? r0 = this.A00;
        r0.A06 = str;
        if (CJI.A01(r0.A05)) {
            immutableList = r0.A05;
        } else {
            RIf rIf = r0.A04;
            if (rIf == null) {
                11T.A0L("channelImagePresets");
                throw 0Q8.createAndThrow();
            }
            immutableList = rIf.A00.integerGradientColors;
        }
        r0.A05 = immutableList;
        C5fi.A01(r0.mView);
        C1562Alh.A03(r0);
    }

    @Override // X.DIl
    public void C0n(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        C1562Alh c1562Alh = this.A00;
        c1562Alh.A05 = immutableList;
        String str = c1562Alh.A06;
        if (str == null) {
            RIf rIf = c1562Alh.A04;
            if (rIf == null) {
                11T.A0L("channelImagePresets");
                throw 0Q8.createAndThrow();
            }
            str = rIf.A00.emoji;
        }
        c1562Alh.A06 = str;
        C1562Alh.A03(c1562Alh);
    }

    @Override // X.DIl
    public void CGS() {
        C1562Alh c1562Alh = this.A00;
        c1562Alh.A06 = null;
        c1562Alh.A05 = 1BK.A0b();
        C1562Alh.A03(c1562Alh);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
    
        if (r303 != null) goto L27;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, X.Alh] */
    @Override // X.DIl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CIa() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cih.CIa():void");
    }

    @Override // X.DIl
    public void CLR() {
        C1562Alh c1562Alh = this.A00;
        c1562Alh.A07 = true;
        C1562Alh.A03(c1562Alh);
    }

    @Override // X.DIl
    public void CPj(int i) {
        C1562Alh c1562Alh = this.A00;
        c1562Alh.A00 = i;
        LithoView lithoView = c1562Alh.A02;
        if (lithoView == null) {
            AbF.A1G();
            throw 0Q8.createAndThrow();
        }
        C5fi.A01(lithoView);
        C1562Alh.A03(c1562Alh);
    }
}
