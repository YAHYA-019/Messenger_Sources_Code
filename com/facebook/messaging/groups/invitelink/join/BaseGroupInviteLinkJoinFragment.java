package com.facebook.messaging.groups.invitelink.join;

import X.04R;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1Br;
import X.1UG;
import X.7zL;
import X.7zO;
import X.7zQ;
import X.7zU;
import X.7zV;
import X.9De;
import X.9lB;
import X.AC8;
import X.AXp;
import X.AXq;
import X.Aa2;
import X.AnonymousClass001;
import X.BOn;
import X.C0A2;
import X.C1306Adj;
import X.C6mh;
import X.C96j;
import X.CQo;
import X.CfG;
import X.LR0;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.groups.invitelink.join.model.GroupInviteLinkData;
import com.facebook.messaging.publicchats.join.ChannelNotificationGroupInviteFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* loaded from: BaseGroupInviteLinkJoinFragment.class */
public abstract class BaseGroupInviteLinkJoinFragment extends MigBottomSheetDialogFragment {
    public CfG A00;
    public Aa2 A01;
    public GroupInviteLinkData A02;
    public boolean A03;

    public void A14(Bundle bundle, LayoutInflater layoutInflater, View view, ViewGroup viewGroup) {
        super.A14(bundle, layoutInflater, view, viewGroup);
        if (this.A03 || this.A02 == null) {
            return;
        }
        if (this instanceof ChannelNotificationGroupInviteFragment) {
            ChannelNotificationGroupInviteFragment channelNotificationGroupInviteFragment = (ChannelNotificationGroupInviteFragment) this;
            boolean z = channelNotificationGroupInviteFragment.A01;
            boolean A1W = AnonymousClass001.A1W(7zU.A0K(channelNotificationGroupInviteFragment), C96j.A06);
            if (z) {
                if (A1W) {
                    C1306Adj.A0B((C1306Adj) 1Br.A0B(channelNotificationGroupInviteFragment.A06), Long.valueOf(ChannelNotificationGroupInviteFragment.A05(channelNotificationGroupInviteFragment)), null, null, 04R.A05(7zQ.A1b("entry_point", ChannelNotificationGroupInviteFragment.A08(channelNotificationGroupInviteFragment))), ActionId.ASYNC_ACTION_FAIL, 1, 92, 38, 1);
                } else if (7zU.A0K(channelNotificationGroupInviteFragment) == C96j.A05) {
                    CQo.A0F(BOn.A05, (CQo) 1Br.A0B(channelNotificationGroupInviteFragment.A03), Long.valueOf(ChannelNotificationGroupInviteFragment.A05(channelNotificationGroupInviteFragment)), (String) null, (List) null, 04R.A05(7zQ.A1b("entry_point", ChannelNotificationGroupInviteFragment.A08(channelNotificationGroupInviteFragment))), ActionId.LEGACY_MARKER, 2, 67, 2);
                }
            } else if (A1W) {
                C1306Adj.A0A((C1306Adj) 1Br.A0B(channelNotificationGroupInviteFragment.A06), Long.valueOf(ChannelNotificationGroupInviteFragment.A05(channelNotificationGroupInviteFragment)), ChannelNotificationGroupInviteFragment.A08(channelNotificationGroupInviteFragment), 7, false, false, 7zV.A1B(channelNotificationGroupInviteFragment));
            } else if (7zU.A0K(channelNotificationGroupInviteFragment) == C96j.A05) {
                CQo.A0G(BOn.A07, (CQo) 1Br.A0B(channelNotificationGroupInviteFragment.A03), Long.valueOf(ChannelNotificationGroupInviteFragment.A05(channelNotificationGroupInviteFragment)), ChannelNotificationGroupInviteFragment.A08(channelNotificationGroupInviteFragment), false, false, 7zV.A1B(channelNotificationGroupInviteFragment));
            }
        } else {
            GroupInviteLinkJoinFragment groupInviteLinkJoinFragment = (GroupInviteLinkJoinFragment) this;
            Long A0h = 7zU.A0h(groupInviteLinkJoinFragment.A1M().A05);
            1UG A08 = 1BK.A08(1Br.A02(((9lB) 1Br.A0B(groupInviteLinkJoinFragment.A03)).A00), 1BJ.A00(2140));
            if (A08.isSampled()) {
                if (A0h != null) {
                    7zL.A1F(A08, String.valueOf(A0h.longValue()));
                }
                A08.BZL();
            }
            if (7zU.A0K(groupInviteLinkJoinFragment) == C96j.A06) {
                C1306Adj.A0A((C1306Adj) 1Br.A0B(groupInviteLinkJoinFragment.A01), A0h, groupInviteLinkJoinFragment.A04, 7, false, false, 7zV.A1B(groupInviteLinkJoinFragment));
            } else if (7zU.A0K(groupInviteLinkJoinFragment) == C96j.A05) {
                CQo.A0G(BOn.A07, (CQo) 1Br.A0B(groupInviteLinkJoinFragment.A00), A0h, groupInviteLinkJoinFragment.A04, false, false, 7zV.A1B(groupInviteLinkJoinFragment));
            }
        }
        this.A03 = true;
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    public final GroupInviteLinkData A1M() {
        GroupInviteLinkData groupInviteLinkData = this.A02;
        if (groupInviteLinkData != null) {
            return groupInviteLinkData;
        }
        11T.A0L("groupInfo");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (A1M().A0L == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1N() {
        /*
            r301 = this;
            r0 = 82650(0x142da, float:1.15817E-40)
            r302 = r0
            r0 = r301
            r1 = r302
            java.lang.Object r0 = X.7zO.A0l(r0, r1)
            X.CHy r0 = (X.CHy) r0
            r303 = r0
            r0 = r301
            X.96j r0 = X.7zU.A0K(r0)
            r304 = r0
            X.96j r0 = X.C96j.A06
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L30
            r0 = r301
            com.facebook.messaging.groups.invitelink.join.model.GroupInviteLinkData r0 = r0.A1M()
            r305 = r0
            r0 = r305
            boolean r0 = r0.A0L
            r302 = r0
            r0 = 2131957436(0x7f1316bc, float:1.9551456E38)
            r306 = r0
            r0 = r302
            if (r0 != 0) goto L34
        L30:
            r0 = 2131957435(0x7f1316bb, float:1.9551454E38)
            r306 = r0
        L34:
            r0 = r301
            android.content.Context r0 = r0.requireContext()
            r305 = r0
            r0 = r303
            r1 = r305
            r2 = r306
            X.CfG r0 = r0.A01(r1, r2)
            r305 = r0
            r0 = r301
            r1 = r305
            r0.A00 = r1
            r0 = r305
            r0.ABm()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.groups.invitelink.join.BaseGroupInviteLinkJoinFragment.A1N():void");
    }

    public void A1O(String str) {
        if (this instanceof ChannelNotificationGroupInviteFragment) {
            ((C6mh) 1Br.A0B(((ChannelNotificationGroupInviteFragment) this).A04)).A0B(false, str);
        } else {
            ((C6mh) 1Br.A0B(((GroupInviteLinkJoinFragment) this).A02)).A0B(false, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1P(String str) {
        Executor A14 = 7zQ.A14();
        AXp aXp = (AXp) 7zO.A0l(this, 66252);
        try {
            Uri A03 = C0A2.A03(str);
            if (A03 != null) {
                AC8.A03(aXp.AS9(A03), this, A14, 26);
                return;
            }
        } catch (SecurityException unused) {
        }
        throw 1BK.A0h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1Q(String str, String str2, Function1 function1, Function1 function12) {
        11T.A0F(str2, 1);
        AXq aXq = (AXq) 7zO.A0l(this, 66253);
        C96j A0K = 7zU.A0K(this);
        11T.A0A(A0K);
        aXq.BXa(A0K, str, str2).observe(this, new LR0(function12, function1, str, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(835815020);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("arg_group_info");
        if (parcelable == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(1054561567, A02);
            throw A0h;
        }
        GroupInviteLinkData groupInviteLinkData = (GroupInviteLinkData) parcelable;
        11T.A0F(groupInviteLinkData, 0);
        this.A02 = groupInviteLinkData;
        if (bundle != null) {
            this.A03 = bundle.getBoolean("invitelink_bottomsheet_impression_logged");
        }
        0FI.A08(-1067672170, A02);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("invitelink_bottomsheet_impression_logged", this.A03);
    }
}
