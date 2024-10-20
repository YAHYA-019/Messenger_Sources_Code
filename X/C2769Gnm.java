package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;

/* renamed from: X.Gnm, reason: case insensitive filesystem */
/* loaded from: Gnm.class */
public final class C2769Gnm extends IFM {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public C2137Deq A04;
    public LithoView A05;
    public boolean A06;
    public boolean A07;
    public 1BY A08;
    public final FbUserSession A09;
    public final C00i A0A;
    public final C00i A0B;
    public final C00i A0C;
    public final HrC A0D;
    public final IWN A0E;

    public C2769Gnm(ViewGroup viewGroup, FbUserSession fbUserSession, AbR abR, 1BO r305, Hrw hrw, HrC hrC, IWN iwn, C6x1 c6x1) {
        super(viewGroup, abR, hrw, c6x1);
        this.A0C = 1BV.A01((1BY) null, 85041);
        this.A0B = 1BV.A01((1BY) null, 115935);
        this.A0A = 1BV.A01((1BY) null, 16981);
        this.A08 = 7zL.A0Q(r305);
        hrC.getClass();
        this.A0D = hrC;
        this.A0E = iwn;
        this.A09 = fbUserSession;
    }

    public static void A00(C2769Gnm c2769Gnm) {
        int i;
        if (c2769Gnm.A09() == null || c2769Gnm.A02 == null) {
            return;
        }
        Ham AwJ = ((IFM) c2769Gnm).A06.A02.AwJ();
        if (((IFM) c2769Gnm).A07 != C6x1.A04 || !AwJ.A01 || (i = AwJ.A00) <= 0) {
            c2769Gnm.A02.setVisibility(8);
        } else {
            c2769Gnm.A02.setVisibility(0);
            c2769Gnm.A02.setText(Integer.toString(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (X.IFM.A08(r301.A0B, r301) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.C2769Gnm r301) {
        /*
            r0 = r301
            X.Hrw r0 = r0.A06
            com.facebook.messaging.montage.composer.MontageComposerFragment r0 = r0.A01
            X.6r6 r0 = r0.A0A
            r302 = r0
            X.6x9 r0 = X.C6r6.A00
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.A07(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2c
            r0 = r301
            X.00i r0 = r0.A0B
            r303 = r0
            r0 = r303
            r1 = r301
            boolean r0 = X.IFM.A08(r0, r1)
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L30
        L2c:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L30:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2769Gnm.A01(X.Gnm):boolean");
    }

    public void A0F() {
        super.A0F();
        C2137Deq c2137Deq = this.A04;
        if (c2137Deq != null) {
            c2137Deq.A06();
            this.A04 = null;
        }
        if (A0D().A00 == HAE.A02) {
            this.A07 = false;
        }
    }

    public void A0H() {
        super.A0H();
        boolean A04 = C6x9.A04(((IFM) this).A06.A01.A0A);
        if (this.A01 == null || this.A07 || !A04) {
            return;
        }
        C00i c00i = this.A0C;
        if (53I.A00(IFM.A04(c00i)).ArU(4LQ.A0W, 0) < 2) {
            C2137Deq c2137Deq = this.A04;
            if (c2137Deq == null) {
                HzT hzT = (HzT) c00i.get();
                Context context = this.A01.getContext();
                11T.A0F(context, 0);
                c2137Deq = HzT.A00(context, hzT, 1BK.A0u(context, 2131960683), -1);
                this.A04 = c2137Deq;
            }
            c2137Deq.A0C(this.A01);
            this.A07 = true;
        }
    }
}
