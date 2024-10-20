package com.facebook.graphql.query;

import X.07S;
import X.1BL;
import X.2Jd;
import X.AnonymousClass001;
import com.facebook.graphql.calls.GraphQlCallInput;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: GraphQlQueryParamSet.class */
public final class GraphQlQueryParamSet {
    public 2Jd A00;

    public GraphQlQueryParamSet() {
        this.A00 = new GraphQlCallInput();
    }

    public GraphQlQueryParamSet(Map map) {
        this();
        2Jd r0 = this.A00;
        r0.A04(r0.A03(), map);
    }

    public TreeMap A00() {
        2Jd r0 = this.A00;
        TreeMap treeMap = new TreeMap();
        GraphQlCallInput.A02(r0.A00, r0, treeMap);
        return treeMap;
    }

    public void A01(GraphQlCallInput graphQlCallInput, String str) {
        if (graphQlCallInput != null) {
            this.A00.A05(graphQlCallInput, str);
        }
    }

    public void A02(Object obj, String str) {
        if (obj != null) {
            2Jd r0 = this.A00;
            if (obj instanceof String) {
                r0.A09(str, (String) obj);
                return;
            }
            if (obj instanceof Number) {
                07S.A00(r0.A03(), obj, str);
                return;
            }
            if (obj instanceof Boolean) {
                r0.A06(str, (Boolean) obj);
                return;
            }
            if (obj instanceof Enum) {
                07S.A00(r0.A03(), obj.toString(), str);
            } else if (obj instanceof List) {
                r0.A0A(str, (List) obj);
            } else {
                if (!(obj instanceof GraphQlCallInput)) {
                    throw 1BL.A0e(obj, "Value is not type that can be added. Actual value type: ", AnonymousClass001.A0k());
                }
                r0.A05((GraphQlCallInput) obj, str);
            }
        }
    }

    public void A03(String str, Boolean bool) {
        if (bool != null) {
            this.A00.A06(str, bool);
        }
    }

    public void A04(String str, Number number) {
        if (number != null) {
            07S.A00(this.A00.A03(), number, str);
        }
    }

    public void A05(String str, String str2) {
        if (str2 != null) {
            this.A00.A09(str, str2);
        }
    }

    public void A06(String str, List list) {
        if (list != null) {
            this.A00.A0A(str, list);
        }
    }
}
