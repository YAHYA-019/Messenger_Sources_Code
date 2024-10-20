package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.staggeredgrid.HorizontalStaggeredLayoutManager;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.msys.thread.aibot.nullstate.cardstack.layoutmanager.AiBotGroupedCardStackLayoutManager;
import com.facebook.messaging.msys.thread.aibot.nux.fragment.AiBotInterstitialNuxFragment;
import com.facebook.messaging.msys.thread.debug.MessageDebugMenuFragment;
import com.facebook.messaging.msys.thread.reactions.reactors.fragment.MessageReactorsFragment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: AQa.class */
public final class AQa extends C00q implements C00m {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQa(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C01i A00(Object obj, C03i c03i, int i) {
        return C01g.A00(c03i, new AQa(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v138, types: [androidx.fragment.app.Fragment, com.facebook.messaging.msys.thread.aibot.nux.fragment.AiBotInterstitialNuxFragment] */
    /* JADX WARN: Type inference failed for: r0v167, types: [com.facebook.messaging.msys.thread.debug.MessageDebugMenuFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v180, types: [com.facebook.messaging.msys.thread.debug.MessageDebugMenuFragment, androidx.fragment.app.Fragment] */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        2Xd r0;
        switch (this.A00) {
            case 0:
                7zL.A1R(this.A01);
                return 04S.A00;
            case 1:
                8CY r02 = ((9ON) this.A01).A00;
                if (r02 != null) {
                    r02.dismiss();
                    return 04S.A00;
                }
                str = "menuContainer";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case 2:
                8uP r03 = (8uP) this.A01;
                List list = C2lb.A0J;
                AiBotGroupedCardStackLayoutManager aiBotGroupedCardStackLayoutManager = r03.A00;
                aiBotGroupedCardStackLayoutManager.A00 = !aiBotGroupedCardStackLayoutManager.A00;
                aiBotGroupedCardStackLayoutManager.A0e();
                TextView textView = ((8E2) r03).A05;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = ((8E2) r03).A06;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                RecyclerView recyclerView = ((8E2) r03).A07;
                if (recyclerView != null && (r0 = recyclerView.A0C) != null) {
                    r0.A07();
                }
                RecyclerView recyclerView2 = ((8E2) r03).A07;
                if (recyclerView2 != null) {
                    recyclerView2.requestLayout();
                }
                return 04S.A00;
            case 3:
                return 7zO.A16(((C9cp) this.A01).A05);
            case 4:
                return ((C9cp) this.A01).A06.A00(68744);
            case 5:
                return new LKi(this.A01, 0);
            case 6:
                8Cf r04 = (8Cf) this.A01;
                float f = NestedScrollView.A0T;
                Context context = r04.getContext();
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2132279314);
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2132279321);
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it = new 07E(0, r04.A01).iterator();
                while (it.hasNext()) {
                    int i = 0;
                    if (7zL.A06(it) % 2 == 0) {
                        i = dimensionPixelSize2;
                    }
                    AnonymousClass001.A1J(A0s, i);
                }
                HorizontalStaggeredLayoutManager horizontalStaggeredLayoutManager = new HorizontalStaggeredLayoutManager(context, new C2634Gjm(A0s, dimensionPixelSize, dimensionPixelSize, 1), r04.A01, true, false);
                horizontalStaggeredLayoutManager.A09 = new C9Jz(r04);
                return horizontalStaggeredLayoutManager;
            case 7:
                return ((8Cf) this.A01).A0I.findViewById(2131363260);
            case 8:
                return ((8Cf) this.A01).A0I.findViewById(2131363259);
            case 9:
                return ((8Cf) this.A01).A0I.findViewById(2131363672);
            case 10:
                return ((8Cf) this.A01).A0I.findViewById(2131365713);
            case 11:
                return Integer.valueOf(C9dn.A00((Context) this.A01, 0S2.A0B));
            case 12:
                return Integer.valueOf(C9dn.A00((Context) this.A01, 0S2.A0E));
            case 13:
                return ((8Cf) this.A01).A0I.findViewById(2131367297);
            case 14:
                return ((8Cf) this.A01).A0I.findViewById(2131367705);
            case 15:
                return ((8Cf) this.A01).A0I.findViewById(2131368216);
            case 16:
            case 25:
            default:
                return this.A01;
            case 17:
            case 26:
                return 7zM.A1A(this.A01);
            case 18:
            case 27:
                return 7zS.A0D(this.A01);
            case 19:
                ?? r05 = (AiBotInterstitialNuxFragment) this.A01;
                Application A09 = 7zU.A09((Fragment) r05);
                11T.A0A(A09);
                2qR r06 = BaseMigBottomSheetDialogFragment.A06;
                return new 8DU(A09, 7zP.A0X(r05.A04), (C77c) 1Br.A0B(r05.A05));
            case 20:
                C6vu c6vu = (C6vu) this.A01;
                5Rm r07 = C6vu.A0g;
                6vY r08 = c6vu.A0P;
                r08.A00 = null;
                r08.A07.A01 = 7zL.A14((Object) null);
                return 04S.A00;
            case 21:
                6rL r09 = (6rL) this.A01;
                ImmutableSet immutableSet = 6rJ.A1N;
                Context context2 = r09.A01;
                06Z r010 = r09.A03;
                1pI A00 = 1vD.A00(r09.A02.requireView());
                83Z A0F = 1BK.A0F();
                if (A0F != null) {
                    A0F.A03(context2, r010, BOj.A07, A00, false);
                }
                return 04S.A00;
            case 22:
                return 2yD.A01(1Br.A07(((9Sh) this.A01).A01), 36316439577110674L);
            case 23:
                return 2yD.A01(1Br.A07(((9Sh) this.A01).A01), 36316439576127623L);
            case 24:
                ?? r011 = (MessageDebugMenuFragment) this.A01;
                Context requireContext = r011.requireContext();
                FbUserSession fbUserSession = r011.A01;
                if (fbUserSession != null) {
                    return new I3n(requireContext, fbUserSession);
                }
                str = "fbUserSession";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case 28:
                1Fv A0N = 7zQ.A0N();
                ?? r012 = (MessageDebugMenuFragment) this.A01;
                final 8yJ r013 = (8yJ) 7zN.A0n((Fragment) r012, A0N.A06((Fragment) r012), 68118);
                final Long l = r012.A03;
                final Bundle bundle = r012.A00;
                final I3n i3n = (I3n) r012.A04.getValue();
                return new ViewModelProvider.Factory(bundle, i3n, r013, l) { // from class: X.9r0
                    public final Bundle A00;
                    public final I3n A01;
                    public final 8yJ A02;
                    public final Long A03;

                    {
                        1BK.A1K(r013, 3, i3n);
                        this.A03 = l;
                        this.A00 = bundle;
                        this.A02 = r013;
                        this.A01 = i3n;
                    }

                    @Override // androidx.lifecycle.ViewModelProvider.Factory
                    public /* synthetic */ ViewModel create(0BZ r302, C1j9 c1j9) {
                        return ViewModelProvider.Factory.CC.$default$create(this, r302, c1j9);
                    }

                    @Override // androidx.lifecycle.ViewModelProvider.Factory
                    public ViewModel create(Class cls) {
                        Long l2 = this.A03;
                        return new 8DK(this.A00, this.A01, this.A02, l2);
                    }

                    @Override // androidx.lifecycle.ViewModelProvider.Factory
                    public /* synthetic */ ViewModel create(Class cls, C1j9 c1j9) {
                        return ViewModelProvider.Factory.CC.$default$create(this, cls, c1j9);
                    }
                };
            case 29:
                View view = (View) this.A01;
                view.setOnClickListener(null);
                view.setVisibility(8);
                return 04S.A00;
            case 30:
                return ((9W2) this.A01).A04.A00(67801);
            case 31:
                return ((9W2) this.A01).A04.A00(68700);
            case 32:
                ((7Ri) this.A01).A02(new 8LK((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L));
                return 04S.A00;
            case 33:
                MessageReactorsFragment messageReactorsFragment = (MessageReactorsFragment) this.A01;
                AaQ aaQ = messageReactorsFragment.A05;
                if (aaQ != null) {
                    aaQ.BYo(messageReactorsFragment.A00);
                    return 04S.A00;
                }
                str = "dataHandler";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case 34:
                C86t c86t = (C86t) this.A01;
                C06974ih c06974ih = C86t.A0Y;
                C1F6 c1f6 = (C1F6) 1Bu.A06(c86t.A00, 1080);
                boolean z = c86t.A0P;
                Function1 function1 = c86t.A0M;
                Context A002 = 1Bf.A00(c1f6);
                try {
                    87L r014 = new 87L(7zQ.A0S(c1f6), function1, z);
                    1Bn.A0K();
                    FbInjector.A04(A002);
                    return r014;
                } catch (Throwable th) {
                    1Bn.A0K();
                    FbInjector.A04(A002);
                    throw th;
                }
            case 35:
                C86t c86t2 = (C86t) this.A01;
                C06974ih c06974ih2 = C86t.A0Y;
                return 71X.A00(c86t2.A02, c86t2.A0N);
            case 36:
                C86t c86t3 = (C86t) this.A01;
                C06974ih c06974ih3 = C86t.A0Y;
                return new C86u(c86t3, c86t3.A0G);
            case 37:
                return ((6wV) this.A01).getText().toString();
            case 38:
                return Integer.valueOf(((6wV) this.A01).B9o().A01);
            case 39:
                return Integer.valueOf(((6wV) this.A01).B9o().A00);
            case 40:
                final C86e c86e = (C86e) this.A01;
                return new C99j() { // from class: X.86f
                };
            case 41:
                return 7zU.A0f(C1u3.A0U, (C1u2) this.A01);
            case 42:
                2qR r015 = 6tM.A01;
                return 6zN.A00(((8cA) this.A01).A01);
            case 43:
                C6pe c6pe = new C6pe();
                c6pe.A02(((C8ay) this.A01).A02.B9Q());
                return c6pe.A01();
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                C6pe c6pe2 = new C6pe();
                c6pe2.A02(((C8ay) this.A01).A02.B4i());
                return c6pe2.A01();
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return new LBI(((C2k5) this.A01).A05);
            case 46:
                return new 75E(7zU.A0A(this.A01)).Aeg(5vH.A05, true);
            case ActionId.ON_START_END /* 47 */:
            case ActionId.QUEUED /* 48 */:
                return 7zQ.A0N().A06((Fragment) this.A01);
        }
    }
}
