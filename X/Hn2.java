package X;

import com.facebook.wearable.mediastream.ul.voltron.loader.MediaStreamLibraryLoader;
import kotlin.jvm.functions.Function1;

/* loaded from: Hn2.class */
public abstract class Hn2 {
    public JNg A00;

    public static JNg A00(1Br r301) {
        return ((Hn2) r301.A00.get()).A00;
    }

    public void A01(Function1 function1) {
        JNg jNg = this.A00;
        if (jNg != null) {
            function1.invoke(jNg);
        } else {
            MediaStreamLibraryLoader.A02(new Il9(function1, 1), (MediaStreamLibraryLoader) 1Bi.A03(116401), false);
        }
    }
}
