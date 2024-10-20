package X;

import android.database.Cursor;

/* renamed from: X.JoN, reason: case insensitive filesystem */
/* loaded from: JoN.class */
public abstract class AbstractC3258JoN extends LsN {
    public Integer A00 = 0S2.A01;
    public Object A01;

    public Object A00() {
        Long l;
        Long l2;
        if (!(this instanceof JoL)) {
            C3257JoM c3257JoM = (C3257JoM) this;
            Cursor cursor = c3257JoM.A02;
            if (cursor.isBeforeFirst()) {
                cursor.moveToNext();
            }
            if (cursor.isAfterLast()) {
                ((AbstractC3258JoN) c3257JoM).A00 = 0S2.A0C;
                return null;
            }
            Kit kit = new Kit(cursor.getLong(c3257JoM.A01), cursor.getString(c3257JoM.A00));
            cursor.moveToNext();
            return kit;
        }
        JoL joL = (JoL) this;
        KrW krW = joL.A04;
        if (!krW.A01() && !joL.A05.A01()) {
            joL.A00 = 0S2.A0C;
            return null;
        }
        Object obj = null;
        if (krW.A01()) {
            MFC mfc = joL.A02;
            if (!krW.A01) {
                krW.A00 = krW.A02.next();
                krW.A01 = true;
            }
            l = mfc.ARi(krW.A00);
            Object obj2 = joL.A00;
            if (obj2 != null) {
                boolean A1P = AnonymousClass001.A1P(joL.A06.compare(l, obj2));
                StringBuilder A0o = AnonymousClass001.A0o("Left iterator keys must be strictly ascending. (");
                A0o.append(joL.A00);
                String A0Z = AnonymousClass001.A0Z(l, " ", A0o);
                if (!A1P) {
                    throw AnonymousClass001.A0N(String.valueOf(A0Z));
                }
            }
        } else {
            l = null;
        }
        KrW krW2 = joL.A05;
        if (krW2.A01()) {
            MFC mfc2 = joL.A03;
            if (!krW2.A01) {
                krW2.A00 = krW2.A02.next();
                krW2.A01 = true;
            }
            l2 = mfc2.ARi(krW2.A00);
            Object obj3 = joL.A01;
            if (obj3 != null) {
                boolean A1P2 = AnonymousClass001.A1P(joL.A06.compare(l2, obj3));
                StringBuilder A0o2 = AnonymousClass001.A0o("Right iterator keys must be strictly ascending. (");
                A0o2.append(joL.A01);
                String A0Z2 = AnonymousClass001.A0Z(l2, " ", A0o2);
                if (!A1P2) {
                    throw AnonymousClass001.A0N(String.valueOf(A0Z2));
                }
            }
        } else {
            l2 = null;
        }
        if (krW.A01() || !krW2.A01()) {
            if (krW.A01() && !krW2.A01()) {
                return new Kh9(krW.A00(), null);
            }
            int compare = joL.A06.compare(l, l2);
            if (compare > 0) {
                joL.A01 = l2;
            } else {
                if (compare < 0) {
                    joL.A00 = l;
                    return new Kh9(krW.A00(), null);
                }
                joL.A01 = l2;
                joL.A00 = l;
                obj = krW.A00();
            }
        }
        return new Kh9(obj, krW2.A00());
    }

    public final boolean hasNext() {
        Integer num = this.A00;
        Integer num2 = 0S2.A0N;
        if (num == num2) {
            throw JQx.A0o();
        }
        int intValue = num.intValue();
        if (intValue == 2) {
            return false;
        }
        if (intValue == 0) {
            return true;
        }
        this.A00 = num2;
        this.A01 = A00();
        if (this.A00 == 0S2.A0C) {
            return false;
        }
        this.A00 = 0S2.A00;
        return true;
    }

    public final Object next() {
        if (!hasNext()) {
            throw AnonymousClass001.A10();
        }
        this.A00 = 0S2.A01;
        return this.A01;
    }
}
