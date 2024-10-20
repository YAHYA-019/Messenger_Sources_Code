package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: By9.class */
public final class By9 {
    public Capabilities A00;
    public final Context A01;
    public final 2bX A02;
    public final 1Br A03;
    public final Lock A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;

    public By9(Context context) {
        11T.A0F(context, 1);
        this.A01 = context;
        this.A09 = 7zM.A0e(context);
        this.A07 = 1Bu.A00(83237);
        this.A05 = 1HG.A00(context, 67259);
        this.A08 = 1Bu.A00(114734);
        this.A06 = 1Bu.A01(context, 67260);
        this.A03 = 7zM.A0Z();
        this.A04 = new ReentrantLock();
        this.A00 = Capabilities.A02;
        this.A02 = new LiveData(1BK.A1G((Object) null, false));
    }
}
