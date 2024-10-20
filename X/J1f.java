package X;

import com.facebook.ui.media.attachments.model.MediaResource;

/* loaded from: J1f.class */
public final class J1f implements Runnable {
    public static final String __redex_internal_original_name = "AudioRecorderAsync$notifyOnUiThread$1";
    public final /* synthetic */ 7Fa A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ Object A02;

    public J1f(7Fa r302, Integer num, Object obj) {
        this.A00 = r302;
        this.A01 = num;
        this.A02 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        7Fa r0 = this.A00;
        Integer num = this.A01;
        Object obj = this.A02;
        7zS.A1H(r0.A02);
        7Fc r02 = r0.A00;
        if (r02 != null) {
            switch (num.intValue()) {
                case 0:
                    r02.CFp();
                    return;
                case 1:
                    r02.CFn();
                    return;
                case 2:
                    r02.CFr();
                    return;
                case 3:
                    r02.CFq((MediaResource) obj, ((IE7) r0.A01.get()).A03);
                    return;
                case 4:
                    r02.CFo();
                    return;
                default:
                    11T.A0I(obj, "null cannot be cast to non-null type kotlin.Throwable");
                    r02.CFk((Throwable) obj);
                    return;
            }
        }
    }
}
