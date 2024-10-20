package X;

import android.view.View;
import android.view.WindowInsetsController;

/* renamed from: X.13r, reason: invalid class name */
/* loaded from: 13r.class */
public final class C13r extends C0xc {
    public View A00;
    public WindowInsetsController A01;

    public C13r(View view) {
        super(view);
        this.A00 = view;
    }

    public C13r(WindowInsetsController windowInsetsController) {
        super(null);
        this.A01 = windowInsetsController;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r302 != null) goto L8;
     */
    @Override // X.C0xc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01() {
        /*
            r301 = this;
            r0 = r301
            android.view.WindowInsetsController r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1b
            r0 = r301
            android.view.View r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L7c
            r0 = r303
            android.view.WindowInsetsController r0 = r0.getWindowInsetsController()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L7c
        L1b:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r303 = r0
            r0 = r303
            r1 = 0
            r0.<init>(r1)
            X.0SL r0 = new X.0SL
            r304 = r0
            r0 = r304
            r1 = r303
            r0.<init>(r1)
            r0 = r302
            r1 = r304
            r0.addOnControllableInsetsChangedListener(r1)
            r0 = r303
            boolean r0 = r0.get()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L67
            r0 = r301
            android.view.View r0 = r0.A00
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L67
            r0 = r306
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r307 = r0
            r0 = r306
            android.os.IBinder r0 = r0.getWindowToken()
            r303 = r0
            r0 = r307
            r1 = r303
            r2 = 0
            boolean r0 = r0.hideSoftInputFromWindow(r1, r2)
        L67:
            r0 = r302
            r1 = r304
            r0.removeOnControllableInsetsChangedListener(r1)
            int r0 = android.view.WindowInsets.Type.ime()
            r305 = r0
            r0 = r302
            r1 = r305
            r0.hide(r1)
            return
        L7c:
            r0 = r301
            super.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13r.A01():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r305 != null) goto L13;
     */
    @Override // X.C0xc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02() {
        /*
            r301 = this;
            r0 = r301
            android.view.View r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2d
            int r0 = android.os.Build.VERSION.SDK_INT
            r303 = r0
            r0 = 33
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 >= r1) goto L2d
            r0 = r302
            android.content.Context r0 = r0.getContext()
            r305 = r0
            r0 = r305
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r306 = r0
            r0 = r306
            boolean r0 = r0.isActive()
        L2d:
            r0 = r301
            android.view.WindowInsetsController r0 = r0.A01
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L47
            r0 = r302
            if (r0 == 0) goto L53
            r0 = r302
            android.view.WindowInsetsController r0 = r0.getWindowInsetsController()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L53
        L47:
            int r0 = android.view.WindowInsets.Type.ime()
            r304 = r0
            r0 = r305
            r1 = r304
            r0.show(r1)
        L53:
            r0 = r301
            super.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13r.A02():void");
    }
}
