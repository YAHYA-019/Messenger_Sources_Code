package X;

import android.content.DialogInterface;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.concurrent.Executor;

/* renamed from: X.Jgq, reason: case insensitive filesystem */
/* loaded from: Jgq.class */
public final class C3027Jgq extends ViewModel {
    public DialogInterface.OnClickListener A02;
    public KiO A03;
    public KTP A04;
    public LA1 A05;
    public KlF A06;
    public KiP A07;
    public MutableLiveData A08;
    public MutableLiveData A09;
    public MutableLiveData A0A;
    public MutableLiveData A0B;
    public MutableLiveData A0C;
    public MutableLiveData A0D;
    public MutableLiveData A0E;
    public MutableLiveData A0F;
    public CharSequence A0G;
    public Executor A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0M;
    public boolean A0N;
    public int A00 = 0;
    public boolean A0L = true;
    public int A01 = 0;

    public static void A00(MutableLiveData mutableLiveData, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            mutableLiveData.setValue(obj);
        } else {
            mutableLiveData.postValue(obj);
        }
    }

    public int A01() {
        KlF klF = this.A06;
        if (klF == null) {
            return 0;
        }
        LA1 la1 = this.A05;
        int i = klF.A00;
        if (i == 0) {
            i = 255;
            if (la1 != null) {
                i = 15;
            }
        }
        return i;
    }

    public void A02(int i) {
        MutableLiveData mutableLiveData = this.A0C;
        if (mutableLiveData == null) {
            mutableLiveData = JQx.A0a();
            this.A0C = mutableLiveData;
        }
        A00(mutableLiveData, Integer.valueOf(i));
    }

    public void A03(CharSequence charSequence) {
        MutableLiveData mutableLiveData = this.A0B;
        if (mutableLiveData == null) {
            mutableLiveData = JQx.A0a();
            this.A0B = mutableLiveData;
        }
        A00(mutableLiveData, charSequence);
    }

    public void A04(boolean z) {
        MutableLiveData mutableLiveData = this.A0F;
        if (mutableLiveData == null) {
            mutableLiveData = JQx.A0a();
            this.A0F = mutableLiveData;
        }
        A00(mutableLiveData, Boolean.valueOf(z));
    }
}
