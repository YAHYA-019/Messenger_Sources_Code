package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1BE, reason: invalid class name */
/* loaded from: 1BE.class */
public final class C1BE implements 1xJ {
    public final /* synthetic */ 1xH A00;
    public final /* synthetic */ C1Az A01;
    public final /* synthetic */ C1B6 A02;
    public final /* synthetic */ 0BJ A03;
    public final /* synthetic */ String A04;

    public C1BE(1xH r302, C1Az c1Az, C1B6 c1b6, 0BJ r305, String str) {
        this.A03 = r305;
        this.A04 = str;
        this.A02 = c1b6;
        this.A01 = c1Az;
        this.A00 = r302;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.1B2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.1B0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [X.1B0, java.lang.Object] */
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void Cit(C1BD c1bd) {
        List A03;
        C1B3 A00;
        Object obj;
        Object obj2;
        byte[] bArr = null;
        if (11T.A0O(c1bd != null ? Boolean.valueOf(c1bd.A00) : null, true)) {
            bArr = 0BJ.A03;
        } else if (c1bd != null) {
            bArr = c1bd.A01;
        }
        0BJ r0 = this.A03;
        String str = this.A04;
        C1B6 c1b6 = this.A02;
        byte[] byteArray = this.A01.toByteArray();
        String id = c1b6.getId();
        11T.A0F(id, 1);
        ?? obj3 = new Object();
        obj3.A00 = id;
        obj3.A01 = byteArray;
        List A032 = 11T.A03((Object) obj3);
        ?? obj4 = new Object();
        obj4.A00 = str;
        obj4.A01 = A032;
        if (bArr == null || (A00 = 0BH.A00(bArr)) == null) {
            A03 = 11T.A03((Object) obj4);
        } else {
            List list = A00.A00;
            Iterator it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (11T.A0O(((C1B0) obj2).A00, str)) {
                        break;
                    }
                }
            }
            C1B0 c1b0 = (C1B0) obj2;
            ArrayList arrayList = new ArrayList(list);
            if (c1b0 == null) {
                arrayList.add(obj4);
                A03 = arrayList;
            } else {
                List list2 = c1b0.A01;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (11T.A0O(((C1B2) next).A00, c1b6.getId())) {
                        obj = next;
                        break;
                    }
                }
                ArrayList arrayList2 = new ArrayList(list2);
                if (obj != null) {
                    arrayList2.remove(obj);
                }
                arrayList2.add(obj3);
                ?? obj5 = new Object();
                obj5.A00 = str;
                obj5.A01 = arrayList2;
                arrayList.remove(c1b0);
                arrayList.add(obj5);
                A03 = arrayList;
            }
        }
        byte[] A01 = 0BH.A01(new C1B3(A03));
        if (A01 == null) {
            this.A00.A04(new C19d(AnonymousClass001.A0N("can't serialize data for user")));
            return;
        }
        1xH A033 = 0BJ.A03(r0, str, A01);
        final 1xH r02 = this.A00;
        final int i = 0;
        A033.A03(new 1xJ(r02, i) { // from class: X.0s7
            public final int A00;
            public final Object A01;

            {
                this.A00 = i;
                this.A01 = r02;
            }

            private final void A00(0EJ r302) {
                1xH r03 = (1xH) this.A01;
                if (r302 == null) {
                    r302 = new C19d(AnonymousClass001.A0N("can't backup data as no result return from SDK"));
                }
                r03.A04(r302);
            }

            private final void A01(0EJ r302) {
                1xH r03 = (1xH) this.A01;
                if (r302 == null) {
                    r302 = new C19d(AnonymousClass001.A0N("can't backup data as no result return from SDK"));
                }
                r03.A04(r302);
            }

            public /* bridge */ /* synthetic */ void Cit(Object obj6) {
                0EJ r03 = (0EJ) obj6;
                if (this.A00 != 0) {
                    A01(r03);
                } else {
                    A00(r03);
                }
            }
        });
    }
}
