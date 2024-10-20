package X;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.facebook.resources.ui.FbFrameLayout;

/* loaded from: C8a.class */
public final class C8a {
    public IEh A00;
    public 53U A01;
    public final Fragment A02;
    public final 1Br A03;
    public final 1Br A04;
    public final DIP A05;
    public final C6r6 A06;
    public final FbFrameLayout A07;
    public final Context A08;

    public C8a(Context context, Fragment fragment, DIP dip, C6r6 c6r6, FbFrameLayout fbFrameLayout) {
        this.A08 = context;
        this.A02 = fragment;
        this.A07 = fbFrameLayout;
        this.A06 = c6r6;
        this.A05 = dip;
        this.A04 = 1Bu.A01(context, 49478);
        this.A03 = 1Bu.A01(context, 537);
    }

    public final Boolean A00() {
        String[] strArr;
        53U r0 = this.A01;
        if (r0 == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        String str = "android.permission.READ_MEDIA_IMAGES";
        if (i >= 34) {
            if (!CJn.A02(r0)) {
                strArr = new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED", str};
                return Boolean.valueOf(r0.BNK(strArr));
            }
        } else if (i < 33) {
            strArr = new String[1];
            str = "android.permission.READ_EXTERNAL_STORAGE";
            strArr[0] = str;
            return Boolean.valueOf(r0.BNK(strArr));
        }
        strArr = new String[1];
        strArr[0] = str;
        return Boolean.valueOf(r0.BNK(strArr));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:17:0x010a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8a.A01():void");
    }
}
