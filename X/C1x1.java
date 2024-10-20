package X;

import androidx.lifecycle.MutableLiveData;

/* renamed from: X.1x1, reason: invalid class name */
/* loaded from: 1x1.class */
public final class C1x1 {
    public final 1Br A00 = 1Bq.A00(16458);

    public final void A00(MutableLiveData mutableLiveData, Object obj) {
        11T.A0F(mutableLiveData, 0);
        if (((1GU) this.A00.A00.get()).BWu()) {
            mutableLiveData.setValue(obj);
        } else {
            mutableLiveData.postValue(obj);
        }
    }

    public final void A01(2bX r302, Object obj) {
        11T.A0F(r302, 0);
        if (((1GU) this.A00.A00.get()).BWu()) {
            r302.setValue(obj);
        } else {
            r302.postValue(obj);
        }
    }
}
