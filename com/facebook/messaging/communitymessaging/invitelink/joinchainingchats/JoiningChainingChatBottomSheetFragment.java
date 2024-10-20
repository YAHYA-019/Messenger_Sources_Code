package com.facebook.messaging.communitymessaging.invitelink.joinchainingchats;

import X.0CW;
import X.0FI;
import X.0Gm;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1CO;
import X.6EX;
import X.7zL;
import X.7zM;
import X.7zP;
import X.7zS;
import X.7zT;
import X.9De;
import X.9Hl;
import X.9VC;
import X.9Wt;
import X.AR7;
import X.C0ty;
import X.C1gb;
import X.C1zu;
import X.C37s;
import X.C8bn;
import X.C9m6;
import X.C9qn;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.invitelink.model.CommunityMessagingInviteLinkData;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingJoinFlowEntrypoint;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Set;

/* loaded from: JoiningChainingChatBottomSheetFragment.class */
public final class JoiningChainingChatBottomSheetFragment extends BaseMigBottomSheetDialogFragment {
    public LithoView A00;
    public 9VC A01;
    public CommunityMessagingInviteLinkData A02;
    public CommunityMessagingJoinFlowEntrypoint A03;
    public ThreadSummary A04;
    public String A05;
    public final FbUserSession A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public ImmutableList A06 = 1BK.A0b();
    public final Set A0C = 7zL.A15();

