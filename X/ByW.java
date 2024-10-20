package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: ByW.class */
public final class ByW {
    public C1qM A00;
    public C1qM A01;
    public final MutableLiveData A02;
    public final MutableLiveData A04;
    public final 1De A05;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final FbUserSession A0B;
    public final 1Br A06 = 7zM.A0Z();
    public final MutableLiveData A03 = 7zL.A0H();

    /* JADX WARN: Type inference failed for: r0v23, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public ByW(1De r302) {
        this.A05 = r302;
        1BY r0 = r302.A00;
        1Br A03 = 1Bu.A03(r0, 16428);
        this.A0A = A03;
        FbUserSession A032 = 1Br.A03(A03);
        this.A0B = A032;
        this.A07 = 1Lm.A03(A032, r0, 33183);
        this.A08 = 1Lm.A03(A032, r0, 16686);
        this.A09 = AbG.A0U();
        this.A02 = new LiveData(C0ty.A00);
        this.A04 = 7zL.A0H();
    }
}
