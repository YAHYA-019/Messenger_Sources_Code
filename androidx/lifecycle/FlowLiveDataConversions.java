package androidx.lifecycle;

import X.0DE;
import X.0DK;
import X.0DR;
import X.0yB;
import X.0zV;
import X.11T;
import X.2Zs;
import X.2aG;
import X.2aN;
import X.4ZJ;
import X.AJV;
import X.C15t;
import X.C2a0;
import X.C2a2;
import X.JR4;

/* loaded from: FlowLiveDataConversions.class */
public abstract class FlowLiveDataConversions {
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.CoroutineLiveData, java.lang.Object, androidx.lifecycle.MediatorLiveData] */
    public static final LiveData asLiveData(0zV r301, 0DE r302, long j) {
        11T.A0H(r301, r302);
        AJV ajv = new AJV(r301, (0DR) null, 17, 42);
        ?? mediatorLiveData = new MediatorLiveData();
        C2a0 c2a0 = new C2a0((C2a2) r302.get(C2a2.A00));
        2Zs r0 = 2aN.A00;
        mediatorLiveData.blockRunner = new BlockRunner(mediatorLiveData, ajv, 5000L, 2aG.A02(0DK.A02(4ZJ.A00.A01(), r302).plus(c2a0)), new JR4((Object) mediatorLiveData, 9));
        if (r301 instanceof C15t) {
            boolean A03 = 0yB.A00().A03();
            Object value = ((C15t) r301).getValue();
            if (!A03) {
                mediatorLiveData.postValue(value);
                return mediatorLiveData;
            }
            mediatorLiveData.setValue(value);
        }
        return mediatorLiveData;
    }
}
