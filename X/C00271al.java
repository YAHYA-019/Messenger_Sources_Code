package X;

import android.net.Uri;

/* renamed from: X.1al, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1al.class */
public final class C00271al implements InterfaceC00281am {
    public final String A00;
    public final String[] A01;

    public C00271al(String[] strArr) {
        this.A00 = strArr[0];
        this.A01 = strArr;
    }

    public static Uri.Builder A00(C00271al c00271al, String str) {
        return C0A2.A03(0Pz.A0W(str, c00271al.A00)).buildUpon();
    }

    @Override // X.InterfaceC00281am
    public Uri.Builder AX6() {
        return C0A2.A03(0Pz.A0W("https://api.", this.A00)).buildUpon();
    }

    @Override // X.InterfaceC00281am
    public String AX7() {
        return null;
    }

    @Override // X.InterfaceC00281am
    public String[] Ai5() {
        return this.A01;
    }

    @Override // X.InterfaceC00281am
    public Uri.Builder AoA() {
        return C0A2.A03(0Pz.A0W("https://graph.", this.A00)).buildUpon();
    }

    @Override // X.InterfaceC00281am
    public Uri.Builder AoB() {
        return A00(this, "https://graph-video.");
    }

    @Override // X.InterfaceC00281am
    public Uri.Builder AoO() {
        return A00(this, "http://h.");
    }

    @Override // X.InterfaceC00281am
    public Uri.Builder Axy() {
        return A00(this, "https://m.");
    }

    @Override // X.InterfaceC00281am
    public Uri.Builder B9S() {
        return A00(this, "https://graph.secure.");
    }

    @Override // X.InterfaceC00281am
    public Uri.Builder B9U() {
        return A00(this, "https://secure.");
    }
}
