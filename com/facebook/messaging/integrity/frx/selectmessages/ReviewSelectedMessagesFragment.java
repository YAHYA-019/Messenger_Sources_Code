package com.facebook.messaging.integrity.frx.selectmessages;

import X.0D2;
import X.0FI;
import X.0NA;
import X.1BL;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1Hv;
import X.1iF;
import X.1tC;
import X.2S3;
import X.2S4;
import X.2Sh;
import X.5Hr;
import X.6Hk;
import X.7zL;
import X.7zP;
import X.8Sm;
import X.9ZS;
import X.AbF;
import X.AbL;
import X.AbM;
import X.AbN;
import X.AbR;
import X.AuE;
import X.B5L;
import X.C00i;
import X.C0o;
import X.C1995Ayo;
import X.C4f;
import X.C62;
import X.C6tg;
import X.C8nz;
import X.CZD;
import X.Clj;
import X.QAk;
import X.QLR;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Layout;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.fullscreendialog.FullScreenDialogFragment;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: ReviewSelectedMessagesFragment.class */
public class ReviewSelectedMessagesFragment extends FullScreenDialogFragment {
    public FbUserSession A00;
    public AbR A01;
    public C00i A02;
    public LithoView A03;
    public B5L A04;
    public C62 A05;
    public C0o A06;
    public C00i A07;
    public final 2S4 A08 = new 2S3(this, "ReviewSelectedMessagesFragment");

    public 1iF A17() {
        return AbF.A0C(876431843082365L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1C() {
        LithoView lithoView = this.A03;
        8Sm A00 = C8nz.A00(this.A05.A01.A01);
        A00.A2X(2131965640);
        C8nz c8nz = A00.A01;
        c8nz.A04 = false;
        c8nz.A03 = null;
        c8nz.A01 = Layout.Alignment.ALIGN_NORMAL;
        c8nz.A00 = A00.A02.A04(AbN.A0T(requireArguments()).B4j());
        lithoView.A0x(A00.A2W());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1D(MessagesCollection messagesCollection, ThreadSummary threadSummary, boolean z) {
        LithoView lithoView = this.A03;
        AbR abR = this.A01;
        Context requireContext = requireContext();
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            9ZS r0 = new 9ZS(requireContext, messagesCollection, threadSummary);
            1Bn.A0K();
            FbInjector.A04(A01);
            Capabilities A02 = threadSummary != null ? ((5Hr) this.A02.get()).A02(getContext(), this.A00, threadSummary, (User) null, (2Sh) null) : 5Hr.A06;
            AuE auE = new AuE(this.A03.A09, new C1995Ayo());
            C1995Ayo c1995Ayo = auE.A01;
            c1995Ayo.A0A = z;
            BitSet bitSet = auE.A02;
            bitSet.set(5);
            c1995Ayo.A05 = this.A05;
            bitSet.set(6);
            c1995Ayo.A08 = AbN.A0T(requireArguments());
            bitSet.set(2);
            c1995Ayo.A04 = this.A00;
            bitSet.set(3);
            c1995Ayo.A06 = r0;
            bitSet.set(9);
            c1995Ayo.A00 = CZD.A00(this, ActionId.VIEW_DID_LOAD_BEGIN);
            bitSet.set(7);
            c1995Ayo.A01 = CZD.A00(this, ActionId.VIEW_WILL_APPEAR_BEGIN);
            bitSet.set(8);
            c1995Ayo.A07 = threadSummary;
            bitSet.set(10);
            c1995Ayo.A09 = A02;
            bitSet.set(0);
            c1995Ayo.A03 = this.mFragmentManager;
            bitSet.set(4);
            c1995Ayo.A02 = getChildFragmentManager();
            bitSet.set(1);
            7zP.A1A(auE, bitSet, auE.A03);
            lithoView.A0x(c1995Ayo);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.A04.A05();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.fullscreendialog.FullScreenDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-477771460);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        ContextThemeWrapper A06 = 0NA.A06(requireContext, 2130972036, 2132607937);
        FbUserSession A0G = 1BL.A0G(this);
        this.A00 = A0G;
        this.A04 = (B5L) 1Bn.A0E(requireContext, (1BY) null, 84923);
        this.A07 = 1BV.A00(16838);
        this.A01 = (AbR) 1Bn.A0A(939);
        this.A02 = 1BV.A00(67674);
        B5L b5l = this.A04;
        ((6Hk) b5l).A00 = this;
        b5l.A03 = this.A06;
        C62 A0W = AbF.A0O(requireContext, 940).A0W(A0G, this.A08, false);
        this.A05 = A0W;
        A0W.A00(A06, getChildFragmentManager());
        0FI.A08(-1579666233, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        int A02 = 0FI.A02(1848704092);
        C6tg c6tg = this.A05.A01;
        QAk A00 = QLR.A00(c6tg.A01);
        A00.A0J();
        LithoView A03 = c6tg.A03(A00.A01);
        this.A03 = A03;
        MigColorScheme.A00(A03, AbN.A0T(requireArguments()));
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            ((1tC) this.A07.get()).A03(window, AbN.A0T(requireArguments()));
        }
        LithoView lithoView = this.A03;
        0FI.A08(1592828904, A02);
        return lithoView;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(2046995425);
        super.onDestroy();
        this.A04.A04();
        0FI.A08(-1350710331, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSaveInstanceState(Bundle bundle) {
        super/*X.0D2*/.onSaveInstanceState(bundle);
        B5L b5l = this.A04;
        C4f c4f = (C4f) 1Hv.A02(requireContext(), 84542);
        String str = c4f.A02;
        if (str != null) {
            bundle.putString("arg_first_message_id", str);
        }
        int i = c4f.A00;
        if (i > 0) {
            bundle.putInt("arg_message_count", i);
        }
        FRXParams fRXParams = b5l.A01;
        ArrayList<String> arrayList = b5l.A07;
        String str2 = b5l.A06;
        bundle.putParcelable("frx_params_key", fRXParams);
        bundle.putStringArrayList("selected_message_ids_params_key", arrayList);
        bundle.putString("prompt_token_id_key", str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        B5L b5l = this.A04;
        if (bundle == null) {
            bundle = this.mArguments;
        }
        Context requireContext = requireContext();
        if (((6Hk) b5l).A00 != null) {
            b5l.A01 = (FRXParams) bundle.getParcelable("frx_params_key");
            b5l.A07 = bundle.getStringArrayList("selected_message_ids_params_key");
            b5l.A06 = bundle.getString("prompt_token_id_key");
            FRXParams fRXParams = b5l.A01;
            if (fRXParams == null || b5l.A07 == null) {
                7zL.A1Q(AbM.A0q(b5l));
                return;
            }
            ThreadKey threadKey = fRXParams.A04;
            ThreadSummary threadSummary = fRXParams.A05;
            b5l.A04 = threadSummary;
            UserKey userKey = fRXParams.A08;
            b5l.A05 = userKey != null ? userKey.id : null;
            if (threadKey == null || threadSummary == null) {
                ((ReviewSelectedMessagesFragment) AbM.A0q(b5l)).A1C();
                return;
            }
            C4f c4f = (C4f) 1Hv.A02(requireContext, 84542);
            String string = bundle.getString("arg_first_message_id", null);
            if (string != null) {
                c4f.A02 = string;
            }
            int i = bundle.getInt("arg_message_count", 0);
            if (i > 0) {
                c4f.A00 = i;
            }
            c4f.A00(new Clj(b5l, threadKey, b5l.A04), threadKey);
        }
    }
}
