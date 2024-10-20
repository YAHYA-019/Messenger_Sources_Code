package com.facebook.orca.notify.mute;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Br;
import X.1Bu;
import X.1F9;
import X.1Lo;
import X.1iF;
import X.2Ov;
import X.2fE;
import X.2oI;
import X.7zT;
import X.AbF;
import X.AbH;
import X.AbI;
import X.AbM;
import X.AnonymousClass001;
import X.BLP;
import X.BLc;
import X.Bix;
import X.Bm9;
import X.BvJ;
import X.CMQ;
import X.CPS;
import X.Cnh;
import X.Cu6;
import X.DFT;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: MuteNotificationsDialogFragment.class */
public final class MuteNotificationsDialogFragment extends 2Ov {
    public FbUserSession A01;
    public 1F9 A02;
    public ThreadKey A03;
    public BLc A04;
    public BLP A05;
    public DFT A06;
    public MigColorScheme A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public final 1Br A0F = 1Bu.A02(this, 17010);
    public final 1Br A0C = 1Bu.A02(this, 83039);
    public final 1Br A0D = 1Bu.A00(83040);
    public final 1Br A0E = 1Bu.A00(83231);
    public int A00 = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        String str;
        String str2;
        int i;
        BLP blp = this.A05;
        if (blp != null) {
            if (blp == BLP.A05) {
                1Br.A0C(this.A0D);
                Context requireContext = requireContext();
                int i2 = this.A00;
                Bm9 bm9 = (Bm9) 1Br.A0B(this.A0E);
                if (bm9.A00 == null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    bm9.A00 = A0s;
                    A0s.add(new Cu6(BLP.A03, 1BK.A0u(FbInjector.A03, 2131967041)));
                    List list = bm9.A00;
                    if (list != null) {
                        list.add(new Cu6(BLP.A02, 1BK.A0u(FbInjector.A03, 2131967039)));
                    }
                    List list2 = bm9.A00;
                    if (list2 != null) {
                        list2.add(new Cu6(BLP.A04, 1BK.A0u(FbInjector.A03, 2131967040)));
                    }
                }
                return new CMQ(requireContext, this.A07, new Bix(this), 1BL.A0a(bm9.A00), i2).A03;
            }
            BLc bLc = this.A04;
            str = "muteEntryPoint";
            if (bLc != null) {
                int ordinal = bLc.ordinal();
                String A00 = 1BJ.A00(2074);
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        str2 = "thread_settings";
                        i = 1816;
                    } else if (ordinal == 2) {
                        str2 = 1BJ.A00(2077);
                        i = 2076;
                    } else if (ordinal != 8) {
                        str2 = "messenger";
                        i = 2075;
                    } else {
                        str2 = "messenger_inbox";
                    }
                    A00 = 1BJ.A00(i);
                } else {
                    str2 = "channel_list";
                }
                CPS cps = (CPS) 1Br.A0B(this.A0C);
                FbUserSession fbUserSession = this.A01;
                if (fbUserSession == null) {
                    str = "fbUserSession";
                } else {
                    Context requireContext2 = requireContext();
                    BLP blp2 = this.A05;
                    if (blp2 != null) {
                        ThreadKey threadKey = this.A03;
                        if (threadKey == null) {
                            str = "threadKey";
                        } else {
                            int i3 = this.A00;
                            BLc bLc2 = this.A04;
                            if (bLc2 != null) {
                                String str3 = this.A0B;
                                if (str3 != null) {
                                    String str4 = this.A0A;
                                    String str5 = this.A08;
                                    String str6 = this.A09;
                                    MigColorScheme migColorScheme = this.A07;
                                    1F9 r0 = this.A02;
                                    DFT dft = this.A06;
                                    Cnh cnh = new Cnh(this);
                                    cps.A00 = dft;
                                    int i4 = 2131967042;
                                    if (2oI.A03(((2fE) 1Lo.A04(requireContext2, fbUserSession, (1BY) null, 17064)).A06(threadKey))) {
                                        i4 = 2131967043;
                                    }
                                    return CPS.A00(requireContext2, r0, threadKey, cnh, migColorScheme, new BvJ(fbUserSession, bLc2, blp2, cps, str3), cps, str4, str5, str6, str2, A00, i4, i3);
                                }
                                str = "requestId";
                            }
                        }
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        str = "muteType";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public 1iF A17() {
        return AbF.A0C(301578351120862L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1760489856);
        super.onCreate(bundle);
        this.A01 = 7zT.A08(this);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            throw 1BK.A0h();
        }
        ThreadKey A0k = AbH.A0k(bundle2);
        if (A0k == null) {
            throw 1BK.A0h();
        }
        this.A03 = A0k;
        bundle2.getBoolean("is_mute_type_chooser_flow");
        ThreadKey threadKey = this.A03;
        if (threadKey == null) {
            AbM.A17();
            throw 0Q8.createAndThrow();
        }
        BLP serializable = bundle2.getSerializable("mute_type");
        11T.A0I(serializable, "null cannot be cast to non-null type com.facebook.messaging.notify.bridge.MuteType");
        BLP blp = serializable;
        if (!AbI.A0a(this.A0F).A0A(threadKey.A06)) {
            blp = BLP.A03;
        }
        this.A05 = blp;
        BLc serializable2 = bundle2.getSerializable("mute_entry_point");
        11T.A0I(serializable2, "null cannot be cast to non-null type com.facebook.messaging.notify.bridge.MuteEntryPoint");
        this.A04 = serializable2;
        String string = bundle2.getString(TraceFieldType.RequestID);
        if (string == null) {
            throw 1BK.A0h();
        }
        this.A0B = string;
        int i = -1;
        if (bundle != null) {
            i = bundle.getInt("selected_mute_item", -1);
        }
        this.A00 = i;
        this.A0A = bundle2.getString("message");
        this.A08 = bundle2.getString("community_id");
        this.A09 = bundle2.getString("group_id");
        this.A07 = (MigColorScheme) bundle2.getParcelable("color_scheme");
        this.A02 = bundle2.getSerializable("folder_name");
        0FI.A08(1260509423, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        int i = this.A00;
        if (i != -1) {
            bundle.putInt("selected_mute_item", i);
        }
    }
}
