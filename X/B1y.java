package X;

import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: B1y.class */
public final class B1y extends 2Yv {
    public 2O4 A00;
    public BL1 A01;
    public ImmutableList A02;
    public ImmutableList A03;
    public List A04;
    public List A05;

    /* JADX WARN: Type inference failed for: r0v26, types: [X.QyK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [X.QyK, java.lang.Object] */
    public void A02(C2l4 c2l4) {
        Object[] objArr = c2l4.A01;
        int i = c2l4.A00;
        if (i != 0) {
            if (i == 1) {
                List list = this.A05;
                ImmutableList immutableList = this.A03;
                BL1 bl1 = this.A01;
                List list2 = (List) objArr[0];
                if (list != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        User A0t = AbG.A0t(it);
                        String str = A0t.A0X.displayName;
                        String str2 = A0t.A13;
                        ?? obj = new Object();
                        ((QyK) obj).A00 = str;
                        ((QyK) obj).A01 = str2;
                        list.add(obj);
                    }
                    immutableList = ImmutableList.copyOf((Collection) list);
                    bl1 = list.isEmpty() ? BL1.ERROR : BL1.LOADED;
                }
                this.A05 = list;
                this.A03 = immutableList;
                this.A01 = bl1;
                return;
            }
            return;
        }
        List list3 = this.A05;
        ImmutableList immutableList2 = this.A03;
        List list4 = this.A04;
        ImmutableList immutableList3 = this.A02;
        QyK qyK = (QyK) objArr[0];
        boolean A1Z = 7zO.A1Z(objArr, 1);
        if (list3 != null && list4 != null) {
            ?? obj2 = new Object();
            ((QyK) obj2).A00 = qyK.A00;
            ((QyK) obj2).A01 = qyK.A01;
            ((QyK) obj2).A02 = qyK.A02;
            ((QyK) obj2).A02 = A1Z;
            if (A1Z) {
                list4.add(obj2);
            } else {
                list4.remove(qyK);
            }
            int indexOf = list3.indexOf(qyK);
            list3.remove(indexOf);
            list3.add(indexOf, obj2);
            immutableList3 = ImmutableList.copyOf((Collection) list4);
            immutableList2 = ImmutableList.copyOf((Collection) list3);
        }
        this.A05 = list3;
        this.A03 = immutableList2;
        this.A04 = list4;
        this.A02 = immutableList3;
    }
}
