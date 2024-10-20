package X;

import android.app.AlertDialog;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.fbpay.w3c.CardDetails;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Jn9, reason: case insensitive filesystem */
/* loaded from: Jn9.class */
public final class C3232Jn9 extends AbstractC3224Jn1 {
    public static final String __redex_internal_original_name = "FacebookCvvVerificationBottomsheet";
    public Intent A00;
    public View A01;
    public View A02;
    public View A03;
    public Button A04;
    public EditText A05;
    public FrameLayout A06;
    public LinearLayout A07;
    public ScrollView A08;
    public Spinner A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public C3018Jgg A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;

    public C3232Jn9() {
    }

    public C3232Jn9(int i) {
    }

    public static final Intent A05(C3232Jn9 c3232Jn9, CardDetails cardDetails, F6i f6i, Integer num, Long l, Long l2, Long l3, String str) {
        String str2;
        Intent A05 = AbF.A05();
        if (cardDetails != null) {
            A05.putExtra("keyResultCardDetails", cardDetails);
        }
        if (l != null) {
            A05.putExtra("timeElapsedInMs", l.longValue());
        }
        A05.putExtra("numberOfCVVFailures", c3232Jn9.A0r().A02.size());
        if (c3232Jn9.A0r().A02.size() > 0) {
            List<G8E> list = c3232Jn9.A0r().A02;
            ArrayList A0z = 1BL.A0z(list);
            for (G8E g8e : list) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append(F2Q.A00(g8e));
                AnonymousClass001.A1H(A0k);
                if ((g8e instanceof G8E) || (g8e instanceof K0H) || (g8e instanceof QmX)) {
                    str2 = g8e.errorTitle;
                } else {
                    if (g8e != null) {
                        str2 = g8e.getMessage();
                        if (str2 != null) {
                        }
                    }
                    str2 = "Unknown error type";
                }
                A0z.add(AnonymousClass001.A0d(str2, A0k));
            }
            StringBuilder A0k2 = AnonymousClass001.A0k();
            A0k2.append('(');
            A05.putExtra("cvvFailures", AnonymousClass002.A0K(A0z, A0k2));
        }
        if (c3232Jn9.A0r().A09 != null) {
            A05.putExtra("qplInstanceKey", c3232Jn9.A0r().A09);
        }
        if (l2 != null) {
            A05.putExtra("timeInMsDemaskCardStart", l2.longValue());
        }
        if (l3 != null) {
            A05.putExtra("timeInMsDemaskCardEnd", l3.longValue());
        }
        A05.putExtra("timeInMsDemaskFragmentActivityCreated", c3232Jn9.A0r().A00);
        int intValue = num.intValue();
        A05.putExtra("keyResultEventName", intValue != 0 ? intValue != 1 ? "CANCELED_CVV_VERIFICATION" : "FAILED_CVV_VERIFICATION" : "SUCCEEDED_CVV_VERIFICATION");
        if (str == null) {
            if (f6i != null) {
                C01i c01i = f6i.A03;
                if (c01i.getValue() != null) {
                    str = (String) c01i.getValue();
                }
            }
            return A05;
        }
        A05.putExtra("keyResultError", str);
        return A05;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(C3232Jn9 c3232Jn9, F6i f6i, String str, String str2, String str3) {
        Button button = c3232Jn9.A04;
        if (button != null) {
            button.setEnabled(false);
        }
        AlertDialog.Builder message = new AlertDialog.Builder(c3232Jn9.getActivity()).setTitle(str).setMessage(str2);
        String str4 = c3232Jn9.A0F;
        if (str4 != null) {
            message.setPositiveButton((CharSequence) str4, (DialogInterface.OnClickListener) new LFS(f6i, c3232Jn9, str3, 2)).show();
        } else {
            11T.A0L("okButtonText");
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        View A0B = DKF.A0B(LayoutInflater.from(requireActivity()), 2132542387);
        this.A01 = A0B;
        if (A0B != null) {
            A0B.setOnTouchListener(new LKW(this, 2));
        }
        AlertDialog create = new AlertDialog.Builder(requireActivity()).setView(this.A01).create();
        11T.A0A(create);
        return create;
    }

    public final C3018Jgg A0r() {
        C3018Jgg c3018Jgg = this.A0D;
        if (c3018Jgg != null) {
            return c3018Jgg;
        }
        11T.A0L("viewModel");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        CardDetails cardDetails;
        BottomSheetBehavior A02;
        int A022 = 0FI.A02(993449700);
        super/*X.0D2*/.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Application application = activity.getApplication();
            11T.A0A(application);
            C3018Jgg c3018Jgg = (C3018Jgg) new ViewModelProvider((ViewModelStoreOwner) this, (ViewModelProvider.Factory) new C3040Jh3(application, this.mArguments)).get(C3018Jgg.class);
            11T.A0F(c3018Jgg, 0);
            this.A0D = c3018Jgg;
            View view = this.A01;
            if (view != null) {
                LKO.A01(view.findViewById(2131362274), this, 37);
                TextView textView = this.A0A;
                if (textView != null) {
                    FragmentActivity activity2 = getActivity();
                    String string = getString(2131951915);
                    Function1 function1 = super.A03;
                    LDl.A04(activity2, super.A00, textView, super.A01, function1 != null ? (L2l) function1.invoke("CLICKED_LEARN_MORE") : null, string);
                }
                if (A0r().A0A.size() > 1) {
                    View view2 = this.A02;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    Spinner spinner = this.A09;
                    if (spinner != null) {
                        Context requireContext = requireContext();
                        C3018Jgg A0r = A0r();
                        spinner.setOnItemSelectedListener(new LLC(A0r, 3));
                        spinner.setAdapter((SpinnerAdapter) new JYR(requireContext, A0r));
                    }
                } else {
                    Spinner spinner2 = this.A09;
                    if (spinner2 != null) {
                        spinner2.setVisibility(8);
                    }
                    View view3 = this.A02;
                    if (view3 != null && (cardDetails = (CardDetails) A0r().A05.getValue()) != null) {
                        LDl.A07(getContext(), view3, cardDetails);
                    }
                }
                EditText editText = this.A05;
                if (editText != null) {
                    editText.addTextChangedListener(new LJj(new GAa(this, 2), 1));
                }
                EditText editText2 = this.A05;
                if (editText2 != null) {
                    editText2.setOnEditorActionListener(new FYa(this, 5));
                }
                Button button = this.A04;
                if (button != null) {
                    LKO.A01(button, this, 29);
                }
                JR2.A0g(this);
                ScrollView scrollView = this.A08;
                if (scrollView != null && (A02 = BottomSheetBehavior.A02(scrollView)) != null) {
                    A02.A0B(3);
                    A02.A0G(new 94U(this, 0));
                }
                A0r().A04.observe(this, new LQx(view, this, 2));
                LR8.A01(this, A0r().A03, 10);
                LR8.A01(this, A0r().A05, 11);
                0FI.A08(2034739478, A022);
                return;
            }
        }
        NullPointerException A0Q = AnonymousClass001.A0Q("Activity cannot be null");
        0FI.A08(-1402205123, A022);
        throw A0Q;
    }

