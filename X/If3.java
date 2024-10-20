package X;

import android.content.Context;
import com.facebook.rsys.callmanager.gen.CallApi;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: If3.class */
public final class If3 implements JOK {
    public final 1Br A00;
    public final GwA A01;
    public final CopyOnWriteArraySet A02 = GOn.A1J();
    public final GwK A03;
    public volatile 2JS A04;

    public If3(Context context, GwA gwA) {
        this.A01 = gwA;
        this.A00 = 1Bu.A01(context, 114844);
        GwK gwK = new GwK(context, this);
        this.A03 = gwK;
        AWz().setAppModelListener(gwK);
    }

    public void A66(JIr jIr) {
        2JS r0;
        if (!this.A02.add(jIr) || (r0 = this.A04) == null) {
            return;
        }
        jIr.C7M(this, r0);
    }

    public CallApi AWz() {
        CallApi callApi = this.A01.A00;
        if (callApi != null) {
            return callApi;
        }
        throw 1BK.A0h();
    }

    public Object AX0(2JQ r302) {
        HXT hxt = this.A01.A01;
        if (hxt != null) {
            return hxt.A00.A01(r302);
        }
        throw 1BK.A0h();
    }

    public 2JS AXC() {
        return this.A04;
    }

    public Gw1 AXr() {
        throw new C14m("T125813592");
    }

    public GwV AbF() {
        throw new C14m("T125813592");
    }

    public String AuS() {
        return this.A01.A0N;
    }

    public Object ChI(2JQ r302) {
        HXT hxt = this.A01.A01;
        if (hxt == null) {
            throw 1BK.A0h();
        }
        Object A01 = hxt.A00.A01(r302);
        if (A01 != null) {
            return A01;
        }
        throw 1BK.A0h();
    }
}
