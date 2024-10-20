package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.inject.FbInjector;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.CustomFrameLayout;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.ExecutorService;

/* loaded from: H4z.class */
public final class H4z extends CustomFrameLayout implements CallerContextable {
    public static final String __redex_internal_original_name = "RecentEmojiView";
    public RecyclerView A00;
    public 2eS A01;
    public Hh5 A02;
    public BlueServiceOperationFactory A03;
    public AbR A04;
    public GWd A05;
    public Hr8 A06;
    public FbTextView A07;
    public 7JL A08;
    public ExecutorService A09;
    public boolean A0A;
    public MigColorScheme A0B;

    public static void A00(H4z h4z, ImmutableList immutableList) {
        2OB r303;
        if (h4z.A05 == null) {
            AbR abR = h4z.A04;
            Hh5 hh5 = h4z.A02;
            Context A01 = FbInjector.A01();
            AbL.A0y(abR);
            try {
                2Xd gWd = new GWd(hh5, abR);
                1Bn.A0K();
                FbInjector.A04(A01);
                h4z.A05 = gWd;
                ((GWd) gWd).A01 = h4z.A06;
                h4z.A00.A16(gWd);
            } catch (Throwable th) {
                1Bn.A0K();
                FbInjector.A04(A01);
                throw th;
            }
        }
        GWd gWd2 = h4z.A05;
        gWd2.A03 = immutableList;
        gWd2.A07();
        h4z.A05.A0H(h4z.A0B);
        if (immutableList.isEmpty()) {
            h4z.A00.setVisibility(8);
            r303 = h4z.A07;
        } else {
            h4z.A07.setVisibility(8);
            r303 = h4z.A00;
        }
        r303.setVisibility(0);
    }

    public void A0V(MigColorScheme migColorScheme) {
        if (Objects.equal(this.A0B, migColorScheme)) {
            return;
        }
        this.A0B = migColorScheme;
        this.A07.setTextColor(migColorScheme != null ? migColorScheme.B9Q() : (-1) << (-1));
        GWd gWd = this.A05;
        if (gWd != null) {
            gWd.A0H(migColorScheme);
        }
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(561603592);
        super.onDetachedFromWindow();
        2eS r0 = this.A01;
        if (r0 != null) {
            r0.A00(true);
            this.A01 = null;
        }
        0FI.A0C(-287521124, A06);
    }
}
