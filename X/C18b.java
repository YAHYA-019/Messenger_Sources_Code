package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.18b, reason: invalid class name */
/* loaded from: 18b.class */
public final class C18b {
    public final C09D A01;
    public final TreeSet A02 = new TreeSet((Comparator) new 0qT(this, 1));
    public List A00 = AnonymousClass001.A0s();

    public C18b(C09D c09d) {
        this.A01 = c09d;
    }

    public C18c A00(C18c c18c) {
        C18c c18c2;
        synchronized (this) {
            Iterator it = A01().iterator();
            do {
                if (!it.hasNext()) {
                    return null;
                }
                c18c2 = (C18c) it.next();
            } while (!c18c2.equals(c18c));
            return c18c2;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v0 ??, still in use, count: 6, list:
          (r309v0 ??) from 0x0122: PHI (r309v1 ??) = (r309v0 ??), (r309v0 ??), (r309v2 ??) binds: [B:75:0x00d7, B:94:0x011e, B:33:0x0075] A[DONT_GENERATE, DONT_INLINE]
          (r309v0 ??) from 0x0122: PHI (r309v1 ??) = (r309v0 ??), (r309v0 ??), (r309v2 ??) binds: [B:75:0x00d7, B:94:0x011e, B:33:0x0075] A[DONT_GENERATE, DONT_INLINE]
          (r309v0 ?? I:X.18c) from 0x00a1: IPUT (r0v45 ?? I:java.lang.String), (r309v0 ?? I:X.18c) A[Catch: JSONException -> 0x016f, all -> 0x0184] X.18c.A02 java.lang.String
          (r309v0 ?? I:X.18c) from 0x00b3: IPUT (r0v49 ?? I:int), (r309v0 ?? I:X.18c) A[Catch: JSONException -> 0x016f, all -> 0x0184] X.18c.A01 int
          (r309v0 ?? I:X.18c) from 0x00c5: IPUT (r0v53 ?? I:int), (r309v0 ?? I:X.18c) A[Catch: JSONException -> 0x016f, all -> 0x0184] X.18c.A00 int
          (r309v0 ?? I:X.18c) from 0x011f: IPUT (r0v62 ?? I:java.util.List), (r309v0 ?? I:X.18c) A[Catch: JSONException -> 0x016f, all -> 0x0184] X.18c.A04 java.util.List
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public java.util.TreeSet A01() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18b.A01():java.util.TreeSet");
    }

    public void A02() {
        synchronized (this) {
            List<C18c> list = this.A00;
            list.clear();
            Iterator it = A01().iterator();
            while (it.hasNext()) {
                list.add((C18c) it.next());
            }
            C09D c09d = this.A01;
            if (c09d != null) {
                try {
                    0Mi AP6 = c09d.AP6();
                    JSONObject A12 = AnonymousClass001.A12();
                    JSONArray jSONArray = new JSONArray();
                    for (C18c c18c : list) {
                        JSONObject A122 = AnonymousClass001.A12();
                        A122.putOpt(TraceFieldType.HostName, c18c.A02);
                        A122.put("priority", c18c.A01);
                        A122.put("fail_count", c18c.A00);
                        if (c18c.A04 != null) {
                            JSONArray jSONArray2 = new JSONArray();
                            Iterator it2 = c18c.A04.iterator();
                            while (it2.hasNext()) {
                                jSONArray2.put(it2.next());
                            }
                            A122.put("address_list_data", jSONArray2);
                        }
                        jSONArray.put(A122.toString());
                    }
                    A12.put("address_entries", jSONArray);
                    AP6.CaM("/settings_mqtt_address", A12.toString());
                    AP6.AGo("AddressEntries", "Failed to save addressEntries");
                } catch (JSONException e) {
                    0fH.A0s("AddressEntries", "Could not serialize addressEntries", e);
                }
            }
        }
    }

    public void A03(C18c c18c) {
        synchronized (this) {
            TreeSet treeSet = this.A02;
            if (treeSet.size() >= 10) {
                treeSet.pollLast();
            }
            treeSet.add(c18c);
        }
    }

    public void A04(C18c c18c, C18c c18c2) {
        synchronized (this) {
            this.A02.remove(c18c);
            A03(c18c2);
        }
    }
}
