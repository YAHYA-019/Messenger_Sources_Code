package X;

import android.content.Context;
import android.preference.Preference;
import android.view.View;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.Aep, reason: case insensitive filesystem */
/* loaded from: Aep.class */
public final class C1347Aep extends Preference implements 1lN, DFo, CallerContextable {
    public static final String __redex_internal_original_name = "ContactsSyncingPreference";
    public 1BY A00;
    public BdX A01;
    public 1HN A02;
    public final C09864rq A03;
    public final FbSharedPreferences A04;

    public C1347Aep(1BO r302) {
        super(AbF.A04((1BY) null));
        this.A01 = null;
        this.A00 = 7zL.A0Q(r302);
        FbSharedPreferences A0i = AbJ.A0i();
        C09864rq c09864rq = (C09864rq) 1Bn.A0E((Context) null, (1BY) null, 82436);
        setLayoutResource(2132542934);
        this.A04 = A0i;
        this.A03 = c09864rq;
    }

    @Override // X.DFo
    public void ACE() {
        setTitle(2131959226);
        int i = 2131963637;
        if (this.A03.A02()) {
            i = 2131963638;
        }
        setSummary(i);
        setOnPreferenceClickListener(new CYY(this, 3));
    }

    public String AWg() {
        return "orca_neue_pref";
    }

    public Long Am7() {
        return 459382642025155L;
    }

    @Override // android.preference.Preference
    public void onBindView(View view) {
        super.onBindView(view);
        ACE();
    }
}
