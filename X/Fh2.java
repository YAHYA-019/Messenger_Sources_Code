package X;

import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fh2.class */
public final class Fh2 implements 1Ro {
    public static final String __redex_internal_original_name = "FetchPrimaryEmailAddressMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("q", "viewer() {primary_email}"), A0s);
        AbF.A1P(A0C, "fetchPrimaryEmailAddress");
        return AbK.A0M(A0C, "graphql", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        String str;
        24X A0D = AbH.A0w(anonymousClass439).A0D("viewer");
        str = "";
        return A0D != null ? C3o5.A0P(A0D, "primary_email", str) : "";
    }
}
