package X;

import android.content.Context;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.acra.constants.ActionId;
import java.util.Iterator;

/* loaded from: EC8.class */
public final class EC8 extends DZJ implements Preference.OnPreferenceChangeListener {
    public static final String __redex_internal_original_name = "SemiFreeMessengerOptinPreferenceFragment";
    public ECK A00;
    public EgL A01;
    public final 1Br A02 = 1BK.A0E();
    public final 1Br A05 = 1Bq.A00(49880);
    public final 1Br A03 = 1Bq.A00(32832);
    public final 1Br A04 = 1Bu.A00(49881);

    public 1iF A1R() {
        return DKH.A0J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        boolean z = !1Br.A09(this.A02).AZn(((1Ky) 1Bn.A0A(98565)).A01("semi_free_messenger_placeholder"), true);
        Context context = getContext();
        if (context != null) {
            PreferenceScreen createPreferenceScreen = ((DZJ) this).A01.createPreferenceScreen(context);
            ECT ect = new ECT(context);
            ect.setLayoutResource(2132542934);
            ect.setTitle(2131965682);
            ect.setSummary(2131965681);
            ect.setChecked(z);
            this.A00 = ect;
            createPreferenceScreen.addPreference(ect);
            ECK eck = this.A00;
            11T.A0D(eck);
            eck.setOnPreferenceChangeListener(this);
            A1X(createPreferenceScreen);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-1891741703);
        super.onActivityCreated(bundle);
        Toolbar toolbar = (Toolbar) 7zL.A0F(this, 2131367286);
        toolbar.A0M(2131965672);
        FXq.A02(toolbar, this, ActionId.PRIVACY_VIOLATION);
        DKH.A1C(this, 2131365481);
        TextView A0D = DKG.A0D(this, 2131367283);
        int i = 2131965678;
        if (1BK.A0N(((5zB) 1Br.A0B(this.A04)).A00).AZk(36311543306587140L)) {
            i = 2131965679;
        }
        String A0j = 0Pz.A0j(getString(i), "<br><br>", getString(2131965680));
        if (A0j == null) {
            A0j = "";
        }
        Spanned fromHtml = Html.fromHtml(A0j);
        11T.A0A(fromHtml);
        A0D.setText(fromHtml);
        0FI.A08(-1292162035, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1895217272);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132543619, viewGroup, false);
        0FI.A08(1465237231, A02);
        return inflate;
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public boolean onPreferenceChange(Preference preference, Object obj) {
        11T.A0F(obj, 1);
        boolean A1V = AnonymousClass001.A1V(obj);
        DKI.A0c(this.A03, A1V);
        if (A1V) {
            Iterator it = ((5zA) 1Br.A0B(this.A05)).A01.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("onFeatureChanged");
            }
        }
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }
}
