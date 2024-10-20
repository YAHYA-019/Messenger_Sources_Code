package androidx.lifecycle;

import X.0Je;
import X.0QJ;
import X.11T;
import X.C4O2;
import kotlin.jvm.functions.Function1;

/* loaded from: Transformations.class */
public abstract class Transformations {
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Je, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r306v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.MediatorLiveData] */
    public static final LiveData distinctUntilChanged(LiveData liveData) {
        MediatorLiveData mediatorLiveData;
        11T.A0F(liveData, 0);
        ?? obj = new Object();
        ((0Je) obj).element = true;
        if (liveData.mData != LiveData.NOT_SET) {
            ((0Je) obj).element = false;
            ?? liveData2 = new LiveData(liveData.getValue());
            liveData2.mSources = new 0QJ();
            mediatorLiveData = liveData2;
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new C4O2(obj, mediatorLiveData, 0)));
        return mediatorLiveData;
    }

    /* JADX WARN: Type inference failed for: r306v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.MediatorLiveData] */
    public static final LiveData map(LiveData liveData, Function1 function1) {
        MediatorLiveData mediatorLiveData;
        11T.A0F(liveData, 0);
        if (liveData.mData != LiveData.NOT_SET) {
            ?? liveData2 = new LiveData(function1.invoke(liveData.getValue()));
            liveData2.mSources = new 0QJ();
            mediatorLiveData = liveData2;
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new C4O2(mediatorLiveData, function1, 1)));
        return mediatorLiveData;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r305v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.MediatorLiveData] */
    public static final LiveData switchMap(LiveData liveData, Function1 function1) {
        MediatorLiveData mediatorLiveData;
        LiveData liveData2;
        ?? obj = new Object();
        Object obj2 = liveData.mData;
        Object obj3 = LiveData.NOT_SET;
        if (obj2 == obj3 || (liveData2 = (LiveData) function1.invoke(liveData.getValue())) == null || liveData2.mData == obj3) {
            mediatorLiveData = new MediatorLiveData();
        } else {
            ?? liveData3 = new LiveData(liveData2.getValue());
            liveData3.mSources = new 0QJ();
            mediatorLiveData = liveData3;
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$1(function1, obj, mediatorLiveData)));
        return mediatorLiveData;
    }
}
