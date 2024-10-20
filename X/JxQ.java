package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: JxQ.class */
public final class JxQ extends JgV implements MIr {
    public static final String __redex_internal_original_name = "ECPSelectionContentFragment";
    public ContextThemeWrapper A00;
    public AnonymousClass088 A01;
    public GKU A02;
    public Q2i A03;
    public LoggingContext A04;
    public boolean A05;
    public ECPHandler A06;
    public final Function2 A09 = new GBs(this, 20);
    public final Function1 A07 = new GBn(this, 11);
    public final Function1 A08 = new GBn(this, 12);

    public static final void A05(EnumC3490Mfk enumC3490Mfk, JxQ jxQ, Long l, String str, String str2, String str3, Throwable th) {
        String str4 = null;
        LZv lZv = C06014fk.A0A().A02;
        LoggingContext loggingContext = jxQ.A04;
        if (loggingContext == null) {
            11T.A0L("loggingContext");
            throw 0Q8.createAndThrow();
        }
        if (th != null) {
            str4 = F2Q.A01(th);
        }
        LinkedHashMap A1C = 1BK.A1C();
        A1C.put("logging_context", loggingContext);
        if (str3 != null) {
            A1C.put("TARGET_NAME", str3);
        }
        if (str2 != null) {
            A1C.put("VIEW_NAME", str2);
        }
        JR1.A1I(l, A1C);
        A1C.put("CREDENTIAL_TYPE", enumC3490Mfk);
        if (str4 != null) {
            LEL.A0A(str4, "error_message", A1C);
        }
        lZv.BZT(str, GOo.A0k(A1C));
    }

    @Override // X.MIr
    public /* synthetic */ boolean Bmr(LoggingContext loggingContext, Integer num) {
        return false;
    }

    @Override // X.MIr
    public void CoJ(ECPHandler eCPHandler) {
        this.A06 = eCPHandler;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x005a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011d  */
    /* JADX WARN: Type inference failed for: r0v60, types: [X.07q, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JxQ.onCreate(android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1658319163);
        ContextThemeWrapper A01 = JgV.A01(this, layoutInflater);
        this.A00 = A01;
        View inflate = layoutInflater.cloneInContext(A01).inflate(2132541904, viewGroup, false);
        0FI.A08(1541630284, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-554390041);
        super.onResume();
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            11T.A0L("viewContext");
            throw 0Q8.createAndThrow();
        }
        Object obj = requireArguments().get("ECP_SELECTION_NAV_BAR_STYLE");
        if (obj == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(1433258805, A02);
            throw A0h;
        }
        R49.A00(contextThemeWrapper, this, (KOY) obj, requireArguments().getString("ECP_SELECTION_FRAGMENT_NAVIGATION_TITLE"), (String) null, new GAW(this, 12), new GAW(this, 13), false, false);
        0FI.A08(553046914, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        int A02 = 0FI.A02(1182375987);
        super/*androidx.fragment.app.Fragment*/.onStop();
        GKU gku = this.A02;
        if (gku == null) {
            11T.A0L("viewModel");
            throw 0Q8.createAndThrow();
        }
        gku.Chj();
        0FI.A08(842122490, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C3036Jgz c3036Jgz;
        11T.A0F(view, 0);
        this.A05 = requireArguments().getBoolean(DKB.A00(217));
        super.onViewCreated(view, bundle);
        View A0M = JQz.A0M(view, 2131363773);
        View A0M2 = JQz.A0M(view, 2131363335);
        if (this.A05) {
            ContextThemeWrapper contextThemeWrapper = this.A00;
            if (contextThemeWrapper == null) {
                str = "viewContext";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
            Qq8 qq8 = Qq8.A02;
            11T.A0F(A0M2, 1);
            RbR.A02(contextThemeWrapper, A0M2, qq8, 59, 60);
            C06014fk.A04();
            LBg.A04(A0M2, 2132607390, false);
        } else {
            A0M.setMinimumHeight(0);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            RecyclerView recyclerView = (RecyclerView) view.requireViewById(2131366867);
            recyclerView.A1D(new LinearLayoutManager(activity, 1, false));
            recyclerView.A1A(null);
            Object obj = requireArguments().get(DKB.A00(218));
            if (obj == null) {
                throw 1BK.A0h();
            }
            if (((KOY) obj).showDivider) {
                RCp.A00.A03(recyclerView);
            }
            LoggingContext loggingContext = this.A04;
            str = "loggingContext";
            if (loggingContext != null) {
                AbstractC3052Jhk abstractC3052Jhk = new AbstractC3052Jhk(KP0.A0o, loggingContext, false);
                QWh qWh = new QWh(loggingContext, this.A07, false, false);
                Function1 function1 = this.A08;
                LoggingContext loggingContext2 = this.A04;
                if (loggingContext2 != null) {
                    QWa qWa = new QWa(loggingContext2, function1);
                    LoggingContext loggingContext3 = this.A04;
                    if (loggingContext3 != null) {
                        QWe qWe = new QWe(loggingContext3, function1, false);
                        LoggingContext loggingContext4 = this.A04;
                        if (loggingContext4 != null) {
                            QWZ qwz = new QWZ(loggingContext4, function1);
                            LoggingContext loggingContext5 = this.A04;
                            if (loggingContext5 != null) {
                                Jwv jwv = new Jwv(loggingContext5, function1);
                                LoggingContext loggingContext6 = this.A04;
                                if (loggingContext6 != null) {
                                    QWY qwy = new QWY(loggingContext6, function1);
                                    LoggingContext loggingContext7 = this.A04;
                                    if (loggingContext7 != null) {
                                        QWb qWb = new QWb(loggingContext7, function1);
                                        LoggingContext loggingContext8 = this.A04;
                                        if (loggingContext8 != null) {
                                            QWc qWc = new QWc(loggingContext8, function1, false);
                                            LoggingContext loggingContext9 = this.A04;
                                            if (loggingContext9 != null) {
                                                Q2i q2i = new Q2i(04R.A09(new 03Y[]{JgV.A03(abstractC3052Jhk), JgV.A03(qWh), JgV.A03(qWa), JgV.A03(qWe), JgV.A03(qwz), JgV.A03(jwv), JgV.A03(qwy), JgV.A03(qWb), JgV.A03(qWc), JgV.A03(new AbstractC3052Jhk(KP0.A0t, loggingContext9, this.A05))}));
                                                this.A03 = q2i;
                                                recyclerView.A16(q2i);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        GKU gku = this.A02;
        str = "viewModel";
        if (gku != null) {
            JgV.A04(this, gku.CkP(), 50);
            GKU gku2 = this.A02;
            if (gku2 != null) {
                JgV.A04(this, gku2.Aft(), 51);
                GKU gku3 = this.A02;
                if (gku3 != null) {
                    if (!(gku3 instanceof C3036Jgz) || (c3036Jgz = (C3036Jgz) gku3) == null) {
                        return;
                    }
                    c3036Jgz.A09.observe(this, new LQx(c3036Jgz, this, 9));
                    return;
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
