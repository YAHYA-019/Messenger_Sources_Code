package X;

import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.channelimageediting.model.EmojiGradientModel;
import com.google.common.collect.ImmutableList;

/* loaded from: Cig.class */
public final class Cig implements DIl {
    public final /* synthetic */ AlP A00;

    public Cig(AlP alP) {
        this.A00 = alP;
    }

    @Override // X.DIl
    public void Bvm(AXh aXh) {
        11T.A0F(aXh, 0);
        if (aXh instanceof EmojiGradientModel) {
            AlP alP = this.A00;
            EmojiGradientModel emojiGradientModel = (EmojiGradientModel) aXh;
            alP.A0B = emojiGradientModel.emoji;
            alP.A0A = emojiGradientModel.integerGradientColors;
        }
        AlP alP2 = this.A00;
        alP2.A0C = false;
        AlP.A07(alP2);
    }

    @Override // X.DIl
    public void Bvp(String str) {
        String str2;
        AlP alP = this.A00;
        alP.A0B = str;
        ImmutableList immutableList = alP.A0A;
        11T.A0F(immutableList, 0);
        if (!CJI.A01(immutableList)) {
            RIf rIf = alP.A06;
            if (rIf == null) {
                str2 = "channelImagePresets";
                11T.A0L(str2);
                throw 0Q8.createAndThrow();
            }
            alP.A0A = rIf.A00.integerGradientColors;
        }
        alP.A0C = false;
        LithoView lithoView = alP.A04;
        if (lithoView == null) {
            str2 = "lithoView";
            11T.A0L(str2);
            throw 0Q8.createAndThrow();
        }
        C5fi.A01(lithoView);
        AlP.A07(alP);
    }

    @Override // X.DIl
    public void C0n(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        AlP alP = this.A00;
        alP.A0A = immutableList;
        String str = alP.A0B;
        if (str == null || !7zL.A1V(str)) {
            RIf rIf = alP.A06;
            if (rIf == null) {
                11T.A0L("channelImagePresets");
                throw 0Q8.createAndThrow();
            }
            alP.A0B = rIf.A00.emoji;
        }
        alP.A0C = false;
        AlP.A07(alP);
    }

    @Override // X.DIl
    public void CGS() {
        ImmutableList of;
        AlP alP = this.A00;
        alP.A0C = true;
        AXh aXh = alP.A05;
        if (aXh != null) {
            C00i c00i = alP.A0G.A00;
            String str = null;
            if (((1WY) c00i.get()).A08()) {
                if (aXh instanceof EmojiGradientModel) {
                    str = ((EmojiGradientModel) aXh).emoji;
                } else if (!(aXh instanceof Cij)) {
                    throw AnonymousClass001.A0N("ThreadTileViewDataModel is unsupported");
                }
            }
            alP.A0B = str;
            AXh aXh2 = alP.A05;
            if (aXh2 != null) {
                if (!((1WY) c00i.get()).A08()) {
                    of = ImmutableList.of();
                    11T.A0D(of);
                } else if (aXh2 instanceof EmojiGradientModel) {
                    of = ((EmojiGradientModel) aXh2).integerGradientColors;
                } else {
                    if (!(aXh2 instanceof Cij)) {
                        throw AnonymousClass001.A0N("ThreadTileViewDataModel is unsupported");
                    }
                    of = 1BK.A0b();
                }
                alP.A0A = of;
                AlP.A07(alP);
                return;
            }
        }
        11T.A0L("defaultChannelImage");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        throw r0;
     */
    @Override // X.DIl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CIa() {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cig.CIa():void");
    }

    @Override // X.DIl
    public void CLR() {
        AlP alP = this.A00;
        alP.A0D = true;
        AlP.A07(alP);
    }

    @Override // X.DIl
    public void CPj(int i) {
        AlP alP = this.A00;
        alP.A00 = i;
        LithoView lithoView = alP.A04;
        if (lithoView == null) {
            AbF.A1G();
            throw 0Q8.createAndThrow();
        }
        C5fi.A01(lithoView);
        AlP.A07(alP);
    }
}
