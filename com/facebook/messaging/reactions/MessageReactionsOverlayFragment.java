package com.facebook.messaging.reactions;

import X.0D2;
import X.0FI;
import X.0S2;
import X.0fH;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1EZ;
import X.1Kd;
import X.1Lo;
import X.1XU;
import X.1YC;
import X.1hM;
import X.1iF;
import X.1tC;
import X.2Dp;
import X.2FP;
import X.2FR;
import X.2FT;
import X.2Ov;
import X.47H;
import X.5Gk;
import X.5zD;
import X.60U;
import X.65U;
import X.6Gp;
import X.6KV;
import X.6QF;
import X.6RX;
import X.6nC;
import X.6qY;
import X.7Y0;
import X.7lR;
import X.7sO;
import X.82O;
import X.ABb;
import X.ABo;
import X.AeX;
import X.AnonymousClass001;
import X.AnonymousClass491;
import X.AnonymousClass622;
import X.C00i;
import X.C1Y6;
import X.C2rw;
import X.C30x;
import X.C3o5;
import X.C5a8;
import X.C5ye;
import X.C62i;
import X.C7te;
import X.C7yl;
import X.GS9;
import X.Gzv;
import X.H0V;
import X.Im0;
import X.Imn;
import X.L7q;
import X.LEz;
import X.Mme;
import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.litho.LithoView;
import com.facebook.messaging.attachments.VideoAttachmentData;
import com.facebook.messaging.dialog.MenuDialogParams;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessageReactions;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.reactions.model.ReactionsSet;
import com.facebook.messaging.reactions.plugins.reactionsactionsdrawer.contextmenu.ReactionsContextMenuPresenter;
import com.facebook.messaging.reactions.plugins.reactionsactionsdrawer.themed.ThemedReactionsActionDrawerPresenter;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.reactions.multi.model.MessageReactionsCount;
import com.google.common.base.Functions$ConstantFunction;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: MessageReactionsOverlayFragment.class */
public class MessageReactionsOverlayFragment extends 2Ov implements 6RX, CallerContextable {
    public static Capabilities A0f;
    public static final CallerContext A0g = CallerContext.A06(MessageReactionsOverlayFragment.class);
    public FbUserSession A01;
    public C00i A02;
    public 5zD A03;
    public 6Gp A04;
    public MenuDialogParams A05;
    public Message A06;
    public ThreadSummary A07;
    public C7yl A08;
    public MessageReactionsOverlayView A09;
    public 7Y0 A0A;
    public C7te A0C;
    public AnonymousClass622 A0D;
    public Integer A0G;
    public boolean A0H;
    public 6KV A0I;
    public C62i A0J;
    public C5a8 A0K;
    public 65U A0L;
    public boolean A0M;
    public boolean A0N;
    public float[] A0O;
    public 2Dp[] A0Q;
    public final C00i A0R = new 1BV(this, 50095);
    public final C00i A0V = new 1BV(this, 115451);
    public final C00i A0T = new 1BQ(67661);
    public final C00i A0b = new 1BQ(114701);
    public final C00i A0S = new 1BV(this, 33031);
    public final C00i A0W = new 1BV(50212);
    public final C00i A0U = new 1BV(147580);
    public final Mme A0e = (Mme) 1Bi.A03(148131);
    public final C00i A0X = new 1BQ(68025);
    public final C00i A0c = new 1BV(65571);
    public final C00i A0d = new 1BV(115217);
    public final C00i A0Y = new 1BQ(100038);
    public final C00i A0Z = new 1BQ(67773);
    public final C00i A0a = new 1BQ(68526);
    public Boolean A0E = false;
    public Boolean A0F = false;
    public int A00 = -1;
    public int[] A0P = new int[2];
    public ReactionsSet A0B = new ReactionsSet();

