package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* renamed from: X.2he, reason: invalid class name */
/* loaded from: 2he.class */
public final class C2he extends 2Yf {
    public 1Im A00;
    public 1Im A01;
    public 1Im A02;
    public Boolean A03;
    public Boolean A04;
    public List A05;

    public C2he() {
        super("DataDiffSection");
    }

    public static C2hf A0I(C1qb c1qb) {
        return new C2hf(c1qb, new C2he());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v151, types: [java.util.AbstractCollection] */
    public static String A0J(C2hs c2hs, String str, List list) {
        String str2;
        ListIterator listIterator = list.listIterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!listIterator.hasNext()) {
                return null;
            }
            int nextIndex = listIterator.nextIndex() + 1;
            Object next = listIterator.next();
            ListIterator listIterator2 = list.listIterator(nextIndex);
            while (listIterator2.hasNext()) {
                Object next2 = listIterator2.next();
                if (C2hs.A00(c2hs, next, next2)) {
                    str2 = "null";
                    String obj = next != null ? next.toString() : str2;
                    String obj2 = next2 != null ? next2.toString() : str2;
                    String A0j = 0Pz.A0j("<cls>", next != null ? AnonymousClass001.A0Y(next) : str2, "</cls>");
                    String A0j2 = 0Pz.A0j("<cls>", next2 != null ? AnonymousClass001.A0Y(next2) : "null", "</cls>");
                    C00m c00m = KyI.A00;
                    long currentTimeMillis = System.currentTimeMillis();
                    1Lc r0 = 1Lc.A02;
                    if (r0.compareTo(1LZ.A00()) >= 0) {
                        Set set = 1LZ.A00;
                        if (!set.isEmpty()) {
                            List list2 = null;
                            for (Object obj3 : set) {
                                String[] strArr = ((1LV) obj3).A00;
                                if (02L.A0C("Litho.DebugInfo", strArr) || 02L.A0C("*", strArr)) {
                                    if (list2 == null) {
                                        list2 = AnonymousClass001.A0s();
                                    }
                                    list2.add(obj3);
                                }
                            }
                            if (list2 == null) {
                                list2 = C0ty.A00;
                            }
                            if (1BK.A1Y(list2)) {
                                LinkedHashMap A1C = 1BK.A1C();
                                A1C.put("section", str);
                                A1C.put("size", Integer.valueOf(list.size()));
                                A1C.put("item", obj);
                                A1C.put("item-type", A0j);
                                A1C.put("other-item", obj2);
                                A1C.put("other-item-type", A0j2);
                                A1C.put("index", Integer.valueOf(i2));
                                A1C.put("next-index", Integer.valueOf(nextIndex));
                                A1C.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "DuplicateItemsInSection");
                                Jux jux = new Jux(r0, "Litho.DebugInfo", (String) c00m.invoke(), A1C, currentTimeMillis);
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    1LV.A00(jux, it);
                                }
                            }
                        }
                    }
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Duplicates are [type:");
                    A0k.append(A0j);
                    A0k.append(" hash:");
                    A0k.append(System.identityHashCode(next));
                    A0k.append(" position:");
                    A0k.append(i2);
                    AnonymousClass001.A1D("] and [type:", A0j2, " hash:", A0k);
                    A0k.append(System.identityHashCode(next2));
                    A0k.append(" position:");
                    A0k.append(nextIndex);
                    return AnonymousClass001.A0d("]", A0k);
                }
                nextIndex++;
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        if (r309.booleanValue() != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0bad  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0659  */
    /* JADX WARN: Type inference failed for: r0v526, types: [X.2i6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v535, types: [java.lang.Object, X.2i3] */
    /* JADX WARN: Type inference failed for: r0v78, types: [X.2i6, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0U(X.2Yx r302, X.2Yf r303, X.2Yf r304, X.C1qb r305, X.C1qb r306, X.C1qb r307) {
        /*
            Method dump skipped, instructions count: 2993
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2he.A0U(X.2Yx, X.2Yf, X.2Yf, X.1qb, X.1qb, X.1qb):void");
    }

    public boolean A0V() {
        return true;
    }
}
