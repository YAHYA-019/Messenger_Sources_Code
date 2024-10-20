package X;

/* renamed from: X.0ea, reason: invalid class name */
/* loaded from: 0ea.class */
public final class C0ea implements C0d8 {
    public static final C0ea A01 = new Object();
    public int A00;

    public C0ea() {
    }

    public C0ea(int i) {
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
        android.util.Log.println(i, str, str2);
    }

    @Override // X.C0d8
    public void CrH(int i) {
        this.A00 = i;
    }

    @Override // X.C0d8
    public void DBS(String str, String str2) {
        android.util.Log.e(str, str2);
    }

    @Override // X.C0d8
    public void DBT(String str, String str2, Throwable th) {
        android.util.Log.e(str, str2, th);
    }

    @Override // X.C0d8
    public void d(String str, String str2) {
        android.util.Log.d(str, str2);
    }

    @Override // X.C0d8
    public void d(String str, String str2, Throwable th) {
        android.util.Log.d(str, str2, th);
    }

    @Override // X.C0d8
    public void e(String str, String str2) {
        android.util.Log.e(str, str2);
    }

    @Override // X.C0d8
    public void e(String str, String str2, Throwable th) {
        android.util.Log.e(str, str2, th);
    }

    @Override // X.C0d8
    public void i(String str, String str2) {
        android.util.Log.i(str, str2);
    }

    @Override // X.C0d8
    public void i(String str, String str2, Throwable th) {
        android.util.Log.i(str, str2, th);
    }

    @Override // X.C0d8
    public void v(String str, String str2) {
        android.util.Log.v(str, str2);
    }

    @Override // X.C0d8
    public void v(String str, String str2, Throwable th) {
        android.util.Log.v(str, str2, th);
    }

    @Override // X.C0d8
    public void w(String str, String str2) {
        android.util.Log.w(str, str2);
    }

    @Override // X.C0d8
    public void w(String str, String str2, Throwable th) {
        android.util.Log.w(str, str2, th);
    }
}
