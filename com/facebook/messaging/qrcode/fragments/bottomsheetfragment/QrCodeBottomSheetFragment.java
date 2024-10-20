package com.facebook.messaging.qrcode.fragments.bottomsheetfragment;

import X.0FI;
import X.0Q8;
import X.0fH;
import X.11I;
import X.11T;
import X.1BM;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Gh;
import X.1Iw;
import X.1LI;
import X.1XU;
import X.2cK;
import X.5OA;
import X.7zK;
import X.7zR;
import X.8LV;
import X.9De;
import X.AbF;
import X.AbG;
import X.AnonymousClass001;
import X.C0zj;
import X.C10y;
import X.C1296Ad8;
import X.C8g2;
import X.C9kb;
import X.CaE;
import X.Cib;
import X.Cot;
import X.GHs;
import X.PzY;
import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: QrCodeBottomSheetFragment.class */
public final class QrCodeBottomSheetFragment extends MigBottomSheetDialogFragment {
    public C1296Ad8 A00;
    public ThreadSummary A01;
    public C9kb A02;
    public String A03;
    public Window A05;
    public FbUserSession A06;
    public PzY A07;
    public String A08;
    public boolean A09;
    public final CallerContext A0A = CallerContext.A0B("QrCodeBottomSheetFragment");
    public final 1Br A0D = 1Bu.A00(68572);
    public final 1Br A0B = AbG.A0c();
    public final 1Br A0C = 1Bq.A00(16508);
    public String A04 = "unknown";

