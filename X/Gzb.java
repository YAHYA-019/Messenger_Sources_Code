package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.facebook.smartcapture.ui.ResourcesButton;
import com.facebook.smartcapture.ui.ResourcesTextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: Gzb.class */
public final class Gzb extends Gzc {
    public static final String __redex_internal_original_name = "DefaultPhotoReviewFragment";
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public Bitmap A06;
    public ScaleGestureDetector A07;
    public View A08;
    public ViewGroup A09;
    public FrameLayout A0A;
    public FrameLayout A0B;
    public FrameLayout A0C;
    public ImageView A0D;
    public ImageView A0E;
    public ImageView A0F;
    public ImageView A0G;
    public ImageView A0H;
    public ImageView A0I;
    public LinearLayout A0J;
    public ProgressBar A0K;
    public RelativeLayout A0L;
    public ResourcesButton A0M;
    public ResourcesButton A0N;
    public ResourcesTextView A0O;
    public ResourcesTextView A0P;
    public ResourcesTextView A0Q;
    public ResourcesTextView A0R;
    public ResourcesTextView A0S;
    public GV7 A0T;
    public GUo A0U;
    public String A0V;
    public String A0W;
    public WeakReference A0X;
    public ArrayList A0Y;
    public boolean A0Z;
    public boolean A0a;
    public Point[] A0b;
    public QoQ A0c;
    public H9j A0d;

    public Gzb() {
        this.A04 = 1.0f;
        this.A05 = -1;
    }

    public Gzb(int i) {
    }

