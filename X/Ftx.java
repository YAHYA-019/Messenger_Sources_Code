package X;

import com.facebook.zero.sdk.json.JSONObjectImpl;
import java.util.Iterator;

/* loaded from: Ftx.class */
public final class Ftx implements GGj {
    public final 1Q7 A00;

    public Ftx(1Q7 r302) {
        this.A00 = r302;
    }

    public static JSONObjectImpl A00(1QC r301) {
        Ezt ezt = new Ezt();
        Iterator A00 = Fue.A00(r301);
        while (A00.hasNext()) {
            ET7 et7 = (ET7) A00.next();
            3oG r0 = (3oG) et7.A01;
            if (r0 != null) {
                ezt.A01(r0.D4O(), (String) et7.A00);
            }
        }
        return ezt.A00();
    }

    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        EDq eDq = (AbstractC10314t5) obj;
        if (eDq instanceof EDq) {
            try {
                EDq eDq2 = eDq;
                1Q7 r0 = this.A00;
                1Q9 r02 = eDq2.A00;
                Ezt ezt = new Ezt();
                ezt.A01(A00(r02.A03), "token_cache");
                ezt.A01(A00(r02.A04), "token_metadata");
                ezt.A03("is_fetching_normal_token", Boolean.valueOf(r02.A07));
                ezt.A03("is_fetching_dialtone_token", Boolean.valueOf(r02.A06));
                ezt.A05("active_token_type", r02.A01.mValue);
                1QF r03 = r02.A02;
                Ezt ezt2 = new Ezt();
                ezt2.A03("use_default_token_if_current_stale", Boolean.valueOf(r03.A02));
                ezt2.A03("only_fetch_token_in_foreground", Boolean.valueOf(r03.A01));
                3oF r04 = r03.A00;
                if (r04 != null) {
                    ezt2.A01(r04.D4O(), "default_token");
                }
                ezt.A01(ezt2.A00(), "integration_config");
                ezt.A05("network_hash", r02.A05);
                ezt.A03("is_in_unknown_state", Boolean.valueOf(r02.A08));
                r0.A01("zero_token", 11T.A02(ezt.A00().nodeInner));
            } catch (Exception unused) {
            }
        }
    }
}
