package X;

import android.view.View;

/* loaded from: Cvp.class */
public final class Cvp implements C5wx {
    public final /* synthetic */ AlA A00;
    public final /* synthetic */ String A01;

    public Cvp(AlA alA, String str) {
        this.A00 = alA;
        this.A01 = str;
    }

    @Override // X.C5wx
    public boolean onLongClick(View view) {
        AlA.A06(this.A00, this.A01);
        return true;
    }
}
