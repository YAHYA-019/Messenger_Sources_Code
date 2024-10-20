package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: Jm8.class */
public final class Jm8 extends 1pK {
    public static final String __redex_internal_original_name = "AppointmentReminderAlertFragment";
    public KfC A00;
    public RecyclerView A01;
    public C3057Jhq A02;

    public 1iF A1R() {
        return new 1iF(3589489187808450L);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(366128279);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132541512);
        0FI.A08(1889513865, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = (RecyclerView) C09s.A01(this.mView, 2131362071);
        C3057Jhq c3057Jhq = new C3057Jhq();
        this.A02 = c3057Jhq;
        c3057Jhq.A00 = this.A00;
        this.A01.A1D(new LinearLayoutManager(getContext(), 1, false));
        this.A01.A16(this.A02);
    }
}
