package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: Lo8.class */
public final /* synthetic */ class Lo8 implements Runnable {
    public static final String __redex_internal_original_name = "AudioFocusManager$AudioFocusListener$$ExternalSyntheticLambda0";
    public final /* synthetic */ int A00;
    public final /* synthetic */ LFv A01;

    public /* synthetic */ Lo8(LFv lFv, int i) {
        this.A01 = lFv;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        LFv lFv = this.A01;
        int i2 = this.A00;
        La7 la7 = lFv.A01;
        if (i2 == -3) {
            i = 3;
        } else if (i2 == -2) {
            La7.A00(la7, 0);
            i = 2;
        } else {
            if (i2 != -1) {
                if (i2 != 1) {
                    5My.A04(GOm.A00(ActionId.VIDEO_SET_RENDERER_CONTEXT), 0Pz.A0T("Unknown focus change type: ", i2));
                    return;
                } else {
                    La7.A01(la7, 1);
                    La7.A00(la7, 1);
                    return;
                }
            }
            La7.A00(la7, -1);
            if (la7.A00 == 0) {
                return;
            } else {
                i = 0;
            }
        }
        La7.A01(la7, i);
    }
}
