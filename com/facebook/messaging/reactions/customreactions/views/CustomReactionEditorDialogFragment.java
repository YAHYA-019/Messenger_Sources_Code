package com.facebook.messaging.reactions.customreactions.views;

import X.0D2;
import X.0FI;
import X.0S2;
import X.0fH;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1Bn;
import X.1Br;
import X.1Fw;
import X.1Lo;
import X.1MV;
import X.1iF;
import X.1tJ;
import X.2Ov;
import X.2eS;
import X.4YT;
import X.4YU;
import X.5lO;
import X.6KV;
import X.6RX;
import X.6qV;
import X.6qY;
import X.7Y0;
import X.7zK;
import X.7zS;
import X.7zT;
import X.82O;
import X.94V;
import X.9Z7;
import X.A99;
import X.AbE;
import X.AbF;
import X.AbL;
import X.AnonymousClass001;
import X.C00i;
import X.C0A8;
import X.C1F6;
import X.C3R7;
import X.C5bb;
import X.C5pk;
import X.DKC;
import X.DKD;
import X.DKE;
import X.EKz;
import X.EMe;
import X.EeE;
import X.FXr;
import X.Fci;
import X.G8T;
import X.GOm;
import X.JQw;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.reactions.model.ReactionsSet;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.DarkColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: CustomReactionEditorDialogFragment.class */
public class CustomReactionEditorDialogFragment extends 2Ov implements DialogInterface.OnDismissListener {
    public Fci A00;
    public 6RX A01;
    public boolean A02;
    public 6KV A03;
    public C00i A04;
    public C00i A05;
    public C00i A06;
    public final C00i A0D = 1BV.A00(65571);
    public final C00i A08 = AbF.A0S(this, 453);
    public final C00i A09 = 1BQ.A02(67661);
    public final C00i A0A = AbF.A0S(this, 68066);
    public final C00i A0C = 1BQ.A02(49322);
    public final C00i A0B = DKC.A0W(this, 100189);
    public MigColorScheme A07 = LightColorScheme.A00();

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.messaging.reactions.customreactions.views.CustomReactionEditorDialogFragment, androidx.fragment.app.Fragment] */
    public static CustomReactionEditorDialogFragment A05(Message message, ThreadSummary threadSummary, EKz eKz, ReactionsSet reactionsSet, MigColorScheme migColorScheme, Capabilities capabilities, Integer num) {
        ?? customReactionEditorDialogFragment = new CustomReactionEditorDialogFragment();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("color_scheme", migColorScheme);
        A05.putParcelable("message", message);
        A05.putInt("reaction_index", 0);
        A05.putSerializable("controller_mode", eKz);
        A05.putParcelable("selected_emoji", reactionsSet);
        if (num != null) {
            A05.putInt("group_size", num.intValue());
        }
        if (threadSummary != null) {
            A05.putSerializable(4YT.A00(317), threadSummary.A1T);
            A05.putSerializable("is_subscribed", Boolean.valueOf(threadSummary.A2i));
            GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType = threadSummary.A0Y;
            if (graphQLMessengerGroupThreadSubType == null) {
                graphQLMessengerGroupThreadSubType = GraphQLMessengerGroupThreadSubType.A0E;
            }
            A05.putString(AbE.A00(177), graphQLMessengerGroupThreadSubType.toString());
        }
        A05.putParcelable("capabilities", capabilities);
        customReactionEditorDialogFragment.setArguments(A05);
        return customReactionEditorDialogFragment;
    }

    public Dialog A0n(Bundle bundle) {
        Dialog A0n = super.A0n(bundle);
        Window window = A0n.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
            window.setLayout(-1, -1);
            float f = 0.8f;
            if (this.A07 instanceof DarkColorScheme) {
                f = 0.85f;
            }
            window.setDimAmount(f);
            window.setSoftInputMode(48);
        }
        return A0n;
    }

    public 1iF A17() {
        return AbF.A0C(3815554831804296L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-2004203699);
        this.A02 = false;
        FbUserSession A0G = 1BL.A0G(this);
        this.A06 = 1Lo.A02(A0G, this, 67391);
        this.A04 = 1Lo.A02(A0G, this, 50222);
        this.A05 = new 1MV(A0G, 67662);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || bundle2.isEmpty()) {
            0fH.A0o("custom_reactions_editor", "CustomReactionsEditorDialogFragment was instantiated without required arguments.");
            A0p();
        } else {
            this.A07 = (MigColorScheme) bundle2.getParcelable("color_scheme");
            Parcelable parcelable = bundle2.getParcelable("message");
            int i = bundle2.getInt("reaction_index");
            EKz serializable = bundle2.getSerializable("controller_mode");
            ReactionsSet reactionsSet = (ReactionsSet) bundle2.getParcelable("selected_emoji");
            Boolean bool = null;
            Integer A0l = bundle2.containsKey("group_size") ? DKD.A0l(bundle2, "group_size") : null;
            String A00 = 4YT.A00(317);
            ImmutableSet immutableSet = bundle2.containsKey(A00) ? (ImmutableSet) bundle2.getSerializable(A00) : null;
            Capabilities capabilities = (Capabilities) bundle2.getParcelable("capabilities");
            if (bundle2.containsKey("is_subscribed")) {
                bool = (Boolean) bundle2.getSerializable("is_subscribed");
            }
            String A002 = AbE.A00(177);
            GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType = (GraphQLMessengerGroupThreadSubType) EnumHelper.A00(GraphQLMessengerGroupThreadSubType.A0E, bundle2.getString(A002) == null ? GraphQLMessengerGroupThreadSubType.A0E.toString() : bundle2.getString(A002));
            C1F6 A0P = AbF.A0P(this.A08);
            parcelable.getClass();
            Message message = (Message) parcelable;
            serializable.getClass();
            EKz eKz = serializable;
            6qY r0 = (6qY) 4YU.A0p(this.A05);
            7Y0 r02 = (7Y0) this.A04.get();
            MigColorScheme migColorScheme = this.A07;
            migColorScheme.getClass();
            if (reactionsSet == null) {
                reactionsSet = new ReactionsSet();
            }
            6qV r03 = (6qV) this.A09.get();
            Context A01 = FbInjector.A01();
            AbL.A0y(A0P);
            try {
                Fci fci = new Fci(graphQLMessengerGroupThreadSubType, A0P, message, eKz, r03, r02, reactionsSet, migColorScheme, capabilities, r0, immutableSet, bool, A0l, i);
                1Bn.A0K();
                FbInjector.A04(A01);
                this.A00 = fci;
            } catch (Throwable th) {
                1Bn.A0K();
                FbInjector.A04(A01);
                throw th;
            }
        }
        A0g(2, 2132607252);
        0FI.A08(-1606494444, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Dialog dialog;
        ViewGroup viewGroup2;
        int A02 = 0FI.A02(-492538674);
        this.A00.getClass();
        ViewGroup viewGroup3 = (ViewGroup) layoutInflater.inflate(2132541808, viewGroup, false);
        6KV A00 = ((82O) this.A0D.get()).A00(getContext());
        this.A03 = A00;
        A00.A02();
        FXr.A03(viewGroup3, this, 108);
        Fci fci = this.A00;
        fci.A05 = (LithoView) viewGroup3.requireViewById(2131365270);
        fci.A0E.B6A(new A99(1Fw.A05(fci.A04), fci, 1));
        if (fci.A09.equals(EKz.A03)) {
            fci.A05.setVisibility(8);
        }
        Fci fci2 = this.A00;
        View requireViewById = viewGroup3.requireViewById(2131363607);
        float A002 = C0A8.A00(requireViewById.getContext(), 12.0f);
        float[] fArr = new float[8];
        fArr[0] = A002;
        7zS.A1X(fArr, A002, 1);
        7zT.A1X(fArr, 0.0f);
        requireViewById.setBackground(new C5bb(fArr, fci2.A0D.AjC()));
        this.A00.A04((LithoView) ((ViewStub) viewGroup3.requireViewById(2131363862)).inflate(), (9Z7) this.A0A.get(), ((C3R7) 4YU.A0p(this.A06)).A01(), 1Br.A07(((6qV) this.A09.get()).A01).AZk(36313415912725045L));
        Fci fci3 = this.A00;
        int A0A = DKE.A0A(this.A0C);
        Object obj = this.A0B.get();
        fci3.A02 = viewGroup3;
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(viewGroup3.requireViewById(2131363607));
        fci3.A0F = A022;
        A022.A0D((int) (A0A * 0.8f), false);
        fci3.A0F.A0I(true);
        fci3.A0F.A0B(5);
        fci3.A0F.A0G(new 94V(obj, fci3, 0));
        if (!fci3.A0L && (viewGroup2 = fci3.A02) != null) {
            viewGroup2.getViewTreeObserver().addOnGlobalLayoutListener(fci3.A0R);
            fci3.A0L = true;
        }
        viewGroup3.requireViewById(2131364438).setBackground(new C5bb(C0A8.A00(r0.getContext(), 2.0f), fci3.A0D.AYx()));
        this.A00.A0B = new EeE(this);
        if (bundle != null) {
            this.A07 = (MigColorScheme) bundle.getParcelable("color_scheme");
        }
        if (A1B()) {
            if (!((0D2) this).A07 || (dialog = ((0D2) this).A01) == null) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    window = activity.getWindow();
                }
            } else {
                window = dialog.getWindow();
            }
            if (window != null) {
                1tJ.A09(window, false);
                1tJ.A06(window, 0);
                window.getDecorView().setSystemUiVisibility(0);
            }
        }
        0FI.A08(-2042957544, A02);
        return viewGroup3;
    }

    public void onDestroy() {
        HashMap A0u;
        int i;
        int A02 = 0FI.A02(-214080818);
        6KV r0 = this.A03;
        if (r0 != null) {
            r0.A04();
        }
        Fci fci = this.A00;
        6RX r02 = this.A01;
        LithoView lithoView = fci.A05;
        if (lithoView != null) {
            lithoView.A0w();
        }
        ViewGroup viewGroup = fci.A02;
        if (viewGroup != null) {
            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(fci.A0R);
            fci.A0L = false;
        }
        if (r02 != null) {
            2eS r03 = fci.A03;
            Integer num = null;
            boolean z = true;
            boolean z2 = false;
            if (r03 != null) {
                r03.A00(true);
                fci.A03 = null;
            }
            int ordinal = fci.A09.ordinal();
            if (ordinal == 0) {
                boolean z3 = !Arrays.equals(fci.A0O, fci.A0P);
                boolean[] zArr = fci.A0Q;
                int length = zArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (zArr[i2]) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
                7Y0 r04 = fci.A0C;
                Message message = fci.A08;
                String A01 = Fci.A01(fci);
                Integer num2 = fci.A0H;
                boolean z4 = fci.A0J;
                if (z4 || z3 || z2) {
                    A0u = AnonymousClass001.A0u();
                    7Y0.A00(Boolean.valueOf(z4), "reset", A0u);
                    7Y0.A00(Boolean.valueOf(z3), JQw.A00(86), A0u);
                    7Y0.A00(Boolean.valueOf(z2), "emoji_search_used", A0u);
                } else {
                    A0u = null;
                }
                r04.A01(message, num2, "overreact_tray", 7zK.A00(300), (String) null, (String) null, A01, A0u);
                r02.Bda();
            } else if (ordinal == 1) {
                String str = fci.A0I;
                if (str == null) {
                    fci.A0C.A01(fci.A08, fci.A0H, (String) null, "exit_overreact_tray", (String) null, (String) null, Fci.A01(fci), (Map) null);
                } else {
                    ReactionsSet reactionsSet = fci.A0X;
                    String str2 = reactionsSet.A01(str) ? null : fci.A0I;
                    C5pk c5pk = (C5pk) fci.A0U.get();
                    ThreadKey threadKey = fci.A08.A0V;
                    String str3 = "reaction";
                    if (c5pk.A00(fci.A0S, threadKey, fci.A0Y, fci.A0Z, fci.A0a)) {
                        str2 = fci.A0I;
                        if (reactionsSet.A01(str2)) {
                            num = 0S2.A0C;
                            if (((5lO) fci.A0V.get()).A01(threadKey)) {
                                i = 77;
                                str3 = GOm.A00(i);
                            }
                        } else {
                            num = 0S2.A00;
                            if (((5lO) fci.A0V.get()).A01(threadKey)) {
                                i = 304;
                                str3 = GOm.A00(i);
                            }
                        }
                    }
                    if (str2 == null) {
                        z = false;
                    }
                    boolean z5 = fci.A0Q[0];
                    EMe eMe = fci.A0N[0];
                    HashMap A0u2 = AnonymousClass001.A0u();
                    7Y0.A00(Boolean.valueOf(z), 4YT.A00(1197), A0u2);
                    7Y0.A00(Boolean.valueOf(z5), "emoji_search_used", A0u2);
                    if (eMe != EMe.A02) {
                        A0u2.put("emoji_category", eMe.name);
                    }
                    r02.Can(num, str2, "reaction_tray_overreact", str3, A0u2);
                }
            }
            r02.ANj();
        }
        super.onDestroy();
        0FI.A08(-915334165, A02);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super/*X.0D2*/.onDismiss(dialogInterface);
        Fci fci = this.A00;
        if (Arrays.equals(fci.A0O, fci.A0P)) {
            return;
        }
        fci.A0E.D7i(fci.A0O);
        int i = 0;
        while (true) {
            int i2 = i;
            String[] strArr = fci.A0O;
            if (i2 >= strArr.length) {
                return;
            }
            String str = strArr[i2];
            String[] strArr2 = fci.A0P;
            if (!str.equals(strArr2[i2])) {
                String str2 = strArr2[i2];
                String str3 = strArr[i2];
                boolean z = fci.A0Q[i2];
                EMe eMe = fci.A0N[i2];
                7Y0 r0 = fci.A0C;
                Message message = fci.A08;
                String A01 = Fci.A01(fci);
                Integer num = fci.A0H;
                Boolean valueOf = Boolean.valueOf(fci.A0J);
                Boolean valueOf2 = Boolean.valueOf(z);
                G8T g8t = new G8T(i2);
                if (valueOf != null) {
                    7Y0.A00(valueOf, "reset", g8t);
                }
                if (valueOf2 != null) {
                    7Y0.A00(valueOf2, "emoji_search_used", g8t);
                }
                if (eMe != null && eMe != EMe.A02) {
                    g8t.put("emoji_category", eMe.name);
                }
                r0.A01(message, num, "overreact_tray", "edit_customize_reaction", str2, str3, A01, g8t);
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1239910742);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A02 = false;
        0FI.A08(-1799346304, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("color_scheme", this.A07);
        this.A02 = true;
    }
}
