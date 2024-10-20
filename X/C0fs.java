package X;

import android.content.Context;
import com.facebook.secure.securewebview.SecureWebView;
import java.util.List;

/* renamed from: X.0fs, reason: invalid class name */
/* loaded from: 0fs.class */
public final class C0fs {
    public final List A01 = AnonymousClass001.A0s();
    public final List A00 = AnonymousClass001.A0s();

    public static Context A00(Context context, SecureWebView secureWebView) {
        C0fs c0fs = new C0fs();
        List list = c0fs.A00;
        16J r0 = new 16J();
        r0.A05(new String[]{"https"});
        0ER A00 = r0.A00();
        11T.A0A(A00);
        list.add(A00);
        secureWebView.A01 = c0fs.A01();
        secureWebView.A02 = "SecureWebView";
        return context.getApplicationContext();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0w6, java.lang.Object] */
    public final 0eS A01() {
        return new 0eS((C0w6) new Object(), new 0YV(), this.A01, this.A00);
    }

    public final void A02() {
        List list = this.A00;
        16J r0 = new 16J();
        r0.A05(new String[]{"http", "https"});
        0ER A00 = r0.A00();
        11T.A0A(A00);
        list.add(A00);
    }
}
