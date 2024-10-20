package com.facebook.messaging.users.displayname;

import X.07S;
import X.0Dc;
import X.0FI;
import X.0NA;
import X.1BK;
import X.1BL;
import X.1Bn;
import X.1Ho;
import X.1VX;
import X.1iF;
import X.1pK;
import X.2FP;
import X.2Jf;
import X.4YU;
import X.4YV;
import X.5iG;
import X.7zL;
import X.7zM;
import X.7zO;
import X.7zP;
import X.7zR;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbK;
import X.AbM;
import X.AbstractC05414dq;
import X.AeR;
import X.AnonymousClass001;
import X.BtO;
import X.C00i;
import X.C1360Af2;
import X.C15h;
import X.C1606Amn;
import X.C2121Dea;
import X.C30G;
import X.C3sa;
import X.CZF;
import X.D2l;
import X.DBe;
import X.DKS;
import X.HWO;
import X.HWP;
import X.I3G;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.error.GraphQLError;
import com.facebook.graphql.error.GraphServicesExceptionMigrationAdapter;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: ChangeDisplayNameSettingsFragment.class */
public class ChangeDisplayNameSettingsFragment extends 1pK implements CallerContextable {
    public TextView A00;
    public TextView A01;
    public BlueServiceOperationFactory A02;
    public 1Ho A03;
    public HWO A04;
    public EditDisplayNameEditText A05;
    public I3G A06;
    public 5iG A07;
    public C15h A08;
    public InputMethodManager A09;
    public FbUserSession A0A;
    public BtO A0B;
    public ListenableFuture A0C;
    public final C00i A0D = AbH.A0D();

    public static void A03(ChangeDisplayNameSettingsFragment changeDisplayNameSettingsFragment) {
        ListenableFuture listenableFuture = changeDisplayNameSettingsFragment.A0C;
        if (listenableFuture == null || listenableFuture.isDone()) {
            7zR.A12(changeDisplayNameSettingsFragment.A05, changeDisplayNameSettingsFragment.A09);
            BtO btO = changeDisplayNameSettingsFragment.A0B;
            FbUserSession fbUserSession = changeDisplayNameSettingsFragment.A0A;
            fbUserSession.getClass();
            EditDisplayNameEditText editDisplayNameEditText = changeDisplayNameSettingsFragment.A05;
            String A0u = AbM.A0u(editDisplayNameEditText.A04 ? editDisplayNameEditText.A00 : editDisplayNameEditText.A01);
            EditDisplayNameEditText editDisplayNameEditText2 = changeDisplayNameSettingsFragment.A05;
            String A0u2 = AbM.A0u(editDisplayNameEditText2.A04 ? editDisplayNameEditText2.A01 : editDisplayNameEditText2.A00);
            C30G A0H = AbF.A0H(88);
            07S A0J = 4YU.A0J(GraphQlCallInput.A02, A0u, "first_name");
            07S.A00(A0J, A0u2, "last_name");
            4YV.A1A(A0J, ((2Jf) A0H).A00, "input");
            C3sa A00 = C3sa.A00(A0H);
            AbstractC05414dq A09 = 1VX.A09(1BK.A04(btO.A01), fbUserSession);
            4YU.A1J(A00, 2971616476299527L);
            changeDisplayNameSettingsFragment.A0C = 2FP.A02(new D2l(btO, 13), AeR.A01(A09.A03(A00)), btO.A03);
            changeDisplayNameSettingsFragment.A06.A01("edit_name_preview_started");
            changeDisplayNameSettingsFragment.A07.A04(new C1606Amn(changeDisplayNameSettingsFragment, 15), changeDisplayNameSettingsFragment.A0C, "change_name_preview");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A06(ChangeDisplayNameSettingsFragment changeDisplayNameSettingsFragment, Throwable th) {
        String string = changeDisplayNameSettingsFragment.getString(2131957335);
        String string2 = changeDisplayNameSettingsFragment.getString(2131962057);
        GraphQLError graphQLErrorFromException = GraphServicesExceptionMigrationAdapter.getGraphQLErrorFromException(th);
        if (graphQLErrorFromException != null) {
            string = graphQLErrorFromException.summary;
            string2 = graphQLErrorFromException.description;
        }
        C2121Dea c2121Dea = new C2121Dea(changeDisplayNameSettingsFragment.getContext());
        c2121Dea.A0B(string);
        c2121Dea.A0A(string2);
        c2121Dea.A08((DialogInterface.OnClickListener) null);
        ((DKS) c2121Dea).A01.A0I = true;
        c2121Dea.A04();
    }

    public 1iF A1R() {
        return AbK.A0E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A0A = 1BL.A0G(this);
        this.A08 = DBe.A00(this, ActionId.FILE_SYSTEM_FAIL);
        this.A07 = (5iG) 1Bn.A0A(49829);
        this.A0B = (BtO) 7zO.A0l(this, 84475);
        this.A02 = (BlueServiceOperationFactory) 7zO.A0l(this, 33031);
        this.A09 = (InputMethodManager) 7zO.A0m(this, 100189);
        this.A06 = (I3G) 1Bn.A0A(116222);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1835434172);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132541685);
        0FI.A08(1547638993, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(1319831674);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        5iG r0 = this.A07;
        if (r0 != null) {
            r0.A02();
        }
        0FI.A08(445025763, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A05 = (EditDisplayNameEditText) 7zL.A0F(this, 2131363780);
        this.A01 = (TextView) 7zL.A0F(this, 2131362962);
        this.A00 = (TextView) 7zL.A0F(this, 2131362960);
        User A0x = AbF.A0x(this.A08);
        EditDisplayNameEditText editDisplayNameEditText = this.A05;
        editDisplayNameEditText.A02 = new HWP(this);
        Name name = A0x.A0X;
        String str = name.firstName;
        String str2 = name.lastName;
        (editDisplayNameEditText.A04 ? editDisplayNameEditText.A00 : editDisplayNameEditText.A01).setText(str);
        (editDisplayNameEditText.A04 ? editDisplayNameEditText.A01 : editDisplayNameEditText.A00).setText(str2);
        C1360Af2 c1360Af2 = new C1360Af2(this, AnonymousClass001.A03(0NA.A0A(getContext(), 2130969141).get()));
        0Dc A0P = 7zP.A0P(requireContext());
        A0P.A01(2131956252);
        A0P.A05(c1360Af2, "[[learn_more_link]]", getString(2131956251), 33);
        this.A01.setMovementMethod(LinkMovementMethod.getInstance());
        this.A01.setText(7zM.A0E(A0P));
        CZF.A01(this.A00, this, 73);
    }
}
