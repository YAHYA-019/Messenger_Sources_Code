package X;

import com.facebook.auth.login.ui.AuthFragmentLogoViewGroup;
import com.facebook.messaging.dogfooding.data.DogfoodingAssistantDataModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableMap;
import com.mapbox.mapboxsdk.BuildConfig;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Ax9, reason: case insensitive filesystem */
/* loaded from: Ax9.class */
public final class C1944Ax9 extends 1LH {
    public final DogfoodingAssistantDataModel A00;
    public final MigColorScheme A01;
    public final 1Cg A02;

    public C1944Ax9(DogfoodingAssistantDataModel dogfoodingAssistantDataModel, MigColorScheme migColorScheme, 1Cg r304) {
        11T.A0F(migColorScheme, 1);
        this.A01 = migColorScheme;
        this.A00 = dogfoodingAssistantDataModel;
        this.A02 = r304;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        Integer num = 0S2.A01;
        2cL r309 = null;
        2lO A0g = 7zL.A0g((2lO) null, new C2xi(num, true, 1));
        1Iw r0 = c2k5.A05;
        C2sn A0U = 7zQ.A0U(r0);
        DogfoodingAssistantDataModel dogfoodingAssistantDataModel = this.A00;
        if (dogfoodingAssistantDataModel != null) {
            1Iw r02 = A0U.A00;
            AwS A00 = B0H.A00(r02);
            A00.A2Y("�� Dogfooding Assistant ��");
            A00.A01.A05 = dogfoodingAssistantDataModel.A02;
            MigColorScheme migColorScheme = this.A01;
            A00.A2X(migColorScheme);
            A0U.A00(A00.A2W());
            String str = dogfoodingAssistantDataModel.A01;
            if (str != null) {
                1Bi.A03(66191);
                boolean z = false;
                if (str.compareTo(BuildConfig.VERSION_NAME) <= 0) {
                    z = true;
                }
                C58v A01 = C58v.A01(3vP.A00(A0U), 4YV.A0I().A03(z ? C1u3.A1V : C1u3.A1x), z ? migColorScheme.AoC() : migColorScheme.B6U());
                2lO A0X = 7zQ.A0X((2lO) null, num, 1.0f);
                C2sn A0J = 7zS.A0J(A0U);
                1Iw r03 = A0J.A00;
                AwS A002 = B0H.A00(r03);
                A002.A2Y("Mobile App");
                A002.A2X(migColorScheme);
                A0J.A00(A002.A2W());
                55N A003 = 55M.A00(r03);
                6BC r04 = new 6BC();
                r04.A02(A01);
                r04.A06(0Pz.A0W("Current: ", BuildConfig.VERSION_NAME));
                r04.A05(0Pz.A0W("Minimum: ", str));
                r04.A03(migColorScheme);
                r04.A07 = !z ? new C59i(new Cwn(A0J, this, 8), migColorScheme, "Update") : null;
                7zU.A1I(A0J, r04.A00(), A003);
                r309 = C2so.A02(A0J, A0U, A0X);
            }
            A0U.A00(r309);
            ImmutableMap immutableMap = dogfoodingAssistantDataModel.A00;
            1Cg r05 = this.A02;
            if (r05 != null && immutableMap != null && !immutableMap.isEmpty()) {
                AwS A004 = B0H.A00(r02);
                A004.A2Y(AbstractC00603o4.A00(AuthFragmentLogoViewGroup.LOGIN_GROUP_ANIM_DELAY_MS));
                A004.A2X(migColorScheme);
                A0U.A00(A004.A2W());
                Iterator A14 = AbM.A14(immutableMap);
                while (A14.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A14);
                    Object key = A0z.getKey();
                    11T.A0A(key);
                    A0U.A00(new AxQ(migColorScheme, r05, (String) key, 1BK.A16(A0z)));
                }
            }
        }
        1LI A02 = C2so.A02(A0U, c2k5, A0g);
        Dud A012 = Dzc.A01(r0);
        A012.A2c(A02);
        A012.A2e(A1W);
        return A012.A2V();
    }
}
