package X;

/* renamed from: X.0d7, reason: invalid class name */
/* loaded from: 0d7.class */
public abstract class C0d7 {
    public static C0d8 A00 = new C0d8() { // from class: X.0s0
        public int A00 = 5;

        private void A00(int i, String str, String str2) {
            android.util.Log.println(i, 0Pz.A0j("unknown", ":", str), str2);
        }

        private void A01(String str, String str2, int i, Throwable th) {
            android.util.Log.println(i, 0Pz.A0j("unknown", ":", str), 0Pz.A0Y(str2, th == null ? "" : android.util.Log.getStackTraceString(th), '\n'));
        }

        @Override // X.C0d8
        public int Axs() {
            return this.A00;
        }

        @Override // X.C0d8
        public boolean BTv(int i) {
            boolean z = false;
            if (this.A00 <= i) {
                z = true;
            }
            return z;
        }

        @Override // X.C0d8
        public void BZM(int i, String str, String str2) {
            A00(i, str, str2);
        }

        @Override // X.C0d8
        public void CrH(int i) {
            this.A00 = i;
        }

        @Override // X.C0d8
        public void DBS(String str, String str2) {
            A00(6, str, str2);
        }

        @Override // X.C0d8
        public void DBT(String str, String str2, Throwable th) {
            A01(str, str2, 6, th);
        }

        @Override // X.C0d8
        public void d(String str, String str2) {
            A00(3, str, str2);
        }

        @Override // X.C0d8
        public void d(String str, String str2, Throwable th) {
            A01(str, str2, 3, th);
        }

        @Override // X.C0d8
        public void e(String str, String str2) {
            A00(6, str, str2);
        }

        @Override // X.C0d8
        public void e(String str, String str2, Throwable th) {
            A01(str, str2, 6, th);
        }

        @Override // X.C0d8
        public void i(String str, String str2) {
            A00(4, str, str2);
        }

        @Override // X.C0d8
        public void i(String str, String str2, Throwable th) {
            A01(str, str2, 4, th);
        }

        @Override // X.C0d8
        public void v(String str, String str2) {
            A00(2, str, str2);
        }

        @Override // X.C0d8
        public void v(String str, String str2, Throwable th) {
            A01(str, str2, 2, th);
        }

        @Override // X.C0d8
        public void w(String str, String str2) {
            A00(5, str, str2);
        }

        @Override // X.C0d8
        public void w(String str, String str2, Throwable th) {
            A01(str, str2, 5, th);
        }
    };

    public static void A00(Class cls, String str) {
        C0d8 c0d8 = A00;
        if (c0d8.BTv(6)) {
            c0d8.e(cls.getSimpleName(), str);
        }
    }

    public static void A01(Class cls, String str) {
        C0d8 c0d8 = A00;
        if (c0d8.BTv(5)) {
            c0d8.w(cls.getSimpleName(), str);
        }
    }

    public static void A02(Class cls, String str, Throwable th) {
        C0d8 c0d8 = A00;
        if (c0d8.BTv(5)) {
            c0d8.w(cls.getSimpleName(), str, th);
        }
    }

    public static void A03(Class cls, String str, Throwable th) {
        C0d8 c0d8 = A00;
        if (c0d8.BTv(6)) {
            c0d8.DBT(cls.getSimpleName(), str, th);
        }
    }

    public static void A04(Class cls, String str, Throwable th, Object... objArr) {
        if (A00.BTv(5)) {
            A02(cls, AnonymousClass002.A0L(str, objArr), th);
        }
    }

    public static void A05(Class cls, String str, Object... objArr) {
        C0d8 c0d8 = A00;
        if (c0d8.BTv(6)) {
            c0d8.e(cls.getSimpleName(), AnonymousClass002.A0L(str, objArr));
        }
    }

    public static void A06(Class cls, String str, Object... objArr) {
        C0d8 c0d8 = A00;
        if (c0d8.BTv(5)) {
            c0d8.w(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void A07(String str, String str2) {
        C0d8 c0d8 = A00;
        if (c0d8.BTv(6)) {
            c0d8.e(str, str2);
        }
    }

    public static void A08(String str, String str2) {
        C0d8 c0d8 = A00;
        if (c0d8.BTv(5)) {
            c0d8.w(str, str2);
        }
    }

    public static void A09(String str, String str2) {
        C0d8 c0d8 = A00;
        if (c0d8.BTv(6)) {
            c0d8.DBS(str, str2);
        }
    }

    public static void A0A(String str, String str2, Throwable th) {
        C0d8 c0d8 = A00;
        if (c0d8.BTv(6)) {
            c0d8.e(str, str2, th);
        }
    }

    public static void A0B(String str, String str2, Throwable th) {
        C0d8 c0d8 = A00;
        if (c0d8.BTv(6)) {
            c0d8.DBT(str, str2, th);
        }
    }

    public static void A0C(String str, String str2, Object... objArr) {
        C0d8 c0d8 = A00;
        if (c0d8.BTv(6)) {
            c0d8.e(str, AnonymousClass002.A0L(str2, objArr));
        }
    }

    public static void A0D(String str, String str2, Object... objArr) {
        C0d8 c0d8 = A00;
        if (c0d8.BTv(5)) {
            c0d8.w(str, String.format(null, str2, objArr));
        }
    }

    public static void A0E(String str, String str2, Object... objArr) {
        C0d8 c0d8 = A00;
        if (c0d8.BTv(6)) {
            c0d8.DBS(str, AnonymousClass002.A0L(str2, objArr));
        }
    }
}
