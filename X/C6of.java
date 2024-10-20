package X;

import android.webkit.WebView;
import com.facebook.litho.ComponentsSystrace;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6of, reason: invalid class name */
/* loaded from: 6of.class */
public final class C6of implements Runnable {
    public static final String __redex_internal_original_name = "WebViewPerfHelper$beginAsyncInit$1";
    public final /* synthetic */ 64C A00;

    public C6of(64C r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        64C r0 = this.A00;
        0fH.A0j("WebViewPerfHelper", "initializing");
        C00j.A05("WebViewPerfHelper#init", 1119869457);
        try {
            WebView.findAddress("1 Hacker Way");
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            C00j.A01(-600456785);
            throw th;
        }
        C00j.A01(-975429839);
        synchronized (r0) {
            0fH.A0j("WebViewPerfHelper", "WebView is now initialized");
            r0.A02 = true;
            r0.A01 = null;
            ArrayList arrayList = r0.A04;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final 6MJ r02 = (6MJ) it.next();
                if (r02.A00) {
                    r02.A01.A0N.post(new Runnable() { // from class: X.6oj
                        public static final String __redex_internal_original_name = "MessageListSectionsHelper$18$1";

                        @Override // java.lang.Runnable
                        public void run() {
                            C6Ff c6Ff = r02.A01;
                            ComponentsSystrace.A02("MessageListSectionsHelper.forceUpdateAdapter");
                            if (c6Ff.A0w.isEmpty()) {
                                c6Ff.A00++;
                                c6Ff.A05(c6Ff.A0E, c6Ff.A0P, c6Ff.A0R, null, true, false);
                            }
                            ComponentsSystrace.A01();
                        }
                    });
                }
            }
            arrayList.clear();
        }
    }
}
