package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AutoMeasureLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.fury.context.ReqContext;
import com.facebook.inject.FbInjector;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.recyclerview.BetterLinearLayoutManager;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* renamed from: X.Gmr, reason: case insensitive filesystem */
/* loaded from: Gmr.class */
public final class C2740Gmr extends IV9 {
    public 1BY A00;
    public Hdr A01;
    public MigColorScheme A02;
    public final 2S4 A03;
    public final GWZ A05;
    public final 6Qb A06;
    public final C00i A07 = 1BQ.A00();
    public final C00i A04 = 1BV.A01((1BY) null, 646);

    public C2740Gmr(2S4 r302, 1BO r303, 6Qc r304, 6Qb r305) {
        this.A00 = 7zL.A0Q(r303);
        AbR A0O = GOn.A0O((1BY) null, 647);
        MigColorScheme Axg = r304.A00.A0O.Axg();
        this.A02 = Axg;
        this.A06 = r305;
        this.A03 = r302;
        Context A01 = FbInjector.A01();
        AbL.A0y(A0O);
        try {
            GWZ gwz = new GWZ(Axg);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A05 = gwz;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public View A01(ViewGroup viewGroup) {
        H5N h5n = H5N.$redex_init_class;
        CustomLinearLayout customLinearLayout = new CustomLinearLayout(viewGroup.getContext());
        customLinearLayout.A0D(2132542626);
        RecyclerView recyclerView = (RecyclerView) customLinearLayout.requireViewById(2131365831);
        ((H5N) customLinearLayout).A00 = recyclerView;
        Context context = customLinearLayout.getContext();
        BetterLinearLayoutManager betterLinearLayoutManager = new BetterLinearLayoutManager(context, 1);
        ((AutoMeasureLinearLayoutManager) betterLinearLayoutManager).A00 = true;
        recyclerView.A1D(betterLinearLayoutManager);
        2kG q2n = new Q2n(context);
        ((H5N) customLinearLayout).A01 = q2n;
        ((H5N) customLinearLayout).A00.A1B(q2n);
        ((H5N) customLinearLayout).A00.A16(this.A05);
        customLinearLayout.A0E(this.A02);
        if (1BK.A0N(this.A07).AZk(36313566235663028L)) {
            ((H5N) customLinearLayout).A00.A1A(null);
        }
        return customLinearLayout;
    }

    public void C3C(ParcelableSecondaryData parcelableSecondaryData) {
        1EK.A09("MoreDrawerKeyboard", 1026063551161386L);
        try {
            ReqContext A04 = AnonymousClass018.A04("MoreDrawerKeyboard", 0);
            try {
                1BY r0 = this.A00;
                C7a2.A01(7NO.A04, (C7a2) 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 83391), null, null, 4YU.A0B(((IV9) this).A00.getContext()).orientation, (-1) << (-1));
                GWZ gwz = this.A05;
                gwz.A02 = HML.A00;
                gwz.A07();
                if (A04 != null) {
                    A04.close();
                }
            } finally {
            }
        } finally {
            1EK.A03();
        }
    }
}
