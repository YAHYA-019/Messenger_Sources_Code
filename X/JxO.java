package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.deeplink.viewmodel.ECPUrlViewModel;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.logging.LoggingContext;

/* loaded from: JxO.class */
public final class JxO extends JgV implements MIr {
    public static final String __redex_internal_original_name = "ECPUrlLoadingContentFragment";
    public ContextThemeWrapper A00;
    public ShimmerFrameLayout A01;
    public ShimmerFrameLayout A02;
    public ShimmerFrameLayout A03;
    public Q2N A04;
    public ECPHandler A05;
    public EcpUIConfiguration A06;
    public LoggingContext A07;

    @Override // X.MIr
    public boolean Bmr(LoggingContext loggingContext, Integer num) {
        11T.A0H(num, loggingContext);
        Q2N q2n = this.A04;
        if (q2n == null) {
            11T.A0L("ecpUrlViewModel");
        } else {
            q2n.A00(loggingContext);
        }
        throw 0Q8.createAndThrow();
    }

    @Override // X.MIr
    public void CoJ(ECPHandler eCPHandler) {
        this.A05 = eCPHandler;
        Q2N q2n = this.A04;
        if (q2n != null) {
            if (eCPHandler == null) {
                throw AnonymousClass001.A0N("Attempting to set null value for EcpHandler. This will result in lossy event-handling behavior");
            }
            ECPHandler eCPHandler2 = q2n.A00;
            if (eCPHandler2 != null && !eCPHandler2.equals(eCPHandler)) {
                throw AnonymousClass001.A0N("Cannot override previous ECP handler with a new handler for the same checkout ViewModel instance");
            }
            q2n.A00 = eCPHandler;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1206022619);
        super/*androidx.fragment.app.Fragment*/.onCreate(bundle);
        Q2N q2n = new ViewModelProvider(this).get(Q2N.class);
        this.A04 = q2n;
        ECPHandler eCPHandler = this.A05;
        if (eCPHandler != null) {
            if (q2n != null) {
                ECPHandler eCPHandler2 = q2n.A00;
                if (eCPHandler2 != null && !eCPHandler2.equals(eCPHandler)) {
                    throw AnonymousClass001.A0N("Cannot override previous ECP handler with a new handler for the same checkout ViewModel instance");
                }
                q2n.A00 = eCPHandler;
            }
            11T.A0L("ecpUrlViewModel");
            throw 0Q8.createAndThrow();
        }
        Q2N q2n2 = this.A04;
        if (q2n2 != null) {
            Bundle requireArguments = requireArguments();
            q2n2.A06.setValue(null);
            q2n2.A05.setValue(null);
            String string = requireArguments.getString("session_id");
            if (string == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            q2n2.A04 = string;
            String string2 = requireArguments.getString("product_id");
            if (string2 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            q2n2.A02 = string2;
            String string3 = requireArguments.getString("order_id");
            if (string3 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            q2n2.A01 = string3;
            String string4 = requireArguments.getString("receiver_id");
            if (string4 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            q2n2.A03 = string4;
            String str = q2n2.A04;
            if (str == null) {
                11T.A0L("sessionId");
                throw 0Q8.createAndThrow();
            }
            String str2 = q2n2.A02;
            if (str2 == null) {
                11T.A0L("productId");
                throw 0Q8.createAndThrow();
            }
            String str3 = q2n2.A01;
            if (str3 == null) {
                11T.A0L("orderId");
                throw 0Q8.createAndThrow();
            }
            Parcelable parcelable = requireArguments.getParcelable("ECP_UI_CONFIGURATION");
            if (parcelable == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            EcpUIConfiguration ecpUIConfiguration = (EcpUIConfiguration) parcelable;
            2aK.A03((Integer) null, (0DE) null, new ECPUrlViewModel.launchECP.1(q2n2, ecpUIConfiguration, str, str2, string4, str3, (0DR) null), (2aI) q2n2.A07.getValue(), 3);
            Parcelable parcelable2 = requireArguments().getParcelable("ECP_UI_CONFIGURATION");
            11T.A0I(parcelable2, "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.EcpUIConfiguration");
            this.A06 = (EcpUIConfiguration) parcelable2;
            0FI.A08(1152000562, A02);
            return;
        }
        11T.A0L("ecpUrlViewModel");
        throw 0Q8.createAndThrow();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(2080278597);
        ContextThemeWrapper A01 = JgV.A01(this, layoutInflater);
        this.A00 = A01;
        View inflate = layoutInflater.cloneInContext(A01).inflate(2132541894, viewGroup, false);
        0FI.A08(-1458969016, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        String str;
        int A02 = 0FI.A02(-1345204402);
        super.onResume();
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            str = "viewContext";
        } else {
            EcpUIConfiguration ecpUIConfiguration = this.A06;
            if (ecpUIConfiguration != null) {
                R49.A00(contextThemeWrapper, this, ecpUIConfiguration.A07, (String) null, (String) null, new GAW(this, 15), SI2.A00, false, false);
                0FI.A08(1738224917, A02);
                return;
            }
            str = "ecpUIConfiguration";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            View requireViewById = view.requireViewById(2131368081);
            11T.A0I(requireViewById, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
            this.A03 = (ShimmerFrameLayout) requireViewById;
            View requireViewById2 = view.requireViewById(2131367730);
            11T.A0I(requireViewById2, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
            this.A02 = (ShimmerFrameLayout) requireViewById2;
            View requireViewById3 = view.requireViewById(2131362483);
            11T.A0I(requireViewById3, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
            this.A01 = (ShimmerFrameLayout) requireViewById3;
            ViewGroup viewGroup = (ViewGroup) view.requireViewById(2131363772);
            EcpUIConfiguration ecpUIConfiguration = this.A06;
            if (ecpUIConfiguration != null) {
                if (ecpUIConfiguration.A07.showDivider) {
                    L9w l9w = RCp.A00;
                    11T.A0D(viewGroup);
                    l9w.A03(viewGroup);
                }
                ShimmerFrameLayout shimmerFrameLayout = this.A03;
                if (shimmerFrameLayout != null) {
                    FAF A04 = C06014fk.A04();
                    Context requireContext = requireContext();
                    Drawable drawable = activity.getDrawable(2132410779);
                    if (drawable == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    FAF A042 = C06014fk.A04();
                    requireContext();
                    shimmerFrameLayout.setBackground(JR0.A0Y(requireContext, drawable, A042, A04, 15));
                    ShimmerFrameLayout shimmerFrameLayout2 = this.A02;
                    if (shimmerFrameLayout2 != null) {
                        FAF A043 = C06014fk.A04();
                        Context requireContext2 = requireContext();
                        Drawable drawable2 = activity.getDrawable(2132410779);
                        if (drawable2 == null) {
                            throw AnonymousClass001.A0N("Required value was null.");
                        }
                        FAF A044 = C06014fk.A04();
                        requireContext();
                        shimmerFrameLayout2.setBackground(JR0.A0Y(requireContext2, drawable2, A044, A043, 15));
                        ShimmerFrameLayout shimmerFrameLayout3 = this.A01;
                        str = "bodyShimmerView";
                        if (shimmerFrameLayout3 != null) {
                            FAF A045 = C06014fk.A04();
                            Context requireContext3 = requireContext();
                            Drawable drawable3 = activity.getDrawable(2132410779);
                            if (drawable3 == null) {
                                throw AnonymousClass001.A0N("Required value was null.");
                            }
                            FAF A046 = C06014fk.A04();
                            requireContext();
                            shimmerFrameLayout3.setBackground(JR0.A0Y(requireContext3, drawable3, A046, A045, 15));
                            ShimmerFrameLayout shimmerFrameLayout4 = this.A03;
                            if (shimmerFrameLayout4 != null) {
                                HLw.A00(shimmerFrameLayout4, (Integer) null);
                                ShimmerFrameLayout shimmerFrameLayout5 = this.A02;
                                if (shimmerFrameLayout5 != null) {
                                    HLw.A00(shimmerFrameLayout5, (Integer) null);
                                    ShimmerFrameLayout shimmerFrameLayout6 = this.A01;
                                    if (shimmerFrameLayout6 != null) {
                                        HLw.A00(shimmerFrameLayout6, (Integer) null);
                                        ShimmerFrameLayout shimmerFrameLayout7 = this.A03;
                                        if (shimmerFrameLayout7 != null) {
                                            shimmerFrameLayout7.setVisibility(0);
                                            ShimmerFrameLayout shimmerFrameLayout8 = this.A02;
                                            if (shimmerFrameLayout8 != null) {
                                                shimmerFrameLayout8.setVisibility(0);
                                                ShimmerFrameLayout shimmerFrameLayout9 = this.A01;
                                                if (shimmerFrameLayout9 != null) {
                                                    shimmerFrameLayout9.setVisibility(0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    11T.A0L("subtitleShimmerView");
                    throw 0Q8.createAndThrow();
                }
                11T.A0L("titleShimmerView");
                throw 0Q8.createAndThrow();
            }
            str = "ecpUIConfiguration";
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        Q2N q2n = this.A04;
        if (q2n != null) {
            JgV.A04(this, q2n.A06, 52);
            Q2N q2n2 = this.A04;
            if (q2n2 != null) {
                JgV.A04(this, q2n2.A05, 53);
                return;
            }
        }
        11T.A0L("ecpUrlViewModel");
        throw 0Q8.createAndThrow();
    }
}
