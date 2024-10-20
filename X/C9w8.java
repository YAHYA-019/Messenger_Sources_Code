package X;

import com.facebook.messaging.contactstab.plugins.loader.montage.ContactsTabMontageLoader;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* renamed from: X.9w8, reason: invalid class name */
/* loaded from: 9w8.class */
public final class C9w8 implements C5d8 {
    public final int A00;
    public final Object A01;

    public C9w8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C5d8
    public void C7S(6BY r302) {
        switch (this.A00) {
            case 0:
                11T.A0F(r302, 0);
                C9u1 c9u1 = (C9u1) this.A01;
                int A08 = 7zR.A08(r302.A00.A00);
                C9kj c9kj = new C9kj(c9u1.A00);
                c9kj.A07 = r302;
                C9kj.A00(c9kj, "montageListResult");
                C9u3 A00 = C9u3.A00(c9kj, A08 == 0 ? C95a.A03 : C95a.A02);
                c9u1.A00 = A00;
                c9u1.A03.CHn(A00);
                return;
            case 1:
                11T.A0F(r302, 0);
                ContactsTabMontageLoader contactsTabMontageLoader = (ContactsTabMontageLoader) this.A01;
                int A082 = 7zR.A08(r302.A00.A00);
                C9kj c9kj2 = new C9kj(contactsTabMontageLoader.A00);
                c9kj2.A07 = r302;
                C9kj.A00(c9kj2, "montageListResult");
                contactsTabMontageLoader.A00 = C9u3.A00(c9kj2, A082 == 0 ? C95a.A03 : C95a.A02);
                contactsTabMontageLoader.A02 = r302;
                C95a c95a = A082 == 0 ? C95a.A03 : C95a.A02;
                contactsTabMontageLoader.A01 = c95a;
                contactsTabMontageLoader.A09.A00(r302, c95a, "MONTAGE");
                ((C9cr) 1Br.A0B(contactsTabMontageLoader.A06)).A02("ContactsTabMontageLoader");
                return;
            default:
                ImmutableList immutableList = r302.A00.A00;
                AcQ acQ = (AcQ) this.A01;
                if (acQ.A0i == null) {
                    acQ.A0i = AnonymousClass001.A0u();
                }
                if (acQ.getContext() != null) {
                    1Du it = immutableList.iterator();
                    while (it.hasNext()) {
                        MontageBucketPreview montageBucketPreview = (MontageBucketPreview) it.next();
                        acQ.A0i.put(montageBucketPreview.A06, montageBucketPreview);
                    }
                    HashMap hashMap = acQ.A1C;
                    for (Object obj : hashMap.keySet()) {
                        if (hashMap.get(obj) != null) {
                            ((C1308Adl) hashMap.get(obj)).A03 = acQ.A0i;
                        }
                    }
                    acQ.A1a().A00.A0E();
                    HashMap hashMap2 = acQ.A0h;
                    for (Object obj2 : hashMap2.keySet()) {
                        if (hashMap2.get(obj2) != null) {
                            ((CqU) hashMap2.get(obj2)).A00 = acQ.A0i;
                        }
                    }
                    if (acQ.A1Z() != null) {
                        acQ.A1Z().A01.A0E();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // X.C5d8
    public void C7U(6BY r302) {
    }
}
