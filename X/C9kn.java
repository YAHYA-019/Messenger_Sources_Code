package X;

import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.PrivacyContext;
import java.util.ArrayList;
import org.json.JSONArray;

/* renamed from: X.9kn, reason: invalid class name */
/* loaded from: 9kn.class */
public final class C9kn {
    public C8yo A00;
    public MailboxCallback A01;
    public 1X9 A02;
    public Runnable A03;
    public final long A04;
    public final Handler A05;
    public final LiveData A06;
    public final MutableLiveData A07;
    public final MutableLiveData A08;
    public final MutableLiveData A09;
    public final MutableLiveData A0A;
    public final MutableLiveData A0B;
    public final MutableLiveData A0C;
    public final MutableLiveData A0D;
    public final MutableLiveData A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1De A0K;
    public final C9mY A0L;

    /* JADX WARN: Type inference failed for: r0v38, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public C9kn(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0K = r303;
        1BY r0 = r303.A00;
        this.A0J = 1Bu.A03(r0, 68662);
        this.A0I = 1Lm.A03(fbUserSession, r0, 67249);
        this.A0H = 1Lm.A03(fbUserSession, r0, 67540);
        this.A05 = AnonymousClass001.A07();
        this.A04 = 7zO.A0C(fbUserSession);
        this.A0F = 1Bq.A00(46);
        this.A0G = 7zM.A0Z();
        MutableLiveData A0H = 7zL.A0H();
        this.A0A = A0H;
        this.A06 = A0H;
        this.A0L = (C9mY) 1Bn.A0E((Context) null, r0, 68214);
        this.A0B = 7zL.A0H();
        this.A07 = 7zL.A0H();
        this.A08 = 7zL.A0H();
        this.A0D = new LiveData(4YV.A0j());
        this.A0C = 7zL.A0H();
        this.A0E = 7zL.A0H();
        this.A09 = 7zL.A0H();
    }

    public static final ArrayList A00(String str) {
        JSONArray jSONArray = new JSONArray(str);
        ArrayList A0s = AnonymousClass001.A0s();
        int length = jSONArray.length();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0s;
            }
            String string = jSONArray.getString(i2);
            11T.A0A(string);
            A0s.add(string);
            i = i2 + 1;
        }
    }

    public static final void A01(C9kn c9kn, C96d c96d, 9OG r303, Exception exc, Integer num, String str, String str2, String str3, long j) {
        C9mY c9mY = c9kn.A0L;
        Long valueOf = Long.valueOf(2);
        long j2 = 32;
        long j3 = 3;
        PrivacyContext privacyContext = c9mY.A00;
        Long l = null;
        if (num != null) {
            l = 7zP.A0g(num);
        }
        9kE.A00(privacyContext, (Long) null, valueOf, (Long) null, l, Long.valueOf(j3), 4YV.A0j(), str, (String) null, str2, str3, j, j2);
        0fH.A0o("MemoryViewModelFetcher", c96d.message);
        if (exc == null) {
            11T.A0F(c96d.message, 1);
        }
        9Zk r0 = r303.A01;
        4YV.A11(r0.A05).execute(new SBH(r303.A00, r0));
    }
}
