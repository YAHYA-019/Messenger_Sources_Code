package X;

import com.facebook.resources.ui.FbTextView;

/* loaded from: Fna.class */
public final class Fna implements GJX {
    public final int A00;
    public final Object A01;

    public Fna(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public GFy Ar0() {
        RvT rvR;
        switch (this.A00) {
            case 0:
                DYu dYu = (DYu) this.A01;
                rvR = new RvS(dYu.A04, AbM.A0u(dYu.A05.A03));
                break;
            case 1:
                rvR = new RvR(AbM.A0u(((DZE) this.A01).A0I.A03));
                break;
            default:
                DZE dze = (DZE) this.A01;
                rvR = new RvT(dze.A01, AbM.A0u(dze.A0F.A03));
                break;
        }
        return (GFy) rvR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.view.View] */
    public void Bo7() {
        int i;
        FbTextView fbTextView;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                i = 8;
                fbTextView = ((DZE) this.A01).A0P;
                break;
            default:
                i = 8;
                fbTextView = ((DZE) this.A01).A0Q;
                break;
        }
        if (fbTextView != null) {
            fbTextView.setVisibility(i);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.view.View] */
    public void CKr(String str) {
        FbTextView fbTextView;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                DZE dze = (DZE) this.A01;
                2OB r0 = dze.A0P;
                if (r0 != null) {
                    r0.setText(str);
                    fbTextView = dze.A0P;
                    fbTextView.setVisibility(0);
                    return;
                }
                return;
            default:
                DZE dze2 = (DZE) this.A01;
                2OB r02 = dze2.A0Q;
                if (r02 != null) {
                    r02.setText(str);
                    fbTextView = dze2.A0Q;
                    fbTextView.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
