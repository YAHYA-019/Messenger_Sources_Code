package X;

import androidx.media.AudioAttributesCompat;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: Ixs.class */
public final class Ixs implements Runnable {
    public static final String __redex_internal_original_name = "RtcAudioHandler$isAudioDisabledBySystem$1";
    public final /* synthetic */ IEj A00;
    public final /* synthetic */ boolean A01;

    public Ixs(IEj iEj, boolean z) {
        this.A00 = iEj;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IEj iEj = this.A00;
        AudioAttributesCompat audioAttributesCompat = IEj.A0N;
        Set<Function1> set = iEj.A0D;
        boolean z = this.A01;
        for (Function1 function1 : set) {
            iEj.A08.ALc("RtcAudioHandler", 0Pz.A1C("isAudioDisabledBySystem - callback ", z), AnonymousClass001.A1Z());
            function1.invoke(Boolean.valueOf(iEj.A02));
        }
    }
}