    /* JADX WARN: Type inference failed for: r0v17, types: [com.facebook.messaging.reactions.MessageReactionsOverlayFragment, androidx.fragment.app.Fragment] */
    public static MessageReactionsOverlayFragment A05(VideoAttachmentData videoAttachmentData, 5zD r302, MenuDialogParams menuDialogParams, ThreadSummary threadSummary, AnonymousClass622 anonymousClass622, Capabilities capabilities, Integer num, float[] fArr, int[] iArr, boolean z) {
        ArrayList<? extends Parcelable> arrayList;
        Uri uri;
        A0f = capabilities;
        if (videoAttachmentData != null) {
            arrayList = AnonymousClass001.A0t(2);
            MediaResource mediaResource = videoAttachmentData.A0I;
            if (mediaResource != null && (uri = mediaResource.A0D) != null) {
                arrayList.add(uri);
            }
            Uri uri2 = videoAttachmentData.A0F;
            if (uri2 != null) {
                arrayList.add(uri2);
            }
            if (videoAttachmentData.A0J == null && arrayList.isEmpty()) {
                throw AnonymousClass001.A0L("Attempting to open the reactions overlay for a video with no thumbnail uri data.");
            }
        } else {
            arrayList = null;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("message", anonymousClass622.A03);
        bundle.putIntArray("message_location", iArr);
        if (arrayList != null) {
            bundle.putParcelableArrayList("video_data", arrayList);
        }
        if (menuDialogParams != null) {
            bundle.putParcelable("menu_params", menuDialogParams);
        }
        bundle.putFloatArray("x_position", fArr);
        bundle.putBoolean("should_hide_active_content", z);
        bundle.putString("show_option", 7lR.A00(num));
        ?? messageReactionsOverlayFragment = new MessageReactionsOverlayFragment();
        messageReactionsOverlayFragment.setArguments(bundle);
        messageReactionsOverlayFragment.A03 = r302;
        messageReactionsOverlayFragment.A07 = threadSummary;
        return messageReactionsOverlayFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A06(MessageReactionsOverlayFragment messageReactionsOverlayFragment) {
        MigColorScheme Axg;
        Dialog dialog = ((0D2) messageReactionsOverlayFragment).A01;
        if (dialog == null || dialog.getWindow() == null) {
            return;
        }
        Window window = ((0D2) messageReactionsOverlayFragment).A01.getWindow();
        Context context = messageReactionsOverlayFragment.getContext();
        if (1XU.A00(context) || C2rw.A00(context)) {
            1Bn.A0A(16838);
            1tC.A00(window, 0);
            return;
        }
        5zD r0 = messageReactionsOverlayFragment.A03;
        if (r0 == null || (Axg = r0.Axg()) == null) {
            return;
        }
        1Bn.A0A(66207);
        int A00 = C5ye.A00(Axg, messageReactionsOverlayFragment.A03.BEz());
        int AjC = Axg.AjC();
        1Bn.A0A(16838);
        if (messageReactionsOverlayFragment.A0N) {
            AjC = A00;
        }
        1tC.A01(window, A00, AjC);
    }

    public static void A07(MessageReactionsOverlayFragment messageReactionsOverlayFragment, String str, String str2) {
        ParticipantInfo participantInfo;
        Message message = messageReactionsOverlayFragment.A06;
        if (message == null || (participantInfo = message.A0K) == null) {
            return;
        }
        7Y0 r0 = messageReactionsOverlayFragment.A0A;
        String A00 = participantInfo.A00();
        ThreadSummary threadSummary = messageReactionsOverlayFragment.A07;
        r0.A01(message, threadSummary != null ? Integer.valueOf(threadSummary.A1L.size()) : null, str, str2, (String) null, (String) null, A00, (Map) null);
    }

    public static void A08(MessageReactionsOverlayFragment messageReactionsOverlayFragment, boolean z) {
        int andIncrement;
        String str;
        ViewPropertyAnimator duration;
        Animator.AnimatorListener animatorListener;
        C7yl c7yl = messageReactionsOverlayFragment.A08;
        if (c7yl != null) {
            c7yl.BuI();
        }
        MessageReactionsOverlayView messageReactionsOverlayView = messageReactionsOverlayFragment.A09;
        if (messageReactionsOverlayView == null || !z) {
            messageReactionsOverlayFragment.A0p();
            return;
        }
        GS9 gs9 = new GS9(messageReactionsOverlayFragment, 0);
        for (Gzv gzv : messageReactionsOverlayView.A06.A0j) {
            gzv.A0D = false;
            5Gk r0 = gzv.A08;
            if (r0 != null) {
                r0.pause();
            }
        }
        if (messageReactionsOverlayView.A00 == null) {
            gs9.onAnimationCancel(null);
            return;
        }
        7sO r02 = messageReactionsOverlayView.A08;
        if (r02 != null) {
            long j = messageReactionsOverlayView.A0C ? 50 : 300L;
            L7q l7q = r02.A00.A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement2 = atomicInteger.getAndIncrement();
            1YC r03 = l7q.A04;
            r03.A08("com.facebook.messaging.reactions.plugins.interfaces.reactionsactionsdrawer.ReactionsActionsDrawerPresenterSpec", "messaging.reactions.reactionsactionsdrawer.ReactionsActionsDrawerPresenterSpec", "hide", andIncrement2);
            try {
                try {
                    try {
                        if (L7q.A01(l7q)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "messaging.reactions.reactionsactionsdrawer.themed.ThemedReactionsActionDrawerPresenter";
                            r03.A0A("com.facebook.messaging.reactions.plugins.reactionsactionsdrawer.themed.ThemedReactionsActionDrawerPresenter", str, "com.facebook.messaging.reactions.plugins.interfaces.reactionsactionsdrawer.ReactionsActionsDrawerPresenterSpec", andIncrement, "messaging.reactions.reactionsactionsdrawer.ReactionsActionsDrawerPresenterSpec", "com.facebook.messaging.reactions.plugins.reactionsactionsdrawer.ReactionsReactionsactionsdrawerKillSwitch", "hide");
                            ThemedReactionsActionDrawerPresenter themedReactionsActionDrawerPresenter = l7q.A01;
                            LithoView lithoView = themedReactionsActionDrawerPresenter.A00;
                            if (lithoView != null) {
                                duration = lithoView.animate().translationY(lithoView.getHeight()).setDuration(j);
                                new LEz(1, gs9, lithoView, themedReactionsActionDrawerPresenter);
                                duration.setListener(animatorListener);
                            }
                            r03.A04((Exception) null, str, "messaging.reactions.reactionsactionsdrawer.ReactionsActionsDrawerPresenterSpec", "hide", andIncrement);
                            r03.A02((Exception) null, "messaging.reactions.reactionsactionsdrawer.ReactionsActionsDrawerPresenterSpec", "hide", andIncrement2);
                        }
                        if (!L7q.A00(l7q)) {
                            r03.A02((Exception) null, "messaging.reactions.reactionsactionsdrawer.ReactionsActionsDrawerPresenterSpec", "hide", andIncrement2);
                            return;
                        }
                        andIncrement = atomicInteger.getAndIncrement();
                        str = "messaging.reactions.reactionsactionsdrawer.contextmenu.ReactionsContextMenuPresenter";
                        r03.A0A("com.facebook.messaging.reactions.plugins.reactionsactionsdrawer.contextmenu.ReactionsContextMenuPresenter", str, "com.facebook.messaging.reactions.plugins.interfaces.reactionsactionsdrawer.ReactionsActionsDrawerPresenterSpec", andIncrement, "messaging.reactions.reactionsactionsdrawer.ReactionsActionsDrawerPresenterSpec", "com.facebook.messaging.reactions.plugins.reactionsactionsdrawer.ReactionsReactionsactionsdrawerKillSwitch", "hide");
                        ReactionsContextMenuPresenter reactionsContextMenuPresenter = l7q.A00;
                        LithoView lithoView2 = reactionsContextMenuPresenter.A00;
                        if (lithoView2 != null) {
                            duration = lithoView2.animate().alpha(0.0f).setDuration(j);
                            new LEz(0, gs9, lithoView2, reactionsContextMenuPresenter);
                            duration.setListener(animatorListener);
                        }
                        r03.A04((Exception) null, str, "messaging.reactions.reactionsactionsdrawer.ReactionsActionsDrawerPresenterSpec", "hide", andIncrement);
                        r03.A02((Exception) null, "messaging.reactions.reactionsactionsdrawer.ReactionsActionsDrawerPresenterSpec", "hide", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r03.A04((Exception) null, str, "messaging.reactions.reactionsactionsdrawer.ReactionsActionsDrawerPresenterSpec", "hide", andIncrement);
                    throw th;
                }
            } catch (Throwable th2) {
                r03.A02((Exception) null, "messaging.reactions.reactionsactionsdrawer.ReactionsActionsDrawerPresenterSpec", "hide", andIncrement2);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        H0V h0v = new H0V(getContext(), this, A0l());
        6QF.A00(h0v);
        Window window = h0v.getWindow();
        window.setGravity(ActionId.RTMP_CONNECTION_INTERCEPTED);
        window.setLayout(-1, -1);
        return h0v;
    }

    public 1iF A17() {
        return new 1iF(3815554831804296L);
    }

    public void ANj() {
        if (this.A0G == 0S2.A0N) {
            A08(this, true);
        }
    }

    public void Bda() {
        MessageReactionsOverlayView messageReactionsOverlayView = this.A09;
        if (messageReactionsOverlayView != null) {
            FastMessageReactionsPanelView fastMessageReactionsPanelView = messageReactionsOverlayView.A06;
            ((6qY) fastMessageReactionsPanelView.A0I.get()).B6A(new Im0(fastMessageReactionsPanelView));
        }
    }

    public boolean Bkd() {
        A08(this, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Can(Integer num, String str, String str2, String str3, Map map) {
        Message message;
        2FT A01;
        if (this.A08 == null || (message = this.A06) == null || message.A1V == null) {
            return;
        }
        if (getContext() == null) {
            A01 = new AnonymousClass491(C3o5.A0K(false));
        } else {
            ThreadKey threadKey = this.A06.A0V;
            UserKey A0L = ThreadKey.A0L(threadKey);
            ListenableFuture A00 = A0L == null ? 1hM.A01 : ((AeX) 1Bn.A0E(requireContext(), (1BY) null, 82710)).A00(A0L);
            Executor executor = (Executor) 1Bi.A03(16490);
            A01 = 2FP.A01(new Imn(this, num, str, str2, str3, map), 2FP.A02(new ABb(this, threadKey, 2), 47H.A00(new Functions$ConstantFunction(null), 2FR.A03(A00), Throwable.class, executor), executor));
        }
        1Kd.A0E(new ABo(str, this, 2), A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        Integer num;
        int A02 = 0FI.A02(-219356664);
        super.onCreate(bundle);
        FbUserSession A00 = C30x.A00(this, (1EZ) 1Bn.A0E(requireContext(), (1BY) null, 16428));
        this.A01 = A00;
        this.A0K = (C5a8) 1Lo.A04(requireContext(), A00, (1BY) null, 81996);
        this.A0L = (65U) 1Lo.A04(requireContext(), this.A01, (1BY) null, 49952);
        this.A0A = (7Y0) 1Lo.A04(requireContext(), this.A01, (1BY) null, 50222);
        this.A02 = 1Lo.A02(this.A01, this, 68485);
        A0g(2, 2132607580);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || bundle2.isEmpty()) {
            0fH.A0o("MessageReactionsOverlayFragment", "MessageReactionsOverlayFragment was instantiated without required arguments.");
            A0p();
        } else {
            Message message = (Message) bundle2.getParcelable("message");
            this.A06 = message;
            this.A0E = Boolean.valueOf(60U.A08(message));
            this.A0F = Boolean.valueOf(60U.A0C(this.A06));
            this.A0P = bundle2.getIntArray("message_location");
            if (bundle2.containsKey("video_data")) {
                ArrayList parcelableArrayList = bundle2.getParcelableArrayList("video_data");
                this.A0Q = new 2Dp[parcelableArrayList.size()];
                for (int i = 0; i < parcelableArrayList.size(); i++) {
                    this.A0Q[i] = 2Dp.A00((Uri) parcelableArrayList.get(i));
                }
            }
            if (bundle2.containsKey("menu_params")) {
                this.A05 = (MenuDialogParams) bundle2.getParcelable("menu_params");
            }
            this.A0O = bundle2.getFloatArray("x_position");
            this.A0M = bundle2.getBoolean("should_hide_active_content");
            65U r0 = this.A0L;
            if (r0 != null) {
                Message message2 = this.A06;
                Capabilities capabilities = A0f;
                ThreadSummary threadSummary = this.A07;
                MessageReactionsCount messageReactionsCount = message2.A0i;
                MessageReactions A002 = message2.A00();
                this.A0B = new 6nC(threadSummary, capabilities, messageReactionsCount, A002 == null ? null : A002.A01).A00.BKJ(r0.A01);
            }
            String string = bundle2.getString("show_option");
            if (string.equals("SHOW_BOTH_REACTION_PANEL_AND_ACTION_MENU")) {
                num = 0S2.A00;
            } else if (string.equals("SHOW_REACTION_PANEL_ONLY")) {
                num = 0S2.A01;
            } else if (string.equals("SHOW_ACTION_MENU_ONLY")) {
                num = 0S2.A0C;
            } else {
                if (!string.equals("SHOW_CUSTOM_REACTION_VIEW_ONLY")) {
                    throw new IllegalArgumentException(string);
                }
                num = 0S2.A0N;
            }
            this.A0G = num;
        }
        0FI.A08(2080737831, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-837983388);
        if (this.A03 == null) {
            A0o();
        }
        6KV A00 = ((82O) this.A0c.get()).A00(getContext());
        this.A0I = A00;
        A00.A02();
        View inflate = layoutInflater.inflate(2132542548, viewGroup, false);
        0FI.A08(1725858105, A02);
        return inflate;
    }

    public void onDestroy() {
        C62i c62i;
        int A02 = 0FI.A02(-1296059312);
        super.onDestroy();
        6KV r0 = this.A0I;
        if (r0 != null) {
            r0.A05(-1);
        }
        5zD r02 = this.A03;
        if (r02 != null && (c62i = this.A0J) != null) {
            r02.CeT(c62i);
            this.A0J = null;
        }
        0FI.A08(-25912789, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super/*X.0D2*/.onDismiss(dialogInterface);
        if (!this.A0H && this.A00 == -1 && this.A0G != 0S2.A0C) {
            A07(this, null, "exit_reaction_tray");
        }
        C7yl c7yl = this.A08;
        if (c7yl != null) {
            c7yl.Btj(this.A0H);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-1746171064);
        super/*androidx.fragment.app.Fragment*/.onPause();
        C7yl c7yl = this.A08;
        if (c7yl != null) {
            c7yl.CNk();
        }
        MessageReactionsOverlayView messageReactionsOverlayView = this.A09;
        if (messageReactionsOverlayView != null) {
            Gzv[] gzvArr = messageReactionsOverlayView.A06.A0j;
            int length = gzvArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                Gzv gzv = gzvArr[i2];
                gzv.A0D = false;
                5Gk r0 = gzv.A08;
                if (r0 != null) {
                    r0.pause();
                }
                i = i2 + 1;
            }
        }
        0FI.A08(-787166554, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-457655482);
        super/*androidx.fragment.app.Fragment*/.onResume();
        MessageReactionsOverlayView messageReactionsOverlayView = this.A09;
        if (messageReactionsOverlayView != null) {
            FastMessageReactionsPanelView fastMessageReactionsPanelView = messageReactionsOverlayView.A06;
            Gzv[] gzvArr = fastMessageReactionsPanelView.A0j;
            int length = gzvArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                Gzv gzv = gzvArr[i2];
                if (!gzv.A0D && !fastMessageReactionsPanelView.A0f) {
                    gzv.A0D = true;
                    5Gk r0 = gzv.A08;
                    if (r0 != null) {
                        r0.CXT();
                    }
                }
                i = i2 + 1;
            }
        }
        0FI.A08(-1450609921, A02);
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to calculate best type for var: r356v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r356v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Not initialized variable reg: 356, insn: 0x0d57: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r356 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:237:0x0d43 */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 4053
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.reactions.MessageReactionsOverlayFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