    public void onCancel(DialogInterface dialogInterface) {
        LET let;
        C11474wl c11474wl;
        11T.A0F(dialogInterface, 0);
        Integer num = this.A0E;
        if (num != null && num.intValue() == -1 && (c11474wl = super.A01) != null) {
            C11444wi c11444wi = c11474wl.A01;
            Integer num2 = 0S2.A01;
            03W A0G = 04R.A0G();
            Bundle bundle = super.A00;
            11T.A0F(num2, 1);
            C11444wi.A01(bundle, c11444wi, "ACCEPTED_AUTOFILL", "PAYMENT_AUTOFILL", A0G);
        }
        WeakReference weakReference = super.A02;
        if (weakReference != null && (let = (LET) weakReference.get()) != null) {
            Integer num3 = this.A0E;
            int intValue = num3 != null ? num3.intValue() : 0;
            Intent intent = this.A00;
            if (intent == null) {
                intent = A05(this, null, null, 0S2.A0C, null, null, null, null);
            }
            let.A0L(intValue, intent);
        }
        dialogInterface.cancel();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(756272796);
        11T.A0F(layoutInflater, 0);
        super/*X.JgN*/.onCreateView(layoutInflater, viewGroup, bundle);
        View view = this.A01;
        0FI.A08(2079356840, A02);
        return view;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(1994850746);
        super/*X.0D2*/.onDestroyView();
        this.A01 = null;
        this.A0C = null;
        this.A05 = null;
        this.A04 = null;
        this.A07 = null;
        this.A03 = null;
        this.A08 = null;
        this.A06 = null;
        this.A0B = null;
        Spinner spinner = this.A09;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(null);
        }
        Spinner spinner2 = this.A09;
        if (spinner2 != null) {
            spinner2.setAdapter((SpinnerAdapter) null);
        }
        this.A09 = null;
        this.A02 = null;
        this.A0A = null;
        0FI.A08(1886998339, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0102, code lost:
    
        if (r304 == null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3232Jn9.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
