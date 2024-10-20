package X;

import android.content.Context;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.21h, reason: invalid class name */
/* loaded from: 21h.class */
public abstract class C21h implements C1qM {
    public final Set A00;

    public C21h(String str) {
        this(Collections.singleton(str));
    }

    public C21h(Collection collection) {
        this.A00 = new HashSet(collection);
    }

    public void A00(Set set) {
        if (!(this instanceof 2Z8)) {
            if (!(this instanceof C21g)) {
                C2j8.A00(((C2j9) this).A00);
                return;
            }
            C21f c21f = ((C21g) this).A00;
            2AV r0 = (2AV) c21f.A02.A00.get();
            boolean booleanValue = ((Boolean) c21f.A07.getValue()).booleanValue();
            r0.A02(new C3ak(c21f, 3), ((AnonymousClass224) c21f.A04.A00.get()).A00("681066249448173"), booleanValue);
            return;
        }
        2Z8 r02 = (2Z8) this;
        Set entrySet = ((C4Ni) r02.A01.A00.get()).A03.entrySet();
        11T.A0A(entrySet);
        2SW r03 = r02.A02;
        Context context = r02.A00;
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            11T.A0D(A0z);
            Number number = (Number) A0z.getKey();
            Object value = A0z.getValue();
            HashSet hashSet = r03.A05;
            if (!hashSet.contains(number)) {
                hashSet.add(number);
                MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A05(context, r03.A01, 84160);
                11T.A0D(number);
                long longValue = number.longValue();
                Cxv cxv = new Cxv(1, value, r03, mailboxFeature, number);
                1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                MailboxFutureImpl A0Q = 1BK.A0Q(AQV, cxv);
                1Um.A02(AQV, new C3aq(5, longValue, mailboxFeature, A0Q), A0Q, false);
            }
        }
    }

    @Override // X.C1qM
    public final void CNu(Set set) {
        HashSet hashSet = new HashSet(this.A00);
        hashSet.retainAll(set);
        if (hashSet.isEmpty()) {
            return;
        }
        A00(hashSet);
    }
}