    /* JADX WARN: Multi-variable type inference failed */
    public static final C10y A05(QrCodeBottomSheetFragment qrCodeBottomSheetFragment) {
        8LV r0;
        Bitmap bitmap;
        C9kb c9kb = qrCodeBottomSheetFragment.A02;
        if (c9kb == null || (r0 = (8LV) c9kb.A01.getValue()) == null || (bitmap = r0.A00) == null) {
            return null;
        }
        11I r02 = new 11I();
        11I.A05(qrCodeBottomSheetFragment.requireContext(), r02, C0zj.A03, "messenger_qr_temp", "png");
        C10y A08 = r02.A08();
        ((GHs) 1Bi.A03(115060)).AH4(bitmap, A08);
        return A08;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A08(com.facebook.messaging.qrcode.fragments.bottomsheetfragment.QrCodeBottomSheetFragment r301) {
        /*
            r0 = r301
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A01
            r301 = r0
            r0 = r301
            boolean r0 = X.5OA.A03(r0)
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L24
            r0 = r301
            if (r0 == 0) goto L22
            r0 = r301
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0l
            r304 = r0
        L19:
            r0 = r304
            if (r0 == 0) goto L22
            r0 = r304
            java.lang.String r0 = X.1BK.A0w(r0)
            r303 = r0
        L22:
            r0 = r303
            return r0
        L24:
            r0 = r301
            if (r0 == 0) goto L22
            r0 = r301
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r304 = r0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.qrcode.fragments.bottomsheetfragment.QrCodeBottomSheetFragment.A08(com.facebook.messaging.qrcode.fragments.bottomsheetfragment.QrCodeBottomSheetFragment):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r0.equals("community_invite_link_sheet") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A0C(com.facebook.messaging.qrcode.fragments.bottomsheetfragment.QrCodeBottomSheetFragment r301) {
        /*
            r0 = r301
            java.lang.String r0 = r0.A04
            r302 = r0
            r0 = r302
            int r0 = r0.hashCode()
            r303 = r0
            r0 = -1592068801(0xffffffffa11af53f, float:-5.250181E-19)
            r304 = r0
            java.lang.String r0 = "invite_link_sheet"
            r305 = r0
            java.lang.String r0 = "direct_invite_sheet"
            r306 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L51
            r0 = -1583681644(0xffffffffa19aef94, float:-1.0498862E-18)
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L3f
            r0 = 1075836154(0x401ff4fa, float:2.4993272)
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L39
            java.lang.String r0 = "community_invite_link_sheet"
            r307 = r0
            r0 = r302
            r1 = r307
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L3c
        L39:
            r0 = 0
            r305 = r0
        L3c:
            r0 = r305
            return r0
        L3f:
            java.lang.String r0 = "channel_invite_link_sheet"
            r307 = r0
            r0 = r302
            r1 = r307
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L39
            r0 = r305
            return r0
        L51:
            r0 = r302
            r1 = r306
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L39
            r0 = r301
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A01
            r307 = r0
            r0 = r307
            boolean r0 = X.5OA.A03(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L6f
            r0 = r306
            return r0
        L6f:
            java.lang.String r0 = "community_direct_invite_sheet"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.qrcode.fragments.bottomsheetfragment.QrCodeBottomSheetFragment.A0C(com.facebook.messaging.qrcode.fragments.bottomsheetfragment.QrCodeBottomSheetFragment):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Long] */
    public static final String A0E(QrCodeBottomSheetFragment qrCodeBottomSheetFragment) {
        ThreadKey threadKey;
        ThreadSummary threadSummary = qrCodeBottomSheetFragment.A01;
        String str = null;
        if (5OA.A03(threadSummary)) {
            if (threadSummary != null && (threadKey = threadSummary.A0n) != null) {
                str = AbF.A14(threadKey);
            }
            str = String.valueOf(str);
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A0F(float f) {
        WindowManager.LayoutParams layoutParams;
        if (1XU.A00(requireContext())) {
            return;
        }
        Window window = this.A05;
        if (window != null) {
            layoutParams = window.getAttributes();
            if (layoutParams != null) {
                layoutParams.screenBrightness = f;
            }
        } else {
            layoutParams = null;
        }
        Window window2 = this.A05;
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
    }

    public static final void A0G(QrCodeBottomSheetFragment qrCodeBottomSheetFragment, String str) {
        C1296Ad8 c1296Ad8 = qrCodeBottomSheetFragment.A00;
        if (c1296Ad8 == null) {
            11T.A0L("communityMessagingLogger");
            throw 0Q8.createAndThrow();
        }
        c1296Ad8.A04(new CommunityMessagingLoggerModel(null, null, A08(qrCodeBottomSheetFragment), null, A0E(qrCodeBottomSheetFragment), null, null, qrCodeBottomSheetFragment.A1N(), str, A0C(qrCodeBottomSheetFragment), null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0x() {
        String str;
        super.A0x();
        Context requireContext = requireContext();
        String str2 = this.A08;
        if (str2 == null) {
            str = "inviteLink";
        } else {
            boolean z = this.A09;
            ThreadSummary threadSummary = this.A01;
            FbUserSession fbUserSession = this.A06;
            if (fbUserSession != null) {
                this.A02 = new C9kb(requireContext, fbUserSession, threadSummary, str2, z);
                this.A00 = 7zR.A0W();
                C9kb c9kb = this.A02;
                if (c9kb != null) {
                    CaE.A03(getViewLifecycleOwner(), c9kb.A01, this, ActionId.RTMP_CONNECTION_RELEASE);
                }
                HandlerThread A02 = ((1Gh) 1Br.A0B(this.A0C)).A02(7zK.A00(290));
                11T.A0A(A02);
                A02.start();
                this.A07 = new PzY(requireContext(), new Handler(A02.getLooper()), new Cib(this));
                return;
            }
            str = "fbUserSession";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        8LV r0;
        11T.A0F(r302, 0);
        C9kb c9kb = this.A02;
        return (c9kb == null || (r0 = (8LV) c9kb.A01.getValue()) == null) ? 2cK.A00(r302).A00 : new C8g2(null, new Cot(), r0, A1F());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    /* JADX WARN: Type inference failed for: r0v134, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v150, types: [com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A1M(X.0DR r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.qrcode.fragments.bottomsheetfragment.QrCodeBottomSheetFragment.A1M(X.0DR, boolean):java.lang.Object");
    }

    public final String A1N() {
        return 5OA.A03(this.A01) ? "chat_qr_code" : "community_qr_code";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        int A02 = 0FI.A02(273920915);
        super.onCreate(bundle);
        this.A06 = 1BM.A01(this);
        Parcelable parcelable = requireArguments().getParcelable("THREAD_SUMMARY");
        if (parcelable != null) {
            this.A01 = (ThreadSummary) parcelable;
            String string = requireArguments().getString("INVITE_LINK");
            if (string != null) {
                this.A08 = string;
                String string2 = requireArguments().getString("ENTRY_POINT");
                11T.A0I(string2, "null cannot be cast to non-null type @[EntryPoint] kotlin.String");
                this.A04 = string2;
                this.A03 = requireArguments().getString("COMMUNITY_ID");
                this.A09 = requireArguments().getBoolean("IS_RESET_ENABLED");
                FragmentActivity activity = getActivity();
                this.A05 = activity != null ? activity.getWindow() : null;
                A0F(1.0f);
                0FI.A08(854457853, A02);
                return;
            }
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -611051642;
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -964879881;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-373438166);
        super/*androidx.fragment.app.Fragment*/.onPause();
        ContentObserver contentObserver = this.A07;
        if (contentObserver != null) {
            try {
                requireContext().getContentResolver().unregisterContentObserver(contentObserver);
            } catch (Throwable th) {
                0fH.A0s("QrCodeBottomSheetFragment", 7zK.A00(ActionId.VIDEO_REQUESTED_PLAYING), th);
            }
        }
        A0F(-1.0f);
        0FI.A08(1755757036, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1438047038);
        super/*androidx.fragment.app.Fragment*/.onResume();
        ContentObserver contentObserver = this.A07;
        if (contentObserver != null) {
            requireContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, contentObserver);
        }
        A0F(1.0f);
        0FI.A08(45209266, A02);
    }
}
