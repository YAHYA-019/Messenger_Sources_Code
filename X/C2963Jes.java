package X;

import android.view.View;

/* renamed from: X.Jes, reason: case insensitive filesystem */
/* loaded from: Jes.class */
public final class C2963Jes extends 0xW {
    public int A00;
    public boolean A01;
    public final int A02;
    public final Object A03;

    public C2963Jes(Kru kru) {
        this.A02 = 0;
        this.A03 = kru;
        this.A01 = false;
        this.A00 = 0;
    }

    public C2963Jes(LLh lLh, int i) {
        this.A02 = 1;
        this.A03 = lLh;
        this.A00 = i;
        this.A01 = false;
    }

    public void onAnimationCancel(View view) {
        if (1 - this.A02 != 0) {
            super.onAnimationCancel(view);
        } else {
            this.A01 = true;
        }
    }

    public void onAnimationEnd(View view) {
        if (this.A02 != 0) {
            if (this.A01) {
                return;
            }
            ((LLh) this.A03).A09.setVisibility(this.A00);
            return;
        }
        int i = this.A00 + 1;
        this.A00 = i;
        Kru kru = (Kru) this.A03;
        if (i == kru.A04.size()) {
            0Sl r0 = kru.A02;
            if (r0 != null) {
                r0.onAnimationEnd((View) null);
            }
            this.A00 = 0;
            this.A01 = false;
            kru.A03 = false;
        }
    }

    public void onAnimationStart(View view) {
        if (this.A02 != 0) {
            ((LLh) this.A03).A09.setVisibility(0);
            return;
        }
        if (this.A01) {
            return;
        }
        this.A01 = true;
        0Sl r0 = ((Kru) this.A03).A02;
        if (r0 != null) {
            r0.onAnimationStart((View) null);
        }
    }
}
