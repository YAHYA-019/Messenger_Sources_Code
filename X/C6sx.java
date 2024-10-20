package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.6sx, reason: invalid class name */
/* loaded from: 6sx.class */
public final class C6sx implements 1Vf {
    public LiveData A00;
    public final Context A01;
    public final LifecycleOwner A02;
    public final Observer A03 = new CZv(this, 4);
    public final ThreadKey A04;

    public C6sx(Context context, LifecycleOwner lifecycleOwner, ThreadKey threadKey) {
        this.A01 = context;
        this.A04 = threadKey;
        this.A02 = lifecycleOwner;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        int hashCode = str.hashCode();
        if (hashCode != -2099842703) {
            if (hashCode != -1027586847) {
                if (hashCode == -609719278 && str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnResume")) {
                    LiveData liveData = this.A00;
                    if (liveData != null) {
                        liveData.observe(this.A02, this.A03);
                        return;
                    }
                    return;
                }
            } else if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnCreate")) {
                this.A00 = Transformations.distinctUntilChanged(((C6sy) 1Bi.A03(67328)).A01(this.A04));
                return;
            }
        } else if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnPause")) {
            LiveData liveData2 = this.A00;
            if (liveData2 != null) {
                liveData2.removeObserver(this.A03);
                return;
            }
            return;
        }
        throw 4YV.A0f(str);
    }
}
