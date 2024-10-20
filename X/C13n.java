package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.13n, reason: invalid class name */
/* loaded from: 13n.class */
public final class C13n implements C15o {
    public static final 16C A0E = 16C.A00();
    public C15w A00;
    public final Handler A01;
    public final C15y A02;
    public final C09D A03;
    public final C16f A04;
    public final String A06;
    public final String A07;
    public final Context A0A;
    public final C15x A0B;
    public final AnonymousClass161 A0C;
    public final 0QY A0D;
    public final Queue A08 = new ConcurrentLinkedQueue();
    public final AtomicBoolean A09 = new AtomicBoolean(false);
    public final Runnable A05 = new Runnable() { // from class: X.163
        public static final String __redex_internal_original_name = "DefaultAnalyticsLogger$AnalyticsBackgroundWorker";

        @Override // java.lang.Runnable
        public void run() {
            C13n c13n = C13n.this;
            16C r0 = C13n.A0E;
            c13n.A09.set(false);
            while (true) {
                Queue queue = c13n.A08;
                if (queue.isEmpty()) {
                    return;
                } else {
                    ((Runnable) queue.remove()).run();
                }
            }
        }
    };

    public C13n(Context context, AnonymousClass161 anonymousClass161, C09D c09d, C16f c16f, C16f c16f2, 0QY r307, String str, String str2, String str3, String str4) {
        this.A0A = context;
        this.A03 = c09d;
        this.A04 = c16f2;
        this.A07 = str4;
        this.A06 = str3;
        this.A0C = anonymousClass161;
        this.A01 = new 0uL(context.getMainLooper(), this, 3);
        this.A0B = new C15x(context.getApplicationContext(), anonymousClass161, str);
        this.A02 = new C15y(context.getApplicationContext(), anonymousClass161, c16f, str, str2);
        this.A0D = r307;
        if (this.A00 != null) {
            A00(this);
        }
        C15w c15w = new C15w();
        c15w.A04 = this.A06;
        c15w.A05 = this.A07;
        AtomicReference atomicReference = new AtomicReference("");
        CountDownLatch A11 = AnonymousClass001.A11();
        atomicReference.set(this.A03.getString("fb_uid", ""));
        A11.countDown();
        try {
            A11.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            0fH.A0s("DefaultAnalyticsLogger", "Waiting for fb user id interrupted", e);
        }
        String str5 = (String) atomicReference.get();
        c15w.A06 = TextUtils.isEmpty(str5) ? ConstantsKt.CAMERA_ID_FRONT : str5;
        c15w.A03 = "567310203415052";
        c15w.A02 = this.A04;
        this.A00 = c15w;
    }

