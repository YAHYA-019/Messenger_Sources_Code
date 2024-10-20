package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: Byv.class */
public final class Byv {
    public final Context A00;
    public final LiveData A01;
    public final LiveData A02;
    public final LiveData A03;
    public final MutableLiveData A04;
    public final FbUserSession A05;
    public final 1Br A06;
    public final 1Br A08;
    public final LiveData A0A;
    public final LiveData A0B;
    public final LiveData A0C;
    public final LiveData A0D;
    public final ThreadKey A0E;
    public final 1Br A09 = AbG.A0W();
    public final 1Br A07 = 7zM.A0Z();

    public Byv(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A0E = threadKey;
        this.A00 = context;
        this.A05 = fbUserSession;
        this.A06 = 1Lm.A00(context, fbUserSession, 82370);
        this.A08 = 1Bu.A01(context, 67674);
        MutableLiveData A0H = 7zL.A0H();
        this.A04 = A0H;
        LiveData switchMap = Transformations.switchMap(A0H, new DD4(this, 5));
        this.A0C = switchMap;
        LiveData map = Transformations.map(switchMap, DDN.A00);
        this.A0D = map;
        LiveData switchMap2 = Transformations.switchMap(map, new DD4(this, 4));
        this.A0B = switchMap2;
        LiveData map2 = Transformations.map(map, new DD4(this, 3));
        this.A0A = map2;
        this.A01 = map2;
        this.A03 = switchMap;
        this.A02 = switchMap2;
        7zS.A1C(A0H, this.A07, threadKey);
    }
}
