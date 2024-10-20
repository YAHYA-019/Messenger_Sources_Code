package X;

/* renamed from: X.0By, reason: invalid class name */
/* loaded from: 0By.class */
public abstract class C0By {
    public static String A00(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int length = valueOf.length();
        int length2 = objArr.length;
        StringBuilder A0l = AnonymousClass001.A0l(length + (length2 * 16));
        int i = 0;
        int i2 = 0;
        while (i < length2 && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            A0l.append(valueOf.substring(i2, indexOf));
            A0l.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        A0l.append(valueOf.substring(i2));
        if (i < length2) {
            A0l.append(" [");
            A0l.append(objArr[i]);
            for (int i3 = i + 1; i3 < length2; i3++) {
                AnonymousClass001.A1H(A0l);
                A0l.append(objArr[i3]);
            }
            A0l.append(']');
        }
        return A0l.toString();
    }

    public static void A01(int i, int i2) {
        Object[] A1b;
        String str;
        if (i < 0) {
            A1b = AnonymousClass001.A1b("index", i);
            str = "%s (%s) must not be negative";
        } else {
            if (i < i2) {
                return;
            }
            if (i2 < 0) {
                throw 0Pz.A04("negative size: ", i2);
            }
            A1b = new Object[]{"index", Integer.valueOf(i), Integer.valueOf(i2)};
            str = "%s (%s) must be less than size (%s)";
        }
        throw new IndexOutOfBoundsException(A00(str, A1b));
    }

    public static void A02(Boolean bool) {
        if (bool != null && !bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static void A03(Object obj, Object obj2) {
        if (obj == null) {
            throw AnonymousClass001.A0Q(String.valueOf(obj2));
        }
    }

    public static void A04(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void A05(boolean z, Object obj) {
        if (!z) {
            throw AnonymousClass001.A0L(String.valueOf(obj));
        }
    }

    public static void A06(boolean z, Object obj) {
        if (!z) {
            throw AnonymousClass001.A0N(String.valueOf(obj));
        }
    }

    public static void A07(boolean z, String str, Object... objArr) {
        if (!z) {
            throw AnonymousClass001.A0L(A00(str, objArr));
        }
    }
}
