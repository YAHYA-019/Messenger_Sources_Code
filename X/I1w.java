package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.business.attachments.generic.model.LogoImage;
import com.facebook.messaging.business.commerce.model.retail.RetailAddress;

/* loaded from: I1w.class */
public final class I1w {
    public Resources A00;
    public final int A01;
    public final int A02;

    public I1w() {
        Resources resources = FbInjector.A00().getResources();
        this.A00 = resources;
        this.A02 = GOn.A07(resources, 2132279345);
        this.A01 = GOn.A07(this.A00, 2132279310);
    }

    public static String A00(Context context, RetailAddress retailAddress) {
        int i;
        Object[] objArr;
        String str = retailAddress.A02;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = retailAddress.A05;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        String str3 = retailAddress.A04;
        String str4 = retailAddress.A03;
        boolean z = !TextUtils.isEmpty(str3);
        boolean z2 = !TextUtils.isEmpty(str4);
        Resources resources = context.getResources();
        if (z) {
            if (z2) {
                i = 2131954361;
                objArr = new Object[]{str, str2, str3, str4};
            } else {
                i = 2131954360;
                objArr = new Object[]{str, str2, str3};
            }
        } else if (z2) {
            i = 2131954359;
            objArr = new Object[]{str, str2, str4};
        } else {
            i = 2131954358;
            objArr = new Object[]{str, str2};
        }
        return resources.getString(i, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean A01(CallerContext callerContext, FbDraweeView fbDraweeView, LogoImage logoImage) {
        Uri uri;
        int i;
        fbDraweeView.getClass();
        if (logoImage == null || (uri = logoImage.A02) == null) {
            fbDraweeView.setVisibility(8);
            return false;
        }
        fbDraweeView.setVisibility(0);
        fbDraweeView.A0G(uri, callerContext);
        fbDraweeView.setBackgroundResource(2132213972);
        int i2 = logoImage.A01;
        if (i2 <= 0 || (i = logoImage.A00) <= 0) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = fbDraweeView.getLayoutParams();
        layoutParams.width = Math.min(i2, this.A02);
        layoutParams.height = Math.min(i, this.A01);
        fbDraweeView.setLayoutParams(layoutParams);
        return true;
    }
}
