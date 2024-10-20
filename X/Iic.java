package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.weather.WeatherServiceDataSource;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.videocodec.effects.persistence.common.PersistedGLRenderer;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.SingletonImmutableSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: Iic.class */
public final class Iic implements JJC {
    public static final Set A09;
    public static final Set A0A = new SingletonImmutableSet("FbMsqrdRenderer");
    public I2f A00;
    public 1BY A01;
    public final Hie A02;
    public final HiR A08 = (HiR) 1Bn.A0E((Context) null, (1BY) null, 116330);
    public final C00i A03 = FbInjector.A00;
    public final C00i A05 = 1BQ.A02(16504);
    public final C00i A04 = 1BV.A01((1BY) null, 116235);
    public final C00i A06 = AbH.A0S();
    public final C00i A07 = 1BV.A01((1BY) null, 116450);

    static {
        HashSet A0v = AnonymousClass001.A0v();
        A09 = A0v;
        A0v.add(Ij0.class);
    }

    public Iic(Hie hie, 1BO r303) {
        this.A01 = 7zL.A0Q(r303);
        this.A02 = hie;
    }

    /* JADX WARN: Type inference failed for: r0v155, types: [java.lang.Object, X.GdX, X.HFT] */
    /* JADX WARN: Type inference failed for: r0v176, types: [com.facebook.cameracore.mediapipeline.services.locale.LocaleDataSource, X.IP6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v207, types: [com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v226, types: [X.HPI, java.lang.Object] */
    public /* bridge */ /* synthetic */ JMy AKh(PersistedGLRenderer persistedGLRenderer) {
        int i = 0;
        HgT hgT = new HgT(HAz.A03, 0, false);
        Hie hie = this.A02;
        1BY r0 = this.A01;
        C3R8 c3r8 = (C3R8) AbstractC2327GOs.A0O(r0);
        HashMap hashMap = null;
        1G2 A00 = ((Erf) 1Bn.A0E((Context) null, r0, 100298)).A00();
        Hki hki = (Hki) c3r8.A02(persistedGLRenderer.A00, Hki.class);
        I2f i2f = this.A00;
        if (i2f == null) {
            ?? obj = new Object();
            obj.setDeviceLocaleIdentifier(((1GS) this.A05.get()).A05().toString());
            IAV A002 = I2f.A00(1BK.A04(this.A03));
            A002.A04 = new ProductFeatureConfig(0, false, false, false, true, true);
            A002.A02(C2436Gdd.A01, new C2436Gdd(null));
            A002.A02(C2439Gdg.A01, new C2439Gdg(obj));
            A002.A02(C2442Gdj.A01, new C2442Gdj(new Object()));
            A002.A02(AbstractC2446Gdn.A02, (HFT) this.A04.get());
            A002.A02(C2444Gdl.A01, new C2444Gdl((WeatherServiceDataSource) this.A07.get()));
            A002.A02 = new Object();
            IAV.A00(A002);
            i2f = new I2f(A002);
            this.A00 = i2f;
        }
        FbSharedPreferences A0R = 1BK.A0R(this.A06);
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        HashMap hashMap2 = hki.A0N;
        if (hashMap2 != null) {
            hashMap = new HashMap(hashMap2);
        }
        String str = hki.A0L;
        String str2 = hki.A0M;
        String str3 = hki.A0I;
        String str4 = hki.A0J;
        boolean z3 = hki.A0U;
        boolean z4 = hki.A0T;
        String str5 = hki.A0C;
        String str6 = hki.A0E;
        String str7 = hki.A0F;
        String str8 = str7;
        if (str7 == null || str7.isEmpty()) {
            str8 = ConstantsKt.CAMERA_ID_FRONT;
        }
        String str9 = hki.A0H;
        String str10 = hki.A0G;
        if (str10 == null || str10.isEmpty()) {
            str10 = ConstantsKt.CAMERA_ID_FRONT;
        }
        boolean z5 = hki.A0S;
        String str11 = hki.A09;
        String str12 = hki.A0A;
        String str13 = hki.A0K;
        String str14 = hki.A0D;
        HAu hAu = hki.A08;
        boolean z6 = hki.A0V;
        java.util.Map map = hki.A0O;
        boolean z7 = hki.A0W;
        if (hki.A0R) {
            i3 = hki.A03;
            i2 = hki.A02;
            i = hki.A01;
            z = hki.A0P;
            z2 = true;
        }
        IAV iav = new IAV(i2f);
        iav.A02(C2450Gdr.A05, new C2450Gdr(new GeH(A0R, 1G3.A01(A00, str7)), new GeG(), new GeG(), new GeG(), new GeG()));
        if (hki.A0Q) {
            Hy3 hy3 = GdX.A01;
            IP0 ip0 = new IP0(hki.A07, hki.A05, hki.A04, hki.A06, hki.A00);
            ?? obj2 = new Object();
            ((GdX) obj2).A00 = ip0;
            iav.A02(hy3, (HFT) obj2);
        }
        String str15 = hki.A0B;
        if (!1JF.A0A(str15)) {
            iav.A02(C2435Gdc.A01, new C2435Gdc(str15));
        }
        I4D i4d = new I4D(new I2f(iav), hAu, str11, str12, str13, str5, str14, str6, str8, str10, str9, str3, str4, str, str2, hashMap, map, i, i2, i3, z, z2, z5, z4, z3, z6, z7);
        I3u i3u = new I3u(this.A08);
        i3u.A01(hie, hgT);
        i3u.A02 = i4d;
        return i3u.A00();
    }

    public Set D3Y() {
        return A0A;
    }
}
