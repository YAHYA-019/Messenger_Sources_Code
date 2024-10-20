package X;

import android.content.Context;
import android.preference.Preference;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.Aeo, reason: case insensitive filesystem */
/* loaded from: Aeo.class */
public final class C1346Aeo extends Preference implements 1lN, DFo {
    public static final String __redex_internal_original_name = "ManageContactsPreference";
    public C00i A00;
    public C00i A01;
    public C00i A02;
    public final C00i A03;
    public final C00i A04;

    public C1346Aeo(Context context) {
        super(context);
        this.A04 = 1BQ.A00();
        this.A03 = 1BQ.A02(66347);
        setLayoutResource(2132542934);
        this.A00 = 7zL.A0R(context, 84020);
        this.A02 = AbH.A0P();
        this.A01 = 1BQ.A02(16849);
    }

    @Override // X.DFo
    public void ACE() {
        FbUserSession A0C = 4YV.A0C(getContext());
        setTitle(2131965787);
        setOnPreferenceClickListener(new CYZ(A0C, this, 0));
    }

    public String AWg() {
        return "orca_neue_pref";
    }

    public Long Am7() {
        return 403510637743228L;
    }

    @Override // android.preference.Preference
    public void onBindView(View view) {
        super.onBindView(view);
        ACE();
    }
}
