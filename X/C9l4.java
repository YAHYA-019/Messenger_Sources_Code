package X;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.state.gen.State;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9l4, reason: invalid class name */
/* loaded from: 9l4.class */
public final class C9l4 {
    public C87w A00;
    public 9Yk A01;
    public C00m A02;
    public final LiveData A03;
    public final MutableLiveData A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final C2613Gj2 A08;
    public final Function1 A09;
    public final Function1 A0A;
    public final Context A0B;
    public final FbUserSession A0C;

    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public C9l4(Context context, FbUserSession fbUserSession, C2613Gj2 c2613Gj2) {
        1BL.A1F(c2613Gj2, fbUserSession);
        this.A08 = c2613Gj2;
        this.A0C = fbUserSession;
        this.A0B = context;
        this.A07 = 1Lm.A00(context, fbUserSession, 17067);
        this.A06 = 1Lm.A00(context, fbUserSession, 49772);
        this.A05 = 1Lm.A00(context, fbUserSession, 84181);
        ?? liveData = new LiveData(C8uk.A00);
        this.A04 = liveData;
        this.A03 = liveData;
        this.A0A = AV2.A00(this, 14);
        this.A09 = AV2.A00(this, 13);
        if (c2613Gj2.A03) {
            A02();
        }
    }

    public static final void A00(C9l4 c9l4) {
        9Yk r0 = c9l4.A01;
        if (r0 != null) {
            State state = (State) ((8LW) C9lt.A00(c9l4.A08.A01).getState()).A00(State.class);
            if (state == null || state.callState != 2) {
                r0.A00 = false;
                r0.A02.invoke(r0, false, r0.A01, null, null);
            } else {
                r0.A00((Activity) null, "MultiCallPresenter", false);
            }
        }
        c9l4.A01 = null;
    }

    public static final void A01(C9l4 c9l4, 9AU r302) {
        MutableLiveData mutableLiveData = c9l4.A04;
        if (11T.A0O(mutableLiveData.getValue(), r302)) {
            return;
        }
        if (r302 instanceof C8ui) {
            A00(c9l4);
        }
        if (11T.A0O(Looper.getMainLooper(), Looper.myLooper())) {
            mutableLiveData.setValue(r302);
        } else {
            mutableLiveData.postValue(r302);
        }
    }

    public final void A02() {
        9Yk r0 = this.A01;
        if (r0 != null) {
            r0.A00 = false;
            r0.A02.invoke(r0, false, r0.A01, null, null);
        }
        this.A01 = null;
        A01(this, new C8uj(this.A00));
        C2613Gj2 c2613Gj2 = this.A08;
        String str = c2613Gj2.A00;
        C9lt.A00(str).A00.invoke(new Gvi(c2613Gj2.A04));
        String str2 = c2613Gj2.A01;
        boolean z = c2613Gj2.A03;
        11T.A0H(str2, str);
        I6E.A00(z ? HCL.A0w : HCL.A0x, str, null, 1BK.A1D("ongoing_local_call_id", str2));
        Object invoke = HO1.A01.invoke(str);
        if (invoke != null) {
            Hwn.A00.invoke(invoke);
        }
    }
}
