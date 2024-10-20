package com.facebook.messaging.msys.thread.reactions.reactors.fragment;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Iw;
import X.1Mu;
import X.2KE;
import X.2KK;
import X.74V;
import X.7zL;
import X.7zP;
import X.8Tl;
import X.8nV;
import X.A9B;
import X.AAD;
import X.AaQ;
import X.AaR;
import X.C0A8;
import X.C0ty;
import X.C1qo;
import X.C1rs;
import X.C53v;
import X.C5hr;
import X.C7W1;
import X.C8S7;
import X.C9f4;
import X.GXB;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultimap;
import java.util.BitSet;
import java.util.List;

/* loaded from: MessageReactorsFragment.class */
public final class MessageReactorsFragment extends SlidingSheetDialogFragment {
    public int A00;
    public LithoView A01;
    public MessageReactorsParams A02;
    public ThreadViewColorScheme A03;
    public 74V A04;
    public AaQ A05;
    public FbUserSession A08;
    public C9f4 A09;
    public GXB A0A;
    public ImmutableMultimap A06 = ImmutableListMultimap.A00();
    public List A07 = C0ty.A00;
    public final AaR A0C = new AAD(this);
    public final 1Br A0B = 1Bq.A00(67773);

    /* JADX WARN: Multi-variable type inference failed */
    public static final LithoView A05(MessageReactorsFragment messageReactorsFragment, 1Mu r302) {
        Window window;
        LithoView lithoView = messageReactorsFragment.A01;
        String str = "lithoView";
        if (lithoView != null) {
            1Iw r0 = lithoView.A09;
            11T.A0A(r0);
            str = "messageReactorsReactionsListItemCreator";
            if (messageReactorsFragment.A09 != null) {
                ImmutableList A00 = C9f4.A00(r302);
                Dialog dialog = ((0D2) messageReactorsFragment).A01;
                if (dialog != null && (window = dialog.getWindow()) != null) {
                    Context requireContext = messageReactorsFragment.requireContext();
                    int size = r302.size();
                    if (size < 4) {
                        size = 4;
                    }
                    int A002 = C0A8.A00(requireContext, 60.0f);
                    int A003 = (int) (C7W1.A00(requireContext) * 0.85d);
                    int i = A002 * (size + 2);
                    if (i > A003) {
                        i = A003;
                    }
                    window.setLayout(-1, i);
                }
                C8S7 c8s7 = new C8S7(r0, new 8nV());
                A9B a9b = new A9B(messageReactorsFragment);
                8nV r02 = c8s7.A01;
                r02.A05 = a9b;
                BitSet bitSet = c8s7.A02;
                bitSet.set(1);
                r02.A00 = messageReactorsFragment.A00;
                bitSet.set(3);
                AaQ aaQ = messageReactorsFragment.A05;
                if (aaQ == null) {
                    str = "dataHandler";
                } else {
                    r02.A07 = aaQ;
                    bitSet.set(2);
                    C9f4 c9f4 = messageReactorsFragment.A09;
                    if (c9f4 != null) {
                        r02.A06 = c9f4;
                        bitSet.set(4);
                        2KE r03 = 2KE.A0C;
                        int i2 = 2KK.A03(r03).textSizeResId;
                        C1qo c1qo = ((C1rs) c8s7).A02;
                        r02.A0A = Integer.valueOf(c1qo.A06(i2));
                        r02.A01 = 2KK.A04(r03).A00(messageReactorsFragment.requireContext());
                        r02.A0B = Integer.valueOf(c1qo.A06(2KK.A03(r03).textSizeResId));
                        r02.A02 = 2KK.A04(r03).A00(messageReactorsFragment.requireContext());
                        r02.A09 = A00;
                        bitSet.set(5);
                        8Tl A004 = C5hr.A00(r0);
                        ThreadViewColorScheme threadViewColorScheme = messageReactorsFragment.A03;
                        if (threadViewColorScheme == null) {
                            str = "threadColorScheme";
                        } else {
                            A004.A2Y(threadViewColorScheme.A0F);
                            8Tl.A08(A004);
                            r02.A04 = A004.A2W().A0l();
                            bitSet.set(0);
                            r02.A08 = messageReactorsFragment.A0C;
                            GXB gxb = messageReactorsFragment.A0A;
                            if (gxb != null) {
                                r02.A03 = gxb;
                                7zP.A15(c8s7, bitSet, c8s7.A03);
                                lithoView.A0y(r02);
                                return lithoView;
                            }
                            str = "onScrollListener";
                        }
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x056d, code lost:
    
        if (r308 == null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x061a, code lost:
    
        if (r308 == null) goto L232;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b4 A[Catch: Exception -> 0x0266, all -> 0x0280, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0266, blocks: (B:19:0x0133, B:20:0x0138, B:23:0x0144, B:26:0x014e, B:29:0x01b4, B:31:0x01c3, B:33:0x01c9, B:36:0x01d3, B:39:0x01df, B:42:0x01eb, B:45:0x01f7, B:46:0x01fe, B:47:0x0205, B:48:0x020c, B:50:0x0219, B:51:0x0220, B:52:0x0225, B:52:0x0225, B:55:0x0234, B:56:0x0239, B:61:0x022d, B:62:0x0158, B:67:0x01a3, B:67:0x01a3, B:69:0x01a8, B:70:0x0169, B:72:0x017b, B:80:0x019e, B:88:0x0251, B:90:0x025e, B:92:0x0265), top: B:18:0x0133, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r0v104, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r301v0, types: [com.facebook.messaging.msys.thread.reactions.reactors.fragment.MessageReactorsFragment, X.0D2, androidx.lifecycle.LifecycleOwner, androidx.fragment.app.Fragment, java.lang.Object, com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment] */
    @Override // com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.thread.reactions.reactors.fragment.MessageReactorsFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        int A02 = 0FI.A02(-1628675666);
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(7zL.A0D(0));
        }
        this.A01 = new LithoView(7zP.A0T(this));
        AaQ aaQ = this.A05;
        if (aaQ == null) {
            11T.A0L("dataHandler");
            throw 0Q8.createAndThrow();
        }
        LithoView A05 = A05(this, aaQ.B6B(this.A00));
        0FI.A08(1395312653, A02);
        return A05;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_SELECTED_TAB_INDEX", this.A00);
        Parcel obtain = Parcel.obtain();
        ImmutableMultimap immutableMultimap = this.A06;
        11T.A0D(obtain);
        1BL.A1F(immutableMultimap, obtain);
        C53v.A0G(obtain, immutableMultimap);
        bundle.putByteArray("ARG_UPDATED_REACTIONS_MAP", obtain.marshall());
        bundle.putParcelableArrayList("ARG_UPDATED_REACTION_COUNTS", 1BK.A17(this.A07));
    }
}
