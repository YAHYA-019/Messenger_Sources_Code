package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: C5d.class */
public final class C5d {
    public final Context A00;
    public final 1De A01;
    public final 1Br A02 = AbG.A0Q();
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;

    public C5d(1De r302) {
        this.A01 = r302;
        1BY r0 = r302.A00;
        this.A03 = 1Bu.A03(r0, 82730);
        this.A05 = 1Bu.A03(r0, 68250);
        this.A00 = 7zQ.A0I(r0);
        this.A06 = 7zM.A0O();
        this.A04 = 7zM.A0Z();
    }

    public final MutableLiveData A00(ThreadKey threadKey, ImmutableList immutableList, String str, String str2) {
        11T.A0F(immutableList, 3);
        MutableLiveData A0H = 7zL.A0H();
        C2q c2q = (C2q) 1Br.A0B(this.A03);
        ArrayList A0z = 1BL.A0z(immutableList);
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            A0z.add(AbO.A0G(it));
        }
        2Jd r0 = new 2Jd(94);
        r0.A09(1BJ.A00(2071), str);
        r0.A0A(1BJ.A00(2072), A0z);
        r0.A09("entry_point", str2);
        ListenableFuture A00 = c2q.A00(r0, threadKey);
        1Br.A0D(this.A06, D4p.A00(this, A0H, 16), A00);
        return A0H;
    }
}
