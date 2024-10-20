package X;

import android.app.Activity;
import com.facebook.messaging.marketplace.banner.plugins.moreoptionscta.MarketplaceMoreOptionsCtaHandler;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: AGm.class */
public final class AGm implements Runnable {
    public static final String __redex_internal_original_name = "MarketplaceMoreOptionsCtaHandler$maybeCreateAndShowBottomSheet$1";
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ MarketplaceMoreOptionsCtaHandler A01;
    public final /* synthetic */ ThreadKey A02;
    public final /* synthetic */ ImmutableList A03;

    public AGm(Activity activity, MarketplaceMoreOptionsCtaHandler marketplaceMoreOptionsCtaHandler, ThreadKey threadKey, ImmutableList immutableList) {
        this.A01 = marketplaceMoreOptionsCtaHandler;
        this.A00 = activity;
        this.A02 = threadKey;
        this.A03 = immutableList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MarketplaceMoreOptionsCtaHandler marketplaceMoreOptionsCtaHandler = this.A01;
        Activity activity = this.A00;
        ThreadKey threadKey = this.A02;
        ImmutableList immutableList = this.A03;
        ImmutableList.Builder A0h = 4YU.A0h();
        1Br.A0C(marketplaceMoreOptionsCtaHandler.A02);
        11T.A0F(activity, 1);
        1Iw A0W = 7zL.A0W(activity);
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            8Lc r0 = (8Lc) it.next();
            A0h.m11011add((Object) new 8Ls(new 9Sc(activity, r0, marketplaceMoreOptionsCtaHandler, threadKey), r0.A02));
        }
        ImmutableList A01 = 1Fj.A01(A0h);
        FFw fFw = null;
        if (!A01.isEmpty()) {
            ImmutableList.Builder A0h2 = 4YU.A0h();
            Iterator it2 = A01.iterator();
            while (it2.hasNext()) {
                8Ls r02 = (8Ls) it2.next();
                C2165Dft A00 = EVY.A00(A0W);
                A00.A0i(r02.A01);
                A00.A0B = 7zO.A0U(AVD.A01(r02, 30));
                1LI A0O = A00.A0O(R4l.A00);
                if (A0O != null) {
                    A0h2.m11011add((Object) A0O);
                }
            }
            ImmutableList build = A0h2.build();
            if (!build.isEmpty()) {
                ExT A002 = FFw.A00(A0W);
                A002.A01(activity);
                2cM A003 = 2cK.A00(A0W);
                Iterator it3 = build.iterator();
                while (it3.hasNext()) {
                    A003.A2e((1LI) it3.next());
                }
                A002.A0D = A003.A00;
                fFw = A002.A00(R4l.A00);
            }
        }
        marketplaceMoreOptionsCtaHandler.A00 = fFw;
        if (fFw != null) {
            4YV.A11(marketplaceMoreOptionsCtaHandler.A06).execute(new ADR(fFw));
        }
    }
}
