package X;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: G3c.class */
public final class G3c implements Runnable {
    public static final String __redex_internal_original_name = "BaseOffsiteFbPaySDKInjector$sendMessageToWebView$1$1";
    public final /* synthetic */ Ez2 A00;
    public final /* synthetic */ AbstractC3252Jnp A01;
    public final /* synthetic */ String A02;

    public G3c(Ez2 ez2, AbstractC3252Jnp abstractC3252Jnp, String str) {
        this.A00 = ez2;
        this.A01 = abstractC3252Jnp;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Ez2 ez2 = this.A00;
        AbstractC3252Jnp abstractC3252Jnp = this.A01;
        String str = this.A02;
        Charset charset = StandardCharsets.UTF_8;
        11T.A0B(charset);
        ez2.A01(abstractC3252Jnp, DKC.A1B(DKC.A1a(str, charset), 2));
    }
}
