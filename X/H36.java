package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.facebook.acra.constants.ActionId;

/* loaded from: H36.class */
public final class H36 extends C6d5 implements JGe {
    public Rect A00;
    public View A01;
    public C00i A02;
    public RRM A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final JJ3 A09;
    public final 6TJ A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H36(Context context) {
        super(context, null, 0);
        11T.A0F(context, 1);
        this.A09 = new IhC(this);
        6TJ A00 = GPl.A00(this, ActionId.NEW_START_FOUND);
        this.A0A = A00;
        this.A02 = 1HG.A00(context, 115836);
        this.A00 = DKC.A0C();
        View view = new View(context);
        this.A01 = view;
        addView(view);
        A0h(A00);
    }

    @Override // X.C6d6
    public String A0H() {
        return "UnifiedVideoCVCPlugin";
    }

    @Override // X.C6d6
    public void A0M() {
        RRM rrm = this.A03;
        if (rrm != null) {
            rrm.A00();
            this.A03 = null;
            this.A06 = false;
        }
        this.A05 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (X.HNY.A00.contains(r0) != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C6d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0e(X.6TI r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H36.A0e(X.6TI, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c1, code lost:
    
        if (r0.getGlobalVisibleRect(r0) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    @Override // X.JGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean CZc(X.ROw r302) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H36.CZc(X.ROw):boolean");
    }
}
