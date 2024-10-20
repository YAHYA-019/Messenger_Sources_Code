package X;

import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;
import com.facebook.rtc.fbwebrtc.pytorchmodelloader.PytorchModelLoadManager;
import java.util.Arrays;

/* loaded from: GxB.class */
public final class GxB extends EnvironmentVariablesProxy {
    public final 1Br A00 = 1BK.A0E();
    public final 1Br A01 = 1Bq.A00(114825);

    @Override // com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy
    public String copyValue(int i) {
        FbSharedPreferences A09;
        1G2 r303;
        switch (i) {
            case 0:
                A09 = 1Br.A09(this.A00);
                r303 = 5Jq.A0I;
                break;
            case 1:
                A09 = 1Br.A09(this.A00);
                r303 = 5Jq.A0J;
                break;
            case 2:
            case 3:
            case 8:
            case 9:
            case 11:
            default:
                return null;
            case 4:
                PytorchModelLoadManager pytorchModelLoadManager = (PytorchModelLoadManager) 1Br.A0B(this.A01);
                ((5Js) 1Br.A0B(pytorchModelLoadManager.A00)).A00(1Br.A03(pytorchModelLoadManager.A01), pytorchModelLoadManager.A05);
                A09 = 1Br.A09(this.A00);
                r303 = 5Jq.A08;
                break;
            case 5:
                PytorchModelLoadManager pytorchModelLoadManager2 = (PytorchModelLoadManager) 1Br.A0B(this.A01);
                ((5Js) 1Br.A0B(pytorchModelLoadManager2.A00)).A00(1Br.A03(pytorchModelLoadManager2.A01), pytorchModelLoadManager2.A07);
                A09 = 1Br.A09(this.A00);
                r303 = 5Jq.A0A;
                break;
            case 6:
                PytorchModelLoadManager pytorchModelLoadManager3 = (PytorchModelLoadManager) 1Br.A0B(this.A01);
                ((5Js) 1Br.A0B(pytorchModelLoadManager3.A00)).A00(1Br.A03(pytorchModelLoadManager3.A01), pytorchModelLoadManager3.A0B);
                A09 = 1Br.A09(this.A00);
                r303 = 5Jq.A0S;
                break;
            case 7:
                return GOo.A10("%s/%s", Arrays.copyOf(new Object[]{FbInjector.A00().getCacheDir().getAbsolutePath(), "RsysLogs"}, 2));
            case 10:
                PytorchModelLoadManager pytorchModelLoadManager4 = (PytorchModelLoadManager) 1Br.A0B(this.A01);
                ((5Js) 1Br.A0B(pytorchModelLoadManager4.A00)).A00(1Br.A03(pytorchModelLoadManager4.A01), pytorchModelLoadManager4.A04);
                A09 = 1Br.A09(this.A00);
                r303 = 5Jq.A07;
                break;
            case 12:
                PytorchModelLoadManager pytorchModelLoadManager5 = (PytorchModelLoadManager) 1Br.A0B(this.A01);
                ((5Js) 1Br.A0B(pytorchModelLoadManager5.A00)).A00(1Br.A03(pytorchModelLoadManager5.A01), pytorchModelLoadManager5.A03);
                A09 = 1Br.A09(this.A00);
                r303 = 5Jq.A05;
                break;
            case 13:
                PytorchModelLoadManager pytorchModelLoadManager6 = (PytorchModelLoadManager) 1Br.A0B(this.A01);
                ((5Js) 1Br.A0B(pytorchModelLoadManager6.A00)).A00(1Br.A03(pytorchModelLoadManager6.A01), pytorchModelLoadManager6.A06);
                A09 = 1Br.A09(this.A00);
                r303 = 5Jq.A09;
                break;
            case 14:
                PytorchModelLoadManager pytorchModelLoadManager7 = (PytorchModelLoadManager) 1Br.A0B(this.A01);
                ((5Js) 1Br.A0B(pytorchModelLoadManager7.A00)).A00(1Br.A03(pytorchModelLoadManager7.A01), pytorchModelLoadManager7.A08);
                A09 = 1Br.A09(this.A00);
                r303 = 5Jq.A0B;
                break;
            case 15:
                PytorchModelLoadManager pytorchModelLoadManager8 = (PytorchModelLoadManager) 1Br.A0B(this.A01);
                ((5Js) 1Br.A0B(pytorchModelLoadManager8.A00)).A00(1Br.A03(pytorchModelLoadManager8.A01), pytorchModelLoadManager8.A0A);
                A09 = 1Br.A09(this.A00);
                r303 = 5Jq.A0Q;
                break;
            case 16:
                PytorchModelLoadManager pytorchModelLoadManager9 = (PytorchModelLoadManager) 1Br.A0B(this.A01);
                ((5Js) 1Br.A0B(pytorchModelLoadManager9.A00)).A00(1Br.A03(pytorchModelLoadManager9.A01), pytorchModelLoadManager9.A09);
                A09 = 1Br.A09(this.A00);
                r303 = 5Jq.A0O;
                break;
        }
        return A09.BD0(r303);
    }
}
