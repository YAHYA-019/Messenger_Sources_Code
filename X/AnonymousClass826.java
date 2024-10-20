package X;

import android.os.Bundle;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadsettings2.params.ThreadSettingsParams;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* renamed from: X.826, reason: invalid class name */
/* loaded from: 826.class */
public final class AnonymousClass826 {
    public final C00i A00 = new 1BV(82389);

    public BBc A00(ThreadKey threadKey, int i) {
        this.A00.get();
        int i2 = BBc.A09;
        ParcelableSecondaryData parcelableSecondaryData = ParcelableSecondaryData.A01;
        11T.A0B(parcelableSecondaryData);
        ThreadSettingsParams threadSettingsParams = new ThreadSettingsParams(threadKey, parcelableSecondaryData, null, i, false);
        BBc bBc = new BBc();
        Bundle bundle = new Bundle();
        bundle.putParcelable("params", threadSettingsParams);
        bBc.setArguments(bundle);
        return bBc;
    }
}
