package X;

import android.content.Context;
import java.util.List;

/* loaded from: Fr4.class */
public final class Fr4 implements 29I {
    public final FyG A00;
    public final DLQ A01;
    public final List A02;

    public Fr4(FyG fyG, DLQ dlq, List list) {
        this.A00 = fyG;
        this.A02 = list;
        this.A01 = dlq;
    }

    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        List list = this.A02;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return null;
            }
            FGp.A00().A09.A04(this.A00, (DLQ) list.get(i2), this.A01, obj);
            i = i2 + 1;
        }
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
        List list = this.A02;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            FGp.A00().A09.A05(this.A00, (DLQ) list.get(i2), this.A01, obj);
            i = i2 + 1;
        }
    }
}