    public static void A00(C13n c13n) {
        OutputStreamWriter outputStreamWriter;
        C15w c15w = c13n.A00;
        List list = c15w.A07;
        if (list.isEmpty()) {
            return;
        }
        C15x c15x = c13n.A0B;
        String str = "failed to close writer";
        AnonymousClass161 anonymousClass161 = c15x.A00;
        anonymousClass161.A00(new C15r("log_event_attempted", 1L));
        File file = c15x.A01;
        if (!file.exists() && !file.mkdir()) {
            0fH.A0k("AnalyticsStorage", "Unable to open analytics storage.");
        }
        UUID uuid = c15w.A08;
        if (uuid == null) {
            uuid = UUID.randomUUID();
            c15w.A08 = uuid;
        }
        File A0D = AnonymousClass001.A0D(file, AnonymousClass002.A0L("%s_%d.batch", AnonymousClass001.A1b(uuid.toString(), c15w.A00)));
        if (A0D.exists()) {
            0fH.A0g(A0D, "AnalyticsStorage", "Duplicate file %s");
            if (!A0D.delete()) {
                0fH.A17("AnalyticsStorage", "File %s was not deleted", new Object[]{A0D});
            }
        }
        c15w.A01 = System.currentTimeMillis();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(A0D);
            try {
                try {
                    outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF8");
                    try {
                        outputStreamWriter.write(c15w.toString());
                        anonymousClass161.A00(new C15r("log_event_file_size_in_bytes", r0.length()));
                        anonymousClass161.A00(new C15r("log_event_succeeded", 1L));
                    } catch (IOException e) {
                        0fH.A0v("AnalyticsStorage", "failed to write session to file", e);
                    }
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e2) {
                        e = e2;
                        0fH.A0v("AnalyticsStorage", str, e);
                        list.clear();
                        c15w.A00++;
                    }
                } catch (Throwable th) {
                    try {
                        outputStreamWriter.close();
                        throw th;
                    } catch (IOException e3) {
                        0fH.A0v("AnalyticsStorage", str, e3);
                        throw th;
                    }
                }
            } catch (UnsupportedEncodingException e4) {
                0fH.A0v("AnalyticsStorage", "UTF8 encoding is not supported", e4);
                try {
                    fileOutputStream.close();
                } catch (IOException e5) {
                    e = e5;
                    str = "failed to close output stream";
                    0fH.A0v("AnalyticsStorage", str, e);
                    list.clear();
                    c15w.A00++;
                }
            }
        } catch (FileNotFoundException e6) {
            0fH.A11("AnalyticsStorage", "Batch file creation failed %s", e6, new Object[]{A0D});
        }
        list.clear();
        c15w.A00++;
    }

    public static void A01(C13n c13n, Runnable runnable) {
        c13n.A08.add(runnable);
        if (c13n.A09.compareAndSet(false, true)) {
            A0E.execute(c13n.A05);
        }
    }

    @Override // X.C15o
    public void CgC(final C15n c15n) {
        boolean z;
        0QY r0 = this.A0D;
        java.util.Map map = c15n.A06;
        if (!map.containsKey(Lra.__redex_internal_original_name)) {
            09C r02 = r0.A00;
            0Mf[] r03 = 0Mf.A00;
            if (!r02.getBoolean("LOG_ANALYTICS_EVENTS", false)) {
                09C r04 = r0.A00;
                String str = 0Mf.A02.mPrefKey;
                11T.A0F(str, 0);
                z = r04.getBoolean(str, false);
            }
            A01(this, new Runnable(c15n, this) { // from class: X.164
                public static final String __redex_internal_original_name = "DefaultAnalyticsLogger$EventRunnable";
                public C15n A00;
                public final /* synthetic */ C13n A01;

                {
                    this.A01 = this;
                    this.A00 = c15n;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C13n c13n = this.A01;
                    C15n c15n2 = this.A00;
                    16C r05 = C13n.A0E;
                    AtomicReference atomicReference = new AtomicReference("");
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    atomicReference.set(c13n.A03.getString("user_id", ""));
                    countDownLatch.countDown();
                    try {
                        countDownLatch.await(5, TimeUnit.SECONDS);
                    } catch (InterruptedException e) {
                        0fH.A0s("DefaultAnalyticsLogger", "Waiting for user id interrupted", e);
                    }
                    String str2 = (String) atomicReference.get();
                    if (TextUtils.isEmpty(str2)) {
                        str2 = ConstantsKt.CAMERA_ID_FRONT;
                    }
                    c15n2.A03(str2);
                    List list = c13n.A00.A07;
                    list.add(c15n2);
                    Handler handler = c13n.A01;
                    handler.removeMessages(1);
                    if (list.size() >= 50) {
                        C13n.A00(c13n);
                    } else {
                        handler.sendEmptyMessageDelayed(1, 300000L);
                    }
                }
            });
        }
        z = Boolean.parseBoolean(AnonymousClass001.A0b(Lra.__redex_internal_original_name, map));
        if (!z) {
            return;
        }
        A01(this, new Runnable(c15n, this) { // from class: X.164
            public static final String __redex_internal_original_name = "DefaultAnalyticsLogger$EventRunnable";
            public C15n A00;
            public final /* synthetic */ C13n A01;

            {
                this.A01 = this;
                this.A00 = c15n;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13n c13n = this.A01;
                C15n c15n2 = this.A00;
                16C r05 = C13n.A0E;
                AtomicReference atomicReference = new AtomicReference("");
                CountDownLatch countDownLatch = new CountDownLatch(1);
                atomicReference.set(c13n.A03.getString("user_id", ""));
                countDownLatch.countDown();
                try {
                    countDownLatch.await(5, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    0fH.A0s("DefaultAnalyticsLogger", "Waiting for user id interrupted", e);
                }
                String str2 = (String) atomicReference.get();
                if (TextUtils.isEmpty(str2)) {
                    str2 = ConstantsKt.CAMERA_ID_FRONT;
                }
                c15n2.A03(str2);
                List list = c13n.A00.A07;
                list.add(c15n2);
                Handler handler = c13n.A01;
                handler.removeMessages(1);
                if (list.size() >= 50) {
                    C13n.A00(c13n);
                } else {
                    handler.sendEmptyMessageDelayed(1, 300000L);
                }
            }
        });
    }
}
