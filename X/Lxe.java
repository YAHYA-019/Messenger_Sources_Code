package X;

import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Lxe.class */
public final class Lxe extends Thread {
    public static final String __redex_internal_original_name = "AutofillController$3";
    public final /* synthetic */ C3243Jnf A00;
    public final /* synthetic */ AbstractC3252Jnp A01;

    public Lxe(C3243Jnf c3243Jnf, AbstractC3252Jnp abstractC3252Jnp) {
        this.A00 = c3243Jnf;
        this.A01 = abstractC3252Jnp;
    }

    public static final 8Lq A00(KoZ koZ, String str) {
        LinkedHashMap A0G;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            JSONObject A1F = DKC.A1F(str);
            Iterator<String> keys = A1F.keys();
            11T.A0A(keys);
            C07w A09 = 0AK.A09(keys);
            A0G = 1BK.A1C();
            Iterator it = A09.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                A0G.put(next, A1F.optString((String) next));
            }
        } catch (JSONException unused) {
            koZ.A00("Wrong JSON format stored for parsing contact data");
            A0G = 04R.A0G();
        }
        return Kvk.A00(A0G);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C3243Jnf c3243Jnf = this.A00;
        50K r0 = (50K) 1Bn.A0F(SystemWebView.A00(this.A01), 50K.class, (Class) null);
        C00i c00i = r0.A03;
        FbSharedPreferences A0R = 1BK.A0R(c00i);
        1G2 r02 = r0.A07;
        String BD0 = A0R.BD0(1G3.A01(r02, "cross_app"));
        String BD02 = 1BK.A0R(c00i).BD0(1G3.A01(r02, "default"));
        String BD03 = 1BK.A0R(c00i).BD0(1G3.A01(r02, "recent"));
        C11424wg c11424wg = c3243Jnf.A0c.A00;
        KoZ koZ = c3243Jnf.A0d;
        1BK.A1K(c11424wg, 3, koZ);
        C82b c82b = c11424wg.A0K;
        c82b.A00 = A00(koZ, BD0);
        c82b.A01 = A00(koZ, BD02);
        c82b.A02 = A00(koZ, BD03);
    }
}
