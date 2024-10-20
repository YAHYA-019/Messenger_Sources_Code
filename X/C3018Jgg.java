package X;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.fbpay.w3c.CardDetails;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jgg, reason: case insensitive filesystem */
/* loaded from: Jgg.class */
public final class C3018Jgg extends AndroidViewModel {
    public static final C04t A0D = new C04t("^\\d{3,4}$");
    public long A00;
    public String A01;
    public List A02;
    public final MediatorLiveData A03;
    public final MutableLiveData A04;
    public final MutableLiveData A05;
    public final MutableLiveData A06;
    public final C0dp A07;
    public final F9i A08;
    public final Integer A09;
    public final List A0A;
    public final Application A0B;
    public final Bundle A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v24, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public C3018Jgg(Application application, Bundle bundle) {
        super(application);
        ArrayList parcelableArrayList;
        11T.A0F(application, 1);
        this.A0B = application;
        this.A0C = bundle;
        if (bundle == null || (parcelableArrayList = bundle.getParcelableArrayList("cardDetailsList")) == null) {
            throw AnonymousClass001.A0L("INTENT_KEY_CARD_DETAILS_LIST is missing from Intent extras");
        }
        this.A0A = parcelableArrayList;
        this.A09 = DKD.A0l(bundle, "qplInstanceKey");
        this.A02 = AnonymousClass001.A0s();
        MutableLiveData A0a = JQx.A0a();
        this.A04 = A0a;
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        this.A03 = mediatorLiveData;
        this.A06 = new LiveData("");
        MutableLiveData A0a2 = JQx.A0a();
        this.A05 = A0a2;
        F9i A01 = RYx.A04.A01();
        this.A08 = A01;
        0rI r0 = 0rI.A00;
        11T.A0A(r0);
        this.A07 = r0;
        this.A00 = -1;
        this.A00 = C11454wj.A02.now();
        mediatorLiveData.setValue(KMv.A04);
        if (!7zM.A1b(parcelableArrayList)) {
            mediatorLiveData.setValue(KMv.A02);
            long j = -1;
            A0a.setValue(new Jsv(null, null, "error_card_not_found", j, j, j));
            return;
        }
        mediatorLiveData.setValue(KMv.A03);
        this.A01 = A01.A02();
        A0a2.setValue(0QD.A0D(parcelableArrayList));
        Observer A00 = LR8.A00(this, 12);
        MediatorLiveData mediatorLiveData2 = this.A03;
        mediatorLiveData2.addSource(this.A06, A00);
        mediatorLiveData2.addSource(this.A05, LR8.A00(this, 13));
    }

    public final void A00() {
        String str;
        MediatorLiveData mediatorLiveData = this.A03;
        if (mediatorLiveData.getValue() != KMv.A05) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Cannot confirm card details from state ");
            throw AnonymousClass002.A0E(mediatorLiveData.getValue(), A0k);
        }
        MutableLiveData mutableLiveData = this.A06;
        mediatorLiveData.removeSource(mutableLiveData);
        MutableLiveData mutableLiveData2 = this.A05;
        mediatorLiveData.removeSource(mutableLiveData2);
        mediatorLiveData.setValue(KMv.A04);
        long now = this.A07.now();
        long now2 = C11454wj.A02.now();
        CardDetails cardDetails = (CardDetails) mutableLiveData2.getValue();
        if (cardDetails == null || (str = cardDetails.A08) == null) {
            return;
        }
        F9i f9i = this.A08;
        String str2 = (String) mutableLiveData.getValue();
        if (str2 == null) {
            str2 = "";
        }
        DSB A00 = F9i.A00(f9i, str, str2, this.A01);
        mediatorLiveData.addSource(A00, new LQy(A00, this, now, now2));
    }
}
