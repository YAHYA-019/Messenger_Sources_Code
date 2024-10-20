package X;

import android.webkit.WebView;

/* renamed from: X.5un, reason: invalid class name */
/* loaded from: 5un.class */
public interface C5un {
    public static final C5un A00 = new C5un() { // from class: X.5uo
        @Override // X.C5un
        public String AST(String str) {
            return WebView.findAddress(str);
        }
    };

    String AST(String str);
}
