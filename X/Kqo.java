package X;

import android.content.Context;
import android.webkit.WebView;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: Kqo.class */
public final class Kqo {
    public static Kqo A09;
    public long A00;
    public WebView A01;
    public LDF A02;
    public PrefetchCacheEntry A03;
    public String A04;
    public List A05;
    public final Context A07;
    public final LinkedList A08 = AbF.A1F();
    public boolean A06 = false;

    public Kqo(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A07 = applicationContext;
        LDF A00 = LDF.A00();
        this.A02 = A00;
        Kjp kjp = Kjp.A03;
        if (kjp == null) {
            kjp = new Kjp();
            Kjp.A03 = kjp;
        }
        A00.A05 = kjp;
        this.A02.A06(applicationContext, false);
        this.A05 = Collections.synchronizedList(AbF.A1F());
    }

    public void A00(PrefetchCacheEntry prefetchCacheEntry) {
        synchronized (this) {
            if (this.A06) {
                LinkedList linkedList = this.A08;
                if (linkedList.size() < 10) {
                    linkedList.addLast(prefetchCacheEntry);
                } else if (LCd.A00) {
                    android.util.Log.w("BrowserHtmlResourceExtractor", "Too many extract resource requests, dropping current one");
                }
            } else {
                this.A06 = true;
                KxI.A00(new SAG(prefetchCacheEntry, this));
            }
        }
    }
}
