package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.0kl, reason: invalid class name */
/* loaded from: 0kl.class */
public class C0kl implements AnonymousClass184 {
    public Throwable A00 = null;
    public final int A01;
    public final long A02;
    public final 18Q A03;
    public final C18v A04;
    public final String A05;
    public volatile AnonymousClass178 A06;
    public volatile 18X A07;

    public C0kl(18Q r302, C18v c18v, String str, int i, long j) {
        this.A03 = r302;
        this.A05 = str;
        this.A04 = c18v;
        this.A01 = i;
        this.A02 = j;
    }

    public void A00() {
        if (this.A07 != null) {
            this.A07.onSuccess(this.A01);
        }
        if (this.A06 != null) {
            this.A06.cancel(false);
        }
    }

    public void A01() {
        synchronized (this) {
            this.A00 = new TimeoutException();
        }
        if (this.A07 != null) {
            this.A07.CEZ(this.A01);
        }
        if (this.A06 != null) {
            this.A06.cancel(false);
        }
    }

    public void A02(0Mb r302) {
        synchronized (this) {
            this.A00 = r302;
        }
        if (this.A07 != null) {
            this.A07.BxW(this.A01, r302.mError.name());
        }
        if (this.A06 != null) {
            this.A06.cancel(false);
        }
    }

    @Override // X.AnonymousClass184
    public int B0K() {
        return this.A01;
    }

    @Override // X.AnonymousClass184
    public void DA7(long j) {
        if (this.A06 != null) {
            try {
                this.A06.get(j, TimeUnit.MILLISECONDS);
            } catch (CancellationException unused) {
            }
            synchronized (this) {
                Throwable th = this.A00;
                if (th != null) {
                    throw new ExecutionException(th);
                }
            }
        }
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MqttOperation{mResponseType=");
        A0k.append(this.A04);
        A0k.append(", mOperationId=");
        A0k.append(this.A01);
        A0k.append(", mCreationTime=");
        A0k.append(this.A02);
        return AnonymousClass001.A0f(A0k);
    }
}
