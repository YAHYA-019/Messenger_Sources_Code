package X;

import android.content.Context;
import android.view.View;
import com.facebook.inject.FbInjector;
import com.facebook.widget.text.BetterTextView;

/* loaded from: F8c.class */
public final class F8c {
    public BetterTextView A02;
    public 1EZ A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C00i A0A;
    public final C00i A0D = 1BQ.A02(49322);
    public final C00i A0B = FbInjector.A00;
    public final C00i A0C = 1BQ.A02(99710);
    public int A01 = 0;
    public int A00 = 0;
    public final java.util.Map A0E = new 0QO(0);

    public F8c(Context context) {
        this.A03 = (1EZ) 1Bn.A0E(context, (1BY) null, 16428);
        this.A0A = 7zL.A0R(context, 616);
        int dimensionPixelSize = FbInjector.A03.getResources().getDimensionPixelSize(2132279373);
        this.A09 = dimensionPixelSize;
        int A01 = 7zN.A01(FbInjector.A03.getResources());
        this.A07 = A01;
        this.A04 = DKE.A03(FbInjector.A03);
        this.A08 = A01 + dimensionPixelSize;
        this.A05 = FbInjector.A03.getResources().getDimensionPixelSize(2132279544);
        FbInjector.A03.getResources().getDimensionPixelOffset(2132279371);
        FbInjector.A03.getResources().getDimensionPixelOffset(2132279321);
        this.A06 = FbInjector.A03.getResources().getDimensionPixelSize(2132279352);
    }

    private boolean A00(EqX eqX, String str, int i, int i2) {
        int i3 = this.A01;
        int textSize = (int) this.A02.getTextSize();
        this.A02.setTextSize(0, i);
        this.A01 = this.A02.getLineHeight();
        int i4 = this.A00;
        this.A02.setText(str);
        this.A02.measure(DKD.A00(i4), View.MeasureSpec.makeMeasureSpec(0, 0));
        int A03 = DKD.A03(this.A02);
        if (A03 <= ((int) Math.floor(i2 / this.A01))) {
            eqX.A02 = A03;
            return true;
        }
        this.A01 = i3;
        this.A02.setTextSize(0, textSize);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:319:0x05a1, code lost:
    
        if (A00(r0, r0, r325, r0) != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x05a6, code lost:
    
        r0.A04 = r325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x05b2, code lost:
    
        r341 = r301.A02.getMeasuredHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x05bc, code lost:
    
        r0 = r341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x05ca, code lost:
    
        if ((r0 + 1) >= r325) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x05da, code lost:
    
        r341 = ((r325 - r0) / 2) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x05ee, code lost:
    
        if (A00(r0, r0, r341, r0) != false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x05f1, code lost:
    
        r325 = r341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x05f8, code lost:
    
        r325 = r341;
     */
    /* JADX WARN: Type inference failed for: r0v246, types: [android.widget.TextView, com.facebook.widget.text.BetterTextView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.EqX A01(android.view.View r302, com.facebook.auth.usersession.FbUserSession r303, com.facebook.messaging.business.montageads.models.SingleMontageAd r304, int r305) {
        /*
            Method dump skipped, instructions count: 2530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F8c.A01(android.view.View, com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.business.montageads.models.SingleMontageAd, int):X.EqX");
    }
}
