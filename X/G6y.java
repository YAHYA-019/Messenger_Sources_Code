package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.bugreporter.core.model.BugReport;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: G6y.class */
public final class G6y implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ F6w A02;
    public final /* synthetic */ 5TL A03;
    public final /* synthetic */ GKR A04;
    public final /* synthetic */ ImmutableMap A05;
    public final /* synthetic */ ImmutableSet A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ java.util.Map A08;

    public G6y(Bundle bundle, F6w f6w, 5TL r304, GKR gkr, ImmutableMap immutableMap, ImmutableSet immutableSet, String str, java.util.Map map, long j) {
        this.A03 = r304;
        this.A00 = j;
        this.A04 = gkr;
        this.A02 = f6w;
        this.A01 = bundle;
        this.A05 = immutableMap;
        this.A06 = immutableSet;
        this.A07 = str;
        this.A08 = map;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        5TL r0 = this.A03;
        FEF fef = (FEF) r0.A06.get();
        long j = this.A00;
        4YV.A0Z(fef.A00).flowMarkPoint(FEF.A00(fef, j), "BuildReportWriter");
        C00i c00i = r0.A07;
        DKF.A0H(c00i).A01(j, "bug_report_build_start");
        FIL fil = (FIL) r0.A08.get();
        String Adg = this.A04.Adg();
        F6w f6w = this.A02;
        List list = f6w.A0O;
        Bundle bundle = this.A01;
        Context context = (Context) f6w.A0K.get();
        ImmutableMap immutableMap = this.A05;
        ImmutableSet immutableSet = this.A06;
        ImmutableSet A07 = ImmutableSet.A07(r0.A0N);
        EPO epo = f6w.A05;
        String str = f6w.A0F;
        ExV A05 = fil.A05(context, bundle, epo, immutableMap, immutableSet, A07, f6w.A09, Adg, str, f6w.A0H, this.A07, list, f6w.A0P, j);
        A05.A0p = f6w.A0I;
        A05.A05 = f6w.A01;
        A05.A0A = f6w.A04;
        A05.A01(this.A08);
        A05.A0X = 5TL.A04(r0);
        A05.A0z = f6w.A0R;
        A05.A0K = f6w.A0A;
        A05.A04 = f6w.A00;
        BugReport bugReport = new BugReport(A05);
        DKF.A0H(c00i).A01(j, "bug_report_build_end");
        return bugReport;
    }
}
