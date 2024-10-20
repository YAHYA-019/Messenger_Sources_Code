package X;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;
import com.facebook.messaging.montage.viewer.controlsoverlay.MontageViewerControlsContainer;
import com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: X.Gog, reason: case insensitive filesystem */
/* loaded from: Gog.class */
public final class C2803Gog extends AbstractC2395Gbx {
    public static final String __redex_internal_original_name = "MontageViewMorePageFrament";
    public View A00;
    public C00i A01;
    public LithoView A02;
    public MontageViewerFragment A03;
    public MontageViewerControlsContainer A04;
    public MontageProgressIndicatorView A05;
    public FbUserSession A06;
    public C00i A07;
    public final C00i A0A = 1BV.A00(16430);
    public final C00i A09 = AbH.A0a();
    public final C00i A0C = new 1HH(this, 66579);
    public final C00i A0B = 1BV.A00(67968);
    public final C00i A0D = 1BV.A00(116002);
    public final C00i A08 = AbH.A0K();

    public static void A03(Uri uri, C2803Gog c2803Gog, ImmutableList.Builder builder, ImmutableList.Builder builder2, int i) {
        LithoView lithoView = c2803Gog.A02;
        if (lithoView != null) {
            GkJ gkJ = new GkJ(lithoView.A09, new C8mb());
            C8mb c8mb = gkJ.A01;
            c8mb.A01 = uri;
            BitSet bitSet = gkJ.A02;
            bitSet.set(2);
            c8mb.A00 = i;
            bitSet.set(0);
            c8mb.A04 = builder.build();
            bitSet.set(4);
            c8mb.A03 = builder2.build();
            bitSet.set(3);
            c8mb.A02 = c2803Gog.A03;
            bitSet.set(1);
            C1rs.A04(bitSet, gkJ.A03);
            gkJ.A0J();
            lithoView.A0y(c8mb);
        }
    }

    public 1iF A1R() {
        return AbF.A0C(1567251216773138L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        FbUserSession A0G = 1BL.A0G(this);
        this.A06 = A0G;
        this.A07 = 1Lo.A00(requireContext(), A0G, 85200);
        this.A01 = 1Lo.A00(requireContext(), this.A06, 17145);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1k(ImmutableList immutableList) {
        if (immutableList.isEmpty()) {
            return;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        int min = Math.min(3, immutableList.size());
        for (int i = 0; i < min; i++) {
            A0s.add(String.valueOf(((MontageBucketPreview) immutableList.get(i)).A02.A00));
        }
        if (getContext() != null) {
            Executor executor = (Executor) 1Bi.A03(16462);
            C2wp c2wp = (C2wp) 4YU.A0p(this.A01);
            ImmutableList.Builder builder = ImmutableList.builder();
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                builder.m11011add((Object) Long.valueOf(AnonymousClass001.A0i(it)));
            }
            c2wp.A02(new IX1(this, immutableList, 2), builder.build(), executor);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1118904508);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542625);
        0FI.A08(1383288404, A02);
        return A08;
    }

    @Override // X.AbstractC2395Gbx
    public void onViewCreated(View view, Bundle bundle) {
        C2803Gog c2803Gog;
        super.onViewCreated(view, bundle);
        MontageViewerFragment montageViewerFragment = this.A03;
        if (montageViewerFragment == null || (c2803Gog = montageViewerFragment.A0H) == null) {
            return;
        }
        c2803Gog.A1k(montageViewerFragment.A0Y.build());
    }
}
