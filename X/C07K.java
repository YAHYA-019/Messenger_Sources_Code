package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.07K, reason: invalid class name */
/* loaded from: 07K.class */
public final class C07K implements Comparable {
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public final int A04;
    public final int A05;
    public final int A06;

    public C07K(int i, int i2, int i3) {
        this.A05 = i;
        this.A04 = i2;
        this.A06 = i3;
    }

    public void A00() {
        int i = this.A06;
        if (i != -1) {
            List list = this.A02;
            int i2 = 0;
            int size = i - (list == null ? 0 : list.size());
            List list2 = this.A00;
            if (list2 != null) {
                i2 = list2.size();
            }
            A01("qpl_internal__lost_annotation_count", size - i2);
        }
    }

    public void A01(String str, int i) {
        List list = this.A00;
        if (list == null) {
            list = new ArrayList();
            this.A00 = list;
        }
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        list.add(str);
        this.A01.add(Integer.valueOf(i));
    }

    public void A02(String str, String str2) {
        List list = this.A02;
        if (list == null) {
            list = new ArrayList();
            this.A02 = list;
        }
        if (this.A03 == null) {
            this.A03 = new ArrayList();
        }
        list.add(str);
        this.A03.add(str2);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C07K c07k = (C07K) obj;
        int i = this.A05;
        int i2 = c07k.A05;
        if (i == i2) {
            i = this.A04;
            i2 = c07k.A04;
            if (i == i2) {
                return 0;
            }
        }
        return i < i2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C07K c07k = (C07K) obj;
            if (this.A05 != c07k.A05 || this.A04 != c07k.A04) {
                return false;
            }
            List list = this.A02;
            List list2 = c07k.A02;
            if (list == null) {
                if (list2 != null) {
                    return false;
                }
            } else if (!list.equals(list2)) {
                return false;
            }
            List list3 = this.A03;
            List list4 = c07k.A03;
            if (list3 == null) {
                if (list4 != null) {
                    return false;
                }
            } else if (!list3.equals(list4)) {
                return false;
            }
            List list5 = this.A00;
            List list6 = c07k.A00;
            if (list5 == null) {
                if (list6 != null) {
                    return false;
                }
            } else if (!list5.equals(list6)) {
                return false;
            }
            List list7 = this.A01;
            List list8 = c07k.A01;
            if (list7 == null) {
                if (list8 != null) {
                    return false;
                }
            } else if (!list7.equals(list8)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = ((217 + this.A05) * 31) + this.A04;
        List list = this.A02;
        if (list != null) {
            i = (i * 31) + list.hashCode();
        }
        List list2 = this.A03;
        if (list2 != null) {
            i = (i * 31) + list2.hashCode();
        }
        List list3 = this.A00;
        if (list3 != null) {
            i = (i * 31) + list3.hashCode();
        }
        List list4 = this.A01;
        if (list4 != null) {
            i = (i * 31) + list4.hashCode();
        }
        return i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MarkerRecord{markerId=");
        A0k.append(this.A05);
        A0k.append(", instanceKey=");
        A0k.append(this.A04);
        A0k.append(", strAnnotationKeys=");
        A0k.append(this.A02);
        A0k.append(", strAnnotationValues=");
        A0k.append(this.A03);
        A0k.append(", intAnnotationKeys=");
        A0k.append(this.A00);
        A0k.append(", intAnnotationValues=");
        A0k.append(this.A01);
        return AnonymousClass001.A0f(A0k);
    }
}
