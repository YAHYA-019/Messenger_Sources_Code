package com.facebook.messaging.communitymessaging.adminactions.mutememberoptions;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BM;
import X.1iF;
import X.1lN;
import X.1pI;
import X.1vD;
import X.6EX;
import X.7zK;
import X.7zP;
import X.7zR;
import X.7zS;
import X.AbF;
import X.AbI;
import X.AnonymousClass001;
import X.BSW;
import X.Bcg;
import X.C1rs;
import X.C5xv;
import X.CMk;
import X.QBp;
import X.QMT;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;

/* loaded from: MuteMemberOptionsFragment.class */
public final class MuteMemberOptionsFragment extends SlidingSheetFullScreenDialogFragment implements 1lN {
    public static final BSW A0H = new Object();
    public long A00;
    public long A01;
    public FbUserSession A02;
    public 1pI A03;
    public CMk A04;
    public MigColorScheme A05;
    public User A06;
    public ParcelableSecondaryData A07;
    public Long A08;
    public String A09;
    public String A0A;
    public boolean A0C;
    public boolean A0D;
    public LithoView A0E;
    public C5xv A0F;
    public HashMap A0B = AnonymousClass001.A0u();
    public final Bcg A0G = new Bcg(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static final LithoView A05(MuteMemberOptionsFragment muteMemberOptionsFragment) {
        String obj;
        LithoView lithoView = muteMemberOptionsFragment.A0E;
        String str = "lithoView";
        if (lithoView != null) {
            QBp qBp = new QBp(7zP.A0T(muteMemberOptionsFragment), new QMT());
            boolean A04 = 6EX.A00.A04(muteMemberOptionsFragment.A00);
            QMT qmt = qBp.A01;
            qmt.A0D = A04;
            BitSet bitSet = qBp.A02;
            bitSet.set(9);
            MigColorScheme migColorScheme = muteMemberOptionsFragment.A05;
            if (migColorScheme == null) {
                str = "colorScheme";
            } else {
                qmt.A01 = migColorScheme;
                bitSet.set(0);
                C5xv c5xv = muteMemberOptionsFragment.A0F;
                if (c5xv == null) {
                    str = "upListener";
                } else {
                    qmt.A02 = c5xv;
                    bitSet.set(13);
                    User user = muteMemberOptionsFragment.A06;
                    if (user == null) {
                        str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                    } else {
                        qmt.A03 = user;
                        bitSet.set(14);
                        String str2 = muteMemberOptionsFragment.A0A;
                        if (str2 == null) {
                            str = "selectedMuteLengthIndex";
                        } else {
                            qmt.A07 = str2;
                            bitSet.set(4);
                            String str3 = muteMemberOptionsFragment.A09;
                            if (str3 == null) {
                                str = "adminNotes";
                            } else {
                                qmt.A06 = str3;
                                bitSet.set(3);
                                qmt.A0A = muteMemberOptionsFragment.A0B;
                                bitSet.set(5);
                                qmt.A0C = muteMemberOptionsFragment.A0D;
                                bitSet.set(8);
                                qmt.A00 = muteMemberOptionsFragment.A0G;
                                bitSet.set(10);
                                qBp.A2N(true);
                                qmt.A08 = "primary_bottom_sheet";
                                bitSet.set(6);
                                qmt.A0E = AnonymousClass001.A1N((muteMemberOptionsFragment.A01 > 0L ? 1 : (muteMemberOptionsFragment.A01 == 0L ? 0 : -1)));
                                bitSet.set(11);
                                qmt.A0B = muteMemberOptionsFragment.A0C;
                                bitSet.set(7);
                                qmt.A05 = String.valueOf(muteMemberOptionsFragment.A00);
                                bitSet.set(2);
                                Long l = muteMemberOptionsFragment.A08;
                                if (l == null || (obj = l.toString()) == null) {
                                    throw 1BK.A0h();
                                }
                                qmt.A04 = obj;
                                bitSet.set(1);
                                qmt.A09 = String.valueOf(muteMemberOptionsFragment.A01);
                                bitSet.set(12);
                                C1rs.A05(bitSet, qBp.A03, 15);
                                qBp.A0J();
                                lithoView.A0x(qmt);
                                LithoView lithoView2 = muteMemberOptionsFragment.A0E;
                                if (lithoView2 != null) {
                                    return lithoView2;
                                }
                            }
                        }
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0y() {
        super.A0y();
        7zR.A12(requireView(), 7zS.A0C(requireActivity()));
    }

    public 1iF A17() {
        return AbF.A0C(447151659733423L);
    }

    public String AWg() {
        return "community_silence_member";
    }

    public Long Am7() {
        return 447151659733423L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment, com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public void onCreate(Bundle bundle) {
        boolean z;
        int A02 = 0FI.A02(872040333);
        super.onCreate(bundle);
        String string = requireArguments().getString("selected_mute_length_index");
        if (bundle != null) {
            this.A0A = String.valueOf(bundle.getString("selected_mute_length_index"));
            this.A09 = String.valueOf(bundle.getString("admin_notes"));
            Serializable serializable = bundle.getSerializable("selected_community_rules");
            11T.A0I(serializable, "null cannot be cast to non-null type java.util.HashMap<com.facebook.messaging.communitymessaging.adminactions.mutememberoptions.model.CommunityRule, kotlin.Boolean>{ kotlin.collections.TypeAliasesKt.HashMap<com.facebook.messaging.communitymessaging.adminactions.mutememberoptions.model.CommunityRule, kotlin.Boolean> }");
            this.A0B = (HashMap) serializable;
            this.A0D = bundle.getBoolean("share_with_user");
            z = bundle.getBoolean("delete_recent_messages");
        } else {
            if (string == null) {
                string = "radio_button_tag_24_hr";
            }
            this.A0A = string;
            this.A09 = "";
            z = false;
            this.A0D = false;
        }
        this.A0C = z;
        Bundle requireArguments = requireArguments();
        Parcelable parcelable = requireArguments.getParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        if (parcelable == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-1530210000, A02);
            throw A0h;
        }
        this.A06 = (User) parcelable;
        this.A08 = AbI.A10(requireArguments, "community_id");
        this.A00 = requireArguments.getLong("group_id");
        this.A07 = (ParcelableSecondaryData) requireArguments.getParcelable("extra_data");
        this.A01 = requireArguments.getLong("thread_id");
        this.A02 = 1BM.A01(this);
        0FI.A08(-1522320925, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r302, android.view.ViewGroup r303, android.os.Bundle r304) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.communitymessaging.adminactions.mutememberoptions.MuteMemberOptionsFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onSaveInstanceState(Bundle bundle) {
        String str;
        11T.A0F(bundle, 0);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        String str2 = this.A0A;
        if (str2 == null) {
            str = "selectedMuteLengthIndex";
        } else {
            bundle.putString("selected_mute_length_index", str2);
            String str3 = this.A09;
            if (str3 != null) {
                bundle.putString("admin_notes", str3);
                bundle.putSerializable("selected_community_rules", this.A0B);
                bundle.putBoolean("share_with_user", this.A0D);
                bundle.putBoolean("delete_recent_messages", this.A0C);
                return;
            }
            str = "adminNotes";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        try {
            this.A03 = 1vD.A00(view);
        } catch (IllegalStateException e) {
            0fH.A0p("MuteMemberOptionsFragment", 7zK.A00(289), e);
        }
        Dialog dialog = ((0D2) this).A01;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }
}
