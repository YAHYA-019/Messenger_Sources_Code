package X;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.Arrays;

/* loaded from: D0w.class */
public abstract class D0w implements C29M {
    public int setField_ = 0;
    public Object value_ = null;

    public static int A02(D0w d0w) {
        return Arrays.deepHashCode(new Object[]{Integer.valueOf(d0w.setField_), d0w.value_});
    }

    public static boolean A03(D0w d0w, Object obj, int i) {
        if (i == 0) {
            return false;
        }
        D0w d0w2 = (D0w) obj;
        boolean z = false;
        if (d0w2 != null && d0w.getClass() == d0w2.getClass()) {
            if (d0w2 == d0w) {
                return true;
            }
            if (d0w.setField_ == d0w2.setField_) {
                Object obj2 = d0w.value_;
                Object obj3 = d0w2.value_;
                if (obj2 != null) {
                    if (obj3 != null) {
                        z = CQq.A0G(obj2, obj3);
                    }
                } else if (obj3 == null) {
                    return true;
                }
            }
        }
        return z;
    }

    public C29O A04() {
        return this instanceof BI5 ? BI5.A00 : this instanceof BI4 ? BI4.A00 : this instanceof BI8 ? BI8.A00 : this instanceof BI7 ? BI7.A00 : this instanceof BI3 ? BI3.A00 : BI6.A00;
    }

    public abstract Object A05(C29Q c29q, 2An r2);

    public java.util.Map A06() {
        return this instanceof BI5 ? BI5.A01 : this instanceof BI4 ? BI4.A01 : this instanceof BI8 ? BI8.A01 : this instanceof BI7 ? BI7.A01 : this instanceof BI3 ? BI3.A01 : BI6.A01;
    }

    public void A07(2An r302) {
        this.setField_ = 0;
        this.value_ = null;
        r302.A0L();
        C29Q A0E = r302.A0E();
        if (A0E.A00 != 0) {
            Object A05 = A05(A0E, r302);
            this.value_ = A05;
            if (A05 != null) {
                this.setField_ = A0E.A03;
            }
            r302.A0E();
        }
        r302.A0M();
    }

    public abstract void A08(2An r1, Object obj, short s);

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        String D4Y;
        Object[] objArr;
        String str;
        Object obj = this.value_;
        if (obj == null) {
            objArr = new Object[]{AnonymousClass001.A0X(this)};
            str = "<%s uninitialized>";
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                StringBuilder A0k = AnonymousClass001.A0k();
                int length = bArr.length;
                int min = Math.min(length, 128);
                for (int i2 = 0; i2 < min; i2++) {
                    if (i2 != 0) {
                        A0k.append(" ");
                    }
                    String hexString = Integer.toHexString(bArr[i2]);
                    if (hexString.length() <= 1) {
                        hexString = 0Pz.A0W(ConstantsKt.CAMERA_ID_FRONT, hexString);
                    }
                    A0k.append(hexString);
                }
                if (length > 128) {
                    A0k.append(" ...");
                }
                D4Y = A0k.toString();
            } else {
                D4Y = C29M.class.isAssignableFrom(obj.getClass()) ? ((C29M) obj).D4Y(i, z) : obj.toString();
            }
            objArr = new Object[]{AnonymousClass001.A0X(this), getFieldDesc(this.setField_).A01, D4Y};
            str = "<%s %s:%s>";
        }
        return String.format(str, objArr);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        if (this.setField_ == 0 || this.value_ == null) {
            RuntimeException runtimeException = new RuntimeException("Cannot write a TUnion with no set value!");
            ((3AC) runtimeException).type_ = 0;
            throw runtimeException;
        }
        r302.A0O();
        r302.A0V(getFieldDesc(this.setField_));
        A08(r302, this.value_, (short) this.setField_);
        r302.A0N();
        r302.A0P();
    }

    public abstract C29Q getFieldDesc(int i);

    public String toString() {
        return D4Y(1, true);
    }
}
