package com.google.common.base;

import X.0Pz;
import X.AnonymousClass001;
import X.JQw;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: Strings.class */
public final class Strings {
    public static String lenientFormat(String str, Object... objArr) {
        int length;
        int indexOf;
        String A0z;
        String valueOf = String.valueOf(str);
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                A0z = "null";
            } else {
                try {
                    A0z = obj.toString();
                } catch (Exception e) {
                    String A0Y = 0Pz.A0Y(AnonymousClass001.A0Y(obj), Integer.toHexString(System.identityHashCode(obj)), '@');
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, 0Pz.A0W("Exception during lenientFormat for ", A0Y), (Throwable) e);
                    A0z = 0Pz.A0z("<", A0Y, JQw.A00(38), AnonymousClass001.A0Y(e), ">");
                }
            }
            objArr[i3] = A0z;
            i2 = i3 + 1;
        }
        int length2 = valueOf.length();
        StringBuilder A0l = AnonymousClass001.A0l((length * 16) + length2);
        int i4 = 0;
        while (i < length && (indexOf = valueOf.indexOf("%s", i4)) != -1) {
            A0l.append((CharSequence) valueOf, i4, indexOf);
            A0l.append(objArr[i]);
            i4 = indexOf + 2;
            i++;
        }
        A0l.append((CharSequence) valueOf, i4, length2);
        if (i < length) {
            A0l.append(" [");
            A0l.append(objArr[i]);
            for (int i5 = i + 1; i5 < length; i5++) {
                AnonymousClass001.A1H(A0l);
                A0l.append(objArr[i5]);
            }
            A0l.append(']');
        }
        return A0l.toString();
    }

    public static String repeat(String str, int i) {
        String str2;
        str2 = ",?";
        boolean z = true;
        if (i <= 1) {
            if (i < 0) {
                z = false;
            }
            Preconditions.checkArgument(z, "invalid count: %s", i);
            return i == 0 ? "" : ",?";
        }
        int length = str2.length();
        long j = length * i;
        int i2 = (int) j;
        if (i2 != j) {
            throw new ArrayIndexOutOfBoundsException(0Pz.A0U("Required array size too large: ", j));
        }
        char[] cArr = new char[i2];
        str2.getChars(0, length, cArr, 0);
        while (true) {
            int i3 = i2 - length;
            if (length >= i3) {
                System.arraycopy(cArr, 0, cArr, length, i3);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }
}
