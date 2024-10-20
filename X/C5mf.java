package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.5mf, reason: invalid class name */
/* loaded from: 5mf.class */
public final class C5mf implements C5kd {
    public static final C5mf A00 = new Object();
    public static final C5g3 A01 = C5mg.A00;

    @Override // X.C5kd
    public C5g3 Asj() {
        return A01;
    }

    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        C5g9 A02;
        ImmutableList A05;
        8Nq r313;
        11T.A0F(r303, 0);
        C5g9 B6D = r303.B6D(i);
        if (B6D == null || (A02 = B6D.A02(7dY.class, "inline_entities")) == null || (A05 = new C5g9(A02.A00).A05("entities", 7dO.class)) == null) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            A0s.add(new C5g9(((C5g9) it.next()).A00));
        }
        LinkedHashMap A1C = 1BK.A1C();
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            C5g9 c5g9 = (C5g9) it2.next();
            JSONObject jSONObject = c5g9.A00;
            03Y A13 = 4YV.A13(Integer.valueOf(jSONObject.optInt("offset")), jSONObject.optInt("length"));
            Object obj = A1C.get(A13);
            if (obj == null) {
                obj = AnonymousClass001.A0s();
                A1C.put(A13, obj);
            }
            List list = (List) obj;
            int ordinal = c5g9.A06(97M.A02, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE).ordinal();
            String str = null;
            if (ordinal == 1) {
                C5g9 A022 = c5g9.A02(7dQ.class, "metadata");
                if (A022 != null) {
                    JSONObject jSONObject2 = A022.A00;
                    if (!jSONObject2.isNull("search_query")) {
                        str = jSONObject2.optString("search_query");
                    }
                }
                String A07 = c5g9.A07("action_label");
                if (A07 == null) {
                    A07 = "Get info";
                }
                r313 = new 8Nq(Integer.valueOf(jSONObject.optInt("context_token_type")), str, A07, c5g9.A07("context_token"));
            } else if (ordinal != 2) {
                r313 = C7wD.A00;
            } else {
                C5g9 A023 = c5g9.A02(7dQ.class, "metadata");
                if (A023 != null) {
                    JSONObject jSONObject3 = A023.A00;
                    if (!jSONObject3.isNull("reminder_topic")) {
                        str = jSONObject3.optString("reminder_topic");
                    }
                }
                r313 = new 8Np(str);
            }
            list.add(r313);
        }
        return new 8Nx(A1C);
    }

    @Override // X.C5kd
    public Integer B7X() {
        return null;
    }
}
