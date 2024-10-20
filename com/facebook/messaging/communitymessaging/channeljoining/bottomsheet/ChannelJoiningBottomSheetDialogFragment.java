package com.facebook.messaging.communitymessaging.channeljoining.bottomsheet;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1LI;
import X.1Lm;
import X.1iF;
import X.2Gt;
import X.2fZ;
import X.4YT;
import X.7zK;
import X.7zL;
import X.7zR;
import X.9TP;
import X.AbF;
import X.AnonymousClass001;
import X.AnonymousClass553;
import X.BSj;
import X.C1296Ad8;
import X.C1958Axn;
import X.C2fq;
import X.C7kn;
import X.Cx1;
import X.DGJ;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.channeljoining.bottomsheet.ChannelJoiningBottomSheetDialogFragment;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableList;
import java.util.Map;

/* loaded from: ChannelJoiningBottomSheetDialogFragment.class */
public final class ChannelJoiningBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public FbUserSession A00;
    public ChannelJoiningBottomSheetModel A01;
    public 9TP A02;
    public ThreadSummary A03;
    public final 1Br A04 = 1Bu.A02(this, 83112);
    public final AnonymousClass553 A05 = Cx1.A01(this, 8);

    public static final CommunityMessagingLoggerModel A05(ChannelJoiningBottomSheetDialogFragment channelJoiningBottomSheetDialogFragment, String str, String str2, String str3, Map map) {
        ChannelJoiningBottomSheetModel channelJoiningBottomSheetModel = channelJoiningBottomSheetDialogFragment.A01;
        if (channelJoiningBottomSheetModel != null) {
            return new CommunityMessagingLoggerModel(null, null, channelJoiningBottomSheetModel.A04, channelJoiningBottomSheetModel.A05, channelJoiningBottomSheetModel.A08, null, str3, str2, str, channelJoiningBottomSheetModel.A07, null, map);
        }
        11T.A0L("model");
        throw 0Q8.createAndThrow();
    }

    public void A14(Bundle bundle, LayoutInflater layoutInflater, View view, ViewGroup viewGroup) {
        byte b;
        String str;
        String str2;
        CommunityMessagingLoggerModel A05;
        String str3;
        11T.A0F(layoutInflater, 0);
        super.A14(bundle, layoutInflater, view, viewGroup);
        if (this.A02 != null) {
            C1296Ad8 A0W = 7zR.A0W();
            ThreadSummary threadSummary = this.A03;
            if (threadSummary == null) {
                str3 = "threadSummary";
            } else {
                if (2Gt.A0A(threadSummary)) {
                    b = 12;
                    str = "accept_invitation_bottom_sheet_rendered";
                    str2 = 7zK.A00(247);
                } else {
                    b = 8;
                    str = "chat_join_sheet_rendered";
                    str2 = "chat_join_sheet";
                }
                String str4 = null;
                if (((b == true ? 1 : 0) & 4) != 0) {
                    ChannelJoiningBottomSheetModel channelJoiningBottomSheetModel = this.A01;
                    if (channelJoiningBottomSheetModel != null) {
                        Integer num = channelJoiningBottomSheetModel.A02;
                        if (num != null) {
                            str4 = 1BK.A13(C7kn.A00(num));
                        }
                    }
                    str3 = "model";
                }
                A0W.A03(A05(this, str, str2, str4, null));
                ChannelJoiningBottomSheetModel channelJoiningBottomSheetModel2 = this.A01;
                if (channelJoiningBottomSheetModel2 != null) {
                    int intValue = BSj.A00(channelJoiningBottomSheetModel2).intValue();
                    if (intValue == 1 || intValue == 2) {
                        A05 = A05(this, 4YT.A00(434), 7zK.A00(41), null, 1BK.A1D("member_join_request_enabled", ConstantsKt.CAMERA_ID_BACK));
                    } else if (intValue != 3) {
                        return;
                    } else {
                        A05 = A05(this, "cancel_request_button_rendered", "chat_join_sheet", null, null);
                    }
                    A0W.A03(A05);
                    return;
                }
                str3 = "model";
            }
            11T.A0L(str3);
            throw 0Q8.createAndThrow();
        }
    }

    public 1iF A17() {
        return AbF.A0C(1897100123826373L);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        return new DGJ() { // from class: X.9z7
            public 1LI AJE(1Iw r3022, MigColorScheme migColorScheme) {
                1BK.A1M(r3022, migColorScheme);
                C1rq A01 = C1rg.A01(r3022, null, 0);
                A01.A0M();
                7zO.A1L(A01, 2RH.A04);
                8Tl A06 = 8Tl.A06(r3022, migColorScheme);
                7zR.A1A(A06, new DD3(ChannelJoiningBottomSheetDialogFragment.this, 6));
                8Tl.A07(A01, A06);
                return A01.A00;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        2fZ r0 = (2fZ) 1Lm.A05(7zL.A0A(r302), 1BM.A01(this), 17067);
        ChannelJoiningBottomSheetModel channelJoiningBottomSheetModel = this.A01;
        String str = "model";
        if (channelJoiningBottomSheetModel != null) {
            MigColorScheme migColorScheme = channelJoiningBottomSheetModel.A00;
            String str2 = channelJoiningBottomSheetModel.A03;
            ImmutableList immutableList = channelJoiningBottomSheetModel.A01;
            String str3 = channelJoiningBottomSheetModel.A06;
            Integer num = channelJoiningBottomSheetModel.A02;
            AnonymousClass553 anonymousClass553 = this.A05;
            Integer A00 = BSj.A00(channelJoiningBottomSheetModel);
            ThreadSummary threadSummary = this.A03;
            if (threadSummary != null) {
                C2fq A0E = r0.A0E(threadSummary, 0, false, false);
                11T.A0D(migColorScheme);
                11T.A0D(str2);
                11T.A0D(immutableList);
                11T.A0D(A0E);
                return new C1958Axn(anonymousClass553, migColorScheme, A0E, immutableList, num, A00, str2, str3);
            }
            str = "threadSummary";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        int A02 = 0FI.A02(-1348067936);
        super.onCreate(bundle);
        this.A00 = 1BM.A01(this);
        Bundle requireArguments = requireArguments();
        Parcelable parcelable = requireArguments.getParcelable("model");
        if (parcelable != null) {
            this.A01 = (ChannelJoiningBottomSheetModel) parcelable;
            Parcelable parcelable2 = requireArguments.getParcelable("thread_summary");
            if (parcelable2 != null) {
                this.A03 = (ThreadSummary) parcelable2;
                0FI.A08(759850067, A02);
                return;
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = 1143911345;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 1408623347;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-1200738151);
        super/*androidx.fragment.app.Fragment*/.onPause();
        0FI.A08(354588124, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(629380625);
        super/*androidx.fragment.app.Fragment*/.onResume();
        if (this.A02 == null) {
            A0p();
        }
        0FI.A08(512581455, A02);
    }
}
