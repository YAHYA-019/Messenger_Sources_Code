package X;

import android.view.View;

/* loaded from: Fjj.class */
public final class Fjj implements GF5 {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ Ena A01;

    public Fjj(View.OnClickListener onClickListener, Ena ena) {
        this.A01 = ena;
        this.A00 = onClickListener;
    }

    @Override // X.GF5
    public void BpE() {
        this.A00.onClick(null);
    }
}
