package androidx.sharetarget;

import X.0IT;
import X.0QO;
import X.4jA;
import X.4jV;
import X.4jX;
import X.4jZ;
import X.AbstractC07214j9;
import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: ShortcutInfoCompatSaverImpl.class */
public class ShortcutInfoCompatSaverImpl extends AbstractC07214j9 {
    public static final Object A07 = new Object();
    public static volatile ShortcutInfoCompatSaverImpl A08;
    public final Context A00;
    public final File A01;
    public final File A02;
    public final ExecutorService A05;
    public final ExecutorService A06;
    public final Map A04 = new 0QO(0);
    public final Map A03 = new 0QO(0);

    public ShortcutInfoCompatSaverImpl(Context context, ExecutorService executorService, ExecutorService executorService2) {
        this.A00 = context.getApplicationContext();
        this.A05 = executorService;
        this.A06 = executorService2;
        File file = new File(context.getFilesDir(), "ShortcutInfoCompatSaver_share_targets");
        this.A01 = new File(file, "ShortcutInfoCompatSaver_share_targets_bitmaps");
        this.A02 = new File(file, "targets.xml");
        executorService.submit((Runnable) new 4jA(this, file));
    }

    public static ShortcutInfoCompatSaverImpl getInstance(Context context) {
        if (A08 == null) {
            synchronized (A07) {
                if (A08 == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    long j = 20;
                    A08 = new ShortcutInfoCompatSaverImpl(context, new ThreadPoolExecutor(0, 1, j, timeUnit, new LinkedBlockingQueue()), new ThreadPoolExecutor(0, 1, j, timeUnit, new LinkedBlockingQueue()));
                }
            }
        }
        return A08;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.common.util.concurrent.ListenableFuture, X.0IT, java.lang.Object] */
    public void A01(final 0IT r302) {
        4jZ r0 = new 4jZ(this, new ArrayList(this.A04.values()));
        final ?? obj = new Object();
        this.A06.submit((Runnable) new 4jX((0IT) obj, this, r0));
        obj.addListener(new Runnable() { // from class: X.4ja
            public static final String __redex_internal_original_name = "ShortcutInfoCompatSaverImpl$11";

            @Override // java.lang.Runnable
            public void run() {
                try {
                    obj.get();
                    r302.A04((Object) null);
                } catch (Exception e) {
                    r302.A05(e);
                }
            }
        }, this.A05);
    }

    public void A02(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((4jV) it.next()).A01;
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        for (File file : this.A01.listFiles()) {
            if (!arrayList.contains(file.getAbsolutePath())) {
                file.delete();
            }
        }
    }
}
