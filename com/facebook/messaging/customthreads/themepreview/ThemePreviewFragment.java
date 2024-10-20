package com.facebook.messaging.customthreads.themepreview;

import X.06Z;
import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BM;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1iF;
import X.1tJ;
import X.2Ov;
import X.7zL;
import X.7zN;
import X.7zO;
import X.7zQ;
import X.7zR;
import X.7zT;
import X.8hN;
import X.9WG;
import X.9Zo;
import X.AnonymousClass001;
import X.C1oi;
import X.C2yk;
import X.C5ic;
import X.C5xv;
import X.C9pd;
import X.C9zj;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.customthreads.themepreview.ThemePreviewFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;

/* loaded from: ThemePreviewFragment.class */
public final class ThemePreviewFragment extends SlidingSheetDialogFragment {
    public static final 9WG A09 = new Object();
    public FbUserSession A00;
    public View.OnClickListener A01;
    public LithoView A02;
    public final 1Br A04 = 7zN.A0I(this);
    public final C5xv A08 = new C9zj(this, 19);
    public final 1Br A05 = 1Bq.A00(50079);
    public final 1Br A03 = 1Bq.A00(68186);
    public final 1Br A06 = 1Bu.A02(this, 68187);
    public final C5ic A07 = 7zQ.A0l();

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(ThemePreviewFragment themePreviewFragment, ThreadKey threadKey, ThreadSummary threadSummary, ThreadThemeInfo threadThemeInfo, String str, String str2, boolean z) {
        FbUserSession A01 = 1BM.A01(themePreviewFragment);
        9Zo r0 = (9Zo) 7zO.A0l(themePreviewFragment, 68182);
        Fragment fragment = themePreviewFragment.mParentFragment;
        if (fragment == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        06Z parentFragmentManager = fragment.getParentFragmentManager();
        Context requireContext = themePreviewFragment.requireContext();
        if (threadThemeInfo == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        r0.A00(requireContext, parentFragmentManager, A01, threadKey, threadSummary, threadThemeInfo, "background", str, str2, z);
        themePreviewFragment.A0p();
        if (!(fragment instanceof SlidingSheetDialogFragment)) {
            if (!(fragment instanceof 2Ov)) {
                return;
            }
            0D2 r02 = (0D2) fragment;
            r02.A0p();
            fragment = r02.mParentFragment;
            if (!(fragment instanceof SlidingSheetDialogFragment)) {
                return;
            }
        }
        ((0D2) fragment).A0p();
    }

    public 1iF A17() {
        return new 1iF(1111956955915072L);
    }

    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-907838768);
        super.onActivityCreated(bundle);
        Activity A16 = A16();
        if (A16 == null || !A16.isInMultiWindowMode()) {
            C1oi.A00(A16(), 1);
        }
        0FI.A08(1711902789, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(236089565);
        super.onCreate(bundle);
        this.A00 = 7zT.A08(this);
        0FI.A08(-1914394538, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException A0N;
        int i;
        Window window;
        Window window2;
        Window window3;
        int A02 = 0FI.A02(-660263510);
        11T.A0F(layoutInflater, 0);
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            window3.setBackgroundDrawable(7zL.A0D(0));
        }
        Dialog dialog2 = ((0D2) this).A01;
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
        this.A02 = 7zR.A0M(this);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            final ThreadThemeInfo threadThemeInfo = (ThreadThemeInfo) bundle2.getParcelable("thread_theme_info");
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                final ThreadThemeInfo threadThemeInfo2 = (ThreadThemeInfo) bundle3.getParcelable("current_thread_theme_info");
                Bundle bundle4 = this.mArguments;
                if (bundle4 != null) {
                    final ThreadKey threadKey = (ThreadKey) bundle4.getParcelable("thread_key");
                    Bundle bundle5 = this.mArguments;
                    if (bundle5 != null) {
                        final ThreadSummary threadSummary = (ThreadSummary) bundle5.getParcelable("thread_summary");
                        Bundle bundle6 = this.mArguments;
                        if (bundle6 != null) {
                            boolean z = bundle6.getBoolean("enable_custom_theme_layout");
                            Bundle bundle7 = this.mArguments;
                            if (bundle7 != null) {
                                final boolean z2 = bundle7.getBoolean("is_current_theme_deprecated");
                                Bundle bundle8 = this.mArguments;
                                if (bundle8 != null) {
                                    final boolean z3 = bundle8.getBoolean("is_from_generated_theme_creation");
                                    Bundle bundle9 = this.mArguments;
                                    if (bundle9 != null) {
                                        final boolean z4 = bundle9.getBoolean("has_available_ai_generated_theme");
                                        Bundle bundle10 = this.mArguments;
                                        if (bundle10 != null) {
                                            final boolean z5 = bundle10.getBoolean("is_in_account_theme_picker_mode");
                                            Bundle bundle11 = this.mArguments;
                                            if (bundle11 != null) {
                                                final String string = bundle11.getString("account_theme_picker_entrypoint");
                                                this.A01 = new View.OnClickListener(this) { // from class: X.9pi
                                                    public final /* synthetic */ ThemePreviewFragment A00;

                                                    {
                                                        this.A00 = this;
                                                    }

                                                    /* JADX WARN: Code restructure failed: missing block: B:30:0x02db, code lost:
                                                    
                                                        if (r308.length() > 0) goto L46;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
                                                    
                                                        if (r312 == null) goto L11;
                                                     */
                                                    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.fragment.app.Fragment, java.lang.Object, com.facebook.messaging.customthreads.themepreview.ThemePreviewFragment] */
                                                    @Override // android.view.View.OnClickListener
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                                    */
                                                    public final void onClick(android.view.View r302) {
                                                        /*
                                                            Method dump skipped, instructions count: 890
                                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: X.C9pi.onClick(android.view.View):void");
                                                    }
                                                };
                                                C9pd c9pd = new C9pd(this, threadThemeInfo, string, 0, z5);
                                                Dialog dialog3 = ((0D2) this).A01;
                                                if (dialog3 != null && (window = dialog3.getWindow()) != null) {
                                                    if (threadThemeInfo != null) {
                                                        int i2 = threadThemeInfo.A0O;
                                                        C2yk.A00(window, i2);
                                                        1tJ.A06(window, i2);
                                                    } else {
                                                        A0N = AnonymousClass001.A0N("Required value was null.");
                                                        i = 1434193659;
                                                    }
                                                }
                                                LithoView lithoView = this.A02;
                                                String str = "lithoView";
                                                if (lithoView != null) {
                                                    1Iw r0 = lithoView.A09;
                                                    11T.A0A(r0);
                                                    MigColorScheme A0m = 7zQ.A0m(this.A04);
                                                    if (threadThemeInfo != null) {
                                                        C5xv c5xv = this.A08;
                                                        View.OnClickListener onClickListener = this.A01;
                                                        if (onClickListener == null) {
                                                            str = "onSelectedListener";
                                                        } else {
                                                            lithoView.A0y(new 8hN(onClickListener, c9pd, r0, A0m, c5xv, threadThemeInfo, z, z3));
                                                            LithoView lithoView2 = this.A02;
                                                            if (lithoView2 != null) {
                                                                0FI.A08(-878337477, A02);
                                                                return lithoView2;
                                                            }
                                                        }
                                                    } else {
                                                        A0N = AnonymousClass001.A0N("Required value was null.");
                                                        i = 487793552;
                                                    }
                                                }
                                                11T.A0L(str);
                                                throw 0Q8.createAndThrow();
                                            }
                                            A0N = AnonymousClass001.A0N("Required value was null.");
                                            i = 807230657;
                                        } else {
                                            A0N = AnonymousClass001.A0N("Required value was null.");
                                            i = -440948423;
                                        }
                                    } else {
                                        A0N = AnonymousClass001.A0N("Required value was null.");
                                        i = 1902062824;
                                    }
                                } else {
                                    A0N = AnonymousClass001.A0N("Required value was null.");
                                    i = 1728081161;
                                }
                            } else {
                                A0N = AnonymousClass001.A0N("Required value was null.");
                                i = 1938312936;
                            }
                        } else {
                            A0N = AnonymousClass001.A0N("Required value was null.");
                            i = 23090420;
                        }
                    } else {
                        A0N = AnonymousClass001.A0N("Required value was null.");
                        i = -1953253364;
                    }
                } else {
                    A0N = AnonymousClass001.A0N("Required value was null.");
                    i = 1823517356;
                }
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = 157599855;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 1949142053;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-1419168159);
        super.onDestroy();
        Activity A16 = A16();
        if (A16 == null || !A16.isInMultiWindowMode()) {
            C1oi.A00(A16(), 2);
        }
        0FI.A08(366300165, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0084, code lost:
    
        if (r306 == null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            r301 = this;
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r304 = r0
            java.lang.String r0 = "Required value was null."
            r305 = r0
            r0 = r304
            if (r0 == 0) goto Lbf
            java.lang.String r0 = "thread_theme_info"
            r306 = r0
            r0 = r304
            java.lang.Class<com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo> r1 = com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo.class
            r2 = r306
            java.lang.Object r0 = X.AnonymousClass086.A00(r0, r1, r2)
            com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo r0 = (com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo) r0
            r307 = r0
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r308 = r0
            r0 = r308
            if (r0 == 0) goto Lb9
            java.lang.String r0 = "is_in_account_theme_picker_mode"
            r306 = r0
            r0 = r308
            r1 = r306
            boolean r0 = r0.getBoolean(r1)
            r309 = r0
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r308 = r0
            r0 = r308
            if (r0 == 0) goto Lb3
            java.lang.String r0 = "account_theme_picker_entrypoint"
            r306 = r0
            r0 = r308
            r1 = r306
            java.lang.String r0 = r0.getString(r1)
            r310 = r0
            r0 = r309
            if (r0 == 0) goto Lb2
            r0 = 68062(0x109de, float:9.5375E-41)
            r311 = r0
            r0 = r311
            java.lang.Object r0 = X.1Bn.A0A(r0)
            X.F4v r0 = (X.F4v) r0
            r304 = r0
            r0 = r307
            if (r0 == 0) goto L87
            r0 = r307
            long r0 = r0.A0S
            r312 = r0
            r0 = r312
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L87
            r0 = r306
            java.lang.String r0 = r0.toString()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L8c
        L87:
            java.lang.String r0 = "0"
            r306 = r0
        L8c:
            java.lang.String r0 = "theme"
            r314 = r0
            r0 = r314
            r1 = r306
            java.util.Map r0 = X.1BK.A1D(r0, r1)
            r315 = r0
            java.lang.String r0 = "branded_chat_theme_preview"
            r307 = r0
            java.lang.String r0 = "impression"
            r305 = r0
            r0 = r304
            r1 = r307
            r2 = r305
            r3 = r314
            r4 = r310
            r5 = r315
            X.F4v.A00(r0, r1, r2, r3, r4, r5)
        Lb2:
            return
        Lb3:
            r0 = r305
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        Lb9:
            r0 = r305
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        Lbf:
            r0 = r305
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.customthreads.themepreview.ThemePreviewFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
