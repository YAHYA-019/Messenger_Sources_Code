package X;

import java.io.IOException;

/* loaded from: Iuj.class */
public final /* synthetic */ class Iuj implements Runnable {
    public static final String __redex_internal_original_name = "LinkSetup$$ExternalSyntheticLambda1";
    public final /* synthetic */ IE6 A00;

    @Override // java.lang.Runnable
    public final void run() {
        IE6 ie6 = this.A00;
        0fH.A0k("LinkSetup", "Set link timed out!");
        ie6.A0G.invoke(new IOException("Timed out attempting to set link!"));
    }
}
