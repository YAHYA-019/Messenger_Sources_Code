package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Transformations;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.events.extension.eventrsvp.viewdata.uimodel.EventRsvpState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.mapbox.mapboxsdk.style.layers.Property;

/* renamed from: X.Am0, reason: case insensitive filesystem */
/* loaded from: Am0.class */
public final class C1581Am0 extends 1pK implements DF3 {
    public static final String __redex_internal_original_name = "EventRsvpExtensionFragment";
    public long A00;
    public long A01;
    public 6Je A02;
    public String A03;
    public String A04;
    public LithoView A05;
    public String A06;
    public final 1Br A0A = 1Bu.A02(this, 83368);
    public final 1Br A09 = 1Bu.A00(83369);
    public final 1Br A07 = 7zN.A0I(this);
    public final 1Br A08 = 1Bu.A00(83314);

    public static final void A03(C1581Am0 c1581Am0) {
        6Je r0 = c1581Am0.A02;
        if (r0 != null) {
            r0.CvW(((C6z) 1Br.A0B(c1581Am0.A09)).A00().A02);
        }
        C96f[] c96fArr = C8ge.A07;
        MigColorScheme A0m = 7zQ.A0m(c1581Am0.A07);
        C1769As3 c1769As3 = ((Brp) 1Br.A0B(c1581Am0.A0A)).A01;
        boolean z = c1769As3 != null ? c1769As3.A09 : false;
        C00i c00i = c1581Am0.A09.A00;
        1LI c8ge = new C8ge(c1581Am0, ((C6z) c00i.get()).A00().A00, ((C6z) c00i.get()).A00().A01, A0m, z);
        LithoView lithoView = c1581Am0.A05;
        if (lithoView == null) {
            AbF.A1G();
            throw 0Q8.createAndThrow();
        }
        lithoView.A0y(c8ge);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        String str;
        String string = requireArguments().getString("arg_parent_surface");
        if (string == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A04 = string;
        this.A01 = requireArguments().getLong("arg_thread_id");
        this.A00 = requireArguments().getLong("arg_event_id");
        this.A03 = requireArguments().getString("arg_community_id");
        String string2 = requireArguments().getString("arg_source");
        if (string2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A06 = string2;
        C0M c0m = (C0M) 1Br.A0B(this.A08);
        String valueOf = String.valueOf(this.A00);
        String str2 = this.A03;
        String str3 = this.A06;
        if (str3 == null) {
            str = Property.SYMBOL_Z_ORDER_SOURCE;
        } else {
            String str4 = this.A04;
            if (str4 != null) {
                1UG A07 = AbL.A07(c0m.A00);
                if (A07.isSampled()) {
                    AbF.A1M(A07, "impression");
                    A07.A7R("community_id", str2);
                    AbF.A1L(A07, "event_rsvp_sheet_rendered");
                    A07.A7R("surface", "rsvp_sheet");
                    A07.A7R(Property.SYMBOL_Z_ORDER_SOURCE, str3);
                    A07.A5c(str4.equals("thread_view") ? BOr.A0o : str4.equals("qp_banner") ? BOr.A0e : null, "parent_surface");
                    A07.A6J("client_extras", 1BK.A1D("event_id", valueOf));
                    AbJ.A1N(A07);
                    return;
                }
                return;
            }
            str = "parentSurface";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.DF3
    public void CmU(6Je r302) {
        this.A02 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(847901585);
        LithoView A0M = 7zR.A0M(this);
        this.A05 = A0M;
        0FI.A08(-656969340, A02);
        return A0M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1769379023);
        super/*androidx.fragment.app.Fragment*/.onResume();
        A03(this);
        0FI.A08(1774345468, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("arg_rsvp_state", ((C6z) 1Br.A0B(this.A09)).A00());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("arg_rsvp_state");
            if (parcelable == null) {
                throw 1BK.A0h();
            }
            ((C6z) 1Br.A0B(this.A09)).A01((EventRsvpState) parcelable);
        }
        FbUserSession A01 = 1BM.A01(this);
        Brp brp = (Brp) 1Br.A0B(this.A0A);
        long j = this.A00;
        long j2 = this.A01;
        C00i c00i = this.A09.A00;
        C6z c6z = (C6z) c00i.get();
        1BK.A1J(A01, 0, c6z);
        brp.A00 = c6z;
        if (bundle == null) {
            CaE.A03(this, Transformations.map(((C89v) 4YU.A0o(A01, brp.A02, 67869)).A01(j2), new DD2(j, 0)), brp, 39);
        }
        CaE.A03(getViewLifecycleOwner(), ((C6z) c00i.get()).A00, this, 38);
    }
}
