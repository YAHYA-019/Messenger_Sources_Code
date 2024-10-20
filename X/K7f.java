package X;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: K7f.class */
public abstract class K7f extends Lda {
    public static final java.util.Map zzb = JQx.A13();
    public int zzd = -1;
    public LDV zzc = LDV.A00();

    private final int A09() {
        return JQy.A0d(this).DCH(this);
    }

    private final int A0A() {
        return JQy.A0d(this).DC6(this);
    }

    public static K7f A0B(L9j l9j, K7f k7f, byte[] bArr) {
        K7f A0C = A0C(l9j, k7f, bArr, bArr.length);
        if (A0C.A0T()) {
            return A0C;
        }
        KLv A00 = new LxK().A00();
        A00.A06(A0C);
        throw A00;
    }

    public static K7f A0C(L9j l9j, K7f k7f, byte[] bArr, int i) {
        KLv e;
        K7f A0O = k7f.A0O();
        try {
            MKz A0d = JQy.A0d(A0O);
            A0d.DD1(new L0J(l9j), A0O, bArr, 0, i);
            A0d.DCn(A0O);
            return A0O;
        } catch (IOException e2) {
            if (e2.getCause() instanceof KLv) {
                throw e2.getCause();
            }
            e = new KLv(e2);
            e.A06(A0O);
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            e = KLv.A05();
            e.A06(A0O);
            throw e;
        } catch (KLv e3) {
            e = e3;
            e.A06(A0O);
            throw e;
        } catch (LxK unused2) {
            e = A0O.A00();
            e.A06(A0O);
            throw e;
        }
    }

    public static K7f A0D(Class cls) {
        java.util.Map map = zzb;
        K7f k7f = (K7f) map.get(cls);
        if (k7f == null) {
            try {
                JQy.A1O(cls);
                k7f = (K7f) map.get(cls);
                if (k7f == null) {
                    k7f = (K7f) ((K7f) LEl.A05(cls)).A0P(6, null, null);
                    if (k7f == null) {
                        throw JQx.A0o();
                    }
                    map.put(cls, k7f);
                }
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        return k7f;
    }

    public static K7E A0E() {
        return K7E.A00();
    }

    public static MRS A0F(MRS mrs) {
        int size = mrs.size();
        int i = size + size;
        if (size == 0) {
            i = 10;
        }
        return mrs.DCY(i);
    }

    public static K7G A0G() {
        return K7G.A00();
    }

    public static LdW A0H(MQk mQk, String str, Object[] objArr) {
        return new LdW(mQk, str, objArr);
    }

    public static Object A0I(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw 1BK.A0s("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw 1BK.A0s("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void A0J(K7f k7f, Class cls) {
        k7f.A0R();
        zzb.put(cls, k7f);
    }

    @Override // X.Lda
    public final int A0L(MKz mKz) {
        int DC6;
        if (A0U()) {
            DC6 = mKz.DC6(this);
            if (DC6 < 0) {
                throw 4YV.A0h("serialized size must be non-negative, was ", DC6);
            }
        } else {
            int i = (-1) >>> 1;
            int i2 = this.zzd & i;
            if (i2 != i) {
                return i2;
            }
            DC6 = mKz.DC6(this);
            if (DC6 < 0) {
                throw 4YV.A0h("serialized size must be non-negative, was ", DC6);
            }
            this.zzd = (this.zzd & ((-1) << (-1))) | DC6;
        }
        return DC6;
    }

    public final K7D A0N() {
        return (K7D) A0P(5, null, null);
    }

    public final K7f A0O() {
        return (K7f) A0P(4, null, null);
    }

    public abstract Object A0P(int i, Object obj, Object obj2);

    public final void A0Q() {
        JQy.A0d(this).DCn(this);
        A0R();
    }

    public final void A0R() {
        this.zzd &= (-1) >>> 1;
    }

    public final void A0S() {
        this.zzd = (this.zzd & ((-1) << (-1))) | ((-1) >>> 1);
    }

    public final boolean A0T() {
        boolean z = true;
        byte byteValue = ((Number) A0P(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean DDC = L84.A00().A01(getClass()).DDC(this);
                K7f k7f = this;
                if (true != DDC) {
                    k7f = null;
                }
                A0P(2, k7f, null);
                return DDC;
            }
            z = false;
        }
        return z;
    }

    public final boolean A0U() {
        return AnonymousClass001.A1N(this.zzd & ((-1) << (-1)));
    }

    @Override // X.MGK
    public final /* synthetic */ MQk DCk() {
        return (Lda) A0P(6, null, null);
    }

    @Override // X.MQk
    public final int DCq() {
        int i;
        if (A0U()) {
            i = A0A();
            if (i < 0) {
                throw 4YV.A0h("serialized size must be non-negative, was ", i);
            }
        } else {
            int i2 = (-1) >>> 1;
            i = this.zzd & i2;
            if (i == i2) {
                int A0A = A0A();
                if (A0A < 0) {
                    throw 4YV.A0h("serialized size must be non-negative, was ", A0A);
                }
                this.zzd = (this.zzd & ((-1) << (-1))) | A0A;
                return A0A;
            }
        }
        return i;
    }

    @Override // X.MQk
    public final /* synthetic */ K7D DDJ() {
        return (K7D) A0P(5, null, null);
    }

    @Override // X.MQk
    public final void DDR(K7H k7h) {
        JQy.A0d(this).DD5(Ldf.A01(k7h), this);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return L84.A00().A01(cls).DD8(this, obj);
    }

    public final int hashCode() {
        if (A0U()) {
            return A09();
        }
        int i = this.zza;
        if (i == 0) {
            i = A09();
            this.zza = i;
        }
        return i;
    }

    public final String toString() {
        return LBp.A00(this, super.toString());
    }
}
