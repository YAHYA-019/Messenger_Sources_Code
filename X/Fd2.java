package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.util.Base64;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.privacy.policyawareencryption.PAEContextJNI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* loaded from: Fd2.class */
public final class Fd2 implements C4Av {
    public 1BY A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;

    public Fd2(1BO r302) {
        1BV A01 = 1BV.A01((1BY) null, 83719);
        this.A02 = A01;
        this.A05 = 1BQ.A02(67262);
        this.A01 = 1BV.A01((1BY) null, 99450);
        this.A03 = 1BQ.A02(16960);
        this.A06 = 1BQ.A02(66227);
        this.A00 = 7zL.A0Q(r302);
        this.A04 = AbF.A0Q((Context) A01.get(), 49160);
    }

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        0fH.A0j("ContactpointConsentsPrefetchConditionalWorker", "runOnRequiredStates");
        if (!r302.A01()) {
            return false;
        }
        if (!((C1uz) this.A06.get()).A02(73)) {
            return true;
        }
        FbUserSession A00 = r302.A00();
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        Charset charset = C03r.A05;
        List A06 = 02L.A06(DKC.A1a("Contactpoint_Consents", charset));
        byte[] decode = Base64.decode(2yD.A02(1BL.A0Q(), 36884161230800314L), 11);
        11T.A0D(decode);
        List A062 = 02L.A06(decode);
        int i = 0;
        do {
            String A0B = ((4Yk) this.A04.get()).A0B(i);
            if (A0B != null) {
                PAEContextJNI pAEContextJNI = new PAEContextJNI();
                PAEContextJNI.initSenderContext(pAEContextJNI, A062, A06);
                2Jd A0Q = DKC.A0Q();
                A0Q.A09("metadata_b64url", DKC.A1B(0QD.A0l(PAEContextJNI.getPLEMetadata()), 11));
                A0Q.A09("enc_data_b64url", DKC.A1B(0QD.A0l(pAEContextJNI.seal(02L.A06(DKC.A1a(A0B, charset)))), 11));
                A0s2.add(A0Q);
            }
            i++;
        } while (i < 2);
        if (((1Rv) this.A05.get()).A08("android.permission.GET_ACCOUNTS")) {
            for (Account account : AccountManager.get(1BK.A04(this.A02)).getAccountsByType("com.google")) {
                A0s.add(account.name);
            }
        }
        0fH.A0j("ContactpointConsentsPrefetchConditionalWorker", A0s.toString());
        ArrayList A0s3 = AnonymousClass001.A0s();
        A0s3.add("UNKNOWN_PURPOSE");
        C30G A0H = AbF.A0H(25);
        A0H.A07("purposes", A0s3);
        A0H.A07("encrypted_contacts", A0s2);
        A0H.A07("numbers", A0s);
        C3sa A002 = C3sa.A00(A0H);
        ((C3sb) A002).A03 = 0L;
        A002.A0B = false;
        1Vd A0F = 1VX.A0F(1BK.A04(this.A02), A00);
        A002.A05 = new 1iF(1EK.A01(), 0L);
        C03713yu A04 = A0F.A04(A002);
        1Kd.A0E(FwL.A00(this, 17), A04);
        try {
            1Yz.A00(A04);
            return true;
        } catch (ExecutionException unused) {
            return false;
        }
    }
}
