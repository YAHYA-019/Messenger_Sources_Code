package X;

import android.credentials.PrepareGetCredentialResponse;
import kotlin.jvm.functions.Function1;

/* loaded from: LA5.class */
public final class LA5 {
    public PrepareGetCredentialResponse A00;
    public KoU A01;
    public C00m A02;
    public C00m A03;
    public Function1 A04;

    public static final /* synthetic */ boolean A00(LA5 la5) {
        PrepareGetCredentialResponse prepareGetCredentialResponse = la5.A00;
        11T.A0D(prepareGetCredentialResponse);
        return prepareGetCredentialResponse.hasAuthenticationResults();
    }

    public static final /* synthetic */ boolean A01(LA5 la5) {
        PrepareGetCredentialResponse prepareGetCredentialResponse = la5.A00;
        11T.A0D(prepareGetCredentialResponse);
        return prepareGetCredentialResponse.hasRemoteResults();
    }

    public static final /* synthetic */ boolean A02(LA5 la5, String str) {
        PrepareGetCredentialResponse prepareGetCredentialResponse = la5.A00;
        11T.A0D(prepareGetCredentialResponse);
        return prepareGetCredentialResponse.hasCredentialResults(str);
    }

    public final void A03(PrepareGetCredentialResponse prepareGetCredentialResponse) {
        this.A00 = prepareGetCredentialResponse;
        this.A04 = new M0s(this, 2);
        this.A02 = new M0R(this, 4);
        this.A03 = new M0R(this, 5);
    }
}
