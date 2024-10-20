package com.facebook.messaging.wellbeing.selfremediation.block.user;

import X.0D2;
import X.0FI;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1PA;
import X.1iF;
import X.1tC;
import X.2Vg;
import X.4YV;
import X.7zN;
import X.9fJ;
import X.AZO;
import X.AbF;
import X.AbJ;
import X.AbK;
import X.AbL;
import X.AbN;
import X.AbR;
import X.AnonymousClass001;
import X.BBk;
import X.BBl;
import X.BNJ;
import X.BNT;
import X.BOM;
import X.BOp;
import X.BWj;
import X.Bib;
import X.C00i;
import X.C1F6;
import X.C1pq;
import X.C26;
import X.C8s;
import X.CIf;
import X.CJj;
import X.CNj;
import X.COw;
import X.CQX;
import X.CQn;
import X.Cfp;
import X.Cln;
import X.D0U;
import X.DG4;
import X.DGC;
import X.DHc;
import X.DHj;
import X.DIi;
import X.JZj;
import X.LQx;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.integrity.frx.upsellafterblock.UpsellAfterBlockBottomSheetFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.HashSet;

/* loaded from: BlockUserFragment.class */
public class BlockUserFragment extends SlidingSheetFullScreenDialogFragment implements DG4 {
    public FbUserSession A00;
    public LithoView A01;
    public CIf A02;
    public COw A03;
    public DIi A04;
    public DHc A05;
    public DHj A06;
    public DGC A07;
    public CQn A08;
    public MigColorScheme A09;
    public final C00i A0G = AbF.A0S(this, 405);
    public final C00i A0F = 1BV.A00(404);
    public final C00i A0A = AbF.A0S(this, 68120);
    public final C00i A0B = AbF.A0S(this, 68427);
    public final C00i A0D = 1BQ.A02(16705);
    public final C00i A0H = 1BV.A00(147628);
    public final C00i A0C = 1BQ.A02(66347);
    public final AZO A0E = new Cln(this);

