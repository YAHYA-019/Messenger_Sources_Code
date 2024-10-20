package X;

import com.facebook.messaging.quickpromotion.plugins.threadlist.threadlistbanner.ThreadListBannerImplementation;

/* renamed from: X.3xu, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3xu.class */
public abstract class AbstractC03373xu {
    public static final void A00(C2bd c2bd, C03363xt c03363xt) {
        ThreadListBannerImplementation threadListBannerImplementation = c2bd.A00;
        if (c03363xt != null) {
            threadListBannerImplementation.A00 = c03363xt;
            threadListBannerImplementation.A05.Ch8("quick_promotion");
        } else if (threadListBannerImplementation.A00 != null) {
            threadListBannerImplementation.A00 = null;
            threadListBannerImplementation.A05.Bks("quick_promotion");
        }
    }
}
