package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.reactions.model.ReactionsSet;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ui.emoji.model.Emoji;
import java.util.List;

/* loaded from: Dz8.class */
public final class Dz8 extends C1rj {
    public static final ReactionsSet A08 = new ReactionsSet();
    public DF1 A00;
    public DGr A01;
    public ReactionsSet A02;
    public MigColorScheme A03;
    public Emoji A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public Dz8() {
        super("EmojiPickerIconComponent");
        this.A02 = A08;
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A04, Boolean.valueOf(this.A05), Boolean.valueOf(this.A06), Boolean.valueOf(this.A07), this.A00, this.A02, this.A01};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        E0P A0P = 4YU.A0P(r302);
        Emoji emoji = this.A04;
        boolean z = this.A06;
        MigColorScheme migColorScheme = this.A03;
        boolean z2 = A0P.A02;
        C2iw c2iw = A0P.A00;
        ElK elK = (ElK) 1Bn.A0E(r302.A0D, (1BY) null, 99882);
        7Wd r0 = (7Wd) 1Bn.A0A(50212);
        elK.A00 = z ? new Erp(r302) : null;
        8TO A00 = C8np.A00(r302);
        String A07 = emoji.A07();
        A00.A2Y(r0.A00(A07));
        A00.A2X(40);
        C8np c8np = A00.A01;
        c8np.A00 = 12;
        c8np.A02 = 50;
        A00.A24(C26z.ALL, 5.0f);
        A00.A2Z(migColorScheme);
        A00.A2a(z2);
        A00.A0G(z2);
        A00.A2S(A07);
        A00.A1w(c2iw);
        A00.A1q(1LI.A09(r302, Dz8.class, "EmojiPickerIconComponent", -2055802235));
        return A00.A2W();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -2055802235) {
            if (i != -1048037474) {
                return null;
            }
            1LI.A0J(r302, obj);
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        Dz8 dz8 = (Dz8) r02;
        E0P A0P = 4YU.A0P(r03);
        DF1 df1 = dz8.A00;
        MigColorScheme migColorScheme = dz8.A03;
        Emoji emoji = dz8.A04;
        DGr dGr = dz8.A01;
        boolean z = dz8.A05;
        boolean z2 = dz8.A07;
        ReactionsSet reactionsSet = dz8.A02;
        ElK elK = A0P.A01;
        C2iw c2iw = A0P.A00;
        if (((C22a) 1Bi.A03(66067)).BNY(emoji) && z2) {
            Context context = r03.A0D;
            FbUserSession A0C = 4YV.A0C(context);
            C2135Deo c2135Deo = new C2135Deo(context, (C62j) elK.A02.get(), false);
            c2135Deo.A0L(migColorScheme);
            ((FIU) c2135Deo).A0M = new RR6(elK, dGr, emoji, z);
            ((FIU) c2135Deo).A0L = new Fe2(elK, 1);
            C00i c00i = elK.A01;
            List AjT = ((C22a) c00i.get()).AjT(emoji);
            for (int i2 = 0; i2 < AjT.size(); i2++) {
                Emoji emoji2 = (Emoji) AjT.get(i2);
                c2135Deo.A0K(((C22a) c00i.get()).AjP(emoji2, 6qG.A00), new Rji(1Lo.A00(context, A0C, 67391), c2135Deo, elK, df1, dGr, emoji2, emoji, z), null, null, emoji.A07(), i2, reactionsSet.A01(emoji2.A07()));
            }
            Fil fil = new Fil(c2135Deo);
            11T.A0F(c2iw, 2);
            F1n.A00(r03, c2iw, fil);
        }
        return AnonymousClass001.A0K();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.2iw, java.lang.Object] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        E0P e0p = (E0P) r303;
        boolean z = this.A06;
        Object A0E = 1Bn.A0E(r302.A0D, (1BY) null, 99882);
        ?? obj = new Object();
        Boolean valueOf = Boolean.valueOf(z);
        e0p.A00 = obj;
        e0p.A02 = valueOf.booleanValue();
        e0p.A01 = (ElK) A0E;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
