package X;

import android.os.Bundle;
import com.facebook.contacts.server.UpdateContactIsMessengerUserParams;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.google.common.base.Platform;

/* renamed from: X.3qs, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3qs.class */
public final class C01353qs {
    public final C00i A01 = new 1BV(33031);
    public final C0et A00 = (C0et) 1Bi.A03(83604);

    public void A00(String str, boolean z) {
        if (this.A00 != C0et.A0P || Platform.stringIsNullOrEmpty(str)) {
            return;
        }
        UpdateContactIsMessengerUserParams updateContactIsMessengerUserParams = new UpdateContactIsMessengerUserParams(str, z);
        Bundle A05 = 1BK.A05();
        A05.putParcelable("updateIsMessengerUserParams", updateContactIsMessengerUserParams);
        1Ho newInstance_DEPRECATED = ((BlueServiceOperationFactory) this.A01.get()).newInstance_DEPRECATED(1BJ.A00(577), A05);
        newInstance_DEPRECATED.A0A = true;
        1Ho.A00(newInstance_DEPRECATED, true);
    }
}
