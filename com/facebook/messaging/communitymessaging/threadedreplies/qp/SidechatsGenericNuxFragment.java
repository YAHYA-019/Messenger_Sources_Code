package com.facebook.messaging.communitymessaging.threadedreplies.qp;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1Bi;
import X.1Br;
import X.7zM;
import X.7zQ;
import X.7zS;
import X.7zV;
import X.9De;
import X.BM4;
import X.C37s;
import X.C9es;
import X.RFD;
import X.RPY;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import java.io.Serializable;

/* loaded from: SidechatsGenericNuxFragment.class */
public final class SidechatsGenericNuxFragment extends MigBottomSheetDialogFragment {
    public static final RPY A06 = new Object();
    public BM4 A00;
    public C9es A01;
    public ThreadKey A02;
    public FbUserSession A03;
    public final RFD A05 = new RFD(this);
    public final 1Br A04 = 7zM.A0Y();

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(75);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003c, code lost:
    
        if (X.C5xr.A00(r0).AZk(36322499768632923L) != false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A1K(X.1Iw r302) {
        /*
            r301 = this;
            r0 = 68332(0x10aec, float:9.5754E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.5xr r0 = (X.C5xr) r0
            r303 = r0
            r0 = r303
            X.1CO r0 = X.C5xr.A00(r0)
            r304 = r0
            r0 = 36322499768567386(0x810b1f000f465a, double:3.033833340384466E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L3f
            r0 = r303
            X.1CO r0 = X.C5xr.A00(r0)
            r304 = r0
            r0 = 36322499768632923(0x810b1f0010465b, double:3.033833340425912E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r308 = r0
            r0 = 2131965980(0x7f13381c, float:1.9568785E38)
            r307 = r0
            r0 = r308
            if (r0 == 0) goto L43
        L3f:
            r0 = 2131965981(0x7f13381d, float:1.9568787E38)
            r307 = r0
        L43:
            r0 = r301
            r1 = r307
            java.lang.String r0 = r0.getString(r1)
            r309 = r0
            r0 = r309
            X.11T.A0D(r0)
            r0 = r301
            r1 = 2131965976(0x7f133818, float:1.9568777E38)
            java.lang.String r0 = X.7zN.A0s(r0, r1)
            r304 = r0
            X.9py r0 = new X.9py
            r310 = r0
            r0 = r310
            r1 = r301
            r2 = 51
            r0.<init>(r1, r2)
            X.8Lf r0 = new X.8Lf
            r303 = r0
            r0 = r303
            r1 = r310
            r2 = r304
            r0.<init>(r1, r2)
            r0 = r301
            com.facebook.mig.scheme.interfaces.MigColorScheme r0 = r0.A1F()
            r311 = r0
            r0 = r301
            r1 = 2131965975(0x7f133817, float:1.9568775E38)
            java.lang.String r0 = r0.getString(r1)
            r312 = r0
            X.8xf r0 = new X.8xf
            r313 = r0
            r0 = r313
            r1 = 0
            r2 = 2132411119(0x7f1a02ef, float:2.0471634E38)
            r0.<init>(r1, r2)
            r0 = r301
            X.RFD r0 = r0.A05
            r314 = r0
            r0 = r312
            X.11T.A0D(r0)
            X.8br r0 = new X.8br
            r304 = r0
            r0 = r304
            r1 = r303
            r2 = r314
            r3 = r313
            r4 = r311
            r5 = r309
            r6 = r312
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.communitymessaging.threadedreplies.qp.SidechatsGenericNuxFragment.A1K(X.1Iw):X.1LI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        Parcelable.Creator creator;
        String str;
        11T.A0F(view, 0);
        this.A03 = 7zV.A09(this, this.A04);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            Object obj = ThreadKey.class.getDeclaredField("CREATOR").get(null);
            if (!(obj instanceof Parcelable.Creator) || (creator = (Parcelable.Creator) obj) == null) {
                throw 7zS.A0v(ThreadKey.class);
            }
            ThreadKey threadKey = (ThreadKey) 7zQ.A0K(bundle2, creator, ThreadKey.class, "parent_thread_key");
            if (threadKey != null) {
                this.A02 = threadKey;
                Serializable serializable = requireArguments().getSerializable("entry_point");
                11T.A0I(serializable, "null cannot be cast to non-null type com.facebook.messaging.communitymessaging.threadedreplies.qp.SidechatsEntryPoint");
                this.A00 = (BM4) serializable;
                C9es c9es = (C9es) 1Bi.A03(68333);
                this.A01 = c9es;
                if (c9es == null) {
                    str = "falcoLogger";
                } else {
                    ThreadKey threadKey2 = this.A02;
                    if (threadKey2 == null) {
                        str = "parentThreadKey";
                    } else {
                        long A0r = threadKey2.A0r();
                        BM4 bm4 = this.A00;
                        if (bm4 != null) {
                            String str2 = bm4.parentSurface;
                            11T.A0F(str2, 1);
                            C9es.A00(c9es).A03(new CommunityMessagingLoggerModel(null, null, null, null, String.valueOf(A0r), null, null, "sidechat_nux", "contextual_upsell_nux", str2, null, null));
                            super.onViewCreated(view, bundle);
                            return;
                        }
                        str = "entryPoint";
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
        }
        throw 1BK.A0h();
    }
}
