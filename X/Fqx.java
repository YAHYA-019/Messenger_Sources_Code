package X;

import android.content.Context;
import android.view.View;
import java.util.List;

/* loaded from: Fqx.class */
public final class Fqx implements 29I {
    public final /* synthetic */ List A00;

    public Fqx(List list) {
        this.A00 = list;
    }

    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        C1qv c1qv = (C1qv) obj;
        c1qv.setTouchDelegate(new DOd(c1qv, this.A00));
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
        ((View) obj).setTouchDelegate(null);
    }
}
