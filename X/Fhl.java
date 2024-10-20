package X;

import android.os.Bundle;
import com.facebook.account.common.model.ContactPointSuggestions;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fhl.class */
public final class Fhl implements 1Ro {
    public static final String __redex_internal_original_name = "ContactPointSuggestionsMethod";
    public 1BY A00;
    public final String A04 = (String) 1Bi.A03(98508);
    public final F9J A01 = (F9J) 1Bn.A0B(99448);
    public final C08554nH A02 = (C08554nH) 1Bi.A03(49257);
    public final C00i A03 = DKD.A0O();

    public Fhl(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        1TC r0 = (1TC) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        F9J f9j = this.A01;
        String A0z = AbJ.A0z(f9j.A05);
        if (A0z != null) {
            A0z = DKC.A18(A0z);
        }
        1Ka A01 = f9j.A01.A01(C1fe.A0C);
        String str = A01 != null ? A01.A01 : null;
        A0s.add(new BasicNameValuePair("reg_instance", this.A04));
        A0s.add(new BasicNameValuePair("phone_id", A0z));
        A0s.add(new BasicNameValuePair("family_id", str));
        if (r0 != null) {
            Bundle bundle = r0.A00;
            String string = bundle.getString("fetch_type");
            String string2 = bundle.getString("header_usage_source");
            if (string != null) {
                A0s.add(new BasicNameValuePair("fetch_type", string));
            }
            if (string2 != null) {
                A0s.add(new BasicNameValuePair("header_usage_source", string2));
            }
            A0s.add(new BasicNameValuePair("format", "json"));
        }
        if (C08554nH.A00(this.A02)) {
            ETV A07 = AbM.A0n(this.A03).A07(1Fw.A05(this.A00), "contact_suggestion");
            A0s.add(new BasicNameValuePair("encrypted_msisdn", A07 != null ? A07.A02 : ""));
        }
        C04083zw A0T = DKC.A0T();
        AbF.A1Q(A0T, "contactPointSuggestions");
        A0T.A0F = "app/prefill_or_autocomplete_contactpoint";
        A0T.A02();
        return DKE.A0X(A0T, A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return anonymousClass439.A00().A1W(ContactPointSuggestions.class);
    }
}
