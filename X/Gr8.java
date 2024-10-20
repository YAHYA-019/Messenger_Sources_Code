package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: Gr8.class */
public final class Gr8 extends GS2 {
    public EAX A00;
    public final JJn A01;
    public final HG5 A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final HFZ A0C;
    public final 2Qn A0D;
    public final Context A0E;
    public final FbUserSession A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gr8(FbUserSession fbUserSession, Context context) {
        super("ExpressionListHeaderPresenter");
        1BL.A1F(fbUserSession, context);
        this.A0F = fbUserSession;
        this.A0E = context;
        this.A08 = 1Lm.A00(context, fbUserSession, 98491);
        this.A09 = GOn.A0d(context, fbUserSession);
        this.A07 = 1Lm.A00(context, fbUserSession, 114977);
        this.A05 = 1Bu.A01(context, 99983);
        this.A06 = 1Bu.A01(context, 115471);
        this.A0B = GOn.A0V(context, fbUserSession);
        this.A04 = 1Bu.A01(context, 99829);
        this.A03 = GOn.A0c(context, fbUserSession);
        this.A0A = 1Bq.A00(83598);
        this.A02 = new GgI(this, 15);
        this.A0C = new Gpt(this, 3);
        this.A0D = IYv.A00(this, 22);
        this.A01 = new IRe(this);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.Hhc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.Hhc, java.lang.Object] */
    private final Hhc A00() {
        JDB jdb = ((GS2) this).A01;
        if (!AbM.A1a(jdb)) {
            return new Object();
        }
        IZf iZf = (IZf) AbM.A0r(jdb);
        ?? obj = new Object();
        iZf.getClass();
        obj.A00 = iZf.A00;
        obj.A01 = iZf.A01;
        obj.A02 = iZf.A02;
        obj.A03 = iZf.A03;
        obj.A04 = iZf.A04;
        return obj;
    }

    public static final void A01(EffectItem effectItem, Gr8 gr8, Integer num) {
        C00i c00i = gr8.A07.A00;
        ((Hpl) c00i.get()).A00 = effectItem;
        if (effectItem != null) {
            if (effectItem.A06()) {
                1Br.A0C(gr8.A0A);
            }
            Activity A09 = ((1Od) 1Bi.A03(16616)).A09();
            if (A09 != null) {
                EAX A00 = HHC.A00(A09, false, 4YV.A1W(effectItem.A06() ? 1 : 0, 1));
                gr8.A00 = A00;
                A00.A0G(true, false);
                EAX eax = gr8.A00;
                if (eax != null) {
                    eax.A07 = new ISJ(gr8, 2);
                }
                ((Hpl) c00i.get()).A01 = true;
                I5n i5n = (I5n) 1Br.A0B(gr8.A05);
                1Br.A0C(gr8.A06);
                Integer num2 = 0S2.A0u;
                Hqg hqg = new Hqg(effectItem, num2, null, null);
                if (num == 0S2.A01) {
                    num2 = 0S2.A15;
                }
                I5n.A00(hqg, i5n, null, num2, i5n.A01());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cb, code lost:
    
        if (r303 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (X.GOq.A0a(r0.A0J).A03 == 2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(X.Gr8 r301) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gr8.A02(X.Gr8):void");
    }
}
