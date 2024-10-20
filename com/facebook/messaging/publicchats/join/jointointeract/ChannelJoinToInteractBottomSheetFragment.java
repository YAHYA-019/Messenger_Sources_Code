package com.facebook.messaging.publicchats.join.jointointeract;

import X.0Fy;
import X.0G2;
import X.0Q8;
import X.11T;
import X.1Br;
import X.7zM;
import X.7zN;
import X.8Lf;
import X.8NJ;
import X.AbG;
import X.AbK;
import X.C06w;
import X.C06z;
import X.C8xf;
import X.CZE;
import X.CZF;
import android.content.Context;
import android.os.Bundle;
import com.facebook.mig.nux.MigNuxBottomSheet;
import java.util.List;

/* loaded from: ChannelJoinToInteractBottomSheetFragment.class */
public final class ChannelJoinToInteractBottomSheetFragment extends MigNuxBottomSheet {
    public static final /* synthetic */ C06z[] A04 = {new C06w(ChannelJoinToInteractBottomSheetFragment.class, "fbUserSessionManager", "getFbUserSessionManager()Lcom/facebook/auth/usersession/manager/FbUserSessionManager;", 0), new C06w(ChannelJoinToInteractBottomSheetFragment.class, "channelsLogger", "getChannelsLogger()Lcom/facebook/messaging/publicchats/broadcastchats/logger/DiscoverablePublicBroadcastChatLogger;", 0), new 0Fy(ChannelJoinToInteractBottomSheetFragment.class, "threadKeyFbId", "getThreadKeyFbId()J", 0)};
    public String A00;
    public final 1Br A02 = 7zM.A0Y();
    public final 1Br A01 = AbG.A0X();
    public final 0G2 A03 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.nux.MigNuxBottomSheet
    public 8NJ A1M() {
        String A0s = 7zN.A0s(this, 2131963977);
        C8xf c8xf = new C8xf(null, 2132411102);
        String string = getString(2131963976);
        Context requireContext = requireContext();
        String A0s2 = 7zN.A0s(this, 2131963974);
        return new 8NJ(new 8Lf(new CZE(requireContext, this, 46), CZF.A00(this, 36), A0s2, getString(2131963975), false), c8xf, string, (CharSequence) null, A0s, (List) null, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0051, code lost:
    
        if (r312 == null) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.nux.MigNuxBottomSheet, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            r301 = this;
            r0 = 57658447(0x36fcc4f, float:7.047032E-37)
            r303 = r0
            r0 = r303
            int r0 = X.0FI.A02(r0)
            r304 = r0
            r0 = r301
            r1 = r302
            super.onCreate(r1)
            java.lang.String r0 = "arg_thread_key_fbid"
            r305 = r0
            r0 = r302
            if (r0 == 0) goto L72
            r0 = 0
            r306 = r0
            r0 = r302
            r1 = r305
            r2 = r306
            long r0 = r0.getLong(r1, r2)
            r308 = r0
        L22:
            r0 = r301
            X.0G2 r0 = r0.A03
            r310 = r0
            X.06z[] r0 = com.facebook.messaging.publicchats.join.jointointeract.ChannelJoinToInteractBottomSheetFragment.A04
            r311 = r0
            r0 = 2
            r303 = r0
            r0 = r311
            r1 = r303
            r0 = r0[r1]
            r312 = r0
            r0 = r301
            r1 = r310
            r2 = r312
            r3 = r308
            X.AbH.A1X(r0, r1, r2, r3)
            java.lang.String r0 = "arg_thread_entrypoint"
            r313 = r0
            r0 = r302
            if (r0 == 0) goto L54
            r0 = r302
            r1 = r313
            java.lang.String r0 = r0.getString(r1)
            r312 = r0
            r0 = r312
            if (r0 != 0) goto L84
        L54:
            r0 = r301
            android.os.Bundle r0 = r0.requireArguments()
            r1 = r313
            java.lang.String r0 = r0.getString(r1)
            r312 = r0
            r0 = r312
            if (r0 != 0) goto L84
            java.lang.IllegalStateException r0 = X.1BK.A0h()
            r313 = r0
            r0 = 195300836(0xba40de4, float:6.31914E-32)
            r1 = r304
            X.0FI.A08(r0, r1)
            r0 = r313
            throw r0
        L72:
            r0 = r301
            android.os.Bundle r0 = r0.requireArguments()
            r312 = r0
            r0 = r312
            r1 = r305
            long r0 = r0.getLong(r1)
            r308 = r0
            goto L22
        L84:
            r0 = r301
            r1 = r312
            r0.A00 = r1
            r0 = -1834888849(0xffffffff92a1d16f, float:-1.0212158E-27)
            r1 = r304
            X.0FI.A08(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.publicchats.join.jointointeract.ChannelJoinToInteractBottomSheetFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putLong("arg_thread_key_fbid", AbK.A07(this, this.A03, A04, 2));
        String str = this.A00;
        if (str == null) {
            11T.A0L("threadEntrypoint");
            throw 0Q8.createAndThrow();
        }
        bundle.putString("arg_thread_entrypoint", str);
    }
}
