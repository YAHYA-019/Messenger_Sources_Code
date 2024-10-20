package X;

import android.content.Context;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: X.Gma, reason: case insensitive filesystem */
/* loaded from: Gma.class */
public final class C2725Gma extends 7kE {
    public final Context A00;
    public final 06Z A01;
    public final LifecycleOwner A02;
    public final 2S4 A03;
    public final 6Qc A04;
    public final 6R7 A05;
    public final 6QZ A06;
    public final 6Qb A07;
    public final 6Qf A08;

    public C2725Gma(Context context, 06Z r303, LifecycleOwner lifecycleOwner, 2S4 r305, 6Qc r306, 6R7 r307, 6QZ r308, 6Qb r309, 6Qf r310) {
        this.A00 = context;
        this.A08 = r310;
        this.A05 = r307;
        this.A06 = r308;
        this.A07 = r309;
        this.A04 = r306;
        this.A03 = r305;
        this.A01 = r303;
        this.A02 = lifecycleOwner;
    }

    public /* bridge */ /* synthetic */ C7yv A00() {
        6Qf r0 = this.A08;
        6Qb r02 = this.A07;
        6Qc r03 = this.A04;
        return new C2741Gms(this.A01, this.A02, this.A03, r03, r02, r0);
    }

    public String A01() {
        return "suggested_popup";
    }

    public String A02() {
        return 4YT.A00(1073);
    }

    public String A03() {
        return "SUGGESTED";
    }

    public /* bridge */ /* synthetic */ void A04(C7yv c7yv) {
        IV9 iv9 = (IV9) c7yv;
        11T.A0F(iv9, 0);
        JEt iv1 = new IV1(this);
        C2735Gmk c2735Gmk = (C2735Gmk) iv9.A00;
        EditText editText = c2735Gmk.A00;
        if (editText != null) {
            c2735Gmk.A0d(editText, c2735Gmk.A0Q, iv1);
        }
        ((C2735Gmk) iv9.A00).A01 = new Hmj(this);
    }
}
