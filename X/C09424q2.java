package X;

import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4q2, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4q2.class */
public final class C09424q2 implements InterfaceC09434q3 {
    public final C00i A00;
    public final C00i A01;
    public final C00i A02;
    public final List A03;

    public C09424q2() {
        C00i c00i = new 1BQ(49278);
        this.A02 = c00i;
        C00i c00i2 = new 1BQ(49279);
        this.A00 = c00i2;
        C00i c00i3 = new 1BQ(49282);
        this.A01 = c00i3;
        this.A03 = Arrays.asList(c00i3, c00i2, c00i);
    }

    @Override // X.InterfaceC09434q3
    public MessengerAccountInfo AVA(String str) {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            MessengerAccountInfo AVA = ((InterfaceC09434q3) ((C00i) it.next()).get()).AVA(str);
            if (AVA != null) {
                return AVA;
            }
        }
        return null;
    }

    @Override // X.InterfaceC09434q3
    public List AVB() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((InterfaceC09434q3) ((C00i) it.next()).get()).AVB());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MessengerAccountInfo messengerAccountInfo = (MessengerAccountInfo) it2.next();
            String str = messengerAccountInfo.A0A;
            if (!hashSet.contains(str)) {
                hashSet.add(str);
                arrayList2.add(messengerAccountInfo);
            }
        }
        return arrayList2;
    }

    @Override // X.InterfaceC09434q3
    public int Azj() {
        C00j.A05("MessengerAccountsProviderWithPageAndSOAPSupport.getNumberOfAccounts", -720491914);
        try {
            int Azj = ((C09444q4) this.A02.get()).A03 + ((C4q9) this.A00.get()).Azj() + ((C09474qD) this.A01.get()).Azj();
            C00j.A01(369917291);
            return Azj;
        } catch (Throwable th) {
            C00j.A01(-1233844821);
            throw th;
        }
    }

    @Override // X.InterfaceC09434q3
    public boolean BNP() {
        return ((C09444q4) this.A02.get()).BNP();
    }

    @Override // X.InterfaceC09434q3
    public MessengerAccountInfo Cby() {
        Boolean bool = (Boolean) 1Bn.A0A(33058);
        ((1Ew) 1Bi.A03(65755)).AXy();
        return bool.booleanValue() ? ((C4q9) this.A00.get()).Cby() : ((C09444q4) this.A02.get()).Cby();
    }

    @Override // X.InterfaceC09434q3
    public void Cdr(String str) {
        ((C09444q4) this.A02.get()).Cdr(str);
        this.A00.get();
        this.A01.get();
    }

    @Override // X.InterfaceC09434q3
    public void CjN(MessengerAccountInfo messengerAccountInfo) {
        C00i c00i;
        if (messengerAccountInfo.A0D) {
            c00i = this.A00;
        } else {
            if (!messengerAccountInfo.A0E) {
                ((C09444q4) this.A02.get()).CjN(messengerAccountInfo);
                return;
            }
            c00i = this.A01;
        }
        c00i.get();
    }

    @Override // X.InterfaceC09434q3
    public void CqZ(C7y6 c7y6) {
        ((C09444q4) this.A02.get()).A00 = c7y6;
        ((C4q9) this.A00.get()).A00 = c7y6;
        ((C09474qD) this.A01.get()).A00 = c7y6;
    }

    @Override // X.InterfaceC09434q3
    public void clear() {
        this.A02.get();
        this.A00.get();
        ((C09474qD) this.A01.get()).clear();
    }
}
