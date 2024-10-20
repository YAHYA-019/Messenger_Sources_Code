package com.facebook.messaging.business.attachments.photo;

import X.0FI;
import X.11T;
import X.1iF;
import X.2Ov;
import X.7zO;
import X.AbF;
import X.AnonymousClass001;
import X.C2513Gft;
import X.C69e;
import X.C69f;
import X.C69s;
import X.DN1;
import X.InterfaceC07034in;
import android.R;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;

/* loaded from: PlatformPhotoFullScreenFragment.class */
public final class PlatformPhotoFullScreenFragment extends 2Ov implements CallerContextable {
    public static final CallerContext A04 = CallerContext.A06(PlatformPhotoFullScreenFragment.class);
    public float A00;
    public C69s A01;
    public FbDraweeView A02;
    public String A03;

    public 1iF A17() {
        return AbF.A0C(709119846302749L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        float f;
        int A02 = 0FI.A02(304766162);
        super.onCreate(bundle);
        this.A01 = (C69s) 7zO.A0l(this, 49976);
        Bundle bundle2 = this.mArguments;
        if (bundle == null) {
            if (bundle2 != null) {
                this.A03 = bundle2.getString("image_uri");
                f = bundle2.getFloat("aspect_ratio");
            }
            A0g(2, R.style.Theme.NoTitleBar.Fullscreen);
            0FI.A08(-10756934, A02);
        }
        this.A03 = bundle.getString("image_uri");
        f = bundle.getFloat("aspect_ratio");
        this.A00 = f;
        A0g(2, R.style.Theme.NoTitleBar.Fullscreen);
        0FI.A08(-10756934, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1980424359);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132542955, viewGroup, false);
        11T.A0A(inflate);
        0FI.A08(-1060095535, A02);
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putString("image_uri", this.A03);
        bundle.putFloat("aspect_ratio", this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.facebook.drawee.view.DraweeView, com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        C69e c69e = new C69e(7zO.A0D(this));
        c69e.A07 = new DN1();
        c69e.A02(InterfaceC07034in.A04);
        c69e.A00 = this.A00;
        C69f A01 = c69e.A01();
        Object findViewById = view.findViewById(2131366591);
        11T.A0I(findViewById, "null cannot be cast to non-null type com.facebook.drawee.fbpipeline.FbDraweeView");
        ?? r0 = (FbDraweeView) findViewById;
        this.A02 = r0;
        if (r0 == 0) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (this.A01 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        r0.setVisibility(0);
        r0.A05(A01);
        Object obj = this.A03;
        r0.A0H(obj instanceof Uri ? (Uri) obj : null, A04, new C2513Gft(0));
    }
}
