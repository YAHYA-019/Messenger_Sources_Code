package com.facebook.messaging.communitymessaging.directadd.disclosurebottomsheet;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Iw;
import X.1Kd;
import X.1LI;
import X.1Um;
import X.1Vd;
import X.22I;
import X.2JX;
import X.2Jf;
import X.2MX;
import X.2Op;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zV;
import X.8Lh;
import X.8TA;
import X.8gP;
import X.9WF;
import X.A1U;
import X.AC8;
import X.C00m;
import X.C3sa;
import X.C8nk;
import X.C9py;
import X.DCw;
import X.DD3;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.communitymessaging.directadd.disclosurebottomsheet.model.DisclosureBottomSheetParentSurface;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: DirectAddDisclosureBottomSheetFragment.class */
public final class DirectAddDisclosureBottomSheetFragment extends MigBottomSheetDialogFragment implements 2Op {
    public static final 9WF A0B = new Object();
    public long A00;
    public FbUserSession A01;
    public 8Lh A02;
    public DisclosureBottomSheetParentSurface A03;
    public 2MX A04;
    public boolean A05;
    public final View.OnClickListener A07;
    public final C00m A08;
    public final C00m A09;
    public volatile boolean A0A = true;
    public final 1Br A06 = 7zM.A0Y();

    public DirectAddDisclosureBottomSheetFragment() {
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        this.A08 = new DCw(this, 46);
        this.A09 = new DCw(this, 47);
        this.A07 = C9py.A03(this, 34);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        Context requireContext;
        int i;
        Context requireContext2;
        int i2;
        11T.A0F(r302, 0);
        if (this.A0A) {
            8TA A00 = C8nk.A00(r302);
            A00.A2Y(A1F());
            A00.A2X(36.0f);
            C8nk A2W = A00.A2W();
            11T.A0D(A2W);
            return A2W;
        }
        8Lh r308 = this.A02;
        if (r308 == null) {
            DisclosureBottomSheetParentSurface disclosureBottomSheetParentSurface = this.A03;
            if (disclosureBottomSheetParentSurface != null) {
                int ordinal = disclosureBottomSheetParentSurface.ordinal();
                if (ordinal == 0) {
                    requireContext = requireContext();
                    i = 2131956712;
                } else {
                    if (ordinal != 1) {
                        throw 1BK.A1F();
                    }
                    requireContext = requireContext();
                    i = 2131956710;
                }
                String string = requireContext.getString(i);
                11T.A0D(string);
                DisclosureBottomSheetParentSurface disclosureBottomSheetParentSurface2 = this.A03;
                if (disclosureBottomSheetParentSurface2 != null) {
                    int ordinal2 = disclosureBottomSheetParentSurface2.ordinal();
                    if (ordinal2 == 0) {
                        requireContext2 = requireContext();
                        i2 = 2131956711;
                    } else {
                        if (ordinal2 != 1) {
                            throw 1BK.A1F();
                        }
                        requireContext2 = requireContext();
                        i2 = 2131956709;
                    }
                    String string2 = requireContext2.getString(i2);
                    11T.A0D(string2);
                    r308 = new 8Lh(string, string2, requireContext().getString(2131956713));
                }
            }
            11T.A0L("disclosureBottomSheetParentSurface");
            throw 0Q8.createAndThrow();
        }
        return new 8gP(this.A07, r308, A1F(), this.A08, this.A09);
    }

    public void CpV(2MX r302) {
        this.A04 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-2127614844);
        super.onCreate(bundle);
        this.A01 = 7zV.A09(this, this.A06);
        Bundle requireArguments = requireArguments();
        Parcelable parcelable = requireArguments.getParcelable("parent_surface");
        if (parcelable == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(573971903, A02);
            throw A0h;
        }
        this.A03 = (DisclosureBottomSheetParentSurface) parcelable;
        this.A00 = requireArguments.getLong("community_id");
        Context requireContext = requireContext();
        if (this.A01 == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        String valueOf = String.valueOf(this.A00);
        DD3 dd3 = new DD3(this, 26);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05("community_id", valueOf);
        C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "DirectAddBottomSheetQuery", (String) null, "fbandroid", 1038299190, 0, 900371189L, 900371189L, false, true));
        AC8 A00 = AC8.A00(dd3, 7);
        1Vd A0K = 7zM.A0K(requireContext);
        11T.A0A(A0K);
        1Kd.A0E(A00, A0K.A09(A0L));
        0FI.A08(1411228801, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(179547490);
        if (!this.A05) {
            FbUserSession fbUserSession = this.A01;
            if (fbUserSession == null) {
                7zL.A1C();
                throw 0Q8.createAndThrow();
            }
            22I r0 = (22I) 7zN.A0m(this, fbUserSession, 33183);
            long j = this.A00;
            1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0P = 1BK.A0P(AQV);
            1Um.A02(AQV, new A1U(r0, A0P, 5, j), A0P, false);
        }
        super.onDestroy();
        0FI.A08(-1390688781, A02);
    }
}
