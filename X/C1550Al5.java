package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.contacts.picker.SingleTapActionConfig;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.neue.contactpicker.ContactPickerParams;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.Al5, reason: case insensitive filesystem */
/* loaded from: Al5.class */
public final class C1550Al5 extends 1pK {
    public static final String __redex_internal_original_name = "CombinedInviteFriendsFragment";
    public 2TV A00;
    public LithoView A01;
    public Beg A02;
    public ContactPickerParams A03;
    public C6P A04;
    public DJk A05;
    public MigColorScheme A06;
    public ImmutableList A07;
    public Context A09;
    public FbUserSession A0A;
    public C1qb A0B;
    public Beh A0C;
    public Set A08 = AnonymousClass001.A0v();
    public final C2kx A0D = new C2kx();
    public final C1sy A0E = new CxA(this, 5);

    /* JADX WARN: Removed duplicated region for block: B:26:0x018a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(X.C1550Al5 r301) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1550Al5.A03(X.Al5):void");
    }

    public 1iF A1R() {
        return AbK.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        ArrayList parcelableArrayList;
        this.A09 = new ContextThemeWrapper(getContext(), 2132607920);
        FbUserSession A0G = 1BL.A0G(this);
        this.A0A = A0G;
        this.A0C = (Beh) 1Bn.A0A(84368);
        AbR A0O = AbF.A0O(this.A09, 408);
        Context context = this.A09;
        Context A01 = FbInjector.A01();
        AbL.A0y(A0O);
        try {
            C6P c6p = new C6P(context, A0G, A0O);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A04 = c6p;
            this.A03 = (ContactPickerParams) requireArguments().getParcelable("params");
            AbJ.A0d().A01(this, this.A0E);
            if (bundle == null || (parcelableArrayList = bundle.getParcelableArrayList("invited_users_key")) == null) {
                return;
            }
            this.A08 = AbF.A1E(parcelableArrayList);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-2069303765);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        this.A03.getClass();
        DJk A00 = this.A04.A00(this.A03);
        this.A05 = A00;
        A00.getClass();
        this.A05.CmR(new Cbt(this, 9));
        DJk dJk = this.A05;
        ContactPickerParams contactPickerParams = this.A03;
        boolean z = contactPickerParams.A0F;
        SingleTapActionConfig singleTapActionConfig = contactPickerParams.A02;
        ImmutableList immutableList = contactPickerParams.A07;
        dJk.D1t(new Bwo(contactPickerParams.A01, null, singleTapActionConfig, contactPickerParams.A06, null, immutableList, z));
        0FI.A08(437376841, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(727927295);
        LithoView A0V = 7zO.A0V(this.A09);
        this.A01 = A0V;
        this.A0B = new C1qb(A0V.A09);
        LithoView lithoView = this.A01;
        0FI.A08(-473671062, A02);
        return lithoView;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.A08.isEmpty()) {
            return;
        }
        bundle.putParcelableArrayList("invited_users_key", 1JW.A02(this.A08));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MigColorScheme A0h = AbK.A0h(this);
        this.A06 = A0h;
        AbG.A1H(this.A01, A0h);
    }
}
