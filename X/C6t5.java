package X;

import com.facebook.video.exoserviceclient.FbVpsController;

/* renamed from: X.6t5, reason: invalid class name */
/* loaded from: 6t5.class */
public final class C6t5 implements 1Vf {
    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnCreate")) {
            throw 4YV.A0f(str);
        }
        1FP r0 = (1FP) 1Bi.A03(67765);
        final 1Br A00 = 1Bq.A00(32976);
        r0.D3D(3Ds.A03, 0S2.A01, new Runnable() { // from class: X.6t6
            public static final String __redex_internal_original_name = "StartVideoPlayerServiceEventHandler$onCreate$1";

            @Override // java.lang.Runnable
            public final void run() {
                ((FbVpsController) A00.A00.get()).A0A();
            }
        }, "Video Player Service");
    }
}
