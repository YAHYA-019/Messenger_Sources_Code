package X;

import com.facebook.wearable.mediastream.ul.voltron.loader.MediaStreamLibraryLoader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: Lo5.class */
public final class Lo5 implements Runnable {
    public static final String __redex_internal_original_name = "MediaStreamLibraryLoader$handleDownloadResult$2$2$1";
    public final /* synthetic */ HG8 A00;
    public final /* synthetic */ MediaStreamLibraryLoader A01;

    public Lo5(HG8 hg8, MediaStreamLibraryLoader mediaStreamLibraryLoader) {
        this.A01 = mediaStreamLibraryLoader;
        this.A00 = hg8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaStreamLibraryLoader mediaStreamLibraryLoader = this.A01;
        HG8 hg8 = this.A00;
        List list = mediaStreamLibraryLoader.A05;
        ArrayList<MIo> A0s = AnonymousClass001.A0s();
        for (Object obj : list) {
            if (obj instanceof JQo) {
                A0s.add(obj);
            }
        }
        for (MIo mIo : A0s) {
            mIo.onSuccess(hg8);
            list.remove(mIo);
        }
    }
}
