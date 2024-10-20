package X;

import com.facebook.user.model.User;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: D9r.class */
public final class D9r implements Runnable {
    public static final String __redex_internal_original_name = "NeueContactPickerSmsInviteLoader$3";
    public final /* synthetic */ C4P A00;
    public final /* synthetic */ CnW A01;
    public final /* synthetic */ SettableFuture A02;
    public final /* synthetic */ List A03;

    public D9r(C4P c4p, CnW cnW, SettableFuture settableFuture, List list) {
        this.A01 = cnW;
        this.A03 = list;
        this.A00 = c4p;
        this.A02 = settableFuture;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.A03;
        ArrayList A1B = AbJ.A1B(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A0t = AbG.A0t(it);
            if (!this.A00.A00(A0t)) {
                A1B.add(A0t);
            }
        }
        this.A02.set(A1B);
    }
}
