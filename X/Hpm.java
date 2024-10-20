package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.widget.recyclerview.BetterLinearLayoutManager;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: Hpm.class */
public final class Hpm {
    public User A00;
    public final RecyclerView A01;
    public final GWX A02;
    public final BcB A03;
    public final AeX A04;
    public final ScheduledExecutorService A05;

    public Hpm(Context context, 06Z r303, RecyclerView recyclerView, BcB bcB, ThreadKey threadKey, ThreadSummary threadSummary, BNT bnt, MigColorScheme migColorScheme, User user, ScheduledExecutorService scheduledExecutorService, boolean z) {
        2Z5 linearLayoutManager;
        C1F6 c1f6 = (C1F6) 1Bn.A0E(context, (1BY) null, 449);
        this.A04 = (AeX) 1Bn.A0E(context, (1BY) null, 82710);
        this.A05 = scheduledExecutorService;
        this.A03 = bcB;
        HQg hQg = new HQg(this);
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            GWX gwx = new GWX(r303, c1f6, hQg, threadKey, threadSummary, bnt);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A02 = gwx;
            this.A01 = recyclerView;
            this.A00 = user;
            if (z) {
                linearLayoutManager = new BetterLinearLayoutManager(context);
                linearLayoutManager.A00 = true;
            } else {
                linearLayoutManager = new LinearLayoutManager(context);
            }
            recyclerView.A1D(linearLayoutManager);
            gwx.A0H(this.A00);
            recyclerView.A16(gwx);
            AbH.A1K(recyclerView, migColorScheme.AjC());
            this.A01.A1B(new 8Dk(this, 0));
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public void A00() {
        1Kd.A0F(Ini.A01(this, 9), this.A04.A00(this.A00.A0k), this.A05);
    }
}
