package X;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.secure.securewebview.SecureWebView;

/* loaded from: E9X.class */
public final class E9X extends SecureWebView {
    public boolean A00;
    public final E9d A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0gl, X.E9d] */
    public E9X(Context context) {
        super(context);
        ?? c0gl = new C0gl();
        this.A01 = c0gl;
        this.A00 = false;
        C0fs c0fs = new C0fs();
        c0fs.A02();
        0eS A01 = c0fs.A01();
        DKI.A0S(this);
        A06(c0gl);
        getSettings().setJavaScriptEnabled(true);
        super.A01 = A01;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(1058660271);
        if (this.A00) {
            requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        0FI.A0B(-580636826, A05);
        return onTouchEvent;
    }
}
