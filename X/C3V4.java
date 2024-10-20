package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3V4, reason: invalid class name */
/* loaded from: 3V4.class */
public final class C3V4 implements 1lT {
    public static final long A0B = TimeUnit.SECONDS.toMillis(60);
    public ByteArrayOutputStream A00;
    public boolean A01;
    public C32r A02;
    public final C49w A03;
    public final C1l1 A04;
    public final 1Rb A05;
    public final 1Zb A06;
    public final SamplingPolicyConfig A07;
    public final Context A08;
    public final 1RL A09;
    public final 1Nz A0A;

    public C3V4(Context context, 1RL r303, C1l1 c1l1, C03z c03z) {
        SamplingPolicyConfig samplingPolicyConfig;
        this.A08 = context;
        this.A04 = c1l1;
        this.A09 = r303;
        try {
            1S7 A00 = 1S7.A00(context);
            this.A05 = (1Rb) 1S7.A01(A00, c1l1.A06.getName(), A00.A05);
            Class cls = c1l1.A04;
            1Zb r309 = null;
            if (cls == null) {
                samplingPolicyConfig = null;
            } else {
                1S7 A002 = 1S7.A00(context);
                samplingPolicyConfig = (SamplingPolicyConfig) 1S7.A02(A002, cls.getName(), A002.A03);
            }
            this.A07 = samplingPolicyConfig;
            Class cls2 = c1l1.A02;
            if (cls2 != null) {
                1S7 A003 = 1S7.A00(context);
                r309 = (1Zb) 1S7.A02(A003, cls2.getName(), A003.A02);
            }
            this.A06 = r309;
            this.A0A = 1S7.A00(context).A04(c1l1.A07.getName());
            this.A03 = new C49w(context, c03z, samplingPolicyConfig, c1l1.A09);
        } catch (IllegalAccessException e) {
            throw A01(this, e);
        } catch (InstantiationException e2) {
            throw A01(this, e2);
        } catch (NoSuchMethodException e3) {
            throw A01(this, e3);
        } catch (InvocationTargetException e4) {
            throw A01(this, e4);
        }
    }

    /* JADX WARN: Type inference failed for: r302v2, types: [X.32r] */
    private C32r A00() {
        C32r c32r = this.A02;
        C32r c32r2 = c32r;
        if (c32r == null) {
            final Looper looper = this.A0A.AJ2("Analytics-NormalPri-InMemory-Scheduler", 10).getLooper();
            ?? r302 = new Handler(looper) { // from class: X.32r
                /* JADX WARN: Type inference failed for: r0v24, types: [X.4AQ, java.lang.Object] */
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    int i = message.what;
                    if (i != 1) {
                        throw 0Pz.A04("Unknown what=", i);
                    }
                    ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) message.obj;
                    C3V4 c3v4 = this;
                    C5r2 c5r2 = new C5r2(c3v4.A03, byteArrayOutputStream);
                    1Rb r0 = c3v4.A05;
                    Integer num = c3v4.A04.A08;
                    Iterator it = Collections.singletonList(c5r2).iterator();
                    4AR r02 = new 4AR((4AQ) new Object(), r0, c3v4.A06, c3v4.A07, num, it);
                    while (r02.A00.hasNext()) {
                        r02.A00();
                    }
                }
            };
            this.A02 = r302;
            c32r2 = r302;
        }
        return c32r2;
    }

    public static RuntimeException A01(C3V4 c3v4, Throwable th) {
        return new RuntimeException(0Pz.A0W("Failed to create instance of ", c3v4.A04.A06.getName()), th);
    }

    public void Bfh() {
        if (this.A00 == null) {
            throw AnonymousClass001.A0N(4YT.A00(373));
        }
        C32r A00 = A00();
        ByteArrayOutputStream byteArrayOutputStream = this.A00;
        A00.removeMessages(1, byteArrayOutputStream);
        1BK.A1I(A00, byteArrayOutputStream, 1);
    }

    public void Bfl() {
        if (this.A00 == null) {
            throw AnonymousClass001.A0N(4YT.A00(373));
        }
        if (this.A01) {
            return;
        }
        this.A01 = true;
        C32r A00 = A00();
        ByteArrayOutputStream byteArrayOutputStream = this.A00;
        A00.sendMessageDelayed(A00.obtainMessage(1, byteArrayOutputStream), A0B);
    }

    public void Bfm(long j) {
        throw 0Q8.createAndThrow();
    }

    public void Bfn(long[] jArr, int i, int i2) {
        throw 0Q8.createAndThrow();
    }

    public void Bgl(String str) {
        if (this.A00 != null) {
            C32r A00 = A00();
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            A00.removeMessages(1, byteArrayOutputStream);
            1BK.A1I(A00, byteArrayOutputStream, 1);
        }
    }

    public /* bridge */ /* synthetic */ void CqQ(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) obj;
        if (this.A00 != byteArrayOutputStream) {
            this.A00 = byteArrayOutputStream;
            this.A01 = false;
        }
    }

    public void D5D() {
        if (this.A00 != null) {
            C32r A00 = A00();
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            A00.removeMessages(1, byteArrayOutputStream);
            1BK.A1I(A00, byteArrayOutputStream, 1);
        }
    }
}
