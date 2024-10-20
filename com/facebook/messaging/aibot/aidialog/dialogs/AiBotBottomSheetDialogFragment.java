package com.facebook.messaging.aibot.aidialog.dialogs;

import X.0FI;
import X.0QD;
import X.11T;
import X.1BM;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2Oe;
import X.7zM;
import X.7zP;
import X.7zT;
import X.9HK;
import X.9HO;
import X.C6sy;
import X.C9N8;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.resources.ui.FbFrameLayout;

/* loaded from: AiBotBottomSheetDialogFragment.class */
public final class AiBotBottomSheetDialogFragment extends BaseMigBottomSheetDialogFragment {
    public LiveData A00;
    public FbUserSession A01;
    public 9HK A02;
    public 9HO A03;
    public C9N8 A04;
    public FbFrameLayout A05;
    public final 1Br A06 = 7zM.A0a();
    public final 1Br A07 = 1Bq.A00(68211);
    public final C6sy A09 = (C6sy) 1Bi.A03(67328);
    public final 1Br A08 = 1Bu.A00(68556);

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r303 == null) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final X.5SW A05() {
        /*
            r301 = this;
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L14
            java.lang.String r0 = "thread_view_source"
            r304 = r0
            r0 = r302
            r1 = r304
            java.io.Serializable r0 = r0.getSerializable(r1)
            r303 = r0
        L14:
            r0 = r303
            boolean r0 = r0 instanceof X.5SW
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L28
            r0 = r303
            X.5SW r0 = (X.5SW) r0
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L2c
        L28:
            X.5SW r0 = X.5SW.A1M
            r303 = r0
        L2c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.aibot.aidialog.dialogs.AiBotBottomSheetDialogFragment.A05():X.5SW");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A08(AiBotBottomSheetDialogFragment aiBotBottomSheetDialogFragment) {
        View view = aiBotBottomSheetDialogFragment.mView;
        if (view != null) {
            7zT.A13(view.getContext(), view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.widget.FrameLayout, android.view.View, com.facebook.resources.ui.FbFrameLayout] */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View A1C() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.aibot.aidialog.dialogs.AiBotBottomSheetDialogFragment.A1C():android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r0.getBoolean("launch_in_voice_mode") == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.9De, java.lang.Object] */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.9De A1D() {
        /*
            r301 = this;
            r0 = r301
            X.5SW r0 = r0.A05()
            r302 = r0
            r0 = r301
            X.1Br r0 = r0.A07
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.848 r0 = (X.AnonymousClass848) r0
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.A01(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L24
            X.8w8 r0 = new X.8w8
            r302 = r0
            r0 = r302
            r0.<init>()
            r0 = r302
            return r0
        L24:
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3f
            java.lang.String r0 = "launch_in_voice_mode"
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.getBoolean(r1)
            r305 = r0
            r0 = 50
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L42
        L3f:
            r0 = 100
            r304 = r0
        L42:
            X.37s r0 = new X.37s
            r302 = r0
            r0 = r302
            r1 = r304
            r0.<init>(r1)
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.aibot.aidialog.dialogs.AiBotBottomSheetDialogFragment.A1D():X.9De");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void A1H() {
        2Oe r0 = (Fragment) 0QD.A0J(7zP.A0x(getChildFragmentManager()), 0);
        if (r0 instanceof 2Oe) {
            2Oe.A07(r0);
        }
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void A1I() {
        9HO r0 = this.A03;
        if (r0 != null) {
            Context context = r0.A00;
            11T.A0I(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(2029960549);
        super.onCreate(bundle);
        this.A01 = 1BM.A01(this);
        0FI.A08(-1769639681, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01f0, code lost:
    
        if (r309 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0265, code lost:
    
        if (r326 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x036b, code lost:
    
        if (r315 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03e6, code lost:
    
        if (((X.C77c) X.7zO.A0l(r301, 68283)).A0I(requireContext()) == false) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 1605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.aibot.aidialog.dialogs.AiBotBottomSheetDialogFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
