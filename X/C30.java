package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: C30.class */
public abstract class C30 {
    public final C1yg A00;
    public final /* synthetic */ C1623Ao1 A01;

    public C30(C1yg c1yg, C1623Ao1 c1623Ao1) {
        this.A01 = c1623Ao1;
        this.A00 = c1yg;
    }

    public 2FT A00(List list) {
        ListenableFuture A0J;
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ThreadKey A0k = AbG.A0k(it);
            if (A0k.A06 == this.A00) {
                builder.m11011add((Object) A0k);
            }
        }
        ImmutableList build = builder.build();
        if (this instanceof B69) {
            B69 b69 = (B69) this;
            A0J = DBF.A00(AbF.A13(b69.A03.A04), build, b69, 9);
        } else {
            B68 b68 = (B68) this;
            ArrayList A1B = AbJ.A1B(build);
            Iterator it2 = build.iterator();
            while (it2.hasNext()) {
                ThreadSummary A06 = b68.A01.A06(AbG.A0k(it2));
                if (A06 != null) {
                    A1B.add(A06);
                }
            }
            A0J = C3o5.A0J(A1B);
        }
        return 2FP.A02(D3J.A01(this, 28), A0J, this.A01.A08);
    }
}
