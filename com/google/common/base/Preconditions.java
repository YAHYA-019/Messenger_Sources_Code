package com.google.common.base;

import X.0Pz;
import X.1BK;
import X.1BL;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.JQw;
import com.facebook.acra.constants.ActionId;

/* loaded from: Preconditions.class */
public abstract class Preconditions {
    public static String badPositionIndex(int i, int i2, String str) {
        Object[] A1a;
        String A00;
        if (i < 0) {
            A1a = AnonymousClass001.A1b(str, i);
            A00 = AnonymousClass000.A00(128);
        } else {
            if (i2 < 0) {
                throw 0Pz.A04("negative size: ", i2);
            }
            A1a = 1BK.A1a(str, Integer.valueOf(i), i2);
            A00 = JQw.A00(ActionId.TIMEOUT);
        }
        return Strings.lenientFormat(A00, A1a);
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean z, Object obj) {
        if (!z) {
            throw AnonymousClass001.A0L(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z, String str, int i) {
        if (!z) {
            throw 1BL.A0g(str, AnonymousClass001.A1a(i));
        }
    }

    public static void checkArgument(boolean z, String str, int i, int i2) {
        if (!z) {
            throw 1BL.A0g(str, AnonymousClass001.A1b(Integer.valueOf(i), i2));
        }
    }

    public static void checkArgument(boolean z, String str, long j) {
        if (!z) {
            throw 1BL.A0g(str, 1BK.A1Z(j));
        }
    }

    public static void checkArgument(boolean z, String str, Object obj) {
        if (!z) {
            throw 1BL.A0g(str, new Object[]{obj});
        }
    }

    public static void checkArgument(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw 1BL.A0g(str, new Object[]{obj, obj2});
        }
    }

    public static void checkArgument(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw 1BL.A0g(str, new Object[]{obj, obj2, obj3});
        }
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (!z) {
            throw 1BL.A0g(str, objArr);
        }
    }

    public static int checkElementIndex(int i, int i2) {
        checkElementIndex(i, i2, "index");
        return i;
    }

    public static int checkElementIndex(int i, int i2, String str) {
        Object[] A1b;
        int i3;
        if (i < 0) {
            A1b = AnonymousClass001.A1b(str, i);
            i3 = 128;
        } else {
            if (i < i2) {
                return i;
            }
            if (i2 < 0) {
                throw 0Pz.A04("negative size: ", i2);
            }
            A1b = 1BK.A1a(str, Integer.valueOf(i), i2);
            i3 = 63;
        }
        throw new IndexOutOfBoundsException(Strings.lenientFormat(AnonymousClass000.A00(i3), A1b));
    }

    public static Object checkNotNull(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw AnonymousClass001.A0Q(String.valueOf(obj2));
    }

    public static Object checkNotNull(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw AnonymousClass001.A0Q(Strings.lenientFormat(str, obj2));
    }

    public static Object checkNotNull(Object obj, String str, Object obj2, Object obj3) {
        if (obj != null) {
            return obj;
        }
        throw AnonymousClass001.A0Q(Strings.lenientFormat(str, obj2, obj3));
    }

    public static int checkPositionIndex(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(badPositionIndex(i, i2, "index"));
        }
        return i;
    }

    public static void checkPositionIndexes(int i, int i2, int i3) {
        String badPositionIndex;
        if (i >= 0) {
            if (i2 >= i && i2 <= i3) {
                return;
            }
            if (i <= i3) {
                if (i2 < 0 || i2 > i3) {
                    badPositionIndex = badPositionIndex(i2, i3, "end index");
                } else {
                    badPositionIndex = Strings.lenientFormat(JQw.A00(273), AnonymousClass001.A1b(Integer.valueOf(i2), i));
                }
                throw new IndexOutOfBoundsException(badPositionIndex);
            }
        }
        badPositionIndex = badPositionIndex(i, i3, "start index");
        throw new IndexOutOfBoundsException(badPositionIndex);
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw AnonymousClass001.A0N(String.valueOf(obj));
        }
    }

    public static void checkState(boolean z, String str, int i) {
        if (!z) {
            throw AnonymousClass001.A0N(Strings.lenientFormat(str, AnonymousClass001.A1a(i)));
        }
    }

    public static void checkState(boolean z, String str, long j) {
        if (!z) {
            throw AnonymousClass001.A0N(Strings.lenientFormat(str, 1BK.A1Z(j)));
        }
    }

    public static void checkState(boolean z, String str, Object obj) {
        if (!z) {
            throw AnonymousClass001.A0N(Strings.lenientFormat(str, obj));
        }
    }

    public static void checkState(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw AnonymousClass001.A0N(Strings.lenientFormat(str, obj, obj2));
        }
    }

    public static void checkState(boolean z, String str, Object... objArr) {
        if (!z) {
            throw AnonymousClass001.A0N(Strings.lenientFormat(str, objArr));
        }
    }
}
