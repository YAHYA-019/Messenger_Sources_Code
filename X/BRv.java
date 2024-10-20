package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* loaded from: BRv.class */
public abstract class BRv {
    public static final MediatorLiveData A00(LiveData liveData, Function2 function2, LiveData[] liveDataArr) {
        11T.A0F(liveData, 0);
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        Object obj = new Object();
        LinkedHashMap A1C = 1BK.A1C();
        mediatorLiveData.addSource(liveData, new Ca2(1, A1C, function2, obj, mediatorLiveData));
        for (LiveData liveData2 : liveDataArr) {
            mediatorLiveData.addSource(liveData2, new Ca3(0, liveData2, mediatorLiveData, A1C, function2, obj));
        }
        return mediatorLiveData;
    }
}