    @Override // X.Gzc
    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super.onAttach(context);
        if (context instanceof JDO) {
            this.A0X = 7zL.A14(context);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-631015450);
        11T.A0F(layoutInflater, 0);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(2132541836, viewGroup, false);
        this.A0B = (FrameLayout) layoutInflater.inflate(2132543110, viewGroup2, false);
        0FI.A08(386002183, A02);
        return viewGroup2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(869798615);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A0A = null;
        this.A0T = null;
        this.A0Y = null;
        this.A08 = null;
        0FI.A08(289513727, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(373062709);
        super/*androidx.fragment.app.Fragment*/.onStart();
        if (this.A06 == null) {
            C05034cn A022 = C05034cn.A02(new J5U(this, 35), C05034cn.A0C);
            ILt iLt = new ILt(this, 2);
            C05034cn.A00(null, new ILs(iLt, A022), A022, C05034cn.A0B);
        }
        0FI.A08(-769808181, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        IKB lko;
        Drawable A04;
        Drawable A00;
        ImageView imageView;
        ImageView imageView2;
        H9j h9j;
        ResourcesButton resourcesButton;
        int i;
        11T.A0F(view, 0);
        this.A09 = (ViewGroup) view;
        this.A0D = (ImageView) HL8.A00(view, 2131365090);
        this.A0F = (ImageView) HL8.A00(view, 2131365091);
        this.A0K = (ProgressBar) HL8.A00(view, 2131366393);
        FrameLayout frameLayout = this.A0B;
        11T.A0D(frameLayout);
        this.A0G = (ImageView) HL8.A00(frameLayout, 2131365092);
        this.A0E = (ImageView) HL8.A00(view, 2131365084);
        FrameLayout frameLayout2 = this.A0B;
        11T.A0D(frameLayout2);
        this.A0H = (ImageView) HL8.A00(frameLayout2, 2131365093);
        this.A0J = (LinearLayout) HL8.A00(view, 2131365282);
        this.A0Q = (ResourcesTextView) view.findViewById(2131368228);
        this.A0R = (ResourcesTextView) HL8.A00(view, 2131368229);
        this.A0O = (ResourcesTextView) HL8.A00(view, 2131368226);
        this.A0P = (ResourcesTextView) HL8.A00(view, 2131368227);
        this.A0C = (FrameLayout) HL8.A00(view, 2131364151);
        this.A0M = (ResourcesButton) HL8.A00(view, 2131362680);
        this.A0N = (ResourcesButton) HL8.A00(view, 2131362681);
        this.A0L = (RelativeLayout) HL8.A00(view, 2131367003);
        this.A0I = (ImageView) HL8.A00(view, 2131365094);
        this.A0S = (ResourcesTextView) HL8.A00(view, 2131368230);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0Z = bundle2.getBoolean("is_cancel_confirmation_action_sheet_enabled");
            this.A0c = bundle2.getSerializable("capture_mode");
            this.A0d = (H9j) bundle2.getSerializable("capture_stage");
            this.A0W = bundle2.getString("sync_feedback_error");
            this.A0V = bundle2.getString("photo_file_path");
            Parcelable[] parcelableArray = bundle2.getParcelableArray("skewed_crop_points");
            if (parcelableArray != null) {
                this.A0b = (Point[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Point[].class);
            }
        }
        QoQ qoQ = this.A0c;
        if (qoQ != null && (h9j = this.A0d) != null) {
            if (qoQ == QoQ.A03 && h9j == H9j.A03) {
                resourcesButton = this.A0M;
                11T.A0D(resourcesButton);
                i = 2131951930;
            } else {
                AbstractC2326GOr.A0y(this.A0P);
                resourcesButton = this.A0M;
                11T.A0D(resourcesButton);
                i = 2131951857;
            }
            resourcesButton.setText(i);
        }
        Context requireContext = requireContext();
        Hp9 hp9 = ((JgR) this).A00;
        if (hp9 != null) {
            Drawable A002 = hp9.A00(requireContext());
            if (A002 != null && (imageView2 = this.A0E) != null) {
                imageView2.setImageDrawable(A002);
            }
            Hp9 hp92 = ((JgR) this).A00;
            if (hp92 != null && (A00 = hp92.A00(requireContext())) != null && (imageView = this.A0H) != null) {
                imageView.setImageDrawable(A00);
            }
            1Br r0 = hp9.A00;
            Drawable A02 = ((Fcg) 1Br.A0B(r0)).A02(requireContext, 3Eh.AFR);
            ImageView imageView3 = this.A0F;
            if (A02 != null) {
                11T.A0D(imageView3);
                imageView3.setImageDrawable(A02);
            } else {
                AbstractC2326GOr.A0y(imageView3);
            }
            if (this.A0W != null && (A04 = ((Fcg) 1Br.A0B(r0)).A04(requireContext, 3Eh.A4h)) != null) {
                ImageView imageView4 = this.A0I;
                11T.A0D(imageView4);
                imageView4.setImageDrawable(A04);
            }
        }
        View.OnClickListener ikb = new IKB(this, 53);
        ResourcesButton resourcesButton2 = this.A0N;
        11T.A0D(resourcesButton2);
        resourcesButton2.setOnClickListener(ikb);
        boolean z = this.A0Z;
        ImageView imageView5 = this.A0E;
        if (z) {
            11T.A0D(imageView5);
            lko = new IKB(this, 49);
        } else {
            11T.A0D(imageView5);
            lko = new LKO(this, 86);
        }
        imageView5.setOnClickListener((View.OnClickListener) lko);
        ImageView imageView6 = this.A0D;
        11T.A0D(imageView6);
        IKB.A00(imageView6, this, 50);
        FrameLayout frameLayout3 = this.A0B;
        11T.A0D(frameLayout3);
        IKB.A00(HL8.A00(frameLayout3, 2131365093), this, 51);
        ResourcesButton resourcesButton3 = this.A0M;
        11T.A0D(resourcesButton3);
        IKB.A00(resourcesButton3, this, 52);
        String str = this.A0W;
        if (str != null) {
            ResourcesTextView resourcesTextView = this.A0R;
            11T.A0D(resourcesTextView);
            resourcesTextView.setVisibility(8);
            ResourcesTextView resourcesTextView2 = this.A0O;
            11T.A0D(resourcesTextView2);
            resourcesTextView2.setVisibility(8);
            ResourcesTextView resourcesTextView3 = this.A0P;
            11T.A0D(resourcesTextView3);
            resourcesTextView3.setVisibility(8);
            ResourcesButton resourcesButton4 = this.A0N;
            11T.A0D(resourcesButton4);
            resourcesButton4.setVisibility(8);
            RelativeLayout relativeLayout = this.A0L;
            11T.A0D(relativeLayout);
            relativeLayout.setVisibility(0);
            ResourcesTextView resourcesTextView4 = this.A0S;
            11T.A0D(resourcesTextView4);
            resourcesTextView4.setText(Html.fromHtml(str, 0));
            ResourcesButton resourcesButton5 = this.A0M;
            11T.A0D(resourcesButton5);
            resourcesButton5.setText(2131951893);
        }
        LinearLayout linearLayout = this.A0J;
        11T.A0D(linearLayout);
        linearLayout.post(new ItP(this));
        Context requireContext2 = requireContext();
        ProgressBar progressBar = this.A0K;
        11T.A0D(progressBar);
        Kw8.A01(requireContext2, progressBar, 2130971524);
        Context requireContext3 = requireContext();
        TypedValue typedValue = new TypedValue();
        requireContext3.getTheme().resolveAttribute(2130970607, typedValue, false);
        if (typedValue.data != 0) {
            AbstractC2326GOr.A0y(this.A0Q);
        }
        TypedValue typedValue2 = new TypedValue();
        requireContext3.getTheme().resolveAttribute(2130970606, typedValue2, false);
        if (typedValue2.data != 0) {
            ResourcesTextView resourcesTextView5 = this.A0R;
            11T.A0D(resourcesTextView5);
            resourcesTextView5.setGravity(49);
            ResourcesTextView resourcesTextView6 = this.A0O;
            11T.A0D(resourcesTextView6);
            resourcesTextView6.setGravity(49);
            ResourcesTextView resourcesTextView7 = this.A0P;
            11T.A0D(resourcesTextView7);
            resourcesTextView7.setGravity(49);
        }
        TypedValue typedValue3 = new TypedValue();
        requireContext3.getTheme().resolveAttribute(2130970608, typedValue3, true);
        CharSequence charSequence = typedValue3.string;
        if (charSequence != null && charSequence.length() != 0) {
            ResourcesTextView resourcesTextView8 = this.A0R;
            11T.A0D(resourcesTextView8);
            resourcesTextView8.setText(charSequence);
        }
        TypedValue typedValue4 = new TypedValue();
        requireContext3.getTheme().resolveAttribute(2130970605, typedValue4, true);
        CharSequence charSequence2 = typedValue4.string;
        if (charSequence2 != null && charSequence2.length() != 0) {
            ResourcesTextView resourcesTextView9 = this.A0O;
            11T.A0D(resourcesTextView9);
            resourcesTextView9.setText(charSequence2);
        }
        if (super.A03 != null) {
            ViewGroup viewGroup = this.A09;
            11T.A0D(viewGroup);
            viewGroup.removeView(this.A0C);
        }
        this.A0Y = AnonymousClass001.A0s();
        this.A08 = view;
        this.A0A = (FrameLayout) view.findViewById(2131367096);
    }
}
