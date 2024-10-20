package X;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.messenger.app.MessengerInstacrashLoopBugReportService;
import com.facebook.payments.p2p.messenger.core.prefs.PaymentMethodsMessengerPayPreferences;
import com.facebook.payments.p2p.messenger.core.prefs.PaymentsPreferenceActivity;
import com.facebook.payments.p2p.messenger.core.prefs.SecurityMessengerPayPreferences;
import com.facebook.payments.p2p.model.PaymentTransaction;
import com.facebook.zero.easydogfooding.ZeroEasyDogfoodController;
import com.google.common.base.Preconditions;
import java.util.Set;

/* loaded from: Frp.class */
public final class Frp implements C02l {
    public final int A00;
    public final Object A01;

    public Frp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:62:0x0416. Please report as an issue. */
    @Override // X.C02l
    public final void CFb(Context context, Intent intent, C01q c01q) {
        int A00;
        int i;
        DMV dmv;
        Eor eor;
        ETm eTm;
        E5O etE;
        switch (this.A00) {
            case 0:
                A00 = C09o.A00(217309588);
                1iZ r0 = (1iZ) this.A01;
                Set set = 1iZ.A0T;
                if (r0.A0Q.get()) {
                    DMV dmv2 = r0.A05;
                    if (dmv2 != null && dmv2.isShowing() && (dmv = r0.A05) != null) {
                        dmv.dismiss();
                    }
                    i = -1755420011;
                } else {
                    i = -1367035947;
                }
                C09o.A01(i, A00);
                return;
            case 1:
                A00 = C09o.A00(-201740631);
                ((ETA) this.A01).A01 = null;
                i = 283975042;
                C09o.A01(i, A00);
                return;
            case 2:
                FJ7 fj7 = (FJ7) this.A01;
                if (fj7.A01 == null && fj7.A00 == null) {
                    return;
                }
                FJ7.A06(fj7);
                return;
            case 3:
                A00 = C09o.A00(-960274698);
                MessengerInstacrashLoopBugReportService messengerInstacrashLoopBugReportService = (MessengerInstacrashLoopBugReportService) this.A01;
                1Mg r02 = messengerInstacrashLoopBugReportService.A00;
                r02.getClass();
                r02.A01(messengerInstacrashLoopBugReportService.A03);
                messengerInstacrashLoopBugReportService.A01.ATB();
                i = 37832377;
                C09o.A01(i, A00);
                return;
            case 4:
                A00 = C09o.A00(-186680819);
                String action = intent.getAction();
                switch (action.hashCode()) {
                    case -1947484184:
                        if (action.equals("com.facebook.payments.auth.ACTION_AUTH_DATA_LOADING_FAIL")) {
                            ServiceException serviceException = (ServiceException) intent.getSerializableExtra("auth_Exception");
                            eor = (Eor) this.A01;
                            eor.A02.A01(serviceException);
                            eor.A01.A01();
                            break;
                        }
                        break;
                    case -1116948505:
                        if (action.equals("com.facebook.payments.auth.ACTION_AUTH_COMPLETE")) {
                            eor = (Eor) this.A01;
                            switch (intent.getSerializableExtra("auth_result_type").ordinal()) {
                                case 0:
                                    eTm = eor.A02;
                                    etE = new E5O();
                                    eTm.A02(etE);
                                    break;
                                case 1:
                                    eTm = eor.A02;
                                    String stringExtra = intent.getStringExtra("auth_token_extra");
                                    etE = new EtE(ELo.A05, stringExtra);
                                    Preconditions.checkArgument(AnonymousClass001.A1Q(stringExtra.length(), 4));
                                    eTm.A02(etE);
                                    break;
                                case 2:
                                    eTm = eor.A02;
                                    etE = new EtE(ELo.A02, intent.getStringExtra("auth_token_extra"));
                                    eTm.A02(etE);
                                    break;
                                case 3:
                                    eTm = eor.A02;
                                    etE = new EtE(ELo.A01, intent.getStringExtra("auth_token_extra"));
                                    eTm.A02(etE);
                                    break;
                                case 4:
                                    eTm = eor.A02;
                                    etE = new EtE(ELo.A04, intent.getStringExtra("auth_token_extra"));
                                    eTm.A02(etE);
                                    break;
                                case 5:
                                    eTm = eor.A02;
                                    ELo eLo = ELo.A06;
                                    String stringExtra2 = intent.getStringExtra("auth_token_extra");
                                    stringExtra2.getClass();
                                    etE = new E5P(eLo, stringExtra2);
                                    eTm.A02(etE);
                                    break;
                            }
                            eor.A04.getAndSet(false);
                            eor.A01.A01();
                            break;
                        }
                        break;
                    case -943682392:
                        if (action.equals("com.facebook.payments.auth.ACTION_AUTH_CANCEL")) {
                            eor = (Eor) this.A01;
                            eor.A02.A00();
                            eor.A04.getAndSet(false);
                            eor.A01.A01();
                            break;
                        }
                        break;
                    case 2046957723:
                        if (action.equals("com.facebook.payments.auth.ACTION_AUTH_BEGIN")) {
                            ETm eTm2 = ((Eor) this.A01).A02;
                            if (eTm2 instanceof E4q) {
                                ((E4q) eTm2).A00.A09();
                                break;
                            }
                        }
                        break;
                }
                i = 411321629;
                C09o.A01(i, A00);
                return;
            case 5:
                A00 = C09o.A00(-1049145627);
                DYp dYp = (DYp) this.A01;
                if (!4DQ.A03(dYp.A04)) {
                    2FT A01 = dYp.A03.A01();
                    dYp.A04 = A01;
                    1Kd.A0F(FwK.A01(dYp, 17), A01, dYp.A05);
                }
                i = -322896750;
                C09o.A01(i, A00);
                return;
            case 6:
                A00 = C09o.A00(1335364143);
                FHd.A03(((FoR) this.A01).A04);
                i = 772790188;
                C09o.A01(i, A00);
                return;
            case 7:
                A00 = C09o.A00(-113490981);
                ((ECD) this.A01).A04.A00(intent.getBooleanExtra(AbE.A00(502), true));
                i = -278708270;
                C09o.A01(i, A00);
                return;
            case 8:
                A00 = C09o.A00(338116727);
                PaymentsPreferenceActivity.A01(((PaymentMethodsMessengerPayPreferences) this.A01).A06.A00);
                i = -20307662;
                C09o.A01(i, A00);
                return;
            case 9:
                A00 = C09o.A00(-737893805);
                PaymentsPreferenceActivity paymentsPreferenceActivity = (PaymentsPreferenceActivity) this.A01;
                2zS r03 = paymentsPreferenceActivity.A0A;
                if (!r03.A06() && r03.A05()) {
                    PaymentsPreferenceActivity.A01(paymentsPreferenceActivity);
                }
                i = 180259784;
                C09o.A01(i, A00);
                return;
            case 10:
                A00 = C09o.A00(-111531702);
                PaymentsPreferenceActivity.A01(((ECF) this.A01).A04.A00);
                i = -1829820416;
                C09o.A01(i, A00);
                return;
            case 11:
                A00 = C09o.A00(-287030653);
                PaymentsPreferenceActivity.A01(((SecurityMessengerPayPreferences) this.A01).A04.A00);
                i = 1407856362;
                C09o.A01(i, A00);
                return;
            case 12:
                A00 = C09o.A00(-1224826963);
                ECE ece = (ECE) this.A01;
                int preferenceCount = ece.A00.getPreferenceCount();
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 < preferenceCount) {
                        if ((ece.A00.getPreference(i3) instanceof Q0D) && ((PaymentTransaction) ece.A00.getPreference(i3).A01).A0E.equals(String.valueOf(intent.getLongExtra("extra_transfer_id", 0L)))) {
                            PaymentsPreferenceActivity.A01(ece.A03.A00);
                        } else {
                            i2 = i3 + 1;
                        }
                    }
                }
                i = -463850491;
                C09o.A01(i, A00);
                return;
            case 13:
                A00 = C09o.A00(59527485);
                PaymentsPreferenceActivity.A01(((ECE) this.A01).A03.A00);
                i = 1738274879;
                C09o.A01(i, A00);
                return;
            case 14:
                A00 = C09o.A00(-1993962516);
                C2047Da8 c2047Da8 = (C2047Da8) this.A01;
                c2047Da8.A05.AEC();
                C2047Da8.A04(c2047Da8);
                i = -548463129;
                C09o.A01(i, A00);
                return;
            case 15:
                A00 = C09o.A00(312033160);
                FIH fih = (FIH) this.A01;
                Set set2 = FIH.A0L;
                fih.A08 = true;
                1PA r04 = fih.A04;
                if (r04 != null) {
                    r04.A01();
                }
                i = -1110952517;
                C09o.A01(i, A00);
                return;
            case 16:
                GJw gJw = (GJw) this.A01;
                if (gJw != null) {
                    gJw.CBy();
                    return;
                }
                return;
            case 17:
                A00 = C09o.A00(1354013121);
                ZeroEasyDogfoodController.A00((ZeroEasyDogfoodController) this.A01);
                i = 736815784;
                C09o.A01(i, A00);
                return;
            default:
                A00 = C09o.A00(1750707052);
                DNt dNt = (DNt) this.A01;
                DNt.A00(dNt);
                ((ListActivity) dNt.getContext()).getListView().invalidate();
                i = 1181857780;
                C09o.A01(i, A00);
                return;
        }
    }
}
