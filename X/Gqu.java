package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;

/* loaded from: Gqu.class */
public final class Gqu extends GS2 {
    public boolean A00;
    public final HG5 A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final HFZ A05;
    public final Context A06;
    public final FbUserSession A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gqu(FbUserSession fbUserSession, Context context) {
        super("ExpressionListControlPresenter");
        int A05 = 7zP.A05(fbUserSession, context, 1);
        this.A07 = fbUserSession;
        this.A06 = context;
        this.A04 = GOn.A0d(context, fbUserSession);
        this.A03 = 1Lm.A00(context, fbUserSession, 98491);
        this.A02 = GOn.A0c(context, fbUserSession);
        this.A05 = new Gpt(this, A05);
        this.A01 = new GgI(this, 14);
    }

    /* JADX WARN: Type inference failed for: r304v4, types: [X.HgK, java.lang.Object] */
    public static final void A00(Gqu gqu) {
        HgK hgK;
        C00i c00i = gqu.A04.A00;
        ImmutableList A0E = GOo.A0U(c00i).A0E();
        HCR A0D = GOo.A0U(c00i).A0D();
        C00i c00i2 = gqu.A03.A00;
        EffectItem effectItem = ((IMJ) c00i2.get()).A00;
        boolean z = false;
        boolean z2 = true;
        if (effectItem == null || !effectItem.A07() || ((IMJ) c00i2.get()).A08 != 0S2.A0N) {
            gqu.A00 = false;
        } else if (!gqu.A00) {
            A0D = HCR.A0C;
            gqu.A00 = true;
        }
        int indexOf = A0E.indexOf(A0D);
        if (GOo.A0U(c00i).A02 == HAU.A06) {
            indexOf = -2;
        }
        if (A0E.size() <= 1) {
            z2 = false;
        }
        JDB jdb = ((GS2) gqu).A01;
        if (AbM.A1a(jdb)) {
            IZo iZo = (IZo) AbM.A0r(jdb);
            ?? obj = new Object();
            ((HgK) obj).A02 = AnonymousClass001.A0v();
            iZo.getClass();
            ((HgK) obj).A03 = iZo.A03;
            ((HgK) obj).A00 = iZo.A00;
            ((HgK) obj).A01 = iZo.A01;
            ((HgK) obj).A02 = AbF.A1E(iZo.A02);
            hgK = obj;
        } else {
            hgK = new HgK();
        }
        hgK.A01 = A0E;
        if (!hgK.A02.contains("tabList")) {
            HashSet A1E = AbF.A1E(hgK.A02);
            hgK.A02 = A1E;
            A1E.add("tabList");
        }
        hgK.A00 = indexOf;
        if (!IEo.A05(gqu.A02)) {
            z = z2;
        }
        hgK.A03 = z;
        gqu.A0Z(new IZo(hgK));
    }
}
