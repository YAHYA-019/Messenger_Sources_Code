package X;

import android.content.Context;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.inject.FbInjector;

/* renamed from: X.GoV, reason: case insensitive filesystem */
/* loaded from: GoV.class */
public final class C2795GoV extends Ht2 {
    public TextView A00;
    public final int A01;
    public final JKA A02;
    public final JLj A03;
    public final 2Wo A04;

    public C2795GoV(ViewStub viewStub, JKA jka, JLj jLj) {
        Context A00 = FbInjector.A00();
        this.A02 = jka;
        this.A03 = jLj;
        2Wo A002 = 2Wo.A00(viewStub);
        this.A04 = A002;
        this.A01 = A00.getResources().getColor(2132214411);
        IlT.A00(A002, this, 14);
    }
}
