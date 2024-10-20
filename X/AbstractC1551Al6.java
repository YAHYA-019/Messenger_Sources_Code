package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLEventCreationEntryPoint;
import com.facebook.messaging.communitymessaging.events.creation.EventCreationState;
import java.util.Calendar;

/* renamed from: X.Al6, reason: case insensitive filesystem */
/* loaded from: Al6.class */
public abstract class AbstractC1551Al6 extends 1pK {
    public static final int A09 = View.generateViewId();
    public static final String __redex_internal_original_name = "BaseEventCreationFragment";
    public long A00;
    public CfG A01;
    public CNk A02;
    public DIQ A03;
    public String A04;
    public FbUserSession A05;
    public final 1Br A06 = 7zN.A0I(this);
    public final 1Br A07 = 1Bq.A00(83384);
    public final C6e A08 = new C6e(this);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [androidx.fragment.app.Fragment, X.B4N] */
    public void A1B(Bundle bundle) {
        Object A11;
        super.A1B(bundle);
        boolean z = this instanceof B4N;
        if (z) {
            ?? r0 = (B4N) this;
            Integer num = r0.A04;
            if (num == null) {
                11T.A0L("eventThreadType");
                throw 0Q8.createAndThrow();
            }
            int intValue = num.intValue();
            if (intValue == 0) {
                2S3 r02 = r0.A05;
                r0.requireContext();
                A11 = 7zQ.A11(r02, 83388);
            } else {
                if (intValue != 1) {
                    throw 1BK.A1F();
                }
                2S3 r03 = r0.A05;
                11T.A0F(r03, 1);
                A11 = r03.A00(83387);
            }
        } else {
            A11 = 7zQ.A11(((B4M) this).A05, 83387);
        }
        DIQ diq = (DIQ) A11;
        11T.A0F(diq, 0);
        this.A03 = diq;
        diq.BPI(((Fragment) this).requireContext(), ((Fragment) this).requireArguments(), (LifecycleOwner) this, z ? ((B4N) this).A05 : ((B4M) this).A05);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A05 = 1BM.A01(this);
        this.A00 = requireArguments().getLong("arg_community_id");
    }

    public final CNk A1X() {
        CNk cNk = this.A02;
        if (cNk != null) {
            return cNk;
        }
        11T.A0L("eventCreationUiModel");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1Y(GraphQLEventCreationEntryPoint graphQLEventCreationEntryPoint, String str) {
        String str2;
        CIV civ = (CIV) 1Br.A0B(this.A07);
        Calendar calendar = CNk.A00(this).A08;
        11T.A0F(calendar, 0);
        if (calendar.getTimeInMillis() < CIV.A00(civ).getTimeInMillis()) {
            DR6 A0K = AbL.A0K(7zM.A0C(this, 67527), this.A06);
            A0K.A00(2131956606);
            A0K.A06(2131956605);
            A0K.A09(CRi.A00);
            A0K.A05();
            return;
        }
        CfG cfG = this.A01;
        if (cfG == null) {
            cfG = ((CHy) 7zO.A0l(this, 82650)).A01(requireContext(), 2131955223);
            this.A01 = cfG;
        }
        cfG.ABm();
        DIQ diq = this.A03;
        if (diq != null) {
            FbUserSession fbUserSession = this.A05;
            if (fbUserSession != null) {
                diq.D1d(requireContext(), fbUserSession, graphQLEventCreationEntryPoint, this.A08, str);
                return;
            }
            str2 = "fbUserSession";
        } else {
            str2 = "eventCreationViewData";
        }
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02d8  */
    /* JADX WARN: Type inference failed for: r0v85, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r1v28, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r301v0, types: [X.Al6, androidx.fragment.app.Fragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1Z(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1551Al6.A1Z(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        DEt dEt;
        DEr dEr;
        11T.A0F(fragment, 0);
        super.onAttachFragment(fragment);
        if ((fragment instanceof DEr) && (dEr = (DEr) fragment) != null) {
            dEr.CmT(this instanceof B4N ? ((B4N) this).A06 : ((B4M) this).A06);
        }
        if (!(fragment instanceof DEt) || (dEt = (DEt) fragment) == null) {
            return;
        }
        dEt.Cp6(this instanceof B4N ? ((B4N) this).A05 : ((B4M) this).A05);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putString("arg_active_fragment_type", this.A04);
        bundle.putLong("arg_community_id", this.A00);
        bundle.putParcelable("arg_creation_view_data", CNk.A00(this));
        DIQ diq = this.A03;
        if (diq != null) {
            bundle.putParcelable("arg_view_data_state", diq.BC7());
        } else {
            11T.A0L("eventCreationViewData");
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        String string = bundle != null ? bundle.getString("arg_active_fragment_type") : null;
        this.A04 = string;
        if (string == null) {
            A1Z("create_event");
        }
        getChildFragmentManager().A1O(new CZm(this, 3), getViewLifecycleOwner(), "request_key_location_click");
        getChildFragmentManager().A1O(new CZm(this, 4), getViewLifecycleOwner(), "request_key_details_click");
        getChildFragmentManager().A1O(new CZm(this, 5), getViewLifecycleOwner(), "request_key_external_url_click");
        getChildFragmentManager().A1O(new CZm(this, 6), getViewLifecycleOwner(), "request_key_location_submitted");
        getChildFragmentManager().A1O(new CZm(this, 7), getViewLifecycleOwner(), "request_key_external_link_submitted");
        2S3 r304 = this instanceof B4N ? ((B4N) this).A05 : ((B4M) this).A05;
        ((Fragment) this).requireContext();
        CNk cNk = (CNk) 7zQ.A11(r304, 83383);
        11T.A0F(cNk, 0);
        this.A02 = cNk;
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("arg_creation_view_data");
            if (parcelable == null) {
                throw 1BK.A0h();
            }
            A1X().A03((EventCreationState) parcelable);
            Parcelable parcelable2 = bundle.getParcelable("arg_view_data_state");
            if (parcelable2 != null) {
                DIQ diq = this.A03;
                if (diq != null) {
                    diq.BYy(((Fragment) this).requireContext(), parcelable2);
                } else {
                    11T.A0L("eventCreationViewData");
                    throw 0Q8.createAndThrow();
                }
            }
        }
    }
}
