package X;

import android.content.Context;
import android.content.pm.ProviderInfo;
import java.util.HashMap;

/* renamed from: X.1AJ, reason: invalid class name */
/* loaded from: 1AJ.class */
public final class C1AJ implements C0w6 {
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0w6, java.lang.Object] */
    public static 10D A00(Context context) {
        HashMap hashMap = 10D.A06;
        return 10D.A01(context, (ProviderInfo) null, (C0w6) new Object());
    }

    @Override // X.C0w6
    public void Cfz(String str) {
        android.util.Log.e("Security-LocalReporter", str);
    }

    @Override // X.C0w6
    public void Cg0(String str, String str2, Throwable th) {
        android.util.Log.e(str, str2, th);
    }
}
