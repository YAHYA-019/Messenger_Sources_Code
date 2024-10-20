package X;

import com.facebook.device_id.debug.FamilyDeviceIdPreferencesActivityLike;
import com.facebook.messaging.internalprefs.GeneratedMessengerPrefsModuleKt;
import com.facebook.messaging.internalprefs.MessengerInternalAudioAssetFetcher;
import com.facebook.messaging.internalprefs.MessengerInternalVideoAssetFetcher;
import com.facebook.surveyplatformdev.SurveyPlatformPreferenceLauncher;

/* loaded from: N1d.class */
public abstract class N1d {
    public static Object A00(int i, 1BO r302, Object obj) {
        if (((i >> 7) & 15) == 0) {
            return A01(i, r302, obj);
        }
        throw MRl.A0J();
    }

    public static Object A01(int i, 1BO r302, Object obj) {
        PpC A02;
        switch ((i >> 0) & 127) {
            case 0:
            case 32:
                A02 = Pko.A00();
                break;
            case 1:
            case 31:
                A02 = Pkv.A00();
                break;
            case 2:
                A02 = Pkl.A00();
                break;
            case 3:
                A02 = PsM.A00();
                break;
            case 4:
                A02 = Pp6.A00();
                break;
            case 5:
                A02 = Pkq.A00();
                break;
            case 6:
                A02 = Pkr.A00(r302);
                break;
            case 7:
                A02 = Pku.A00();
                break;
            case 8:
                A02 = Pku.A01();
                break;
            case 9:
                A02 = Pkm.A00(r302);
                break;
            case 10:
                A02 = 1BK.A0d();
                break;
            case 11:
                A02 = Pks.A00();
                break;
            case 12:
                A02 = PqT.A00();
                break;
            case 13:
                return new Pkk(r302);
            case 14:
                A02 = PqU.A00(r302);
                break;
            case 15:
                A02 = Pjp.A00(r302);
                break;
            case 16:
                A02 = Pkv.A01();
                break;
            case 17:
                A02 = Pkp.A00(obj);
                break;
            case 18:
                return new 1C5(r302, 1C4.A2C);
            case 19:
                A02 = PiX.A00(r302);
                break;
            case 20:
                A02 = Pkt.A01(r302);
                break;
            case 21:
                A02 = Pkw.A02(r302);
                break;
            case 22:
                A02 = SurveyPlatformPreferenceLauncher.A00(r302);
                break;
            case 23:
                A02 = MessengerInternalAudioAssetFetcher.A00(r302);
                break;
            case 24:
                A02 = MessengerInternalVideoAssetFetcher.A00(r302);
                break;
            case 25:
                A02 = FamilyDeviceIdPreferencesActivityLike.A00();
                break;
            case 26:
                A02 = Pkt.A00(r302);
                break;
            case 27:
                A02 = Pkw.A00();
                break;
            case 28:
                A02 = Pkw.A01();
                break;
            case 29:
                A02 = GeneratedMessengerPrefsModuleKt.A00(r302);
                break;
            case 30:
                A02 = Pkv.A02();
                break;
            default:
                throw MRl.A0J();
        }
        return A02;
    }
}
