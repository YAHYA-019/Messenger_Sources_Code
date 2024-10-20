package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8v0, reason: invalid class name */
/* loaded from: 8v0.class */
public final class C8v0 extends BJB {
    public static final String __redex_internal_original_name = "ManageAiMemoryFragment";
    public long A00 = -1;
    public FbUserSession A01;
    public 1pI A02;
    public MigColorScheme A03;
    public final C01i A04;

    public C8v0() {
        AQk A01 = AQk.A01(this, 40);
        C01i A00 = AQk.A00(AQk.A01(this, 33), C03i.A02, 34);
        this.A04 = 7zU.A0F(AQk.A01(A00, 35), A01, AQc.A00(null, A00, 28), 7zL.A18(8DM.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A01 = 7zT.A08(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-628341943);
        11T.A0F(layoutInflater, 0);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        this.A00 = requireArguments().getLong("thread_ID");
        this.A03 = 7zV.A0S(this);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        A0J.setOnTouchListener(new View.OnTouchListener() { // from class: X.9q6
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        C1s0 c1s0 = new C1s0(A0J.A09);
        c1s0.A06 = C02A.A00(null, C02A.defaultInstance, null, null, null, null, null, null, null, -129, 31, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        A0J.A10(c1s0.A00(), true);
        ViewModel viewModel = (ViewModel) this.A04.getValue();
        String valueOf = String.valueOf(this.A00);
        11T.A0F(valueOf, 0);
        2aK.A03((Integer) null, (0DE) null, new AIr(viewModel, valueOf, null, 1), ViewModelKt.getViewModelScope(viewModel), 3);
        0FI.A08(-807231006, A02);
        return A0J;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.DZJ*/.onSaveInstanceState(bundle);
        bundle.putLong("thread_ID", this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super/*X.1pK*/.onViewCreated(view, bundle);
        this.A02 = 1vD.A00(view);
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView == null || getContext() == null) {
            return;
        }
        A1b();
        AJW.A01(lithoView, this, 7zO.A0J(this), 1);
        AJT.A02(this, 7zO.A0J(this), 11);
    }
}
