package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Alh, reason: case insensitive filesystem */
/* loaded from: Alh.class */
public final class C1562Alh extends 1pK implements 1pN {
    public static final BSe A0H = new Object();
    public static final String __redex_internal_original_name = "ChannelImageSelectorFragment";
    public int A00;
    public 1pI A01;
    public LithoView A02;
    public AXh A03;
    public RIf A04;
    public String A06;
    public boolean A07;
    public FbUserSession A08;
    public String A0A;
    public final 1Br A0B;
    public final Cih A0F;
    public final ImmutableList A0G;
    public ImmutableList A09 = 1BK.A0b();
    public ImmutableList A05 = 1BK.A0b();
    public final 1Br A0D = AbG.A0Q();
    public final 1Br A0C = 7zN.A0I(this);
    public final 1Br A0E = 1Bu.A02(this, 68066);

    /* JADX WARN: Multi-variable type inference failed */
    public C1562Alh() {
        1Br A00 = 1Bq.A00(83360);
        this.A0B = A00;
        this.A0G = ((C7P) 1Br.A0B(A00)).A01();
        this.A0F = new Cih(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f3, code lost:
    
        if (X.11T.A0O(r301.A09, r301.A05) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A03(X.C1562Alh r301) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1562Alh.A03(X.Alh):void");
    }

    public void A1E() {
        super.A1E();
        A03(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        int[] intArray;
        this.A08 = 1BM.A01(this);
        this.A00 = bundle != null ? bundle.getInt("selected_tab_index") : 0;
        this.A07 = bundle != null ? bundle.getBoolean("show_custom_picker") : false;
        this.A0A = requireArguments().getString("initial_emoji");
        int[] intArray2 = requireArguments().getIntArray("initial_gradient_colors");
        if (intArray2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A09 = 1BL.A0a(02L.A07(intArray2));
        if (bundle != null) {
            this.A06 = bundle.getString("selected_emoji");
            intArray = bundle.getIntArray("selected_gradient_colors");
        } else {
            this.A06 = requireArguments().getString("initial_emoji");
            intArray = requireArguments().getIntArray("initial_gradient_colors");
        }
        this.A05 = 1BL.A0a(intArray != null ? 02L.A07(intArray) : ImmutableList.of());
        Context requireContext = requireContext();
        BLC serializable = requireArguments().getSerializable("arg_creation_chat_type");
        11T.A0I(serializable, "null cannot be cast to non-null type com.facebook.messaging.communitymessaging.plugins.interfaces.channelimageediting.ChannelImageProviderInterfaceSpec.CreationChatType");
        RfB A00 = RfB.A00(requireContext, serializable, (ThreadSummary) null, false);
        AXh A02 = A00.A02();
        if (A02 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A03 = A02;
        boolean A08 = AbJ.A0Q(this.A0D).A08();
        RIf A03 = A00.A03();
        if (A08) {
            if (A03 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
        } else {
            if (A03 == null) {
                throw AnonymousClass001.A0L("Required value was null.");
            }
            A03 = new RIf(A03.A00, ((C7P) 1Br.A0B(this.A0B)).A00());
        }
        this.A04 = A03;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean Bkd() {
        return AbO.A0d(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-237428336);
        this.A02 = 7zR.A0M(this);
        FrameLayout A08 = AbJ.A08(this);
        A08.setClickable(true);
        A08.setImportantForAccessibility(2);
        LithoView lithoView = this.A02;
        if (lithoView == null) {
            AbF.A1G();
            throw 0Q8.createAndThrow();
        }
        A08.addView(lithoView);
        0FI.A08(91189692, A02);
        return A08;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_tab_index", this.A00);
        bundle.putBoolean("show_custom_picker", this.A07);
        bundle.putString("selected_emoji", this.A06);
        bundle.putIntArray("selected_gradient_colors", 0QD.A0n(this.A05));
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = 1vD.A00(view);
        C5fi.A01(view);
    }
}
