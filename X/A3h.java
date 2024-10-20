package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.ArrayList;
import java.util.List;

/* loaded from: A3h.class */
public final class A3h implements 6cX {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadKey A04;
    public final boolean A05;

    public A3h(Context context, ThreadKey threadKey, boolean z) {
        this.A04 = threadKey;
        this.A05 = z;
        this.A01 = 1HG.A00(context, 67956);
        this.A03 = 1HG.A00(context, 67954);
        this.A02 = 1HG.A00(context, 68638);
        this.A00 = 1HG.A00(context, 115823);
    }

    public List B3i() {
        C00i c00i = this.A03.A00;
        ((92U) c00i.get()).A00 = this.A04;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new Object());
        A0s.add(1Br.A0B(this.A01));
        A0s.add(c00i.get());
        if (this.A05) {
            A0s.add(1Br.A0B(this.A02));
        }
        A0s.add(1Br.A0B(this.A00));
        return A0s;
    }

    public boolean BUS() {
        return true;
    }
}