    /* JADX WARN: Type inference failed for: r0v21, types: [com.facebook.messaging.wellbeing.selfremediation.block.user.BlockUserFragment, androidx.fragment.app.Fragment] */
    public static BlockUserFragment A05(ThreadSummary threadSummary, BNT bnt, MigColorScheme migColorScheme, User user) {
        Bundle A05 = 1BK.A05();
        HashSet A0v = AnonymousClass001.A0v();
        UserKey userKey = user.A0k;
        C1pq.A08("userKey", userKey);
        Name name = user.A0X;
        String A02 = name.A02();
        C1pq.A08("userName", A02);
        String A00 = name.A00();
        C1pq.A08("userDisplayOrFullName", A00);
        A05.putParcelable("saved_presenter_state", new BlockUserPersistingState(null, threadSummary, bnt, null, userKey, null, A00, A02, C1pq.A07(bnt, "entryPoint", A0v, A0v), true, false, false));
        A05.putParcelable("color_scheme", migColorScheme);
        ?? blockUserFragment = new BlockUserFragment();
        blockUserFragment.setArguments(A05);
        return blockUserFragment;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [com.facebook.messaging.wellbeing.selfremediation.block.user.BlockUserFragment, androidx.fragment.app.Fragment] */
    public static BlockUserFragment A06(BNT bnt, BNJ bnj, User user) {
        Bundle A05 = 1BK.A05();
        HashSet A0v = AnonymousClass001.A0v();
        UserKey userKey = user.A0k;
        C1pq.A08("userKey", userKey);
        Name name = user.A0X;
        String A02 = name.A02();
        C1pq.A08("userName", A02);
        String A00 = name.A00();
        C1pq.A08("userDisplayOrFullName", A00);
        HashSet A07 = C1pq.A07(bnt, "entryPoint", A0v, A0v);
        C1pq.A08(Property.SYMBOL_Z_ORDER_SOURCE, bnj);
        A05.putParcelable("saved_presenter_state", new BlockUserPersistingState(null, null, bnt, bnj, userKey, null, A00, A02, 4YV.A10(Property.SYMBOL_Z_ORDER_SOURCE, A07), true, false, false));
        ?? blockUserFragment = new BlockUserFragment();
        blockUserFragment.setArguments(A05);
        return blockUserFragment;
    }

    public void A0p() {
        JZj jZj;
        super/*X.0D2*/.A0p();
        COw cOw = this.A03;
        if (cOw == null || (jZj = cOw.A00) == null) {
            return;
        }
        jZj.dismiss();
    }

    public 1iF A17() {
        return AbN.A0B();
    }

    @Override // X.DG4
    public void ClX(DIi dIi) {
        this.A04 = dIi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        if (fragment instanceof UpsellAfterBlockBottomSheetFragment) {
            AZO azo = this.A0E;
            11T.A0F(azo, 0);
            ((UpsellAfterBlockBottomSheetFragment) fragment).A00 = azo;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment, com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public void onCreate(Bundle bundle) {
        ThreadSummary threadSummary;
        int A02 = 0FI.A02(54183436);
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = this.mArguments;
        }
        BlockUserPersistingState blockUserPersistingState = (BlockUserPersistingState) bundle.getParcelable("saved_presenter_state");
        this.A00 = 1BL.A0G(this);
        MigColorScheme migColorScheme = (MigColorScheme) requireArguments().getParcelable("color_scheme");
        if (migColorScheme == null) {
            migColorScheme = (blockUserPersistingState == null || (threadSummary = blockUserPersistingState.A01) == null) ? AbK.A0h(this) : BWj.A00(getContext(), threadSummary.A0n, threadSummary);
        }
        this.A09 = migColorScheme;
        C1F6 A0P = AbF.A0P(this.A0G);
        MigColorScheme migColorScheme2 = this.A09;
        FbUserSession fbUserSession = this.A00;
        Context A01 = FbInjector.A01();
        AbL.A0y(A0P);
        try {
            CQn cQn = new CQn(fbUserSession, A0P, migColorScheme2);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A08 = cQn;
            AbR abR = (AbR) this.A0F.get();
            MigColorScheme migColorScheme3 = this.A09;
            A01 = FbInjector.A01();
            AbL.A0y(abR);
            COw cOw = new COw(migColorScheme3);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A03 = cOw;
            CQn cQn2 = this.A08;
            blockUserPersistingState.getClass();
            cQn2.A06 = blockUserPersistingState;
            1Bn.A0E((Context) null, cQn2.A04, 82656);
            BlockUserPersistingState blockUserPersistingState2 = cQn2.A06;
            BOM bom = blockUserPersistingState2.A00;
            if (bom == null) {
                bom = CJj.A01(blockUserPersistingState2.A01);
            }
            cQn2.A01 = bom;
            this.A0H.get();
            CIf cIf = new CIf(requireContext(), getChildFragmentManager(), this.A05);
            this.A02 = cIf;
            ThreadSummary threadSummary2 = blockUserPersistingState.A01;
            if (threadSummary2 != null) {
                cIf.A01 = threadSummary2;
            }
            Context requireContext = requireContext();
            1Bn.A0A(33208);
            2Vg r0 = new 2Vg(requireContext, this.A00);
            r0.A01.A00((ThreadKey) null, "BLOCK_USER").observe(this, new LQx(new C26(this), r0, 4));
            0FI.A08(-565649197, A02);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        int A02 = 0FI.A02(-1684593380);
        LithoView A0O = AbK.A0O(this);
        this.A01 = A0O;
        MigColorScheme.A00(A0O, this.A09);
        1tC r0 = (1tC) 1Bn.A0A(16838);
        Dialog dialog = ((0D2) this).A01;
        if (dialog == null) {
            if (A1B()) {
                window = A16().getWindow();
            }
            LithoView lithoView = this.A01;
            0FI.A08(949120356, A02);
            return lithoView;
        }
        window = dialog.getWindow();
        r0.A03(window, this.A09);
        LithoView lithoView2 = this.A01;
        0FI.A08(949120356, A02);
        return lithoView2;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-378965523);
        super.onDestroyView();
        this.A01 = null;
        0FI.A08(480353171, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super/*X.0D2*/.onDismiss(dialogInterface);
        DGC dgc = this.A07;
        if (dgc != null) {
            dgc.BuJ();
        }
        ((C8s) 1Bi.A03(82595)).A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-479788962);
        super/*androidx.fragment.app.Fragment*/.onResume();
        Fragment fragment = this.mParentFragment;
        if (fragment != null && fragment.isHidden()) {
            A0p();
        }
        CQn cQn = this.A08;
        boolean z = ((0D2) this).A07;
        BlockUserPersistingState blockUserPersistingState = cQn.A06;
        blockUserPersistingState.getClass();
        BNT bnt = blockUserPersistingState.A02;
        ImmutableList immutableList = blockUserPersistingState.A05;
        boolean z2 = blockUserPersistingState.A09;
        boolean z3 = blockUserPersistingState.A0B;
        BNJ bnj = blockUserPersistingState.A03;
        BOM bom = blockUserPersistingState.A00;
        ThreadSummary threadSummary = blockUserPersistingState.A01;
        String str = blockUserPersistingState.A06;
        UserKey userKey = blockUserPersistingState.A04;
        String str2 = blockUserPersistingState.A07;
        HashSet A1E = AbF.A1E(blockUserPersistingState.A08);
        if (cQn.A06.A09) {
            z2 = false;
            new BlockUserPersistingState(bom, threadSummary, bnt, bnj, userKey, immutableList, str, str2, A1E, false, z, z3);
            CQX cqx = (CQX) cQn.A0I.get();
            ThreadKey A00 = CQn.A00(cQn);
            BlockUserPersistingState blockUserPersistingState2 = cQn.A06;
            String str3 = blockUserPersistingState2.A04.id;
            BNT A002 = blockUserPersistingState2.A00();
            BOM bom2 = cQn.A01;
            BNJ A01 = blockUserPersistingState2.A01();
            ThreadSummary threadSummary2 = blockUserPersistingState2.A01;
            cqx.A0E(bom2, A00, A002, A01, threadSummary2 == null ? null : threadSummary2.A1e, str3);
        }
        cQn.A06 = new BlockUserPersistingState(bom, threadSummary, bnt, bnj, userKey, immutableList, str, str2, A1E, z2, z, z3);
        CQn.A08(cQn, (ImmutableMap) null);
        0FI.A08(1863804613, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putParcelable("saved_presenter_state", this.A08.A06);
    }

    public void onStart() {
        String str;
        int A02 = 0FI.A02(687025141);
        super/*X.0D2*/.onStart();
        CQn cQn = this.A08;
        cQn.A05 = this;
        9fJ A01 = CQn.A01(cQn);
        BOp A012 = cQn.A06.A00().A01();
        ThreadKey A00 = CQn.A00(cQn);
        if (A01.A00 != 0) {
            4YV.A0Z(A01.A01).flowEndCancel(A01.A00, CancelReason.SYSTEM_CANCELLED);
        }
        C00i c00i = A01.A01.A00;
        A01.A00 = 7zN.A0c(c00i).generateNewFlowId(759436107);
        7zN.A0c(c00i).flowStartIfNotOngoing(A01.A00, new UserFlowConfig(A012.toString(), false));
        if (A00 != null) {
            if (!A00.A12()) {
                str = A00.A1N() ? "OPEN" : "ENCRYPTED";
            }
            7zN.A0c(c00i).flowAnnotate(A01.A00, "thread_type", str);
        }
        BBk bBk = (CNj) cQn.A0E.get();
        Bib bib = new Bib(cQn);
        if (!(bBk instanceof BBl)) {
            ((Cfp) 1Br.A0B(bBk.A05)).A00 = bib;
        }
        cQn.A0C.get();
        1PA r306 = cQn.A03;
        if (r306 == null) {
            r306 = D0U.A00(AbJ.A0B(cQn.A0D.get()), cQn, 31);
            cQn.A03 = r306;
        }
        r306.A00();
        0FI.A08(-41328076, A02);
    }

    public void onStop() {
        int A02 = 0FI.A02(-1262242704);
        super/*X.0D2*/.onStop();
        CQn cQn = this.A08;
        cQn.A05 = null;
        9fJ A01 = CQn.A01(cQn);
        4YV.A0Z(A01.A01).flowEndCancel(A01.A00, CancelReason.USER_CANCELLED);
        BBk bBk = (CNj) cQn.A0E.get();
        if (!(bBk instanceof BBl)) {
            ((Cfp) 1Br.A0B(bBk.A05)).A00 = null;
        }
        cQn.A0C.get();
        1PA r0 = cQn.A03;
        if (r0 != null) {
            r0.A01();
        }
        JZj jZj = this.A03.A00;
        if (jZj != null) {
            jZj.dismiss();
        }
        0FI.A08(1624046633, A02);
    }
}
