package androidx.lifecycle;

import X.0QJ;
import X.AnonymousClass001;
import java.util.Iterator;
import java.util.Map;

/* loaded from: MediatorLiveData.class */
public class MediatorLiveData extends MutableLiveData {
    public 0QJ mSources = new 0QJ();

    /* loaded from: MediatorLiveData$Source.class */
    public class Source implements Observer {
        public final LiveData mLiveData;
        public final Observer mObserver;
        public int mVersion = -1;

        public Source(LiveData liveData, Observer observer) {
            this.mLiveData = liveData;
            this.mObserver = observer;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            int i = this.mVersion;
            int i2 = this.mLiveData.mVersion;
            if (i != i2) {
                this.mVersion = i2;
                this.mObserver.onChanged(obj);
            }
        }
    }

    public void addSource(LiveData liveData, Observer observer) {
        if (liveData == null) {
            throw AnonymousClass001.A0Q("source cannot be null");
        }
        Source source = new Source(liveData, observer);
        Source source2 = (Source) this.mSources.A02(liveData, source);
        if (source2 != null) {
            if (source2.mObserver != observer) {
                throw AnonymousClass001.A0L("This source was already added with the different observer");
            }
        } else if (this.mActiveCount > 0) {
            source.mLiveData.observeForever(source);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        Iterator it = this.mSources.iterator();
        while (it.hasNext()) {
            Source source = (Source) ((Map.Entry) it.next()).getValue();
            source.mLiveData.observeForever(source);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        Iterator it = this.mSources.iterator();
        while (it.hasNext()) {
            Source source = (Source) ((Map.Entry) it.next()).getValue();
            source.mLiveData.removeObserver(source);
        }
    }

    public void removeSource(LiveData liveData) {
        Source source = (Source) this.mSources.A01(liveData);
        if (source != null) {
            source.mLiveData.removeObserver(source);
        }
    }
}
