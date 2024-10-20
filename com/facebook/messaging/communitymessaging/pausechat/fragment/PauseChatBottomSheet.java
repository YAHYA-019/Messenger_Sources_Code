package com.facebook.messaging.communitymessaging.pausechat.fragment;

import X.06Z;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Iw;
import X.1LH;
import X.1LI;
import X.7zR;
import X.7zS;
import X.9Ba;
import X.AQt;
import X.AnonymousClass001;
import X.GC5;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.channels.pause.model.PauseDuration;
import com.facebook.messaging.channels.pause.model.PausedReasonEnum;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.pausechat.fragment.PauseDurationController;
import com.facebook.messaging.communitymessaging.pausechat.fragment.PauseReasonController;
import com.facebook.messaging.communitymessaging.pausechat.fragment.PausedReasonData;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Map;

/* loaded from: PauseChatBottomSheet.class */
public final class PauseChatBottomSheet extends MigBottomSheetDialogFragment {
    public static final 9Ba A06 = new Object();
    public FbUserSession A00;
    public PauseDuration A01;
    public PauseChatBottomSheetParams A02;
    public PausedReasonData A03;
    public PauseDurationController A04;
    public PauseReasonController A05;

    public static final void A05(PauseChatBottomSheetParams pauseChatBottomSheetParams, String str, String str2, String str3, Map map) {
        7zR.A0W().A04(new CommunityMessagingLoggerModel(null, null, pauseChatBottomSheetParams.A02, String.valueOf(pauseChatBottomSheetParams.A00), 1BK.A0w(pauseChatBottomSheetParams.A01), null, str2, str, str3, pauseChatBottomSheetParams.A03, null, map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        final MigColorScheme A0j = 7zS.A0j(this);
        final 06Z parentFragmentManager = getParentFragmentManager();
        PauseChatBottomSheetParams pauseChatBottomSheetParams = this.A02;
        String str = "pauseChatBottomSheetParams";
        if (pauseChatBottomSheetParams != null) {
            final String str2 = pauseChatBottomSheetParams.A04;
            final long j = pauseChatBottomSheetParams.A00;
            final PauseDuration pauseDuration = this.A01;
            if (pauseDuration == null) {
                str = "currentDuration";
            } else {
                final PausedReasonData pausedReasonData = this.A03;
                if (pausedReasonData == null) {
                    str = "currentReason";
                } else {
                    final PauseDurationController pauseDurationController = this.A04;
                    if (pauseDurationController == null) {
                        str = "pauseDurationController";
                    } else {
                        final PauseReasonController pauseReasonController = this.A05;
                        if (pauseReasonController != null) {
                            final GC5 gc5 = new GC5(this, 8);
                            final AQt A01 = AQt.A01(r302, this, 13);
                            return new 1LH(parentFragmentManager, pauseDuration, pauseDurationController, pauseReasonController, pausedReasonData, A0j, str2, A01, gc5, j) { // from class: X.8dy
                                public final long A00;
                                public final 06Z A01;
                                public final PauseDuration A02;
                                public final PausedReasonData A03;
                                public final MigColorScheme A04;
                                public final String A05;
                                public final C00m A06;
                                public final C0Bd A07;
                                public final PauseDurationController A08;
                                public final PauseReasonController A09;

                                {
                                    7zR.A1N(A0j, str2);
                                    this.A04 = A0j;
                                    this.A01 = parentFragmentManager;
                                    this.A05 = str2;
                                    this.A00 = j;
                                    this.A02 = pauseDuration;
                                    this.A03 = pausedReasonData;
                                    this.A08 = pauseDurationController;
                                    this.A09 = pauseReasonController;
                                    this.A07 = gc5;
                                    this.A06 = A01;
                                }

                                public 1LI A0s(C2k5 c2k5) {
                                    String A0o;
                                    11T.A0F(c2k5, 0);
                                    C2lh A00 = C2lc.A00(c2k5, new AKM(this, 16));
                                    C2lh A002 = C2lc.A00(c2k5, new AKM(this, 17));
                                    PauseDurationController pauseDurationController2 = this.A08;
                                    PauseReasonController pauseReasonController2 = this.A09;
                                    4FL.A00(c2k5, new AQj(10, this, pauseDurationController2, A00, A002), new Object[]{A00, A002});
                                    4FL.A00(c2k5, new AQj(11, this, pauseReasonController2, A00, A002), new Object[]{A002, A00});
                                    C2sn A0K = 7zR.A0K(c2k5.A05);
                                    2RH r0 = 2RH.A06;
                                    2lO A0c = 7zT.A0c(7zT.A0M((2lO) null, 7zL.A00(r0)), r0);
                                    1Iw AeS = A0K.AeS();
                                    C2sn A0U = 7zQ.A0U(AeS);
                                    1Iw r02 = A0U.A00;
                                    2KD A012 = 2K3.A01(r02, 0);
                                    7zM.A1X(A012, A0U, 2131962973);
                                    A012.A2m();
                                    A012.A2b();
                                    MigColorScheme migColorScheme = this.A04;
                                    A012.A2x(migColorScheme);
                                    4YU.A1M(A012, 2RH.A05);
                                    A012.A2X();
                                    2KD A0d = 7zR.A0d(r02, A0U, A012, 0);
                                    7zR.A1L(migColorScheme, A0d, 3yH.A0A(A0U, this.A05, 2131962972));
                                    A0d.A2X();
                                    7zS.A1O(A0U, A0K, A0c, A0d);
                                    Object obj = A00.A02;
                                    if (obj == PauseDuration.A06) {
                                        A0o = 3yH.A09(A0K, 2131962976);
                                    } else {
                                        A0o = 4YV.A0o(4YU.A0E(AeS), ((PauseDuration) obj).durationHr, 2131820766);
                                        11T.A0D(A0o);
                                    }
                                    CQY A003 = 7zU.A0T().A00(AeS, migColorScheme);
                                    2kW r03 = new 2kW();
                                    r03.A01 = 1;
                                    r03.A07 = new 2kZ(new 2XL((C02A) null, (C2kk) null, (2XO) null, (Boolean) null, (Integer) null, 2.0f, 0, 0, false, false, false, false, false, true), (1cU) null, (Integer) null, false, false);
                                    A003.A00 = r03.A00();
                                    AnonymousClass557 A0V = 7zU.A0V(migColorScheme);
                                    A0V.A01();
                                    7zU.A1S(A0V, A0K, 2131962975);
                                    A0V.A07(A0o);
                                    A0V.A01 = new 9yY(1, pauseDurationController2, A00, this);
                                    A003.A0L(A0V.A00());
                                    AnonymousClass557 A0V2 = 7zU.A0V(migColorScheme);
                                    A0V2.A01();
                                    7zU.A1S(A0V2, A0K, 2131962986);
                                    String str3 = ((PausedReasonData) A002.A02).A01;
                                    if (0CU.A0O(str3)) {
                                        str3 = 3yH.A09(A0K, 2131962984);
                                    }
                                    A0V2.A07(str3);
                                    A0V2.A01 = new 9yY(2, A002, pauseReasonController2, this);
                                    A003.A0L(A0V2.A00());
                                    C8m6 A09 = A003.A09();
                                    11T.A0A(A09);
                                    A0K.A00(A09);
                                    8Ti A013 = 8oM.A01(AeS);
                                    A013.A2Z(migColorScheme);
                                    A013.A2a(3yH.A09(A0K, 2131962974));
                                    9zQ.A01(A013, this, 5);
                                    return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, 7zL.A16(A013.A2W(), A0K), false);
                                }
                            };
                        }
                        str = "pauseReasonController";
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v65, types: [com.facebook.messaging.communitymessaging.pausechat.fragment.PauseDurationController, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, com.facebook.messaging.communitymessaging.pausechat.fragment.PauseReasonController] */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        Parcelable parcelable;
        int A02 = 0FI.A02(1919253502);
        super.onCreate(bundle);
        this.A00 = 1BM.A01(this);
        if (bundle == null) {
            this.A01 = PauseDuration.A02;
            this.A03 = new PausedReasonData(PausedReasonEnum.A04, "");
            ?? obj = new Object();
            obj.A00 = null;
            this.A04 = obj;
            ?? obj2 = new Object();
            obj2.A00 = null;
            this.A05 = obj2;
            parcelable = requireArguments().getParcelable("bottom_sheet_params");
            if (parcelable == null) {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = -554092015;
                0FI.A08(i, A02);
                throw A0N;
            }
            this.A02 = (PauseChatBottomSheetParams) parcelable;
            0FI.A08(-1700948011, A02);
            return;
        }
        Parcelable parcelable2 = bundle.getParcelable("duration");
        if (parcelable2 != null) {
            this.A01 = (PauseDuration) parcelable2;
            Parcelable parcelable3 = bundle.getParcelable("reason");
            if (parcelable3 != null) {
                this.A03 = (PausedReasonData) parcelable3;
                Parcelable parcelable4 = bundle.getParcelable("duration_controller");
                if (parcelable4 != null) {
                    this.A04 = (PauseDurationController) parcelable4;
                    Parcelable parcelable5 = bundle.getParcelable("reason_controller");
                    if (parcelable5 != null) {
                        this.A05 = (PauseReasonController) parcelable5;
                        parcelable = bundle.getParcelable("bottom_sheet_params");
                        if (parcelable == null) {
                            A0N = AnonymousClass001.A0N("Required value was null.");
                            i = -1869837192;
                        }
                        this.A02 = (PauseChatBottomSheetParams) parcelable;
                        0FI.A08(-1700948011, A02);
                        return;
                    }
                    A0N = AnonymousClass001.A0N("Required value was null.");
                    i = -1341053876;
                } else {
                    A0N = AnonymousClass001.A0N("Required value was null.");
                    i = 448080344;
                }
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = -894005069;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -801058331;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        String str;
        11T.A0F(bundle, 0);
        PauseDuration pauseDuration = this.A01;
        if (pauseDuration == null) {
            str = "currentDuration";
        } else {
            bundle.putParcelable("duration", pauseDuration);
            PausedReasonData pausedReasonData = this.A03;
            if (pausedReasonData == null) {
                str = "currentReason";
            } else {
                bundle.putParcelable("reason", pausedReasonData);
                PauseDurationController pauseDurationController = this.A04;
                if (pauseDurationController == null) {
                    str = "pauseDurationController";
                } else {
                    bundle.putParcelable("duration_controller", pauseDurationController);
                    PauseReasonController pauseReasonController = this.A05;
                    if (pauseReasonController == null) {
                        str = "pauseReasonController";
                    } else {
                        bundle.putParcelable("reason_controller", pauseReasonController);
                        PauseChatBottomSheetParams pauseChatBottomSheetParams = this.A02;
                        if (pauseChatBottomSheetParams != null) {
                            bundle.putParcelable("bottom_sheet_params", pauseChatBottomSheetParams);
                            super.onSaveInstanceState(bundle);
                            return;
                        }
                        str = "pauseChatBottomSheetParams";
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
