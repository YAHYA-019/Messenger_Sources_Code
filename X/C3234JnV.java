package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.JnV, reason: case insensitive filesystem */
/* loaded from: JnV.class */
public final class C3234JnV extends L5Y implements MNo {
    public final KuG A00;
    public final Context A01;
    public final View A02;

    public C3234JnV(Context context, View view, JgX jgX, KmK kmK, MLg mLg, int i) {
        this.A01 = context;
        View A0C = DKF.A0C(JQx.A0X(view, 2131362758), 2132541648);
        this.A02 = A0C;
        ImageView imageView = (ImageView) A0C.requireViewById(2131362748);
        MLq mLq = kmK.A01;
        if (mLq != null) {
            imageView.setOnClickListener(mLq.B06());
            MLq.A00(context, imageView, mLq);
            GOo.A16(context, imageView, mLq.BD5());
            imageView.setVisibility(0);
        }
        this.A00 = new KuG(jgX, new L9s(mLg, i), mLg);
    }

    @Override // X.MNo
    public int Amw() {
        return this.A01.getResources().getDimensionPixelSize(2132279410);
    }

    @Override // X.MNo
    public View Amx() {
        return this.A02;
    }

    @Override // X.MNp
    public void BOG() {
        this.A00.A00(0);
        MNo.A00(this);
    }

    @Override // X.MNo
    public boolean BSq() {
        return true;
    }

    @Override // X.MNo
    public boolean BSr() {
        return false;
    }

    @Override // X.MNo
    public boolean BWA() {
        return false;
    }

    @Override // X.MNo
    public void BzQ(int i) {
    }

    @Override // X.MNp
    public /* synthetic */ boolean C24(long j) {
        return false;
    }

    @Override // X.MNp
    public void CAi(String str) {
        KuG kuG = this.A00;
        if (kuG.A00 || kuG.A01) {
            return;
        }
        kuG.A01(this);
    }

    @Override // X.MNp
    public void Cc2() {
    }

    @Override // X.MNp
    public void Clk(boolean z) {
        this.A00.A02(this, z ? 0S2.A00 : 0S2.A01);
    }

    @Override // X.MNo
    public void Cox(boolean z) {
    }

    @Override // X.MNo
    public void Coy(boolean z) {
    }

    @Override // X.MNo
    public /* synthetic */ void Cq7(boolean z) {
    }

    @Override // X.MNp
    public void D0U() {
        KuG kuG = this.A00;
        if (kuG.A00 || kuG.A01) {
            return;
        }
        kuG.A01(this);
    }

    @Override // X.MNo
    public boolean isAvailable() {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // X.MNp
    public void setProgress(int i) {
    }
}
