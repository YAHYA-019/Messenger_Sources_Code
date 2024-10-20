package X;

import android.content.Context;
import android.view.View;

/* loaded from: Fr3.class */
public final class Fr3 implements 29I {
    public final /* synthetic */ FyG A00;
    public final /* synthetic */ DLQ A01;
    public final /* synthetic */ GJj A02;

    public Fr3(FyG fyG, DLQ dlq, GJj gJj) {
        this.A01 = dlq;
        this.A02 = gJj;
        this.A00 = fyG;
    }

    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        11T.A0F(view, 1);
        FXt.A01(view, this.A01, this.A00, this.A02, 3);
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        11T.A0F(view, 1);
        view.setOnClickListener(null);
        view.setClickable(false);
    }
}
