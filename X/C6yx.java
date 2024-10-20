package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6yx, reason: invalid class name */
/* loaded from: 6yx.class */
public final class C6yx extends 1pK implements 2Of, 2Og, 2Oi {
    public static final String __redex_internal_original_name = "PinnedMessagesListViewFragment";
    public DIi actionBarTitleDelegate;
    public 1pI contentViewManager;
    public LithoView lithoView;
    public AZo pinnedMessageRepository;
    public DHb threadActionHandler;
    public final 2S3 threadViewSurface = new 2S3(this, __redex_internal_original_name);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(FbUserSession fbUserSession, 1Iw r302, ThreadKey threadKey, final C6yx c6yx, C5j5 c5j5, MigColorScheme migColorScheme, C79j c79j, Integer num, List list) {
        LithoView lithoView = c6yx.lithoView;
        if (lithoView == null) {
            11T.A0L("lithoView");
            throw 0Q8.createAndThrow();
        }
        2qR r0 = 8hX.A0C;
        06Z childFragmentManager = c6yx.getChildFragmentManager();
        11T.A0A(childFragmentManager);
        final int i = 1;
        lithoView.A0y(new 8hX(c6yx, childFragmentManager, fbUserSession, r302, threadKey, c5j5, c6yx.threadActionHandler, migColorScheme, new C5xv(c6yx, i) { // from class: X.9zh
            public final int A00;
            public final Object A01;

            {
                this.A00 = i;
                this.A01 = c6yx;
            }

            @Override // X.C5xv
            public void CSR() {
                int i2 = this.A00;
                Object obj = this.A01;
                if (i2 == 0) {
                    6Nz r02 = (6Nz) obj;
                    2KE r03 = 6Nz.A0b;
                    Iterator it = r02.A0X.iterator();
                    while (it.hasNext()) {
                        ((AaW) it.next()).CSS();
                    }
                    return;
                }
                C6yx c6yx2 = (C6yx) obj;
                1pI r04 = c6yx2.contentViewManager;
                if (r04 != null) {
                    if (!r04.BVa()) {
                        return;
                    }
                    1pI r05 = c6yx2.contentViewManager;
                    if (r05 != null) {
                        r05.CeH(C6yx.__redex_internal_original_name);
                        return;
                    }
                }
                11T.A0L("contentViewManager");
                throw 0Q8.createAndThrow();
            }
        }, c79j, num, list));
    }

    public 1iF A1R() {
        return new 1iF(557220298628848L);
    }

    public void AQN(6Sh r302) {
    }

    public int BBX() {
        return 0;
    }

    public boolean BTe() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public 06Z BdK() {
        if (isAdded()) {
            return getChildFragmentManager();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1207443863);
        LithoView lithoView = new LithoView(requireContext());
        lithoView.setId(2131368468);
        this.lithoView = lithoView;
        lithoView.setOnTouchListener(new View.OnTouchListener() { // from class: X.7uu
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        LithoView lithoView2 = this.lithoView;
        if (lithoView2 == null) {
            11T.A0L("lithoView");
            throw 0Q8.createAndThrow();
        }
        0FI.A08(1947619798, A02);
        return lithoView2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-784952970);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        LithoView lithoView = this.lithoView;
        if (lithoView == null) {
            11T.A0L("lithoView");
            throw 0Q8.createAndThrow();
        }
        lithoView.A0z(null);
        0FI.A08(1942992900, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(-1299611586);
        super/*androidx.fragment.app.Fragment*/.onStart();
        DIi dIi = this.actionBarTitleDelegate;
        if (dIi != null) {
            dIi.Cgk(2131963353);
        }
        0FI.A08(-1424794199, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, X.6tF] */
    public void onViewCreated(View view, Bundle bundle) {
        Parcelable parcelable;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.contentViewManager = 1vD.A00(view);
        C6vt c6vt = (C6vt) 1Bn.A0A(66607);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (parcelable = bundle2.getParcelable("thread_key")) == null) {
            throw 1BK.A0h();
        }
        ThreadKey threadKey = (ThreadKey) parcelable;
        FbUserSession A06 = ((1Fv) 1Bi.A03(66351)).A06(this);
        C5j5 A00 = ((C1rd) 1Lm.A05(requireContext(), A06, 66634)).A00(threadKey);
        1Bn.A0A(147663);
        this.pinnedMessageRepository = (AZo) (threadKey.A0z() ? new A8X(requireContext(), new 9ZU(requireContext(), A06, threadKey, A00), threadKey.A01, threadKey.A03) : new Object());
        1Iw A002 = 6tK.A00(requireContext());
        C6rj c6rj = new C6rj();
        6vP r0 = new 6vP(c6rj.A04, 0);
        Context requireContext = requireContext();
        ?? obj = new Object();
        2S3 r02 = this.threadViewSurface;
        C7w7 c7w7 = new 1Va() { // from class: X.7w7
            public final void CZm(1Q5 r302) {
            }
        };
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        C79j A003 = c6vt.A00(requireContext, A06, this, r02, threadKey, null, null, A00, this, this, c7w7, C1zz.A02(), c6rj, obj, this, r0, null);
        MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0E(requireContext(), (1BY) null, 16979);
        A03(A06, A002, threadKey, this, A00, migColorScheme, A003, 0S2.A01, C0ty.A00);
        9V3 r03 = new 9V3(A06, A002, threadKey, this, A00, migColorScheme, A003);
        AZo aZo = this.pinnedMessageRepository;
        if (aZo == null) {
            11T.A0L("pinnedMessageRepository");
            throw 0Q8.createAndThrow();
        }
        aZo.AO2(getViewLifecycleOwner(), A06, r03);
    }
}
