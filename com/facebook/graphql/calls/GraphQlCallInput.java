package com.facebook.graphql.calls;

import X.07S;
import X.0CP;
import X.1BL;
import X.AnonymousClass001;
import X.C03z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: GraphQlCallInput.class */
public abstract class GraphQlCallInput {
    public static final C03z A02 = C03z.A00();
    public C03z A01 = A02;
    public 07S A00 = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r302v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r302v2 */
    /* JADX WARN: Type inference failed for: r302v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r302v5, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r302v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static Object A00(GraphQlCallInput graphQlCallInput, Object obj) {
        String str;
        if (obj == 0) {
            return null;
        }
        if (obj instanceof 0CP) {
            ArrayList arrayList = ((0CP) obj).A00;
            if (arrayList.size() > 0 && (arrayList.get(0) instanceof 07S)) {
                obj = new ArrayList(arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) != null) {
                        obj.add(A00(graphQlCallInput, arrayList.get(i)));
                    }
                }
            } else if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof 0CP)) {
                obj = new ArrayList(arrayList.size());
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    Object obj2 = arrayList.get(i3);
                    if (obj2 == null) {
                        str = null;
                    } else if ((obj2 instanceof Number) || (obj2 instanceof Boolean)) {
                        obj.add(obj2);
                        i2 = i3 + 1;
                    } else {
                        str = obj2.toString();
                    }
                    obj.add(str);
                    i2 = i3 + 1;
                }
            } else {
                obj = 1BL.A10(arrayList);
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (arrayList.get(i4) != null) {
                        obj.add(A00(graphQlCallInput, arrayList.get(i4)));
                    }
                }
            }
        } else if (obj instanceof 07S) {
            TreeMap treeMap = new TreeMap();
            A02((07S) obj, graphQlCallInput, treeMap);
            return treeMap;
        }
        return obj;
    }

    private void A01(0CP r302, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Object obj : list) {
            if (obj != null) {
                if (obj instanceof List) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        A01(r302.A0C(), (List) it.next());
                    }
                    return;
                }
                if (obj instanceof String) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        0CP.A00(r302, it2.next());
                    }
                    return;
                }
                if (obj instanceof Boolean) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        0CP.A00(r302, it3.next());
                    }
                    return;
                }
                if (obj instanceof Number) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        0CP.A00(r302, it4.next());
                    }
                    return;
                }
                if (obj instanceof Enum) {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        0CP.A00(r302, it5.next().toString());
                    }
                    return;
                } else if (obj instanceof GraphQlCallInput) {
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        r302.A0E(((GraphQlCallInput) it6.next()).A03());
                    }
                    return;
                } else {
                    if (!(obj instanceof Map)) {
                        throw 1BL.A0e(obj, "List value type is not supported: ", AnonymousClass001.A0k());
                    }
                    Iterator it7 = list.iterator();
                    while (it7.hasNext()) {
                        A04(r302.A0D(), (Map) it7.next());
                    }
                    return;
                }
            }
        }
    }

    public static void A02(07S r301, GraphQlCallInput graphQlCallInput, Map map) {
        if (r301 == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= r301.A00) {
                return;
            }
            map.put(r301.A0F(i2), A00(graphQlCallInput, r301.A0E(i2)));
            i = i2 + 1;
        }
    }

    public 07S A03() {
        07S r302 = this.A00;
        if (r302 == null) {
            r302 = this.A01.A02();
            this.A00 = r302;
        }
        return r302;
    }

    public void A04(07S r302, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                if (value instanceof Boolean) {
                    value = ((Boolean) value).booleanValue() ? "true" : "false";
                } else if (!(value instanceof Number) && !(value instanceof String)) {
                    if (value instanceof Enum) {
                        value = value.toString();
                    } else if (value instanceof GraphQlCallInput) {
                        r302.A0H(((GraphQlCallInput) value).A03(), str);
                    } else if (value instanceof List) {
                        A01(r302.A0C(str), (List) value);
                    } else {
                        if (!(value instanceof Map)) {
                            throw 1BL.A0e(value, "Unexpected object value type ", AnonymousClass001.A0k());
                        }
                        A04(r302.A0D(str), (Map) value);
                    }
                }
                07S.A00(r302, value, str);
            }
        }
    }

    public void A05(GraphQlCallInput graphQlCallInput, String str) {
        if (graphQlCallInput != null) {
            A03().A0H(graphQlCallInput.A03(), str);
        }
    }

    public void A06(String str, Boolean bool) {
        07S.A00(A03(), bool, str);
    }

    public void A07(String str, Double d) {
        07S.A00(A03(), d, str);
    }

    public void A08(String str, Integer num) {
        07S.A00(A03(), num, str);
    }

    public void A09(String str, String str2) {
        07S.A00(A03(), str2, str);
    }

    public void A0A(String str, List list) {
        A01(A03().A0C(str), list);
    }
}
