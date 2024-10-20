package X;

import androidx.work.impl.WorkDatabase;
import com.facebook.omnistore.mqtt.MessagePublisher;
import java.util.AbstractCollection;
import java.util.concurrent.Callable;

/* renamed from: X.4Xd, reason: invalid class name */
/* loaded from: 4Xd.class */
public final class C4Xd implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C4Xd(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        2Ay CVT;
        Throwable th;
        try {
            switch (this.A00) {
                case 0:
                    C4Ji c4Ji = (C4Ji) this.A01;
                    AbstractCollection abstractCollection = (AbstractCollection) this.A02;
                    String str = this.A03;
                    WorkDatabase workDatabase = c4Ji.A02;
                    abstractCollection.addAll(workDatabase.A0F().BEM(str));
                    return workDatabase.A0E().BKy(str);
                case 1:
                    MessagePublisher messagePublisher = (MessagePublisher) this.A01;
                    CVT = messagePublisher.mMqttPushServiceClientManager.CVT();
                    String str2 = this.A03;
                    byte[] bArr = (byte[]) this.A02;
                    messagePublisher.mMonotonicClock.now();
                    if (!CVT.A09(str2, bArr, 60000L)) {
                        new Exception() { // from class: X.4Rm
                        };
                        throw th;
                    }
                    CVT.A07();
                    return null;
                default:
                    C4Uu c4Uu = (C4Uu) this.A01;
                    CVT = ((C1oE) c4Uu.A03.get()).CVT();
                    String str3 = this.A03;
                    byte[] bArr2 = (byte[]) this.A02;
                    ((C0dr) c4Uu.A02.get()).now();
                    if (!CVT.A09(str3, bArr2, 60000L)) {
                        new Exception() { // from class: X.4Rn
                        };
                        throw th;
                    }
                    CVT.A07();
                    return null;
            }
        } catch (Throwable th2) {
            CVT.A07();
            throw th2;
        }
    }
}
