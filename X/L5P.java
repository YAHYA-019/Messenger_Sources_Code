package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: L5P.class */
public abstract class L5P {
    public final 0QO A00;
    public final 0QO A01;
    public final 0QO A02;

    public L5P(0QO r302, 0QO r303, 0QO r304) {
        this.A01 = r302;
        this.A02 = r303;
        this.A00 = r304;
    }

    private Class A00(Class cls) {
        0QO r0 = this.A00;
        String name = cls.getName();
        Class<?> cls2 = (Class) r0.get(name);
        if (cls2 == null) {
            cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            r0.put(name, cls2);
        }
        return cls2;
    }

    private C3086Jio A03() {
        C3086Jio c3086Jio = (C3086Jio) this;
        Parcel parcel = c3086Jio.A05;
        int dataPosition = parcel.dataPosition();
        int i = c3086Jio.A02;
        if (i == c3086Jio.A04) {
            i = c3086Jio.A03;
        }
        return new C3086Jio(parcel, ((L5P) c3086Jio).A01, ((L5P) c3086Jio).A02, ((L5P) c3086Jio).A00, 0Pz.A0W(c3086Jio.A07, "  "), dataPosition, i);
    }

    public int A01(int i, int i2) {
        if (A09(i2)) {
            i = ((C3086Jio) this).A05.readInt();
        }
        return i;
    }

    public Parcelable A02(Parcelable parcelable, int i) {
        if (A09(i)) {
            C3086Jio c3086Jio = (C3086Jio) this;
            parcelable = 1BL.A0C(c3086Jio.A05, c3086Jio.getClass());
        }
        return parcelable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public 4iR A04() {
        String readString = ((C3086Jio) this).A05.readString();
        if (readString == null) {
            return null;
        }
        C3086Jio A03 = A03();
        4iR r0 = L5P.class;
        try {
            0QO r02 = this.A01;
            Method method = (Method) r02.get(readString);
            if (method == null) {
                method = Class.forName(readString, true, r0.getClassLoader()).getDeclaredMethod("read", r0);
                r02.put(readString, method);
            }
            r0 = (4iR) method.invoke(null, A03);
            return r0;
        } catch (ClassNotFoundException unused) {
            throw AnonymousClass001.A0U(r0);
        } catch (IllegalAccessException unused2) {
            throw AnonymousClass001.A0U(r0);
        } catch (NoSuchMethodException unused3) {
            throw AnonymousClass001.A0U(r0);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (!(cause instanceof RuntimeException) && !(cause instanceof Error)) {
                cause = AnonymousClass001.A0U(e);
            }
            throw cause;
        }
    }

    public void A05(int i) {
        C3086Jio c3086Jio = (C3086Jio) this;
        int i2 = c3086Jio.A00;
        if (i2 >= 0) {
            int i3 = c3086Jio.A06.get(i2);
            Parcel parcel = c3086Jio.A05;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        c3086Jio.A00 = i;
        SparseIntArray sparseIntArray = c3086Jio.A06;
        Parcel parcel2 = c3086Jio.A05;
        sparseIntArray.put(i, parcel2.dataPosition());
        parcel2.writeInt(0);
        parcel2.writeInt(i);
    }

    public void A06(int i, int i2) {
        A05(i2);
        ((C3086Jio) this).A05.writeInt(i);
    }

    public void A07(Parcelable parcelable, int i) {
        A05(i);
        ((C3086Jio) this).A05.writeParcelable(parcelable, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Throwable, X.Jio] */
    public void A08(4iR r302) {
        if (r302 == null) {
            ((C3086Jio) this).A05.writeString(null);
            return;
        }
        try {
            Class<?> cls = r302.getClass();
            ((C3086Jio) this).A05.writeString(A00(cls).getName());
            ?? A03 = A03();
            try {
                0QO r0 = this.A02;
                String name = cls.getName();
                Method method = (Method) r0.get(name);
                if (method == null) {
                    method = A00(cls).getDeclaredMethod("write", cls, L5P.class);
                    r0.put(name, method);
                }
                method.invoke(null, r302, A03);
                int i = A03.A00;
                if (i >= 0) {
                    int i2 = A03.A06.get(i);
                    Parcel parcel = A03.A05;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException unused) {
                throw AnonymousClass001.A0U(A03);
            } catch (IllegalAccessException unused2) {
                throw AnonymousClass001.A0U(A03);
            } catch (NoSuchMethodException unused3) {
                throw AnonymousClass001.A0U(A03);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (!(cause instanceof RuntimeException) && !(cause instanceof Error)) {
                    cause = AnonymousClass001.A0U(e);
                }
                throw cause;
            }
        } catch (ClassNotFoundException e2) {
            throw 1BK.A0s(0Pz.A0W(AnonymousClass001.A0X(r302), " does not have a Parcelizer"), e2);
        }
    }

    public boolean A09(int i) {
        boolean z;
        C3086Jio c3086Jio = (C3086Jio) this;
        while (true) {
            int i2 = c3086Jio.A02;
            int i3 = c3086Jio.A03;
            z = true;
            int i4 = c3086Jio.A01;
            if (i2 < i3) {
                if (i4 != i) {
                    if (String.valueOf(i4).compareTo(String.valueOf(i)) > 0) {
                        break;
                    }
                    Parcel parcel = c3086Jio.A05;
                    parcel.setDataPosition(i2);
                    int readInt = parcel.readInt();
                    c3086Jio.A01 = parcel.readInt();
                    c3086Jio.A02 += readInt;
                } else {
                    break;
                }
            } else if (i4 == i) {
                return true;
            }
        }
        z = false;
        return z;
    }
}
