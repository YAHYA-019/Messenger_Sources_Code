package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: Esi.class */
public final class Esi {
    public final java.util.Map A00;
    public final java.util.Map A01;

    public Esi(String str) {
        LinkedHashMap A1C = 1BK.A1C();
        LinkedHashMap A1C2 = 1BK.A1C();
        JSONArray jSONArray = DKC.A1F(str).getJSONArray("assembled_bundles");
        int length = jSONArray.length();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                this.A01 = A1C;
                this.A00 = A1C2;
                return;
            }
            JSONArray jSONArray2 = jSONArray.getJSONObject(i2).getJSONArray("localized_information");
            int length2 = jSONArray2.length();
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 < length2) {
                    JSONObject jSONObject = jSONArray2.getJSONObject(i4);
                    JSONArray jSONArray3 = jSONObject.getJSONObject("meta").getJSONArray("included_bloks_apps_ids");
                    jSONArray3.length();
                    String string = jSONArray3.getJSONObject(0).getString("app_id");
                    String A1A = DKC.A1A("bundle_type", jSONObject);
                    for (Integer num : 0S2.A00(2)) {
                        if ((1 - num.intValue() != 0 ? "prepackaged" : "prebundled").equals(A1A)) {
                            int intValue = num.intValue();
                            if (intValue == 0) {
                                String string2 = jSONObject.getString("locale");
                                String string3 = jSONObject.getJSONObject("public_cdn_url").getString("value");
                                String A1A2 = DKC.A1A("content_security_type", jSONObject);
                                for (Integer num2 : 0S2.A00(2)) {
                                    if ((1 - num2.intValue() != 0 ? "normal" : "secure").equals(A1A2)) {
                                        String string4 = jSONArray3.getJSONObject(0).getString("checksum");
                                        11T.A0D(string4);
                                        11T.A0D(string3);
                                        EIN ein = new EIN(string4, num2, string3);
                                        11T.A0D(string);
                                        11T.A0D(string2);
                                        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s:%s", string, string2);
                                        11T.A0A(formatStrLocaleSafe);
                                        A1C.put(formatStrLocaleSafe, ein);
                                    }
                                }
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                            if (intValue == 1) {
                                String string5 = jSONObject.getJSONObject("prebundled_data").getString("payload_output_file");
                                11T.A0D(string);
                                11T.A0D(string5);
                                A1C2.put(string, new EIM(string5));
                            }
                            i3 = i4 + 1;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b9, code lost:
    
        if (r304 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.EIN A00(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Esi.A00(java.lang.String):X.EIN");
    }
}
