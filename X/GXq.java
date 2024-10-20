package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.widget.FacebookProgressCircleView;
import java.util.Iterator;

/* loaded from: GXq.class */
public final class GXq extends C2lb implements View.OnClickListener, View.OnLongClickListener, CallerContextable {
    public static final String __redex_internal_original_name = "RtcCircularEffectViewHolder";
    public I5A A00;
    public final Context A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final ImageView A05;
    public final ImageView A06;
    public final ProgressBar A07;
    public final 1EZ A08;
    public final FbDraweeView A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final View A0H;
    public final GWo A0I;
    public final FacebookProgressCircleView A0J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GXq(View view, GWo gWo) {
        super(view);
        11T.A0F(view, 1);
        this.A04 = view;
        this.A0I = gWo;
        Context A08 = 4YU.A08(view);
        this.A01 = A08;
        this.A08 = 7zQ.A0O(A08);
        this.A0E = 7zM.A0U();
        this.A0D = 1Bu.A01(A08, 114892);
        this.A0F = 1Bu.A01(A08, 115285);
        this.A0B = 1BK.A0C();
        this.A0C = 1Bu.A01(A08, 115287);
        this.A0A = 1Bu.A01(A08, 16453);
        this.A0G = 1Bu.A01(A08, 16430);
        View findViewById = view.findViewById(2131363810);
        findViewById.setBackgroundResource(2132411468);
        this.A02 = findViewById;
        this.A0H = 7zM.A0H(view, 2131367278);
        this.A0J = (FacebookProgressCircleView) 7zM.A0H(view, 2131363959);
        ProgressBar progressBar = (ProgressBar) 7zM.A0H(view, 2131363960);
        this.A07 = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(A08.getColor(2132213766), PorterDuff.Mode.SRC_IN);
        FbDraweeView fbDraweeView = (FbDraweeView) 7zM.A0H(view, 2131363823);
        5SA r0 = new 5SA();
        r0.A02(view.getResources().getDimension(2132279371));
        fbDraweeView.A0O(r0);
        this.A09 = fbDraweeView;
        ImageView A0I = GOn.A0I(view, 2131363816);
        A0I.setImageDrawable(new GSd(this.A01, 7zP.A0S(this.A0E).A03(C1u3.A5K), 2132213766, 2132214289, 52, 10));
        this.A05 = A0I;
        this.A06 = (ImageView) 7zM.A0H(view, 2131363811);
        this.A03 = 7zM.A0H(view, 2131363812);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    public static final void A00(Uri uri, GXq gXq, boolean z) {
        if (uri != null) {
            CallerContext A06 = CallerContext.A06(GXq.class);
            FbDraweeView fbDraweeView = gXq.A09;
            fbDraweeView.A0F(null);
            fbDraweeView.A0G(uri, A06);
            gXq.A03.setVisibility(DKG.A00(z ? 1 : 0));
            gXq.A06.setVisibility(8);
        }
    }

    public static final void A01(C1u3 c1u3, GXq gXq) {
        gXq.A09.setImageDrawable(new GSd(gXq.A01, 7zP.A0S(gXq.A0E).A03(c1u3), 2132213766, 2132214289, 52, 10));
        gXq.A03.setVisibility(8);
        gXq.A06.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (r301.A0J.getVisibility() == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r301.A0J.getVisibility() == 0) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0A(X.HAR r302, double r303) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GXq.A0A(X.HAR, double):boolean");
    }

    public boolean A0B(boolean z) {
        View view = this.A0H;
        boolean z2 = true;
        boolean A1O = AnonymousClass001.A1O(view.getVisibility());
        view.setVisibility(DKG.A00(z ? 1 : 0));
        if (z) {
            this.A03.setVisibility(8);
            if (!1Br.A07(((HPr) 1Br.A0B(this.A0C)).A00).AZk(36320352283934031L)) {
                this.A07.setVisibility(8);
            }
        }
        if (A1O == z) {
            z2 = false;
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x043a, code lost:
    
        if (r0.A05(new X.AKd(r0, 7, r0, r0)) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04f7, code lost:
    
        if (X.I5a.A00(r0, r0, new X.AKd(r0, 8, r0, r0), new X.J9p(r0, 20)) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0446  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r302) {
        /*
            Method dump skipped, instructions count: 1289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GXq.onClick(android.view.View):void");
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        EffectItem A01;
        I5A i5a = this.A00;
        if (i5a != null && i5a.A00 != 1 && (A01 = i5a.A01()) != null) {
            Hpl hpl = (Hpl) 1Lm.A05(this.A01, 1Fw.A04(this.A08), 114977);
            Integer num = 0S2.A01;
            Iterator it = hpl.A04.iterator();
            while (it.hasNext()) {
                ((JJn) it.next()).CEE(A01, num);
            }
        }
        return true;
    }
}
