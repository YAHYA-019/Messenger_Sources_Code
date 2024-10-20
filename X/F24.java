package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* loaded from: F24.class */
public abstract class F24 {
    public static 2Jd A00(java.util.Map map) {
        2Jd A0Q = DKC.A0Q();
        A0Q.A0A("manifest_capabilities", (List) DKC.A12("manifest_capabilities", map));
        C03z c03z = GraphQlCallInput.A02;
        java.util.Map map2 = (java.util.Map) DKC.A12("supported_sdk_versions", map);
        07S A0J = 4YU.A0J(c03z, map2.get("min_version"), "min_version");
        07S.A00(A0J, map2.get("max_version"), "max_version");
        7zN.A17(A0J, A0Q, "supported_sdk_versions");
        Object obj = map.get("texture_compression");
        A0Q.A09("texture_compression", "etc2_compression".equals(obj) ? "ETC" : "pvr_compression".equals(obj) ? "PVR" : "UNCOMPRESSED");
        return A0Q;
    }

    public static ImmutableList A01(java.util.Map map) {
        ImmutableList.Builder A0h = 4YU.A0h();
        Iterator A1B = 1BK.A1B(map);
        while (A1B.hasNext()) {
            String A0i = AnonymousClass001.A0i(A1B);
            2Jd A0Q = DKC.A0Q();
            A0Q.A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0i);
            A0Q.A09("value", String.valueOf(map.get(A0i)));
            A0h.m11011add((Object) A0Q);
        }
        return A0h.build();
    }
}
