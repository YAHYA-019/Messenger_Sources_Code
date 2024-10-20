package com.facebook.messaging.profile;

import X.0D2;
import X.0FI;
import X.1BQ;
import X.1Br;
import X.1GU;
import X.1HH;
import X.1iF;
import X.1lN;
import X.1tG;
import X.AbE;
import X.AlO;
import X.AnonymousClass001;
import X.BgY;
import X.BgZ;
import X.C00i;
import X.C06c;
import X.C1lM;
import X.C7pn;
import X.C9A;
import X.D66;
import X.HFt;
import android.R;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import com.facebook.widget.popover.SimplePopoverFragment;
import com.facebook.xapp.messaging.profile.logging.ContextualProfileLoggingData;
import java.util.HashMap;
import java.util.Map;

/* loaded from: ProfilePopoverFragment.class */
public class ProfilePopoverFragment extends SimplePopoverFragment implements 1lN, C1lM {
    public AlO A00;
    public C7pn A01;
    public HFt A02;
    public ContextualProfileLoggingData A03;
    public final C00i A07 = 1BQ.A02(83097);
    public final C00i A06 = new 1HH(this, 83092);
    public boolean A05 = true;
    public String A04 = "";

    public void A0o() {
        A1D();
    }

    public 1iF A17() {
        return new 1iF(267451864570511L);
    }

    public void A1D() {
        super/*X.0D2*/.A0p();
        if (this.A05 && this.A03 != null) {
            C9A c9a = (C9A) this.A06.get();
            c9a.A02(this.A04, "profile_in_messenger_dismiss");
            c9a.A00 = "pull_to_dismiss";
            c9a.A01("entry_point", this.A03.A02);
            c9a.A01("entry_point_type", this.A03.A03);
            c9a.A01("is_using_litho", String.valueOf(this.A03.A04));
            c9a.A00();
        }
        super.A00 = 2;
        C7pn c7pn = this.A01;
        if (c7pn != null) {
            ((1GU) 1Br.A0B(c7pn.A01.A00)).Ciz(new D66(c7pn.A00));
        }
        ((BgZ) this.A07.get()).A00 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1E() {
        AlO alO = this.A00;
        if (alO != null) {
            alO.A08 = new BgY(this);
            C06c c06c = new C06c(getChildFragmentManager());
            c06c.A0Q(this.A00, "USER_PROFILE", 2131363335);
            c06c.A04();
            return;
        }
        AlO A0b = getChildFragmentManager().A0b("USER_PROFILE");
        this.A00 = A0b;
        if (A0b != null) {
            A0b.A08 = new BgY(this);
        }
    }

    @Override // X.C1lM
    public Map AWe() {
        HashMap A0u = AnonymousClass001.A0u();
        AlO alO = this.A00;
        if (alO != null) {
            A0u.putAll(alO.AWe());
        }
        return A0u;
    }

    public String AWg() {
        return this.A00 != null ? AbE.A00(597) : "unknown";
    }

    public Long Am7() {
        AlO alO = this.A00;
        if (alO == null) {
            return null;
        }
        return alO.Am7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.popover.SimplePopoverFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1494776080);
        super.onCreate(bundle);
        setRetainInstance(true);
        if (bundle != null) {
            this.A04 = bundle.getString("PROFILE_ID", "");
            this.A05 = bundle.getBoolean("SHOULD_LOG", true);
            this.A03 = (ContextualProfileLoggingData) bundle.getParcelable("LOGGING_DATA");
        }
        0FI.A08(-1315921194, A02);
    }

    @Override // com.facebook.widget.popover.SimplePopoverFragment
    public void onDestroy() {
        int A02 = 0FI.A02(2135072514);
        super.onDestroy();
        ((BgZ) this.A07.get()).A00 = false;
        0FI.A08(-37020669, A02);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(793452998);
        super.onDestroyView();
        ((BgZ) this.A07.get()).A00 = false;
        0FI.A08(427741679, A02);
    }

    @Override // com.facebook.widget.popover.SimplePopoverFragment
    public void onResume() {
        int A02 = 0FI.A02(-238055477);
        super.onResume();
        ((BgZ) this.A07.get()).A00 = true;
        0FI.A08(-2054379569, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putString("PROFILE_ID", this.A04);
        bundle.putBoolean("SHOULD_LOG", this.A05);
        bundle.putParcelable("LOGGING_DATA", this.A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (((0D2) this).A01 == null) {
            view.setBackground(new ColorDrawable(1tG.A05(requireContext().getColor(R.color.black), (int) (0.7f * 255.0f))));
        }
    }
}
