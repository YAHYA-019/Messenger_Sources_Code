package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.plugins.activation.autocreatechannelinterstitial.AutoCreateChannelInterstitialImplementation;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: Bx9.class */
public final class Bx9 {
    public AutoCreateChannelInterstitialImplementation A00;
    public Object A01;
    public final Context A02;
    public final 06Z A03;
    public final FbUserSession A04;
    public final 1YC A05 = 1YC.A03;
    public final ParcelableSecondaryData A06;
    public final 3JU A07;

    public Bx9(Context context, 06Z r303, FbUserSession fbUserSession, 3JU r305, ParcelableSecondaryData parcelableSecondaryData) {
        this.A02 = context;
        this.A03 = r303;
        this.A04 = fbUserSession;
        this.A07 = r305;
        this.A06 = parcelableSecondaryData;
    }
}
