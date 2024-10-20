package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.receipt.PaymentsReceiptActivity;
import com.facebook.payments.receipt.model.ReceiptCommonParams;
import com.facebook.payments.receipt.model.ReceiptComponentControllerParams;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;

/* loaded from: EzO.class */
public final class EzO {
    public final Euy A00;
    public final Fmn A01;
    public final C15h A02;
    public final Context A03;
    public final F7J A04;
    public final Fmn A06;
    public final 6Gx A05 = DKD.A0Z();
    public final EsD A07 = (EsD) 1Bi.A03(99315);

    public EzO(Context context) {
        this.A03 = context;
        G7H g7h = new G7H(context, this, 6);
        F7J f7j = (F7J) 1Bi.A03(99158);
        Euy euy = (Euy) 1Bn.A0E(context, (1BY) null, 98787);
        Fmn fmn = (Fmn) 1Hv.A02(context, 99159);
        this.A01 = (Fmn) 1Hv.A02(context, 99159);
        this.A02 = g7h;
        this.A04 = f7j;
        this.A00 = euy;
        this.A06 = fmn;
    }

    public void A00(Context context, FbUserSession fbUserSession, Dkz dkz, ER0 er0, EzZ ezZ, Integer num) {
        F7J f7j;
        4RT r317;
        String str;
        String AVJ = dkz.AVJ();
        if (AVJ != null) {
            EsD esD = this.A07;
            6Gx r0 = esD.A00;
            DM2 dm2 = DM2.A01;
            r0.A02(fbUserSession, DM4.A05, DM1.A04, dm2);
            ListenableFuture BLb = this.A06.BLb(context, null, esD.A00(ezZ), er0, dkz, ezZ.A0H);
            if (!AVJ.equals("P2P_OPEN_RECEIPT")) {
                if (AVJ.equals("MFS_OPEN_NUX")) {
                    f7j = this.A04;
                    r317 = 4RT.A00;
                }
                1Kd.A0E(FwJ.A00(context, this, 31), BLb);
            }
            f7j = this.A04;
            r317 = 4RT.A0A;
            switch (num.intValue()) {
                case 0:
                    str = "p2p_receive";
                    break;
                case 1:
                    str = "p2p_request_ack";
                    break;
                default:
                    str = "p2p_settings";
                    break;
            }
            F7J.A00(ezZ.A05, r317, f7j, str, str, (String) null);
            1Kd.A0E(FwJ.A00(context, this, 31), BLb);
        }
    }

    public void A01(Context context, FbUserSession fbUserSession, ER0 er0, EzZ ezZ, Integer num) {
        String str;
        F7J f7j = this.A04;
        4RT r0 = 4RT.A08;
        switch (num.intValue()) {
            case 0:
                str = "p2p_receive";
                break;
            case 1:
                str = "p2p_request_ack";
                break;
            default:
                str = "p2p_settings";
                break;
        }
        String str2 = ezZ.A0H;
        F7J.A00(ezZ.A05, r0, f7j, str, str, str2);
        A02(fbUserSession, er0, ezZ);
        HashSet A0v = AnonymousClass001.A0v();
        ER6 er6 = ER6.A0K;
        ELR elr = ELR.A02;
        HashSet A0z = 4YV.A0z("receiptStyle", A0v, A0v);
        C1pq.A08("productId", str2);
        Object obj = 2JZ.A01;
        ReceiptCommonParams receiptCommonParams = new ReceiptCommonParams(PaymentsDecoratorParams.A03(), new ReceiptComponentControllerParams(er6, elr, str2, A0z), null);
        Intent A00 = this.A00.A00(context, PaymentsReceiptActivity.A12(context, (ViewerContext) this.A02.get(), receiptCommonParams), EMw.A04);
        if (A00 != null) {
            A00.addFlags(268435456);
            0LS.A0A(context, A00);
        }
    }

    public void A02(FbUserSession fbUserSession, ER0 er0, EzZ ezZ) {
        EsD esD = this.A07;
        6Gx r0 = esD.A00;
        DM2 dm2 = DM2.A01;
        r0.A02(fbUserSession, DM4.A05, DM1.A04, dm2);
        RTb A00 = esD.A00(ezZ);
        6Gx r02 = this.A05;
        FHR A002 = F7K.A00(A00, "action_click");
        A002.A05(er0);
        r02.A05(A002);
    }
}