    public JoiningChainingChatBottomSheetFragment() {
        1Br A0Y = 7zM.A0Y();
        this.A0A = A0Y;
        this.A07 = 7zS.A0E(A0Y);
        this.A0B = 1Bq.A00(66630);
        this.A08 = 7zM.A0Q();
        this.A09 = 1Bq.A00(68708);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(JoiningChainingChatBottomSheetFragment joiningChainingChatBottomSheetFragment) {
        CommunityMessagingInviteLinkData communityMessagingInviteLinkData = joiningChainingChatBottomSheetFragment.A02;
        if (communityMessagingInviteLinkData == null) {
            11T.A0L("inviteLinkData");
            throw 0Q8.createAndThrow();
        }
        Long l = communityMessagingInviteLinkData.A0C;
        if (l != null && communityMessagingInviteLinkData.A05 == C1zu.A04 && joiningChainingChatBottomSheetFragment.A04 == null) {
            LiveData A07 = 7zT.A07(ThreadKey.A08(l.longValue()));
            A07.observe(joiningChainingChatBottomSheetFragment.getViewLifecycleOwner(), new C9qn(A07, joiningChainingChatBottomSheetFragment, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        LithoView lithoView = new LithoView(7zP.A0T(this));
        this.A00 = lithoView;
        return lithoView;
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(80);
    }

    public final C8bn A1K() {
        boolean z;
        1CO A00;
        long j;
        Long A0e;
        CommunityMessagingInviteLinkData communityMessagingInviteLinkData = this.A02;
        if (communityMessagingInviteLinkData != null) {
            ImmutableList immutableList = this.A06;
            MigColorScheme A1F = A1F();
            C1gb c1gb = (C1gb) 1Br.A0B(this.A0B);
            CommunityMessagingInviteLinkData communityMessagingInviteLinkData2 = this.A02;
            if (communityMessagingInviteLinkData2 != null) {
                String str = communityMessagingInviteLinkData2.A0E;
                if (6EX.A00.A04((str == null || (A0e = 0CW.A0e(str)) == null) ? 0L : A0e.longValue())) {
                    A00 = C1gb.A02(c1gb);
                    j = 36325270021558816L;
                } else {
                    if (str == null) {
                        z = false;
                        return new C8bn(new 9Hl(this), communityMessagingInviteLinkData, A1F, immutableList, z, !this.A0C.isEmpty());
                    }
                    A00 = ((9Wt) 1Br.A0B(c1gb.A04)).A00(str);
                    j = 108367930458374181L;
                }
                z = A00.AZk(j);
                return new C8bn(new 9Hl(this), communityMessagingInviteLinkData, A1F, immutableList, z, !this.A0C.isEmpty());
            }
        }
        11T.A0L("inviteLinkData");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-387962962);
        super.onCreate(bundle);
        new C9m6(7zM.A0C(this, 147544));
        try {
            Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) requireArguments().getParcelable("arg_invite_link_data", Parcelable.class) : requireArguments().getParcelable("arg_invite_link_data");
            Parcelable.Creator creator = CommunityMessagingInviteLinkData.CREATOR;
            11T.A0B(creator);
            CommunityMessagingInviteLinkData communityMessagingInviteLinkData = (CommunityMessagingInviteLinkData) ((Parcelable) 0Gm.A01(creator, parcelable, CommunityMessagingInviteLinkData.class));
            if (communityMessagingInviteLinkData != null) {
                this.A02 = communityMessagingInviteLinkData;
                int i = requireArguments().getInt("arg_entrypoint");
                Integer valueOf = Integer.valueOf(i);
                CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A0I;
                int i2 = communityMessagingJoinFlowEntrypoint.value;
                if (valueOf == null || i != i2) {
                    communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A0H;
                    int i3 = communityMessagingJoinFlowEntrypoint.value;
                    if (valueOf == null || i != i3) {
                        communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A07;
                        int i4 = communityMessagingJoinFlowEntrypoint.value;
                        if (valueOf == null || i != i4) {
                            communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A0A;
                            int i5 = communityMessagingJoinFlowEntrypoint.value;
                            if (valueOf == null || i != i5) {
                                communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A02;
                                int i6 = communityMessagingJoinFlowEntrypoint.value;
                                if (valueOf == null || i != i6) {
                                    communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A03;
                                    int i7 = communityMessagingJoinFlowEntrypoint.value;
                                    if (valueOf == null || i != i7) {
                                        communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A0G;
                                        int i8 = communityMessagingJoinFlowEntrypoint.value;
                                        if (valueOf == null || i != i8) {
                                            communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A08;
                                            int i9 = communityMessagingJoinFlowEntrypoint.value;
                                            if (valueOf == null || i != i9) {
                                                communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A04;
                                                int i10 = communityMessagingJoinFlowEntrypoint.value;
                                                if (valueOf == null || i != i10) {
                                                    communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A09;
                                                    int i11 = communityMessagingJoinFlowEntrypoint.value;
                                                    if (valueOf == null || i != i11) {
                                                        communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A0B;
                                                        int i12 = communityMessagingJoinFlowEntrypoint.value;
                                                        if (valueOf == null || i != i12) {
                                                            communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A0F;
                                                            int i13 = communityMessagingJoinFlowEntrypoint.value;
                                                            if (valueOf == null || i != i13) {
                                                                communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A05;
                                                                int i14 = communityMessagingJoinFlowEntrypoint.value;
                                                                if (valueOf == null || i != i14) {
                                                                    communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A0K;
                                                                    int i15 = communityMessagingJoinFlowEntrypoint.value;
                                                                    if (valueOf == null || i != i15) {
                                                                        communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A0J;
                                                                        int i16 = communityMessagingJoinFlowEntrypoint.value;
                                                                        if (valueOf == null || i != i16) {
                                                                            communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A0E;
                                                                            int i17 = communityMessagingJoinFlowEntrypoint.value;
                                                                            if (valueOf == null || i != i17) {
                                                                                communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A0D;
                                                                                int i18 = communityMessagingJoinFlowEntrypoint.value;
                                                                                if (valueOf == null || i != i18) {
                                                                                    communityMessagingJoinFlowEntrypoint = CommunityMessagingJoinFlowEntrypoint.A0C;
                                                                                    int i19 = communityMessagingJoinFlowEntrypoint.value;
                                                                                    if (valueOf == null || i != i19) {
                                                                                        communityMessagingJoinFlowEntrypoint = null;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.A03 = communityMessagingJoinFlowEntrypoint;
                this.A05 = requireArguments().getString("arg_entrypoint_logging");
                List parcelableArrayList = requireArguments().getParcelableArrayList("arg_join_chaining_chat");
                if (parcelableArrayList == null) {
                    parcelableArrayList = C0ty.A00;
                }
                this.A06 = 1BL.A0a(parcelableArrayList);
                0FI.A08(626228850, A02);
                return;
            }
        } catch (IllegalStateException | NullPointerException e) {
            0fH.A0r("CommunityMessagingInviteLinkJoinBottomSheetFragment", "failed during getInviteLinkDataFromParcelable", e);
        }
        IllegalStateException A0h = 1BK.A0h();
        0FI.A08(-1241547636, A02);
        throw A0h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            Context A0C = 7zM.A0C(this, 147542);
            AR7 ar7 = new AR7(context, this, 24);
            this.A01 = new 9VC(A0C, this.A07, this.A03, this.A05, ar7);
        }
        LithoView lithoView = this.A00;
        if (lithoView == null) {
            11T.A0L("contentView");
            throw 0Q8.createAndThrow();
        }
        lithoView.A0y(A1K());
    }
}
