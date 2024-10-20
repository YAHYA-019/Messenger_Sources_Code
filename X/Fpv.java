package X;

import android.content.Context;
import android.view.View;
import com.facebook.quicksilver.views.loading.QuicksilverCardlessLoadingView;
import com.facebook.quicksilver.views.loading.progress.CircularProgressView;

/* loaded from: Fpv.class */
public final class Fpv implements GKY {
    public 1BY A00;
    public final GGK A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05 = DKG.A0Q();
    public final C00i A06;
    public final FAX A07;

    public Fpv(1BO r302, GGK ggk) {
        this.A00 = 7zL.A0Q(r302);
        Context A0J = 7zP.A0J();
        1HH A0Q = AbF.A0Q(A0J, 82751);
        this.A03 = A0Q;
        this.A04 = AbF.A0Q(A0J, 98364);
        this.A06 = AbF.A0Q(A0J, 98307);
        this.A01 = ggk;
        this.A07 = ((F6C) A0Q.get()).A00;
        this.A02 = AbH.A0K();
    }

    public View BJw() {
        return this.A01;
    }

    public void BO9(boolean z) {
        QuicksilverCardlessLoadingView quicksilverCardlessLoadingView = (QuicksilverCardlessLoadingView) this.A01;
        if (!z) {
            quicksilverCardlessLoadingView.A00.setVisibility(8);
            return;
        }
        FHq fHq = (FHq) 4YU.A0p(quicksilverCardlessLoadingView.A07);
        View view = quicksilverCardlessLoadingView.A00;
        FpN fpN = new FpN(quicksilverCardlessLoadingView, 7);
        11T.A0F(view, 0);
        view.animate().translationY(fHq.A00).setInterpolator(fHq.A01).setListener(new EAQ(fpN, view, 4));
    }

    public void BrM() {
    }

    public void C03() {
        reset();
    }

    public void C07() {
        ((QuicksilverCardlessLoadingView) this.A01).A0B.A01();
    }

    public void CmV(GJw gJw) {
        ((QuicksilverCardlessLoadingView) this.A01).A09 = gJw;
    }

    public void CpD(boolean z) {
        ((QuicksilverCardlessLoadingView) this.A01).A0C.setChecked(z);
    }

    public void Cqp(int i) {
        this.A01.setProgress(i);
    }

    public void Cr2(int i) {
        ((QuicksilverCardlessLoadingView) this.A01).A0B.A05.A04 = i;
    }

    public void CtT(boolean z, boolean z2) {
        QuicksilverCardlessLoadingView quicksilverCardlessLoadingView = (QuicksilverCardlessLoadingView) this.A01;
        if (!z2) {
            FA8 fa8 = quicksilverCardlessLoadingView.A0B;
            CircularProgressView circularProgressView = fa8.A05;
            int i = 0;
            int i2 = 4;
            if (z) {
                i2 = 0;
            }
            circularProgressView.setVisibility(i2);
            2OB r0 = fa8.A06;
            if (!z) {
                i = 4;
            }
            r0.setVisibility(i);
            return;
        }
        C00i c00i = quicksilverCardlessLoadingView.A07;
        c00i.getClass();
        c00i.get();
        FA8 fa82 = quicksilverCardlessLoadingView.A0B;
        CircularProgressView circularProgressView2 = fa82.A05;
        if (z) {
            FHq.A00(circularProgressView2, (GGC) null);
            c00i.get();
            FHq.A00(fa82.A06, (GGC) null);
        } else {
            FHq.A01(circularProgressView2, (GGC) null);
            c00i.get();
            FHq.A01(fa82.A06, (GGC) null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
    
        if (r304 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        if (r304 != null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void reset() {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fpv.reset():void");
    }
}
